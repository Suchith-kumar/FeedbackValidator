package com.predix.feedback.service;

import com.predix.feedback.dto.FeedbackRequestDto;
import com.predix.feedback.dto.FeedbackResponseDto;

public interface IFeedbackService {
	
	FeedbackResponseDto addFeedback(FeedbackRequestDto userFeedback);

}
