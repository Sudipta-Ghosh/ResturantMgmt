<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Table Master</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Fancy Sliding Form with jQuery" />
        <meta name="keywords" content="jquery, form, sliding, usability, css3, validation, javascript"/>
        <link rel="stylesheet" href="../../css/CreateFormStyle.css" type="text/css" media="screen"/>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>	
	<script type="text/javascript" src="../../js/sliding.form.js"></script>
	
	<link rel="stylesheet" href="../../css/validationEngine.jquery.css" type="text/css">
	<link rel="stylesheet" href="../../css/template.css" type="text/css">
	<script src="../../js/jquery-1.8.2.min.js" type="text/javascript">	</script>
	<script src="../../js/jquery.validationEngine-en.js" type="text/javascript" charset="utf-8">	</script>
	<script src="../../js/jquery.validationEngine.js" type="text/javascript" charset="utf-8"></script>
    </head>
    <style>
        span.reference{
            position:fixed;
            left:5px;
            top:5px;
            font-size:10px;
            text-shadow:1px 1px 1px #fff;
        }
        span.reference a{
            color:#555;
            text-decoration:none;
			text-transform:uppercase;
        }
        span.reference a:hover{
            color:#000;

        }
        h1{
            color:#ccc;
            font-size:36px;
            text-shadow:1px 1px 1px #fff;
            padding:20px;
        }
    </style>
    <script>
    
    	$().ready(function() {
    		jQuery("#formElem").validationEngine();
    	});
    	
    	function update()       {
    	
    	 TableInfoDWR.displayTableInformation({ 
	              async: false,
	              callback: function(data){  
	              alert('data--'+data);
	              	document.getElementById("example").innerHTML=data; 
	                $('#example').dataTable();
	              }
        });
        }
	</script>
    <body>
       
        <div id="content">
            <h1>Table Update</h1>
            <div id="wrapper">
                <div id="steps">
                    <form id="formElem" name="formElem" action="" method="post">
                        <fieldset class="step">
			<legend>Table Master</legend>
			<p>
				<label for="tableno">Table No</label>
				<input id="tableno" name="tableno"  class="validate[required] minSize[6]" type="text" value="" />
			</p>
			<p>
				<label for="tabledescription">Table Description</label>
				<input id="tabledescription" name="tabledescription"  class="validate[required] text-input" type="text" />
			</p>
			<p>
				<label for="noofseats">No Of Seats</label>
				<input id="noofseats" name="noofseats" class="validate[required] text-input" type="text" />
			</p>
			<p>
				<label for="tablestatus">Table Status</label>
				<select id="tablestatus" name="tablestatus" >
					<option>Active</option>
					<option>Inactive</option>					
				</select>
			</p>				
			<p>
				<label for="tablestatus">Table Status</label>
				<input id="tabletype" name="tabletype"  class="validate[required] text-input" type="text"/>
			</p>
                        </fieldset>
                       
			<fieldset class="step">
                            <legend>Confirm</legend>
							<p>
								Everything in the form was correctly filled
								if all the steps have a green checkmark icon.
								A red checkmark icon indicates that some field
								is missing or filled out with invalid data. In this
								last step the user can confirm the submission of
								the form.
							</p>
                            <p class="submit">
                                <button id="registerButton" type="submit" >Save</button>
                            </p>
                        </fieldset>
                    </form>
                </div>
                <div id="navigation" style="display:none;">
                    <ul>
                        <li class="selected">
                            <a href="#">Table Data</a>
                        </li>
 			<li>
                            <a href="#">Confirm</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>