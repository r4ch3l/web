

 
// FEEDBACK REPLY MESSAGE
$('#submitbutton').live('click',function(){
		var button = $(this);
		var contact_form_content = $('#contact_form_popup');
		var name = $('#name').attr("value");
		var email = $('#email').attr("value");
		var message = $('#message').attr("value");
		var messageAbout="messageAbout";
		//var checkbox_job_fair = $('#checkbox_job_fair');
		var checkbox_job_fair = $('#checkbox_job_fair:checked').attr("value");
		var checkbox_web_site = $('#checkbox_web_site:checked').attr("value");
		var checkbox_additional_information = $('#checkbox_additional_information:checked').attr("value");
		var checkbox_other_feedback = $('#checkbox_other_feedback:checked').attr("value");
	

		
		
		$.ajax({
				url			: 'json/sendfeedback',
				type		: 'get',
				data		: {name : name, email : email, message : message, 
							"messageAbout" : checkbox_job_fair+checkbox_web_site+ checkbox_additional_information+checkbox_other_feedback,
						
			},
				complete	: function(xhr){

						// This will help users troubleshoot their form:
						if(xhr.status == 404){
								$.colorbox({width:"auto"/*736px*/, inline:true, href:"#feedback_message", title:"Failed to send feedback!"});
			return false;
			
						}
					//	alert(xhr.responseText);
						// Hiding the button and the textarea, after which
						// we are showing the received response from submit.php

						$.colorbox({width:"auto", inline:true, href:"#feedback_message",title:"Send out ! "});
				},
				onWait:$.colorbox({width:"auto", inline:true, href:"#feedback_message",title:"Sending......"}),
					
		});

		return false;
});