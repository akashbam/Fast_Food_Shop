package fastFoodShop.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/placeOrder")
public class OrderPlacedServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int value=1;
		while(true)
		{
			 String name=req.getParameter(("pN"+value));
			 
			 
             String unit=req.getParameter(("pU"+value));
//            double price= Integer.parseInt( req.getParameter("pP"+value));
             
           // int qty= Integer.parseInt(req.getParameter("pQ"+value));
            
            System.out.println(name);
            System.out.println(unit);
            //System.out.println(price);
          //  System.out.println(qty);
             
		}
	}

	
	

}
