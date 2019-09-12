<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
    <head> 
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
       <title>Login Page</title> 
    </head> 
    <body> 
    <form>
        <h1>User Details</h1> 
        <%-- The form data will be passed to acceptuser.jsp  
             for validation on clicking submit 
        --%>  
       
            Enter Username : <input type="text" id="user"><br/><br/> 
            Enter Password : <input type="password" id ="pass"><br/> 
               <input type ="button" onclick="validate()" value="SUBMIT">     
               
       </form> 
    </body> 
    
    <script type="text/javascript">
    function validate(){
    	console.log("In validate");
    	var d1=document.getElementById("user").value; // start date 
    	var d2=document.getElementById("pass").value; //end date 

    	if(d1=="Shilpa" && d2=="abn123@") 
		{ 
    			location.href = "http://localhost:8080/getForm";
    	}
    	else{ 
    		alert("Log Failed!!"); // handle your error validation here 
         
    	} 
    }
    </script>
</html> 