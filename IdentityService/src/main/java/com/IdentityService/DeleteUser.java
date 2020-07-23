package com.IdentityService;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.identity.User;

public class DeleteUser implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
	    IdentityService identityService=execution.getProcessEngine().getIdentityService();
	    
	    
	    identityService.unlockUser("10");
    	identityService.deleteUser("10");	     
	      System.out.println("User Deleted");

	}
	
}