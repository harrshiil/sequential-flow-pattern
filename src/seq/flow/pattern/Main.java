package seq.flow.pattern;

import seq.flow.pattern.seq.IContext;
import seq.flow.pattern.seq.ISequentialFlow;

public class Main {

    public static void main(String[] args) {
        FlowConfig flowConfig = new FlowConfig();

        ISequentialFlow<IContext, IContext> current = flowConfig.initiate();
        IContext iContext = new BaseContext();

        current.process(iContext);
    }
}
