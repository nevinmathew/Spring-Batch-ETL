package com.etl.batch.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			System.out.println("!!! JOB FINISHED! Time to verify the results");
		}
	}
	
}
