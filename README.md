# FeedbackValidator
 REST API to validate user provided comments
 
 URL : localhost/feedback/add
 Method: POST
 content-type: application/json
 Request Body:
 {
	"userId":1,
	"feedback":"This product is bloody hell"
}

Response:
{
    "feedbackResponse": "Feedback consists of explict langauge please Review"
}
