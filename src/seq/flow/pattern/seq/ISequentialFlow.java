package seq.flow.pattern.seq;

/**
 * 
 * Generic interface used for creating a sequential flow using ISequentialAction as various steps.
 * All the actions will be invoked in a sequential manner where output of first action will become
 * input for second action.  
 *
 *
 * @param <I> input
 * @param <O> output
 */
public interface ISequentialFlow<I, O> {
	
	/**
	 * This method is used to assemble SequentialFlow with different ISequentialActions 
	 * those will run sequentially and the output for first action will be given as input to second.
	 * 
	 * @param next This is the next Action to be performed.
	 * @return ISequentialFlow<I, NewO> This returns assembled flow using next Action class.
	 *
	 */
	<NewO> ISequentialFlow<I, NewO> assembleFlow(ISequentialAction<O, NewO> next);

	/**
	 * This method will be used to kick off the sequential flow processing.
	 * 
	 * @param I Input parameter
	 * @return O Output Parameter
	 *
	 */
	O process(I input);

}
