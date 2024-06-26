package Currency;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CurrencyServlet
 */
@WebServlet("/currency")
public class CurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 double u=0;
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw=response.getWriter();
		 response.setContentType("text/html");
		 
		 double ev=Double.parseDouble(request.getParameter("num"));
		String fromcurrency=request.getParameter("selectf");
		
		String tocurrency=request.getParameter("selectt"); 
		
		//india us
		
		pw.print("<html><body><center><h3>");
		
		if(fromcurrency.equals("ir") && tocurrency.equals("ud"))
		{
			double res=ev*0.012;
	
		pw.print(ev+"INR = "+res+"USD");
		}
		
		if(fromcurrency.equals("ud") && tocurrency.equals("ir"))
		{
			double res=ev*83.556859;
			pw.print(ev +"USD = "+res+"INR");
		}
		 
		//india eru
		if(fromcurrency.equals("ir") && tocurrency.equals("er"))
		{
			double res=ev*0.0112;
	
		pw.print(ev+"INR = "+res+"EUR");
		}
		
		if(fromcurrency.equals("er") && tocurrency.equals("ir"))
		{
			double res=ev*89.376865;
			pw.print(ev +"EUR = "+res+"INR");
		}
		 
		
       //india britsh
		if(fromcurrency.equals("ir") && tocurrency.equals("bp"))
		{
			double res=ev*0.009460;
	
		pw.print(ev+"INR = "+res+"BPD");
		}
		
		if(fromcurrency.equals("bp") && tocurrency.equals("ir"))
		{
			double res=ev*105.705741;
			pw.print(ev +"BPD = "+res+"INR");
		}
 
		 //india australia
		if(fromcurrency.equals("ir") && tocurrency.equals("ad"))
		{
			double res=ev*0.018010;
	
		pw.print(ev+"INR = "+res+"AUD");
		}
		
		if(fromcurrency.equals("ad") && tocurrency.equals("ir"))
		{
			double res=ev*55.524783;
			pw.print(ev +"AUD = "+res+"INR");
		}
 
		//i c
		
		if(fromcurrency.equals("ir") && tocurrency.equals("cd"))
		{
			double res=ev*0.016391;
	
		pw.print(ev+"INR = "+res+"CAD");
		}
		
		if(fromcurrency.equals("cd") && tocurrency.equals("ir"))
		{
			double res=ev*61.008550;
			pw.print(ev +"CAD = "+res+"INR");
		}
		
		//singapur
		
		if(fromcurrency.equals("ir") && tocurrency.equals("sd"))
		{
			double res=ev*0.016216;
	
		pw.print(ev+"INR = "+res+"SAD");
		}
		
		if(fromcurrency.equals("sd") && tocurrency.equals("ir"))
		{
			double res=ev*61.667271;
			pw.print(ev +"SAD = "+res+"INR");
		}
		
		//s france
		
		if(fromcurrency.equals("ir") && tocurrency.equals("sf"))
		{
			double res=ev*0.010697;
	
		pw.print(ev+"INR = "+res+"SF");
		}
		
		if(fromcurrency.equals("sf") && tocurrency.equals("ir"))
		{
			double res=ev*93.487749;
			pw.print(ev +"SF = "+res+"INR");
		}
		
		//ml
		
		if(fromcurrency.equals("ir") && tocurrency.equals("mr"))
		{
			double res=ev*0.056398;
	
		pw.print(ev+"INR = "+res+"MR");
		}
		
		if(fromcurrency.equals("mr") && tocurrency.equals("ir"))
		{
			double res=ev*17.731012;
			pw.print(ev +"MR = "+res+"INR");
		}
		
		//japan
		if(fromcurrency.equals("ir") && tocurrency.equals("jy"))
		{
			double res=ev*1.912262;
	
		pw.print(ev+"INR = "+res+"JY");
		}
		
		if(fromcurrency.equals("jy") && tocurrency.equals("ir"))
		{
			double res=ev*0.522941;
			pw.print(ev +"JY = "+res+"INR");
		}
		
		//chinese
		
		
		if(fromcurrency.equals("ir") && tocurrency.equals("cy"))
		{
			double res=ev*11.508344;
	
		pw.print(ev+"INR = "+res+"CY");
		}
		
		if(fromcurrency.equals("cy") && tocurrency.equals("ir"))
		{
			double res=ev*0.086893;
			pw.print(ev +"CY = "+res+"INR");
		}
		
		
		
		//Ud
		
		
				if(fromcurrency.equals("er") && tocurrency.equals("ud"))
				{
					double res=ev*1.0694;
			
				pw.print(ev+"EUR = "+res+"USD");
				}
				
				if(fromcurrency.equals("ud") && tocurrency.equals("er"))
				{
					double res=ev*0.9351;
					pw.print(ev +"USD = "+res+"EUR");
				}
				 
				//india eru
				if(fromcurrency.equals("ud") && tocurrency.equals("ad"))
				{
					double res=ev*1.5038;
			
				pw.print(ev+"USD  = "+res+"AUD");
				}
				
				if(fromcurrency.equals("ad") && tocurrency.equals("ud"))
				{
					double res=ev*0.665;
					pw.print(ev +"AUD = "+res+"USD");
				}
				 
				
		       //india britsh
				if(fromcurrency.equals("ud") && tocurrency.equals("bp"))
				{
					double res=ev*0.7903;
			
				pw.print(ev+"USD = "+res+"BPD");
				}
				
				if(fromcurrency.equals("bp") && tocurrency.equals("ud"))
				{
					double res=ev*1.2657;
					pw.print(ev +"BPD = "+res+"USD");
				}
		 
				 //india australia
				if(fromcurrency.equals("cd") && tocurrency.equals("ud"))
				{
					double res=ev*0.7302;
			
				pw.print(ev+"CAD = "+res+"USD");
				}
				
				if(fromcurrency.equals("ud") && tocurrency.equals("cd"))
				{
					double res=ev*1.3696;
					pw.print(ev +"USD = "+res+"CAD");
				}
		 
				//i c
				
				if(fromcurrency.equals("ud") && tocurrency.equals("sd"))
				{
					double res=ev*1.355;
			
				pw.print(ev+"USD = "+res+"SPD");
				}
				
				if(fromcurrency.equals("sd") && tocurrency.equals("ud"))
				{
					double res=ev*0.738;
					pw.print(ev +"SPD = "+res+"USD");
				}
				
	
             pw.print("</h3></center></body></html>");
		
		RequestDispatcher rd=request.getRequestDispatcher("NewCurrency.html")	 ;
		rd.include(request, response);
	}

}

	
	 
	 