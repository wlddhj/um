( function() {	var ua = navigator.userAgent.toLowerCase();	var is = (ua.match(/\b(chrome|opera|safari|msie|firefox)\b/) || [ '',			'mozilla' ])[1];	var r = '(?:' + is + '|version)[\\/: ]([\\d.]+)';	var v = (ua.match(new RegExp(r)) || [])[1];	jQuery.browser.is = is;	jQuery.browser.ver = v;	jQuery.browser[is] = true;})();( function(jQuery) {	this.layer = {		'width' :250,		'height' :120,		'bottom':20,		'right':3	};	this.title = '信息提示';	this.time = 4000;	this.anims = {		'type' :'slide',		'speed' :600	};	this.timer1 = null;	this.inits = function(title, text) {		if ($("#message_tip").is("div")) {			$("#message_content").html(text);			return;		}		$(document.body)				.prepend(						'<div id="message_tip" style="border:#b9c9ef 1px solid;z-index:100;width:'								+ this.layer.width								+ 'px;height:'								+ this.layer.height								+ 'px;position:absolute; display:none;background:#eeeeee; bottom:'								+this.layer.bottom								+'px; right:'								+this.layer.right								+'px; overflow:hidden;"><div style="border:1px solid #fff;border-bottom:none;width:100%;height:25px;font-size:12px;overflow:hidden;color:#1f336b;"><div id="message_tip_close" class="chatting_window_close"></div><div style="padding:5px 0 5px 5px;width:100px;line-height:18px;text-align:left;overflow:hidden;">'								+ title								+ '</div><div style="clear:both;"></div></div> <div style="padding-bottom:5px;border:1px solid #fff;border-top:none;width:100%;height:auto;font-size:12px;"><div id="message_content" style="margin:0 5px 0 5px;background-color:#ffffff;border:#b9c9ef 1px solid;padding:10px 0 10px 5px;font-size:12px;width:'								+ (this.layer.width - 17)								+ 'px;height:'								+ (this.layer.height - 50)								+ 'px;color:#1f336b;text-align:left;overflow:hidden;">'								+ text + '</div></div></div>');		$("#message_tip_close").click( function() {			setTimeout('this.close()', 1);		});		$("#message_tip").hover( function() {			clearTimeout(timer1);			timer1 = null;		}, function() {			if (time > 0)				timer1 = setTimeout('this.close()', time);			});		$(window).scroll(				function() {					var bottomHeight =  this.layer.bottom-document.documentElement.scrollTop;					$("#message_tip").css("bottom", bottomHeight + "px");				});	};	this.show = function(title, text, time) {		if ($("#message_tip").is("div")) {			$("#message_content").html(text);			return;		}		if (title == 0 || !title)			title = this.title;		this.inits(title, text);		if (time >= 0)			this.time = time;		switch (this.anims.type) {		case 'slide':			$("#message_tip").slideDown(this.anims.speed);			break;		case 'fade':			$("#message_tip").fadeIn(this.anims.speed);			break;		case 'show':			$("#message_tip").show(this.anims.speed);			break;		default:			$("#message_tip").slideDown(this.anims.speed);			break;		}		var bottomHeight =  this.layer.bottom-document.documentElement.scrollTop;		$("#message_tip").css("bottom", bottomHeight + "px");				if ($.browser.is == 'chrome') {			setTimeout( function() {				$("#message_tip").remove();				this.inits(title, text);				$("#message_tip").css("display", "block");			}, this.anims.speed - (this.anims.speed / 5));		}		this.rmmessage(this.time);	};	this.lays = function(width, height) {//		if ($("#message_tip").is("div")) {//			return;//		}		if (width != 0 && width)			this.layer.width = width;		if (height != 0 && height)			this.layer.height = height;	}	this.anim = function(type, speed) {		if ($("#message_tip").is("div")) {			return;		}		if (type != 0 && type)			this.anims.type = type;		if (speed != 0 && speed) {			switch (speed) {			case 'slow':				;				break;			case 'fast':				this.anims.speed = 200;				break;			case 'normal':				this.anims.speed = 400;				break;			default:				this.anims.speed = speed;			}		}	}	this.rmmessage = function(time) {		if (time > 0) {			timer1 = setTimeout('this.close()', time);		}	};	this.callback = function(){			}	this.close = function() {		switch (this.anims.type) {		case 'slide':			$("#message_tip").slideUp(this.anims.speed);			break;		case 'fade':			$("#message_tip").fadeOut(this.anims.speed);			break;		case 'show':			$("#message_tip").hide(this.anims.speed);			break;		default:			$("#message_tip").slideUp(this.anims.speed);			break;		}		;		setTimeout('$("#message_tip").remove();', this.anims.speed);		this.callback();		this.original();	}	this.original = function() {		this.layer = {			'width' :250,			'height' :120,			'bottom':20,			'right':3		};		this.callback = function(){};		this.title = '信息提示';		this.time = 4000;		this.anims = {			'type' :'slide',			'speed' :600		};	};	jQuery.messager = this;	return jQuery;})(jQuery);