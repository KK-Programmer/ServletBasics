package org.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.business.RepositoryService;
import org.web.models.ReservationEvent;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String reservationId=request.getParameter("resId");
		String pnrNumber=request.getParameter("pnrNumber");
		String subType=request.getParameter("subType");
		
		ReservationEvent reservationEvent = new ReservationEvent(Integer.parseInt(reservationId), pnrNumber, subType);
		
		int count=RepositoryService.InsertReservationEventDetails(reservationEvent);
		
		if(count==1){
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("getReservationEventBasedOnId");
			requestDispatcher.forward(request, response);
		}else{
			response.sendRedirect("jsps/failurepage.jsp");
		}
		
	}

}
