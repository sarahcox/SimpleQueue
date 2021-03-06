package Queue;

public class Validator {
	int lowerLimit;
	int upperLimit;

	public Validator(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	public Boolean validate(int numberToValidate) throws InvalidException {
		if(!isValid(numberToValidate))
			throw new InvalidException();
		return true;
	}

	private boolean isValid(int numberToValidate) {
		return numberToValidate > lowerLimit && numberToValidate < upperLimit;
	}

}

