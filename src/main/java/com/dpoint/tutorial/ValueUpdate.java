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
		cs.setCaseRefrenceNo((String)execution.getVariable("CaseRefrenceNo"));
		cs.setCourtId((String)execution.getVariable("CourtId"));
		cs.setCustomer((String)execution.getVariable("Customer"));
		cs.setRequestType((String)execution.getVariable("RequestType"));
		cs.setCourtOrderDate((String)execution.getVariable("CourtOrderDate"));
		cs.setProInstanceId((String)execution.getProcessInstanceId());
		cs.setLevel("maker");
		
		ccmsDao.save(cs);
		System.out.println("AcIn:"+execution.getActivityInstanceId());
		System.out.println("prin:"+execution.getProcessInstanceId());
		System.out.println("prtn:"+execution.getTenantId());
		System.out.println(execution.getVariable("CaseRefrenceNo"));
		System.out.println(execution.getVariable("CourtId"));
		System.out.println(execution.getVariable("Customer"));
		System.out.println(execution.getVariable("RequestType"));
		System.out.println(execution.getVariable("CourtOrderDate"));
//		System.out.println(execution.getVariable("Name"));
		
	}

}
