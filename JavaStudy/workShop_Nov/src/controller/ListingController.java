package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import service.SignupService;

public class ListingController extends HttpServlet {
	HttpServletRequest request;
	HttpServletResponse response;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		try {

			String item = request.getParameter("name");
			String price = request.getParameter("price");
			String file = request.getParameter("item_image");
			String category = request.getParameter("item_category");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ServletContext context = this.getServletContext();
			RequestDispatcher dispatcher = context.getRequestDispatcher("/listing.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
