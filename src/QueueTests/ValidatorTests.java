package QueueTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Queue.InvalidException;
import Queue.Validator;

public class ValidatorTests {

	Validator validator;
	private int lowerBoundary = 0;
	private int upperBoundary = 100;

	@Before
	public void setUp() {
		validator = new Validator(lowerBoundary, upperBoundary);
	}

	@Test
	public void lowerLimitPlusOneThrowsNoException() throws InvalidException {
		assertEquals(Boolean.TRUE, validator.validate(lowerBoundary + 1));
	}

	@Test(expected = InvalidException.class)
	public void lowerLimitMinusOneThrowsAnException() throws InvalidException {
		validator.validate(lowerBoundary - 1);
	}

	@Test(expected = InvalidException.class)
	public void upperLimitPlusOneThrowsAnException() throws InvalidException {
		validator.validate(upperBoundary + 1);
	}

	@Test
	public void upperBoundaryMinusOneThrowsNoException()
			throws InvalidException {
		assertEquals(Boolean.TRUE, validator.validate(upperBoundary - 1));
	}

	@Test(expected = InvalidException.class)
	public void upperLimitThrowsInvalidException() throws InvalidException {
		assertEquals(Boolean.TRUE, validator.validate(upperBoundary));
	}

	@Test(expected = InvalidException.class)
	public void lowerLimitThrowsInvalidException() throws InvalidException {
		validator.validate(lowerBoundary);
	}
}
