package paula.model;

public interface QueueNumbers {
  public void add(int number)throws OutOfLimitException;
  public int process();

}
