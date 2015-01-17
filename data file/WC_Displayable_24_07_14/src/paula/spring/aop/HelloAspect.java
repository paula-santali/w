package paula.spring.aop;

import org.aspectj.lang.*;

public class HelloAspect {
 public void nohello(ProceedingJoinPoint point) throws Throwable{
	 Signature singature = point.getSignature();
	 String methodName = singature.getName();
	 String className =point.getTarget().getClass().getName();//primim point cu ajutorul getTarget,apoi prin getClass primi
	 //denumitea clasei,si apoi denumirea metodei!
	 Object [] args =point.getArgs();//primim parametrii care ii primeshte metoda!
	 System.out.println("invoked method: "+methodName);
	 System.out.println("invoked class: "+className);
	 System.out.println("parameters : ");
	 if(args!=null){
		 for(int i=0; i<args.length;i++){
		 	 if(args[i]instanceof java.lang.String)
		 		 if(((String)args[i]).contains("Hello"))//daca este cuvintul hello atunci ori aruncamexceptie ori shimbam cuvintul 
		 			 //in lok de hello scriem bye,sau putem sa scriem cu litere mici Hello cu ajutoru metodei toLowerCase();
		 		// throw new IllegalArgumentException("I'm tired from Hello");
		 			 args[i]="bye";
		 }
			 
	 }
	 
	 point.proceed(args);
 }
}
