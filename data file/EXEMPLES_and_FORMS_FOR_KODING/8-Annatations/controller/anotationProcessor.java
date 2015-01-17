package controller;

import anatationPackage.Service;
import classPackage.LazyService;
import classPackage.SimpleService;

public class anotationProcessor {

	public static void main(String[] args) {
	inspectService(SimpleService.class);
	inspectService(LazyService.class);
	inspectService(String.class);

	}

	private static void inspectService(Class<?> service) {
	if(service.isAnnotationPresent(Service.class)){
		Service ann = service.getAnnotation(Service.class);
		System.out.println(ann);
	}
		
	}

}
