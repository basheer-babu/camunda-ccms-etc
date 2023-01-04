package com.dpoint.tutorial;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dpoint.tutorial.dao.CcmsDao;
import com.dpoint.tutorial.dto.CcmsStore;

@Component("statusChange")
public class StatusChange implements JavaDelegate {
	@Autowired
	private CcmsDao ccmsDao;
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("StatusChange called..");
		
		CcmsStore cs = new CcmsStore();
		

		int status=ccmsDao.setLevelChange("checker", execution.getProcessInstanceId());
		System.out.println("update level::"+status);
		
		
	}

}
