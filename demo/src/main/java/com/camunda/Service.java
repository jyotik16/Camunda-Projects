package com.camunda;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateTask;

public abstract class Service implements DelegateTask{

	
	public void notify(DelegateTask delegateTask) {
	       
	       
	       
        IdentityService identityService = delegateTask.getProcessEngine().getIdentityService() ;
        identityService.newUser("sagar") ;
       
      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
