<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


 <!--HEADER START-->
    <!--CURRENT DATE START-->
<div id="current_date_container">

  <div id="current_date_text">
        <script type="text/javascript">
        var d=new Date();
        var weekday=new Array("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday", "Saturday");
        var monthname=new Array("January","February","March","April","May","June","July","August","September","October","November","December");

        document.write(weekday[d.getDay()] + ", ");
        document.write(monthname[d.getMonth()] + " ");
        document.write(d.getDate() + ", ");
        document.write(d.getFullYear());
        </script>
    </div>

</div>
<!--CURRENT DATE END-->

<!--HEADER START-->
<div id="header_container">
    <div id="header_hidden_logo">
        <img src="images/ccc_logo_small.png" width="47" height="41" alt="Small Logo" /><h1>Consolidated Contractors Company</h1>
    </div>

    <img src="images/header-link.png" width="920" height="90" border="0" usemap="#Map" />
    <map name="Map" id="Map">
        <area shape="poly" coords="22,75,58,11,95,76" href="homePage" alt="Home Page" title="Home Page"/>
    </map>


</div>
<!--HEADER END-->
    <!--HEADER END-->


    <!--NAVIGATION START-->
    <div id="navigation_container">
	<div id="navigation_contents">
		<ul id="navigation_menu">
			<li><a href="home"> Home Page </a></li>
			
			
		<li><a href="about_us"> About Us </a>
				<ul>
					<li><a href="about_us">Introduction</a></li>
					<li><a href="our_group">Our Group<img src="images/nav_arrow.png" alt="Nav Sub Menu Arrow" width="9" height="7" /></a>
						<ul>
							<li><a href="our_group">Our People</a></li>
							<li><a href="offices">offices</a></li>
						</ul>
					</li>
					<li><a href="business_relation">Business Relations</a></li>
				</ul>
			</li>
 
			
<!--  

			<li><a href="sample_projectsPage.jsp"> Sample  Projects </a>
				<ul>
					<li><a href="APage">A</a></li>
					<li><a href="BPage">B<img src="images/nav_arrow.png" alt="Nav Sub Menu Arrow" width="9" height="7" /></a>
						<ul>
							<li><a href="A1Page">A1</a></li>
							<li><a href="A2Page">A2</a></li>
						</ul>
					</li>
					<li><a href="CPage">C </a></li>
				</ul>
			</li>
		-->
			
			<li class='contact'><a class='contact_form'>Contact Us</a></li>
					<li>

						<!--CONTACT FORM START (HIDDEN)-->
						
						<div id="contact_container">
							<div id="contact_form_popup">
								<img src="images/ccc_feedback_logo.jpg" alt="Feedback Logo" width="50" height="50" />
								<p>Please tell us what you think about our web site, company, products, or services.</p>
								<p>If you provide us with your contact information, we will be able to reach you in case you have any questions.</p>
								<div id="contact_form_content">
									<form method="post"  action="feedbackSubmit" onSubmit="return false;">
										<fieldset id="user_info">
											<label for="Name">Name:</label>
											<input type="text" name="feedback.name" id="name" />

											<label for="Email">Email:</label>
											<input type="text" name="feedback.email" id="email" />
										</fieldset>

										<fieldset id="user_categories">
											<p>Message about ...</p>
											<input type="checkbox" name="checkbox_fair_feedback" value="Job_Fair" id="checkbox_job_fair" />
											<label>Job Fair Feedback</label>

											<input type="checkbox" name="checkbox_web_site" value="Web_Site" id="checkbox_web_site" />
											<label>Web Site Feedback</label>

											<input type="checkbox" name="checkbox_additional_information" value="Additional_Information" id="checkbox_additional_information" />
											<label>Request Additional Information</label>

											<input type="checkbox" name="checkbox_other_feedback" value="Other_Feedback" id="checkbox_other_feedback" />
											<label>Other Feedback</label>
										</fieldset>

										<fieldset id="user_message">
											<label for="Message">Message:</label>
											<textarea name="feedback.message" rows="20" cols="20" id="message" ></textarea>

											<input type="submit" name="submitbutton" id="submitbutton" class="submitHover" value="Submit" />
											<input type="reset" name="resebutton" id="resebutton" class="resetHover" value="Reset" />
										</fieldset>
									</form>
								</div>
							</div>
						</div>

						<div id="feedback_message_wrapper">
							<div id="feedback_message">
								<h1>Thank you for your Feedback!</h1>
							</div>
						</div>
						<!--CONTACT FORM END (HIDDEN)-->

					</li>
			<li>
			
			</li>
		</ul>

		<br style="clear: left" />

	</div>
</div>
	<!--NAVIGATION END-->
