package seq.flow.pattern.seq;

public interface IApplicable<I> {

	default boolean isApplicable(I input) {
		return false;
	}
}
