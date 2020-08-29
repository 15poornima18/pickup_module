<%-- 
    Document   : Bill
    Created on : 18 Mar, 2020, 8:39:56 PM
    Author     : Poornima Tomar
--%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"> </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=PT+Sans|Roboto+Mono&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="CSS/billstyle.css">
    <title>Bill DashBoard</title>
</head>
<body>
    <div>
    <ul>
        <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>
        <li><a href="EmployeePage.jsp">Sign Out</a></li>
        <li><a href="Bill.jsp">Bill</a></li>
        <li><a href="BillDashBoard.jsp">ScrapKart Calculator</a></li>
        <li><a href="ReqDashBoard.jsp">Request</a></li>
        <li><a href="PickupBoyProfile.jsp">Profile</a></li>
    </ul>
</div> 

<div class="container"  class="col-sm-8" style="margin-top: 50px; height: 900px; background-color:white; ">
    <div class="row">
          <div class="col-sm-12" style="height: 1250px; background-color:whitesmoke;  "> 

         <form class="form-horizontal" action="" style="font-size: 20px; overflow: hidden;">
          <fieldset>
            <h3 style="text-align: center; color: green; font-size: 35px;">ScrapKart Bill</h3><br>
                <label style="color: green; align-items: center; text-align: center; margin-left: 50px;">Billed To:</label>
          <div class="form-group" style="width: 50%; margin-left: 30px;"> 
              <label class="control-label col-sm-2" for="custid">Customer Id:</label>
            <div class="col-sm-10">
            <input type="text" class="form-control" id="custid" 
                placeholder="" name="cust_id"> 
            </div>
          </div> <br>
   <table class="table table-responsive" >
            <tr style="color: green; text-align: center;">
                <th style="width:120px; text-align: center;">Item</th>
                <th style="width:120px; text-align: center;">Cost</th>
                <th style="width:120px; text-align: center;">Weight</th>
            </tr>
            
            <tr>
               <td><input type="checkbox" >  Book </td>
                <td>6</td>
                <td><input type="number" name="weight"></td>
            </tr>
            
            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Aluminium </td>
                <td>75</td>
                <td><input type="number" name="weight"></td>
            </tr>
            <tr>
               <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Iron </td>
                <td>14</td>
                <td><input type="number" name="weight"></td>
            </tr>
            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  NewsPaper </td>
                <td>13</td>
                <td><input type="number" name="weight"></td>
            </tr>
            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Hard Plastic </td>
                <td>8</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
               <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Brass </td>
                <td>180</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Carton_house </td>
                <td>5</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
               <td><input type="checkbox" class="form-check-input"  names="item" value="" onclick="able();">  Carton_shop </td>
                <td>6</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Polythene </td>
                <td>4</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Tin </td>
                <td>10</td>
                <td><input type="number" name="weight"></td>
            </tr>

            <tr>
                <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Steel </td>
                <td>23</td> 
                <td><input type="number" name="weight"></td>

            </tr>

            <tr>
               <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Tyre</td>
                <td>3</td>
                <td><input type="number" name="weight"></td>

            </tr>

           
            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  Fiber </td>
                <td>7</td>
                <td><input type="number" name="weight"></td>

            </tr>

            <tr>
              <td><input type="checkbox" class="form-check-input" names="item" value="" onclick="able();">  E-waste </td>
                <td>10</td>
                <td><input type="number" name="weight"></td>

            </tr>   
        </table>
    
        <br>
        <div id="b1">
        <a href="FinalBill.jsp" >   
            <label id="b2" type="submit" class="btn bg-success" style="font-size:20px; background-color: green;"> 
                Submit
            </label> 
            </a>
        </div>
          
    </fieldset>
         </form>      
         </div>
     </div>
     
</body>
