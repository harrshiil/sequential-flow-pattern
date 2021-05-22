package seq.flow.pattern.action;

import seq.flow.pattern.AbstractSequentialAction;
import seq.flow.pattern.seq.IContext;

public class SecondAction extends AbstractSequentialAction<IContext> {
    @Override
    public IContext execute(IContext input) {
        System.out.println("inside Second Action");
        return null;
    }

    @Override
    public boolean isApplicable(IContext input) {
//        return super.isApplicable(input);
        return true;
    }
}
