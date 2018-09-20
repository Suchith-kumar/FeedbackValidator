package com.predix.feedback.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.predix.feedback.dto.FeedbackRequestDto;
import com.predix.feedback.dto.FeedbackResponseDto;
import com.predix.feedback.service.IFeedbackService;

@Service
public class FeedbackService implements IFeedbackService{

	@Override
	public FeedbackResponseDto addFeedback(FeedbackRequestDto userFeedback) {
		
		FeedbackResponseDto feedback = new FeedbackResponseDto();
		
		
		// Make set of bad words
		Set<String> badWords = new HashSet<>(Arrays.asList("bloody,hell,chinky,cocaine,dipshit,gays".split(",")));
		
		String comment = userFeedback.getFeedback();
		boolean isBadWord=false;
		
		for(String word : comment.split(" ")) {
			
			if(badWords.contains(word)) {
				isBadWord=true;
				break;
			}
			
		}
		if(isBadWord) {
			feedback.setFeedbackResponse("Feedback consists of explict langauge please Review");
		}else {
			feedback.setFeedbackResponse("Feedback Successfully submitted");
		}
		
		return feedback;
	}

}
