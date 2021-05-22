package seq.flow.pattern.seq;

/**
 * 
 * Generic sequential action for creating a step in sequential flow.
 * 
 *
 * @param <I> input
 * @param <R> output
 */
public interface ISequentialAction<I, R> {

	/**
	 * This method will be invoked for each step in sequential flow.
	 * 
	 * @param I This parameter holds input data
	 * @return R This returns processed output data
	 *
	 */
	public R run(I input);
}
