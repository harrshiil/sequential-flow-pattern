/**
 *
 */
package seq.flow.pattern;


import seq.flow.pattern.action.*;
import seq.flow.pattern.seq.IContext;
import seq.flow.pattern.seq.ISequentialFlow;

/**
 * To manage the Sequential flow actions in an order
 * Algorithm
 *
 *
 */
public class FlowConfig {

    public ISequentialFlow<IContext, IContext> initiate() {

        return new SequentialFlow<>(new FirstAction())
                .assembleFlow(new SecondAction())
                .assembleFlow(new ThirdAction())
                .assembleFlow(new FourthAction())
                .assembleFlow(new FifthAction());
    }
}
