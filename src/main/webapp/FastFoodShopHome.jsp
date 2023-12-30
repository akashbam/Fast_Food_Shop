<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>My Fast Food Shop</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style type="text/css">
        body {
    background-color: #F5F5F5;
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

.container {
    text-align: center;
    background-color: white;
    padding: 20px;
}

.shop-name {
    font-size: 24px;
    font-weight: bold;
    margin-top: 20px;
}

.background-image {
    background-image: url("background.jpg");
    background-size: cover;
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    opacity: 0.3;
    z-index: -1;
}

.menu {
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
}

.menu-item {
    padding: 10px;
    border: 1px solid #ccc;
    margin: 10px;
    display: inline-block;
    background-color: white;
    border-radius: 10px;
    box-shadow: 2px 2px 5px #888888;
}

img {
    width: 100px;
    height: 100px;
}

.quantity-button {
    background-color: #4CAF50;
    color: white;
    border: none;
    padding: 5px 10px;
    cursor: pointer;
    margin: 5px;
}

.order-list {
    margin-top: 20px;
    text-align: left;
    background-color: white;
    border-radius: 10px;
    padding: 10px;
    box-shadow: 2px 2px 5px #888888;
}

#order-list-items {
    list-style: none;
    padding: 0;
}

#total-amount {
    font-weight: bold;
}

#submit-order {
    background-color: #4CAF50;
    color: white;
    border: 2px solid red;
    box-shadow: 10px 15px 15px gray;
    padding: 10px 20px;
    cursor: pointer;
    border-radius: 10px;
}

form {
    padding: 20px;
}
.Reduse-quantity-button
{
    border: 2px solid black;
    background-color: red;
}
.Add-quantity-button
{
    border: 2px solid black;
    background-color: lightgreen;

}
#name1{color: red}
#name2{color: green;}

#name1,#name2
{
    font-weight: bold;
    font-family: Arial Rounded MT Bold;
    font-size: 30px;
    
}
#submit-order
{        


            border-radius: 10px;
            color: white;            
            background-color: green;
            
            border: 2px solid black;
            
            box-shadow: 10px 10px 15px black;
            animation: shakebtn .8s both;
            transform: translate3d(0px, 0px, 0px);
            animation-iteration-count: infinite;
        }
        @keyframes shakebtn
        {
            0%,90%{transform: translate3d(-1px, 0px, 0px);}
            20%,80%{transform: translate3d(1px, 0px, 0px);}
            30%,50%,70%{transform: translate3d(-2px, 0px, 0px);}
            40%,60%{transform: translate3d(2px, 0px, 0px);}
     }
     #submit-order:hover
{        


            font-size: 20px;
            border-radius: 10px;
            color: black;            
            background-color: green;
            
            border: 2px solid black;            
            box-shadow: 10px 10px 15px black;
            
     }
     .Add-To-Order-button
     {        


            border-radius: 5px;
            color: white;            
            background-color: green;
            font-size: 15px;
            
            border: 2px solid black;
            
            box-shadow: 10px 10px 15px black;
            animation: shakebtn .8s both;
            transform: translate3d(0px, 0px, 0px);
            animation-iteration-count: infinite;
        }
        @keyframes shakebtn
        {
            0%,90%{transform: translate3d(-1px, 0px, 0px);}
            20%,80%{transform: translate3d(1px, 0px, 0px);}
            30%,50%,70%{transform: translate3d(-2px, 0px, 0px);}
            40%,60%{transform: translate3d(2px, 0px, 0px);}
     }
     .Add-To-Order-button:hover
     {     

           font-size: 20px;
           border-radius: 5px;


            color: white;            
            background-color: gray;
            
            border: 2px solid black;
            
            box-shadow: 10px 10px 15px black;
            animation: shakebtn .8s both;
            transform: translate3d(0px, 0px, 0px);
            animation-iteration-count: infinite;
        }
        @keyframes shakebtn
        {
            0%,90%{transform: translate3d(-1px, 0px, 0px);}
            20%,80%{transform: translate3d(1px, 0px, 0px);}
            30%,50%,70%{transform: translate3d(-2px, 0px, 0px);}
            40%,60%{transform: translate3d(2px, 0px, 0px);}
     }
     
     #Add-Toppings-Popup-button
     {        


            border-radius: 5px;
            color: black;            
            background-color: yellow;
            font-size: 15px;
            
            border: 2px solid black;
            
            box-shadow: 10px 10px 15px black;
            animation: shakebtn .8s both;
            transform: translate3d(0px, 0px, 0px);
            animation-iteration-count: infinite;
        }
        @keyframes shakebtn
        {
            0%,90%{transform: translate3d(-1px, 0px, 0px);}
            20%,80%{transform: translate3d(1px, 0px, 0px);}
            30%,50%,70%{transform: translate3d(-2px, 0px, 0px);}
            40%,60%{transform: translate3d(2px, 0px, 0px);}
     }
     #Add-Toppings-Popup-button:hover
     {     

           font-size: 20px;
           border-radius: 5px;


            color: white;            
            background-color: gray;
            
            border: 2px solid black;
            
            box-shadow: 10px 10px 15px black;
            animation: shakebtn .8s both;
            transform: translate3d(0px, 0px, 0px);
            animation-iteration-count: infinite;
        }
        @keyframes shakebtn
        {
            0%,90%{transform: translate3d(-1px, 0px, 0px);}
            20%,80%{transform: translate3d(1px, 0px, 0px);}
            30%,50%,70%{transform: translate3d(-2px, 0px, 0px);}
            40%,60%{transform: translate3d(2px, 0px, 0px);}
     }
     
     #table
     {
        border: 2px solid black;
        padding: 0px;
        margin: 0px;
     }
     #openPopup
     {
        background-color: orange;
        border: 2px double black;
     }
     #fl
     {
        color: green;
        
        font-family: Arial, sans-serif;

     }
    </style>


</head>
<body>

    <form action="placeOrder" method="post">
        <div class="container" id="mainDiv" style="display:'block'>
            <h1 class="shop-name">My --( <span id="name1">F</span><span id="name2">a</span><span id="name1">s</span><span id="name2">t</span> <span id="name1">F</span><span id="name2">o</span><span id="name1">o</span><span id="name2">d</span> )-- Shop</h1>
            <div class="background-image"></div>

            
            

            <div class="menu">
                <div class="menu-item">
                    <img src="pI.png" alt="Pizza">
                    <p>Pizza:</p>
                    <select name="food" id="food-selection">
                        <option value="CHOCOLATE-PIZZA" onclick="pizzaSelected1()">CHOCOLATE PIZZA </option>
                        <option value="PIZZA-MARGERITA" onclick="pizzaSelected2()">PIZZA MARGERITA</option>
                        <option value="FOUR-CHEESE-PIZZA" onclick="pizzaSelected3()">FOUR CHEESE PIZZA</option>
                        
                    </select>
                    <br>
                    <br>                   

                    <select name="food" id="size-selection">
                        <option value="small" >small </option>
                        <option value="LARGE"> LARGE </option>                        
                    </select>
                    <br>
                    <br>
                    <button type="button" class="Reduse-quantity-button" onclick="ReduseOneP()">-</button>
                    <input type="text" id="pQty" value="1" disabled style="width: 18px;">
                    <button type="button" class="Add-quantity-button" onclick="AddOneP()">+</button>
                    <br>
                    <br>
                    <button type="button" class="Add-To-Order-button" onclick="addPizza()">Add-To-Order</button>
                    <br>
                    <br>                    
                    <button type="button" class="button" id="Add-Toppings-Popup-button" style="display: none;" onclick="showToppings()">Add-Toppings</button>
                </div>

                <div class="menu-item">
                    <img src="https://wallpapercave.com/wp/wp1987065.jpg" alt="Burger">
                    <p>Special Burger - 100 Rs</p>                    
                    <br>
                    <br>
                    <br>
                    <br>
                    
                    <button type="button" class="Reduse-quantity-button" onclick="ReduseOneB()">-</button>
                    <input type="text" id="bQty" value="1" disabled style="width: 18px;">
                    <button type="button" class="Add-quantity-button" onclick="AddOneB()">+</button>
                    <br>
                    <br>
                    <button type="button" class="Add-To-Order-button" onclick="addBurger()">Add-To-Order</button>
                    <br>
                </div>                

                <div class="menu-item">
                    <img src="https://thumbs.dreamstime.com/z/finger-chips-french-fries-tomato-sauce-73796877.jpg" alt="Finger Chips">
                    <p>Finger Chips</p>
                    <br>
                    <br>
                    <select name="food" id="halfOrFull">
                        <option value="half" >half -60</option>
                        <option value="full"> full -120</option>                        
                    </select>
                    <br>
                    <br>
                    <button type="button" class="Reduse-quantity-button" onclick="ReduseOneF()">-</button>
                    <input type="text" id="fQty" value="1" disabled style="width: 18px;">
                    <button type="button" class="Add-quantity-button" onclick="AddOneF()">+</button>
                   <br>
                    <br>
                    <button type="button" class="Add-To-Order-button" onclick="addFingerChips()">Add-To-Order</button>
                    <br>

                </div>

                <div class="menu-item">
                    <img src="https://img-new.cgtrader.com/items/1897656/5c124d52df/coke-3d-project-file-3d-model-obj-mtl-fbx-blend.jpg" alt="Coke">
                    <p>Coke:</p>
                    <br>
                    <br>
                    <select  id="coke-type">
                        <option value="500ml-coke">500ml Coke - 50 Rs</option>
                        <option value="1000ml-coke">1000ml Coke - 100 Rs</option>
                    </select>
                    <br>
                    <br>
                    <button type="button" class="Reduse-quantity-button" onclick="ReduseOneC()">-</button>
                    <input type="text" id="cQty" value="1" disabled style="width: 18px;">
                    <button type="button" class="Add-quantity-button" onclick="AddOneC()">+</button>
                    <br>
                    <br>
                    <button type="button"  class="Add-To-Order-button" onclick="addCoke()">Add-To-Order</button>
                    <br>
                </div>
            </div>

            <div class="orderlist" id="orderlist" style="display:none;" align="center">
                <h1><span id="fl">Y</span>our <span id="fl">O</span>rder <span id="fl">L</span>ist</h1>
                <br>
               <table border="1" id="myTable">
                     <thead>
                            <tr>
                              
                               <th>Name</th>
                               <th>unit</th>
                               <th>Price</th>
                               <th>Qty</th>
                               <th>Total Price</th>
                           </tr>
                      </thead>
                      <tbody id="productTableBody">
                      </tbody>
               </table>

                <p>Total Amount: <span id="total-amount">0</span> Rs</p>
            </div>
            <br>
            <br>

            <div align="center">
                <button type="submit" id="submit-order" style="display:none" >PLACE ORDER</button>
            </div>
        </div>
    </form>

      <div class="popup" id="toppingPopup" style="display: none;" align="center">
          <form style="width:200px; background-color: skyblue; border: 2px solid black; box-shadow: 15px 10px 10px gray;" >
              <div class="popup-content">
            <p>Select Toppings:</p>
            <div class="options">

                <select name="food" id="toppingName">
                        <option value="Pepperoni" >Pepperoni (Rs 20)</option>
                        <option value="Mushroom"> Mushroom (Rs 30)</option>   
                        <option value="Extra-Cheese"> Extra-Cheese (Rs 25)</option>
                         <option value="Onion"> Onion (Rs 20)</option>
                          <option value="Green-Paper"> Green-Paper (Rs 15)</option>                        
                    </select>                
                <br>
                <br>                
                <button type="button" class="Reduse-quantity-button" onclick="ReduseOne()">-</button>
                    <input type="text" id="Qty" value="1" disabled style="width: 18px;">
                    <button type="button" class="Add-quantity-button" onclick="AddOne()">+</button>
                    <br>
                    <br>
            </div>
            <button type="button" class="button-ok" id="okToppings" onclick="doneToppings()" style="color: white; background-color: green; border-radius: 10px;">  OK  </button>
            <br>
            <br>
            <button type="button" class="button-cancle" id="noToppings" onclick="cancleToppings()" style="color: white; background-color: red; border-radius:10px;">CANCLE</button>
        </div>
          </form>
        
    </div>

    
   <div>
       <script type="text/javascript">
        ////////////////////////////////////////////////////////

         

         ////////////////////////////////////////////////////////

        


       function AddOne()
           {

            var previousValue=document.getElementById("Qty");
            var value=parseInt(previousValue.value);
            value++;
            previousValue.value=value;
           }

           function ReduseOne()
           {

            var previousValue=document.getElementById("Qty");
            var value=parseInt(previousValue.value);
            if (value > 1)
             {
                value--;
                previousValue.value = value;
            }
           }

      


        function showToppings()
        {
            const toppingPopup=document.getElementById("toppingPopup");
            const mainDiv=document.getElementById("mainDiv");
            
            toppingPopup.style.display='block';
            mainDiv.style.display = 'none';

        }

        function cancleToppings() 
        {
            var toppingPopup= document.getElementById("toppingPopup");
            toppingPopup.style.display = "none";

            var mainDiv= document.getElementById("mainDiv");
            mainDiv.style.display = "block";
        }



        ///////////////////////////////////////////////////////

        let productCount = 1;
        let totalAmout=0;




         document.getElementById('myTable').addEventListener('click', function(event) {
      if (event.target.classList.contains('remove-button')) {

        if (productCount>1) {
            productCount--;
        }
        if(productCount===1)
        {
            
            const orderlist=document.getElementById("orderlist");
            orderlist.style.display="none";

            const AddToppingsPopupbutton=document.getElementById("Add-Toppings-Popup-button");
            AddToppingsPopupbutton.style.display="none";

            
            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="none";
        }

        var row = event.target.closest('tr');

        var rowAmount = parseInt(row.querySelector('td:nth-child(5)').textContent.slice());

         // var totalPrice1 = totalAmout -  rowAmount;

         totalAmout-=rowAmount

            
        
            document.getElementById("total-amount").innerHTML=totalAmout;

        
        row.remove(); 
      }
    });











       const chake= document.getElementById("mainDiv");

       chake.addEventListener('click', () => {
            if(productCount>1)
            {
                
                const orderlist=document.getElementById("orderlist");
                orderlist.style.display="block";

            }
        });


        function doneToppings() {/////////////////////////////////////////////////////////////////////////////////////////////////////////
            


            var productName = "Pepperoni";
            var productUnit = "";
            var productPrice = 20;

            if(document.getElementById("toppingName").value=="Mushroom")
            {
                productPrice=30;
                productName="Mushroom";

            }
            else if(document.getElementById("toppingName").value=="Extra-Cheese")
            {
                productPrice=25;
                productName="Extra-Cheese";

            }
            else if(document.getElementById("toppingName").value=="Onion")
            {
                productPrice=20;
                productName="Onion";

            }
             else if(document.getElementById("toppingName").value=="Green-Paper")
            {
                productPrice=15;
                productName="Green-Paper";

            }
            var productQty = document.getElementById("Qty").value;
            var totalPrice = productPrice * productQty;

            totalAmout+=totalPrice;

            var tableBody = document.getElementById("productTableBody");
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                
                <td name="pN${productCount}">${productName}</td>
                <td name="pU${productCount}">${productUnit}</td>
                <td name="pP${productCount}">${productPrice} Rs</td>
                <td name="pQ${productCount}">${productQty}</td>
                <td>${totalPrice} Rs</td>
                <button class="remove-button" type="button" style="color:red;border:2px solid red; border-radius: 10px;" id="${productCount}">--</button>
            `;
            tableBody.appendChild(newRow);

            productCount++;
            document.getElementById("total-amount").innerHTML=totalAmout;
            var restartQty=1;
             document.getElementById("fQty").value=restartQty;

            var toppingPopup= document.getElementById("toppingPopup");
            toppingPopup.style.display = 'none';

            var mainDiv= document.getElementById("mainDiv");
            mainDiv.style.display = 'block';

            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="block";


        }


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

             function addFingerChips()
             {
            
            var productName = "Finger-chips";
            var productUnit = "Half";
            var productPrice = 60;

            if(document.getElementById("halfOrFull").value=="full")
            {
                productPrice=120;
                productUnit="Full"

            }
            var productQty = document.getElementById("fQty").value;
            var totalPrice = productPrice * productQty;

            totalAmout+=totalPrice;

            var tableBody = document.getElementById("productTableBody");
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                
                <td name="pN${productCount}">${productName}</td>
                <td name="pU${productCount}">${productUnit}</td>
                <td name="pP${productCount}">${productPrice} Rs</td>
                <td name="pQ${productCount}">${productQty}</td>
                <td id="totalPrice">${totalPrice} Rs</td>
                <button class="remove-button" type="button" style="color:red;border:2px solid red; border-radius: 10px;" id="${productCount}">--</button>
            `;
            tableBody.appendChild(newRow);

            productCount++;
            document.getElementById("total-amount").innerHTML=totalAmout;
            var restartQty=1;
             document.getElementById("fQty").value=restartQty;
             
              var dis= document.getElementById("Add-Toppings-Popup-button");
            dis.style.display = 'none';

            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="block";
        }

         function addCoke()
             {
            
            var productName = "Coke";
            var productUnit = "1000ml";
            var productPrice = 100;

            if(document.getElementById("coke-type").value=="500ml-coke")
            {
                productPrice=50;
                productUnit="500ml"

            }
            
            var productQty = document.getElementById("cQty").value;
            var totalPrice = productPrice * productQty;

            totalAmout+=totalPrice;

            var tableBody = document.getElementById("productTableBody");
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                
                <td name="pN${productCount}">${productName}</td>
                <td name="pU${productCount}">${productUnit}</td>
                <td name="pP${productCount}">${productPrice} Rs</td>
                <td name="pQ${productCount}">${productQty}</td>
                <td>${totalPrice} Rs</td>
                <button class="remove-button" type="button" style="color:red;border:2px solid red; border-radius: 10px;" id="${productCount}">--</button>
            `;
            tableBody.appendChild(newRow);

            productCount++;
            document.getElementById("total-amount").innerHTML=totalAmout;
            var restartQty=1;
             document.getElementById("cQty").value=restartQty;
              var dis= document.getElementById("Add-Toppings-Popup-button");
            dis.style.display = 'none';

            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="block";
        }


        function addBurger()
             {
            
            var productName = "Burger";
            var productUnit = "";
            var productPrice = 100;            
            
            var productQty = document.getElementById("bQty").value;
            var totalPrice = productPrice * productQty;

            totalAmout+=totalPrice;

            var tableBody = document.getElementById("productTableBody");
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                
               <td name="pN${productCount}">${productName}</td>
                <td name="pU${productCount}">${productUnit}</td>
                <td name="pP${productCount}">${productPrice} Rs</td>
                <td name="pQ${productCount}">${productQty}</td>
                <td>${totalPrice} Rs</td>
                <button class="remove-button" type="button" style="color:red;border:2px solid red; border-radius: 10px;" id="${productCount}">--</button>
            `;
            tableBody.appendChild(newRow);

            productCount++;
            document.getElementById("total-amount").innerHTML=totalAmout;
            var restartQty=1;
             document.getElementById("bQty").value=restartQty;
             var dis= document.getElementById("Add-Toppings-Popup-button");
            dis.style.display = 'none';

            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="block";

        }


        function addPizza()
             {
            
            var productName = document.getElementById("food-selection").value;
            var productUnit = "";
            var productPrice = 0;

            if(productName=="CHOCOLATE-PIZZA")
            {
                if(document.getElementById("size-selection").value=="small")
                {
                   productPrice=115;
                  productUnit="Small";
                }
                else
                {
                    productPrice=230;
                  productUnit="Large"
                }
 
            }
            else if(productName=="PIZZA-MARGERITA")
            {
                if(document.getElementById("size-selection").value=="small")
                {
                   productPrice=100;
                  productUnit="Small";
                }
                else
                {
                    productPrice=200;
                  productUnit="Large"
                }
 
            }
            else if(productName=="FOUR-CHEESE-PIZZA")
            {
                if(document.getElementById("size-selection").value=="small")
                {
                   productPrice=120;
                  productUnit="Small";
                }
                else
                {
                    productPrice=240;
                  productUnit="Large"
                }
 
            }
            
            var productQty = document.getElementById("pQty").value;
            var totalPrice = productPrice * productQty;

            totalAmout+=totalPrice;

            var tableBody = document.getElementById("productTableBody");
            var newRow = document.createElement("tr");
            newRow.innerHTML = `
                
                <td name="pN${productCount}">${productName}</td>
                <td name="pU${productCount}">${productUnit}</td>
                <td name="pP${productCount}">${productPrice} Rs</td>
                <td name="pQ${productCount}">${productQty}</td>
                <td>${totalPrice} Rs</td>
                <button class="remove-button" type="button" type="button" style="color:red;border:2px solid red; border-radius: 10px;" id="${productCount}">--</button>
            `;
            tableBody.appendChild(newRow);

            productCount++;
            document.getElementById("total-amount").innerHTML=totalAmout;

            var restartQty=1;
             document.getElementById("pQty").value=restartQty;

            var dis= document.getElementById("Add-Toppings-Popup-button");
            dis.style.display = 'block';

            const submitorder=document.getElementById("submit-order");
            submitorder.style.display="block";             
            
        }


           function AddOneF()
           {

            var previousValue=document.getElementById("fQty");
            var value=parseInt(previousValue.value);
            value++;
            previousValue.value=value;
           }

           function ReduseOneF()
           {

            var previousValue=document.getElementById("fQty");
            var value=parseInt(previousValue.value);
            if (value > 1)
             {
                value--;
                previousValue.value = value;
            }
           }




           function AddOneC()
           {

            var previousValue=document.getElementById("cQty");
            var value=parseInt(previousValue.value);
            value++;
            previousValue.value=value;
           }

           function ReduseOneC()
           {

            var previousValue=document.getElementById("cQty");
            var value=parseInt(previousValue.value);
            if (value > 1)
             {
                value--;
                previousValue.value = value;
            }
           }



           function AddOneB()
           {

            var previousValue=document.getElementById("bQty");
            var value=parseInt(previousValue.value);
            value++;
            previousValue.value=value;
           }

           function ReduseOneB()
           {

            var previousValue=document.getElementById("bQty");
            var value=parseInt(previousValue.value);
            if (value > 1)
             {
                value--;
                previousValue.value = value;
            }
           }



           function AddOneP()
           {

            var previousValue=document.getElementById("pQty");
            var value=parseInt(previousValue.value);
            value++;
            previousValue.value=value;
           }

           function ReduseOneP()
           {

            var previousValue=document.getElementById("pQty");
            var value=parseInt(previousValue.value);
            if (value > 1)
             {
                value--;
                previousValue.value = value;
            }
           }

       </script>
   </div>
</body>
</html>