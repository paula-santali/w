package aop;

import org.aspectj.lang.*;

public class PersonsAOP {
	public void timing(ProceedingJoinPoint point) throws Throwable {
		Signature sing = point.getSignature();
		String name = sing.getName();// primim numele metodei care se cheama

		long timeStart = System.currentTimeMillis();

		point.proceed();

		long timeFinish = System.currentTimeMillis();
		System.out.println("Running time of method = " + name + " : "
				+ (timeFinish - timeStart) + " ms");
	}
}
