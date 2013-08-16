// GALLERY THUMBNAIL HOVER
$(document).ready(function(){
	$("#sample_project_gallery_one img, #sample_project_gallery_two img, #sample_project_gallery_three img, #sample_project_gallery_four img, #sample_project_gallery_five img").fadeTo(0, 0); // This sets the opacity of the thumbs to fade down to 40% when the page loads

	$("#sample_project_gallery_one img, #sample_project_gallery_two img, #sample_project_gallery_three img, #sample_project_gallery_four img, #sample_project_gallery_five img").hover(function(){
		$(this).stop(true, true).fadeTo(150, 1.0); // This should set the opacity to 100% on hover
	},function(){
		$(this).stop(true, true).fadeTo(200, 0); // This should set the opacity back to 40% on mouseout

	});

});

// GALLERY IMAGE POP UP
$(document).ready(function(){
	// IMAGE POP UP
	$("a[rel='proj_one']").colorbox({inline:true, href:"#hidden_gallery_one", title:"Ambatovy Project-Nickel Slurry &amp; Tailing Pipelines: Madagascar"});
	$("a[rel='proj_two']").colorbox({inline:true, href:"#hidden_gallery_two", title:"Wadi Dayqah Main &amp; Saddle Dams Project: Oman"});
	$("a[rel='proj_three']").colorbox({inline:true, href:"#hidden_gallery_three", title:"Khalifa Sports Hall: Qatar"});
	$("a[rel='proj_four']").colorbox({inline:true, href:"#hidden_gallery_four", title:"The Dubai Mall"});
	$("a[rel='proj_five']").colorbox({inline:true, href:"#hidden_gallery_five", title:"Nad Al Hamar Beirut Road Tunnel: Dubai"});
});