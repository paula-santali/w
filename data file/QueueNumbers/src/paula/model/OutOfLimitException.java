package paula.model;

public class OutOfLimitException extends Exception {

public OutOfLimitException(int limit,int number){
	super("Number " + number + " not added to queue with limit " + limit);
}
}
