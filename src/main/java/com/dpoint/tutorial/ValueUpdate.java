package com.dpoint.tutorial;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dpoint.tutorial.dao.CcmsDao;
import com.dpoint.tutorial.dto.CcmsStore;

@Component("valueUpdate")
public class ValueUpdate implements JavaDelegate{
	
	@Autowired
	private CcmsDao ccmsDao;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("called..");
		
		CcmsStore cs = new CcmsStore();
		cs.setComment((String)execution.getVariable("Comment"));
		cs.setCourtId((String)execution.getVariable("CourtId"));
		cs.setCustomer((String)execution.getVariable("Customer"));
		cs.setName((String)execution.getVariable("Name"));
		cs.setPhone((String)execution.getVariable("Phone"));
		
		ccmsDao.save(cs);
		
		System.out.println(execution.getVariable("Name"));
		System.out.println(execution.getVariable("Phone"));
		System.out.println(execution.getVariable("CourtId"));
		System.out.println(execution.getVariable("Customer"));
		System.out.println(execution.getVariable("Comment"));
//		System.out.println(execution.getVariable("Name"));
		
	}

}
