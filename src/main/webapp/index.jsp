<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>XXX Company : Home</title>

<!--COMMON STYLSHEETS-->
<link rel="stylesheet" type="text/css" href="css/styles.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/print_styles.css" media="print" />
<link rel="stylesheet" type="text/css" href="css/colorbox.css" />
<!--CURRENT PAGE STYLSHEETS-->
<link rel="stylesheet" type="text/css" href="css/index_page.css" />
<link rel="stylesheet" type="text/css" href="css/tooltip.css" />
<link rel="stylesheet" type="text/css" href="css/sample_projects.css" />



<!--COMMON SCRIPTS-->
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript" src="scripts/jquery.colorbox.js"></script>
<script type="text/javascript" src="scripts/jquery.cross-slide.js"></script>
<script type="text/javascript" src="scripts/jquery.clearfield.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        $('.clear_field').clearField();
    });
    </script>

<script type="text/javascript" src="scripts/common_scripts.js"></script>

<!--CURRENT PAGE SCRIPTS-->
<script type="text/javascript" src="scripts/home_page_slide.js"></script>
<script type="text/javascript" src="scripts/sample_projects_script.js"></script>
</head>

<body>

<!--BODY START-->
	
<div id="body_container">

   
    <%@include file="common/header.jsp"%>
    


    <!--INTRODUCTION START-->
    <div id="introduction_container">

        <!--INTRO IMAGES START-->
        
        <div id="introduction_images"></div>
        
        <div id="introduction_images_caption">
        
        </div>
        <!--INTRO IMAGES END-->

        <!--INTRO FRAME START-->
        <div id="introduction_frame">
            <img src="images/frame.png" width="920" height="350" alt="" />
        </div>
        <!--INTRO FRAME END-->

    </div>
    <!--INTRODUCTION END-->

  
    <!--CONTENTS CONTAINER START-->
    



            <!--PROJECTS GALLERY START-->
            <div id="sample_project_gallery">
               <div id="sample_project_gallery_contents">

                    <!--PROJECTS GALLERY ONE-->
                    <div id="sample_project_gallery_one">
                        <a rel="proj_one" onmouseover="tooltip.show('Pipelines');" onmouseout="tooltip.hide();"><img src="images/sample_projects/gallery_overlay.png" width="150" height="95" alt="Overlays" /></a>
                    </div>

                    <!--PROJECTS GALLERY POPUP-->
                    <div class="hidden_gallery_frame">
                        <div id="hidden_gallery_one">
                            <img src="images/sample_projects/gallery/pic01.jpg" width="750" height="500" alt="G_one" />
                        </div>
                    </div>

                    <!--PROJECTS GALLERY TWO-->
                    <div id="sample_project_gallery_two">
                        <a rel="proj_two" onmouseover="tooltip.show('Heavy Civil: Dams');" onmouseout="tooltip.hide();"><img src="images/sample_projects/gallery_overlay.png" width="150" height="95" alt="Overlays" /></a>
                    </div>

                    <!--PROJECTS GALLERY POPUP-->
                    <div class="hidden_gallery_frame">
                        <div id="hidden_gallery_two">
                            <img src="images/sample_projects/gallery/pic02.jpg" width="750" height="500" alt="G_two" />
                        </div>
                    </div>

                    <!--PROJECTS GALLERY THREE-->
                    <div id="sample_project_gallery_three">
                        <a rel="proj_three" onmouseover="tooltip.show('Heavy Civil');" onmouseout="tooltip.hide();"><img src="images/sample_projects/gallery_overlay.png" width="150" height="95" alt="Overlays" /></a>
                    </div>

                    <!--PROJECTS GALLERY POPUP-->
                    <div class="hidden_gallery_frame">
                        <div id="hidden_gallery_three">
                            <img src="images/sample_projects/gallery/pic03.jpg" width="750" height="500" alt="G_three" />
                        </div>
                    </div>

                    <!--PROJECTS GALLERY FOUR-->
                    <div id="sample_project_gallery_four">
                        <a rel="proj_four" onmouseover="tooltip.show('Buildings');" onmouseout="tooltip.hide();"><img src="images/sample_projects/gallery_overlay.png" width="150" height="95" alt="Overlays" /></a>
                    </div>

                    <!--PROJECTS GALLERY POPUP-->
                    <div class="hidden_gallery_frame">
                        <div id="hidden_gallery_four">
                            <img src="images/sample_projects/gallery/pic04.jpg" width="750" height="500" alt="G_four" />
                        </div>
                    </div>

                    <!--PROJECTS GALLERY FIVE-->
                    <div id="sample_project_gallery_five">
                        <a rel="proj_five" onmouseover="tooltip.show('Earth Works: Roads');" onmouseout="tooltip.hide();"><img src="images/sample_projects/gallery_overlay.png" width="150" height="95" alt="Overlays" /></a>
                    </div>

                    <!--PROJECTS GALLERY POPUP-->
                    <div class="hidden_gallery_frame">
                        <div id="hidden_gallery_five">
                            <img src="images/sample_projects/gallery/pic05.jpg" width="750" height="500" alt="G_five" />
                        </div>
                    </div>
                    
                </div>
            </div>
            <!--PROJECTS GALLERY END-->

        
        <!--PROJECTS END-->

        <!--CLEAR FLOAT START-->
        <div id="clear_both"></div>
        <!--CLEAR FLOAT END-->

 
    <!--CONTENTS CONTAINER END-->
    

</div>
<!--BODY END-->


<%@include file="common/footer.jsp"%>

<script type="text/javascript" src="scripts/tooltip.js"></script>
<script type="text/javascript" src="scripts/feedback_message.js"></script>
<script type="text/javascript" src="scripts/navigation.js"></script>

</body>
</html>