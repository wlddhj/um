try{
	$('#pdChilltip').remove();
}catch(e){}
$(document).ready(function(){
	//setTimeout(function(){doChilltipFunc();}, 2000);
	doChilltipFunc();
});
function doChilltipFunc(){
	$('.pd-chill-tip').live("mouseover", function(e){
		var title = $(this).attr("title");
		$('body').append('<div id="pdChilltip" class="chilltip_title" ></div>');
		$('#pdChilltip').html('<div>' + title + '</div>');
		$('#pdChilltip').css({
			"background": "#53585e",
			"border": "2px solid #53585e",
			"display": "none",
			"font-family": "宋体",
			"font-size": "14px",
			"max-width": "400px",
			"position": "absolute",
			"top": "0",
			"line-height" : "20px",
			"z-index" : "11001"
		});
		$('#pdChilltip div').css({
			"color": "#fff",
			/*"float": "left",*/
			"margin": "0",
			"padding": "5px",
			"text-align": "justify",
			"width": "auto",
			"line-height" : "20px",
			"word-wrap":"break-word"
		});
		this.tip = this.title;
	});
	$('.pd-chill-tip').live("mousemove", function(e){
		var html = $.trim($('#pdChilltip div').html());
		if (html == "") {
			return;
		}
		var border_top = $(window).scrollTop(),border_right = $(window).width(),offset = 15,left_pos,top_pos;
	    if(	border_right - (offset *2) >= $('#pdChilltip').width() + e.pageX){left_pos = e.pageX + offset;}
		else{left_pos = border_right - $('#pdChilltip').width() - offset;}
		if(border_top + (offset *2 ) >= e.pageY - $('#pdChilltip').height()){top_pos = border_top + offset;}
		else{top_pos = e.pageY-$('#pdChilltip').height( )- offset;}	
		$('#pdChilltip').css({left:left_pos, top:top_pos});
		$('#pdChilltip').fadeIn(200);
	});
	
	$('.pd-chill-tip').live("mouseout", function(){
		$('#pdChilltip').remove();
		this.title = this.tip;
	});
}
