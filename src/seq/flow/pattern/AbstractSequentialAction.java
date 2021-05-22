package seq.flow.pattern;

import seq.flow.pattern.seq.IAction;
import seq.flow.pattern.seq.ISequentialAction;

/**
 * 
 * This abstract class gives the default implementation of run method. Each
 * Sequence flow actions need to extend from this class.
 *
 *
 * @param <I> input & output
 * 
 */
public abstract class AbstractSequentialAction<I> implements ISequentialAction<I, I>, IAction<I, I> {

	@Override
	public I run(I input) {
		if (this.isApplicable(input))
			return this.execute(input);
		else
			return input;

	}
}
