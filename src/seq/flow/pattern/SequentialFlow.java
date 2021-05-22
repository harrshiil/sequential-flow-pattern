package seq.flow.pattern;

import seq.flow.pattern.seq.ISequentialAction;
import seq.flow.pattern.seq.ISequentialFlow;

public class SequentialFlow<I, O> implements ISequentialFlow<I, O> {

    private final ISequentialAction<I, O> current;

    public SequentialFlow(ISequentialAction<I, O> current) {
        this.current = current;
    }

    @Override
    public <NewO> ISequentialFlow<I, NewO> assembleFlow(ISequentialAction<O, NewO> next) {
        return new SequentialFlow<>(input -> next.run(current.run(input)));
    }

    @Override
    public O process(I input) {
        return current.run(input);
    }

}
