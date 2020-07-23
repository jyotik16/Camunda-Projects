package com.IdentityService;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.identity.User;

public class Create5User implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
	    IdentityService identityService=execution.getProcessEngine().getIdentityService();
//	       User user=identityService.newUser("ANkita");
//	        user.setId("10");
//	        user.setFirstName("ANkita");
//	        user.setLastName("ROY");
//	        user.setEmail("abc@abc.com");
//	        user.setPassword("ANkita");
//	        identityService.saveUser(user);
	    	
	        System.out.println("User Created");

	}
	
}