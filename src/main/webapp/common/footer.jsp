<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!--FOOTER CONTAINER START-->
<div id="footer_container">
	<script type="text/javascript">
	var currentYear = (new Date).getFullYear();
	$(document).ready(function() {
		$("#year").text( (new Date).getFullYear() );
	});
	</script>

	<script type="text/javascript">
	if ( $.browser.msie && $.browser.version.slice(0,1) < "8") {
		$("#footer_container").css();
	}else{
		$("#footer_container").css("margin-top","-41px");
	}
	</script>

	<div  class="footer_text">&copy; <span id="year">TEXT</span> @Ca7erina</div>
</div>
<!--FOOTER CONTAINER END-->