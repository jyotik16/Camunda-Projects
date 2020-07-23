package com.camunda.demo.SimpleDemo;

import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.identity.User;

public abstract class DeleteUser implements DelegateTask{
	public void notify(DelegateTask delegateTask) {  
	       
	     
	    IdentityService identityService = delegateTask.getProcessEngine().getIdentityService() ;
        System.out.println("Delete User");
        Create5Users uu = new Create5Users();
        String ID = uu.getId();
        System.out.println("Delete User ID"+ID);
        identityService.deleteUser(ID);
        
       
	}
}
