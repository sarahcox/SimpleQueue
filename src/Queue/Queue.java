package Queue;

import java.util.LinkedList;

public class Queue {

	Validator validator  = new Validator(0, 100);
	private LinkedList<Integer> queueList = new LinkedList<Integer>();

	public int getSize() {
		return queueList.size();
	}

	public Boolean isEmpty() {
		return queueList.size() == 0;
	}

	public void add(int numberToAdd) throws QueueFullException, InvalidException{
		checkQueueSizeIsNotGreaterThanOrEqualToFive();
		if (validator.validate(numberToAdd))
			queueList.add(numberToAdd);
	}

	private void checkQueueSizeIsNotGreaterThanOrEqualToFive()
			throws QueueFullException {
		if (queueList.size() >= 5)
			throw new QueueFullException();
	}

	public int peek() throws QueueEmptyException {
		checkQueueIsNotEmpty();
		return queueList.peekFirst();
	}

	private void checkQueueIsNotEmpty() throws QueueEmptyException {
		if (queueList.size() == 0)
			throw new QueueEmptyException();
	}

	public void remove() throws QueueEmptyException {
		checkQueueIsNotEmpty();
		queueList.removeFirst();
		
	}

}
