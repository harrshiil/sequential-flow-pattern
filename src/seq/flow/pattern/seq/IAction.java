package seq.flow.pattern.seq;

public interface IAction<I, R> extends IApplicable<I> {
	
	R execute(I input);

}
