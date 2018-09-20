package com.predix.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.predix.feedback.dto.FeedbackRequestDto;
import com.predix.feedback.dto.FeedbackResponseDto;
import com.predix.feedback.service.IFeedbackService;


@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	IFeedbackService feedbackService;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST,consumes = {"application/JSON"}, produces = {"application/JSON"})
    public ResponseEntity<FeedbackResponseDto>  addUser(@RequestBody FeedbackRequestDto userFeedback){
		
		if(userFeedback==null || userFeedback.getUserId()==null || userFeedback.getFeedback()==null || StringUtils.isEmpty(userFeedback.getFeedback())) {
			
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		FeedbackResponseDto feed = feedbackService.addFeedback(userFeedback);
		//feed.setFeedbackResponse("success");
		return new ResponseEntity<FeedbackResponseDto>(feed, HttpStatus.OK);
	}

}
