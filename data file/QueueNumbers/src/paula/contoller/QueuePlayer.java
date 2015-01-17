package paula.contoller;

import paula.model.OutOfLimitException;
import paula.model.QueueNumbers;

public class QueuePlayer {
private QueueNumbers queue;
private int nActions;
private int addPercent;
private int rejectedCount;

public QueuePlayer(QueueNumbers queue,int nActions,int addPercent){
	this.queue=queue;
	this.nActions=nActions;
	this.addPercent=addPercent;
}
public void play(){
	rejectedCount = 0;
	for (int i = 0; i < nActions; i++) {
		int number = (int) (Math.random() * 100);
		if (number < addPercent) {
			try {
				queue.add(number);
			} catch (OutOfLimitException e) {
				e.getMessage();
				rejectedCount++;
			}
		} else
			queue.process();
	}
	
}

public int getRejectedCount() {
	return rejectedCount;
}


}
