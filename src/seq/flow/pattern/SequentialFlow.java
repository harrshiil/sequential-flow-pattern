package seq.flow.pattern;

import seq.flow.pattern.seq.ISequentialAction;
import seq.flow.pattern.seq.ISequentialFlow;

public class SequentialFlow<I, O> implements ISequentialFlow<I, O> {

    private final ISequentialAction<I, O> current;

    public SequentialFlow(ISequentialAction<I, O> current) {
        this.current = current;
    }

    /**
     * @param next   This is the next Action to be performed.
     * @param <NewO>
     * @return
     *
     * This is the example of recursion. below code will point current to next and next will run current first
     *
     * if we need to remove context from this example then below code would become like...
     * return new SequentialFlow(() -> {
     *             current.run();
     *             next.run();
     *         });
     */
    @Override
    public <NewO> ISequentialFlow<I, NewO> assembleFlow(ISequentialAction<O, NewO> next) {
        return new SequentialFlow<>(input -> next.run(current.run(input)));
    }

    @Override
    public O process(I input) {
        return current.run(input);
    }

}
