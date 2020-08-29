<%-- 
    Document   : RequestPage
    Created on : 29 Feb, 2020, 12:45:39 PM
    Author     : Poornima Tomar
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>ScrapKart DashBoard PickUpBoy</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="CSS/requeststyle.css">
        
    </head>
<body>
    <div>
        <ul>
            <li id="logo"><img src="images/logo.jpg" alt="ScrapKart" height="60" width="100"></li>
            <li><a href="EmployeeLogin.html">Log out</a></li>
            <li><a href="">Profile</a></li>
            <li><a href="request.html">Expenses</a></li>
            <li><a href="DashBoard.html">DashBoard</a></li>
            
           
             
        </ul>
    </div>
    <br>
    <hr style="color: black;">
    <div class="heading">
    
        <h3 style="margin-left: 27px;margin-top: 20px; text-align: center;">PICKUP BOY PANEL</h3>
    </div>   <br>
    <div class="major">
    <div class="minor1">
         <form>
            <h3>Filters</h3>
            <br>
            <a onclick="enable()" class="resetAnchor" > <p style="color:graytext; font-size: small;float:right" onMouseOver="this.style.color=red" onMouseOut="this.style.color=gray">Reset Filters</p></a>
            <label for="Date">Search by Date Range</label><br>
            <label> From</label><br>
            <a onclick="disable2()"><input type="date" name="fromDate"></a>
            <label> To</label><br>
            <a onclick="disable2()"><input type="date" name="toDate"></a>
            <input type="submit" value="Search" style="background-color: orange;">
        </form>
    </div>
   
    <button class="refresh" style="background-color:rgb(0, 0, 255); border-radius: 5px; color: white;" >
        <img src="images/product.png" height="20" width="20">
        <span>Today's Requests</span>
     </button>
     <button class="refresh" style="background-color:red; border-radius: 5px; color:white;" >
        <img src="images/product.png" height="20" width="20" >
        <span>Missed Requests</span>
     </button>
     <h4 style="color:white; text-align: center;">TODAY'S REQUESTS :</h4>
    <div class="minor3">


        <table class="table  reqTable" >
            <thead class="rowhead">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Req. Assigned</th>
                    <th>Status</th>
                    <th>Date</th>    
               </tr>
           </thead>
           <tbody>

               <tr>
                  <td>234</td> 
                  <td>harshita JOshi</td>
                  <td>R1231</td>
                  <td>Assigned</td>
                  <td>12 Feb</td>
               </tr>
              

           </tbody>
   </table>
    </div>    
    </div>
</body>
</html>