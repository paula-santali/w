package paula.contoller;


import paula.model.QueueNumbers;
import paula.model.QueueNumbersArray;

public class QueueAppl {
static final int LIMIT=100;
static final int ADD_PROBALITY=80;
static final int N_ACTIONS=10000;
	
	public static void main(String[] args) {
		QueueNumbers qn=new QueueNumbersArray(LIMIT);
		QueuePlayer queue=new QueuePlayer(qn,N_ACTIONS,ADD_PROBALITY);
		queue.play();
		System.out.println(queue.getRejectedCount());
		
	}
}