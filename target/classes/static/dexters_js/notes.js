var notes_lst;


$(document).ready(function() {

	load_notes();

	
	
	
	$(".l1").click(function(e){
		$("#values").html($(".l1").attr("notes"));
	});
	
	$(".l2").click(function(e){
		$("#values").html($(".l2").attr("notes"));
	});
	$(".l3").click(function(e){
		$("#values").html($(".l3").attr("notes"));
	});
	$(".l4").click(function(e){
		$("#values").html($(".l4").attr("notes"));
	});
	$(".l5").click(function(e){
		$("#values").html($(".l5").attr("notes"));
	});
	
});

function load_notes(){
	
	   $.ajax({
	        type: "GET",
	        contentType: "application/json",
	        url: "/v1/Getnotes",
	        dataType: 'json',
	        cache: false,
	        timeout: 600000,
	        success: function (data) {
	        	 console.log(data);
	        	 success_notes(data);
	        	 notes_lst = data;
	        },
	        error: function (e) {

	            

	        }
	    });
		
	}

function success_notes(data){
	$("#n1").html(data[0].notes);
	$("#n2").html(data[1].notes);
	$("#n3").html(data[2].notes);
	$("#n4").html(data[3].notes);
	$("#n5").html(data[4].notes);
	
	$(".l1").attr("notes", data[0].notes)
	$(".l2").attr("notes", data[1].notes)
	$(".l3").attr("notes", data[2].notes)
	$(".l4").attr("notes", data[3].notes)
	$(".l5").attr("notes", data[4].notes)
	
	$("#values").html($(".l1").attr("notes"));
}


