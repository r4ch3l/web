var site = function() {
	this.navigation_menuLi = $('#navigation_menu li').children('ul').hide().end();
	this.init();
};

site.prototype = {
 	
 	init : function() {
 		this.setMenu();
 	},
 	
 	// Enables the slidedown menu, and adds support for IE6
 	
 	setMenu : function() {
 	
 		this.navigation_menuLi.hover(function() {
 			// mouseover
			$(this).find('> ul').stop(true, true).delay(150).slideToggle(150);
 		}, function() {
 			// mouseout
 			$(this).find('> ul').stop(true, true).hide(); 		
		});
 		
 	}
 
}

new site();