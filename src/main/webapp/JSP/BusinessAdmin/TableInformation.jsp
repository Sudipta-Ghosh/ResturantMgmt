<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link href="../../css/form.css" type="text/css" rel="stylesheet" />
  <script type='text/javascript' src='/ResturantMgmt/dwr/interface/TableInfoDWR.js'></script>
  <script type='text/javascript' src='/ResturantMgmt/dwr/engine.js'></script>
  <script type='text/javascript' src='/ResturantMgmt/dwr/util.js'></script>
  
  <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  <link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  		<link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/plug-ins/725b2a2115b/integration/jqueryui/dataTables.jqueryui.css">
  
  		<script type="text/javascript" language="javascript" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
  		<script type="text/javascript" language="javascript" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
  		<script type="text/javascript" language="javascript" src="http://cdn.datatables.net/plug-ins/725b2a2115b/integration/jqueryui/dataTables.jqueryui.js"></script>
  		
  
  <script type="text/javascript">
  function update()
  {
 
      TableInfoDWR.displayTableInformation({ 
          async: false,
          callback: function(data){  
          alert('data--'+data);
          	document.getElementById("example").innerHTML=data; 
            $('#example').dataTable();
          }
    });
      
      
      
 }
 
 $("#addrow" ).click(function() {
     alert("asda");
     $( "#dialog-modal" ).dialog({
         height: 140,
         modal: true
     });
             $.ajax({
                     url: "target.jsp?id=123",
                     success: function(data){
                         $('#dialog-modal p').html(data);
                     }
             });
 
    });
</script>
</head>


<body onload=" update();"  >
	<table class="formtable" align="center" border=0 width="95%" cellspacing="1" cellpadding="0">
	<tr>
	<td class="formtable_cel">
	<table width="50%" align="center" border=0 cellspacing="1" cellpadding="0">
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<p></p>
	<div class="container">
	<table  cellpadding="0" cellspacing="0" border="1" class="display" id="example" >

	</table>
	</div>
	<table  align="center" border="1" width="50%">
	<div class="actionbtns">
	<div id="btn" class="btn_blue">
	<ul>
		<li><a href="#null" id="addrow" onclick="savePage()"><span><%="Add New Row"%></span></a></li>
		<li><a href="#null" onclick="savePage()"><span><%="Bulk Delete"%></span></a></li>
	</ul>
	</div>
	</div>
	
	</table>
	</table>
	</td></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	<tr></tr>
	</table>
	
	</body>
</html>