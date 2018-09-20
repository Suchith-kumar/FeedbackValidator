package com.predix.feedback.dto;

import org.springframework.beans.factory.annotation.Required;


public class FeedbackRequestDto {
	
	private String userId;
	
	private String feedback;
	public String getUserId() {
		return userId;
	}
	
	@Required
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFeedback() {
		return feedback;
	}
	
	@Required
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

}
