// VIDEO CONTAINER
$(document).ready(function(){
	//$(".video_player").colorbox({iframe:true, innerWidth:640, innerHeight:360});
	$(".youtube_videos").colorbox({width:"884px", height:"484px", inline:true, href:"#video_contents", title:'Our Media &amp; In the News'});
	$(".press_release").colorbox({width:"auto", inline:true, href:"#press_contents", title:'Press Release'});
});

// VIDEO CONTAINER THUMBNAIL HOVER
$(document).ready(function(){
	$("#press_container_one img, #video_container_one img, #press_container_two img, #video_container_two img, #video_container_three img, #video_container_four img, #video_container_five img, #video_container_six img").fadeTo(0, 0); // This sets the opacity of the thumbs to fade down to 40% when the page loads

	$("#press_container_one img, #video_container_one img, #press_container_two img, #video_container_two img, #video_container_three img, #video_container_four img, #video_container_five img, #video_container_six img").hover(function(){
		$(this).stop(true, true).fadeTo(150, 1.0); // This should set the opacity to 100% on hover
	},function(){
		$(this).stop(true, true).fadeTo(200, 0); // This should set the opacity back to 40% on mouseout

	});

});

// VIDEO CONTAINER PLAYER POP UP
$(document).ready(function(){
	// IMAGE POP UP
	$("#youtube_video_one").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=TmJ8rcL2mK8&vq=medium", innerWidth:640, innerHeight:360, title:'CCC Chairman’s Message for the 2013'});
	$("#youtube_video_two").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=vQzUE2aXzUM&vq=medium", innerWidth:640, innerHeight:360, title:'CCC Deputy Chairman’s Message for the 2013'});
	$("#youtube_video_three").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=L3UsEfEKmSc&vq=medium", innerWidth:640, innerHeight:360, title:'CCC Preparations'});
	$("#youtube_video_four").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=ODz0yDVIgiE&vq=medium", innerWidth:640, innerHeight:360, title:'CCC 60th Anniversary Message from CCC Chairman'});
	$("#youtube_video_five").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=AM9B64T_gBo&vq=medium", innerWidth:640, innerHeight:360, title:'Princess Nora University - Riyadh KSA'});
	$("#youtube_video_six").colorbox({iframe:true, href:"http://www.youtube.com/watch_popup?v=k1cUptQfk3U&vq=medium", innerWidth:640, innerHeight:360, title:'RAS Laffan EPC Mega Civil Project'});
});

// ACKNOWLEDGEMENTS
$(document).ready(function(){
	//Examples of how to assign the ColorBox event to elements
	$(".acknowledgements_w").colorbox({iframe:true, width:"630px", height:"289px", title:'Acknowledgements'});
});

// CONTACT FORM
$(document).ready(function(){
	//Examples of how to assign the ColorBox event to elements
	$(".contact_form").colorbox({width:"800px", inline:true, href:"#contact_form_popup", title:"Feedback Form"});
});

// VBC
$(document).ready(function(){
	//Examples of how to assign the ColorBox event to elements
	$(".vbc_page").colorbox({iframe:true, width:"80%", height:"80%", title:"VBC Central"});
});

// CAPABILITIES
function group_capabilitie(url) 
	{
	 var width  = 600;
	 var height = 415;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

//

function epc(url) 
	{
	 var width  = 415;
	 var height = 563;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

//

function envisage(url) 
	{
	 var width  = 415;
	 var height = 563;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

//

function oil_gas(url) 
	{
	 var width  = 415;
	 var height = 563;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

// EMPLOYMENT
function employment(url) 
	{
	 var width  = 1000;
	 var height = 600;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=yes';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

// PRESS RELEASE POP UP
function press_release_link(url) 
	{
	 var width  = 415;
	 var height = 565;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}

function press_release_slides_link(url) 
	{
	 var width  = 565;
	 var height = 415;
	 var left   = (screen.width  - width)/2;
	 var top    = (screen.height - height)/2;
	 var params = 'width='+width+', height='+height;
	 params += ', top='+top+', left='+left;
	 params += ', directories=no';
	 params += ', location=no';
	 params += ', menubar=no';
	 params += ', resizable=yes';
	 params += ', scrollbars=no';
	 params += ', status=no';
	 params += ', toolbar=no';
	 newwin=window.open(url,'windowname5', params);
	 if (window.focus) {newwin.focus()}
	 return false;
	}