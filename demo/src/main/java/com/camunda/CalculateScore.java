package com.camunda;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalculateScore implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		int tem = getRandomCIBILScore();
		execution.setVariable("CIBIL", 660);
		System.out.println("CIBILscore="+tem);
	}
	public static int getRandomCIBILScore() {
        
        Random random=new Random();
        int CIBIL=random.nextInt(900);
        //System.out.print(CIBIL);
        return CIBIL;
    }
}
