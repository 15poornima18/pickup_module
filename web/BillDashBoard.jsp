<%-- 
    Document   : BillDashBoard
    Created on : 13 Jun, 2020, 12:07:19 PM
    Author     : Poornima Tomar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=PT+Sans|Roboto+Mono&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="CSS/calculator.css">
    <title>ScrapKart Calculator DashBoard</title>
</head>
<body >
    <ul >        
            <a href="EmployeePage.jsp"><img src="Images/scrap1.jpeg" alt="ScrapKart" height="60" width="100"></a>       
            <li><a href="EmployeePage.jsp">Sign Out</a></li>
            <li><a href="Bill.jsp">Bill</a></li>
            <li><a href="BillDashBoard.jsp">ScrapKart Calculator</a></li>
            <li><a href="ReqDashBoard.jsp">Request</a></li>
            <li><a href="PickupBoyProfile.jsp">Profile</a></li>
        </ul>
       
        <div class="row" >
            <h3>
                <img class ="gif"src="Images/new.gif"><strong>SCRAPKART BILL CALCULATOR</strong>
            </h3>
            <p>Select Scrap Items and enter an approximate weight </p><br>
            
           <a href="#amount"><button type="button" class="btn btn-warning"  id="calculate" onclick="on();">Generate Bill</button></a>
      </div>
     
        <div class="container Details" style="background-color:whitesmoke ; border-radius: 7px;">
            <div class="table-responsive">          
                <table class="table" >
                    <thead style="color: green;">
                    <tr>
                      <th>Items</th>
                      <th>Rate (per kg)</th>
                      <th>Weight(in kg)</th>
                    </tr>
                  </thead>
                  <tbody class="mycontent">
                    <tr>
                      <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Books</span></td>
                      <td>7</td>
                      <td ><div class="form-group placebox">
                        <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                      </div>
                      </td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Aluminium</span></td>
                        <td>75</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Iron</span></td>
                        <td>14</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Newpapers</span></td>
                        <td>8</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Hard plastic</span></td>
                        <td>8</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Brass</span></td>
                        <td>100</td>
                        <td><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Carton_House</span></td>
                        <td>5</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Carton_Shop</span></td>
                        <td>6</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Polythene</span></td>
                        <td>6</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
  
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Tin</span></td>
                        <td>10</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Steel</span></td>
                        <td>23</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Tyre</span></td>
                        <td>3</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Water/Oilcovers</span></td>
                        <td>4</td>
                        <td><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Fibre</span></td>
                        <td>7</td>
                        <td><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>E-Waste</span></td>
                        <td>10</td>
                        <td><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Water/Oilcovers</span></td>
                        <td>4</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>Fibre</span></td>
                        <td>7</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                    <tr>
                        <td><input type="checkbox" class="form-check-input" value="" onclick="able();"><span>E-Waste</span></td>
                        <td>10</td>
                        <td ><div class="form-group placebox">
                            <input type="text" class="form-control" placeholder="Enter Weight" name="text1" disabled>
                          </div></td>
                    </tr>
                   
                  </tbody>
                </table>
            </div>
        </div>
        <div id="amount" onclick="off();">
        </div>
       
</body>

<script>
   

    function on()
    {
    document.getElementById("calculate").disabled=true;
    createTable();
    document.getElementById("amount").style.display ="block";
  
   
    
  }

  function off()
  {
    document.getElementById("amount").style.display="none";
    var elem=document.getElementById("amount");
    elem.innerHTML="";
    document.getElementById("calculate").disabled=false;
  }
 
  function able()
  {
    var flag=0;
    var l= document.getElementsByTagName("TABLE")[0].getElementsByClassName("mycontent")[0].rows.length;

    var base=document.getElementsByTagName("TABLE")[0].getElementsByClassName("mycontent")[0];

    for(var i=0;i<l;i++)
    {
      var check= base.rows[i].getElementsByClassName("form-check-input")[0].checked;
      var amt=base.rows[i].getElementsByClassName("form-control")[0].value;
      if(check)
      {
          document.getElementsByClassName("form-control")[i].disabled=false;
          flag=1;
      }
      else{
        document.getElementsByClassName("form-control")[i].disabled=true;
        base.rows[i].getElementsByClassName("form-control")[0].value="";
        flag=0;

      }

    }
    

  }



  function createTable(){

    var table=document.createElement("table");
    table.setAttribute('id','calTable');
    var arrHead=new Array();
    arrHead=['Selected Item','Rate (Rs/kg)','Entered Quantity (in kg)'];

    var arrValue=new Array();
    var l= document.getElementsByTagName("TABLE")[0].getElementsByClassName("mycontent")[0].rows.length;

    var base=document.getElementsByTagName("TABLE")[0].getElementsByClassName("mycontent")[0];
    
    var sum=0;
    for(var i=1;i<l;i++)
    {
      var check= base.rows[i].getElementsByClassName("form-check-input")[0].checked;

      var x=base.rows[i].getElementsByTagName("SPAN")[0].innerHTML;
      var r= base.rows[i].getElementsByTagName("TD")[1].innerHTML;
      var amt=base.rows[i].getElementsByClassName("form-control")[0].value;
     
      if(check )
      {
        arrValue.push([x,r,amt]);
        sum+=r*amt;
      }
      
    }

    var tr=table.insertRow(-1);

    for(var h=0;h<arrHead.length;h++)
    {
      var th = document.createElement('th');  
      th.innerHTML=arrHead[h];
      tr.appendChild(th);

    }

    for (var c = 0; c <= arrValue.length - 1; c++)
     {
            tr = table.insertRow(-1);

            for (var j = 0; j < arrHead.length; j++) 
            {
                var td = document.createElement('td');          // TABLE DEFINITION.
                td = tr.insertCell(-1);
                td.innerHTML = arrValue[c][j];                  // ADD VALUES TO EACH CELL.
            }
      }


      document.getElementById("amount").appendChild(table);
      var div=document.createElement('div');
      div.innerHTML= "Amount is: "+sum+" Rupees";
      div.setAttribute("id",'result');
      document.getElementById("amount").appendChild(div);
      var button=document.createElement("input");
      button.setAttribute("value",'Scroll To Top');
      button.setAttribute("id","mybtn");
      button.setAttribute('type',"button");
      document.getElementById("amount").appendChild(button);
      button.setAttribute("onclick","funcScroll()");

  }

  function funcScroll()
  {
    document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
  }

  // function funcFooter(){
  //     var newelem=document.createElement("div");
  //     newelem.setAttribute("id","info");
  //     document.getElementById("info").innerHTML="Give the terms and Conditions";
  //     document.getElementById("info").style.display="block";
      
  // }
  
  
</script>
</html>