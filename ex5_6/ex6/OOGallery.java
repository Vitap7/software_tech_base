import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OOGallery extends HttpServlet {
	public void doPost(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {

		/**
		 *  Indicate the content type (for example, text/html), 
		 *  being returned by the response
		 */
		response.setContentType("text/html");

		/** 
		 * 	Retrieve an output stream to use to send data to the client 
		 */
		PrintWriter out = response.getWriter();

		/**
		 *	 Get the user input from the form
		 */
		String bgrnd = request.getParameter("bgrnd");
		String theme = request.getParameter("theme");

		/** 
		 * 	Create an instance of the HtmlPage class 
		 */
		HtmlPage htmlPage = new HtmlPage();
		
		/**
         *  Set the title for the response Web page
         */
		htmlPage.setTitle("OOGalleryForm");

		/** 
		 * 	Create an instance of the HtmlImage class for the first image
		 */
		HtmlImage htmlImage1 = new HtmlImage("resource/img/"+theme+"One.jpg",theme+"One");

		/**
		 * 	Create an instance of the HtmlImage class for the second image
		 */
		HtmlImage htmlImage2 = new HtmlImage("resource/img/"+theme+"Two.jpg",theme+"Two");

		/** 
		 * 	Set the attributes of the HtmlPage object 
		 */
		htmlPage.setBackgroundImage("resource/img/"+ bgrnd +".gif");


		/** 
		 * 	Add the images 
		 */
		if(!(theme==null))
		{
			htmlPage.addText(htmlImage1.buildHtml());
			htmlPage.addText("<br>");
			htmlPage.addText(htmlImage2.buildHtml());
		}

		/**
		 *	 Construct the HTML response
		 */
		out.println(htmlPage.buildHtml());
	}
}
