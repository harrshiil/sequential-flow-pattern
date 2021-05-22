package seq.flow.pattern.action;

import seq.flow.pattern.AbstractSequentialAction;
import seq.flow.pattern.seq.IContext;

public class FifthAction extends AbstractSequentialAction<IContext> {
    @Override
    public IContext execute(IContext input) {
        System.out.println("inside Fifth Action");
        return null;
    }

    @Override
    public boolean isApplicable(IContext input) {
//        return super.isApplicable(input);
        return true;
    }
}
