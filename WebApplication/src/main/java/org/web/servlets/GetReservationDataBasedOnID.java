package org.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.business.RepositoryService;
import org.web.models.ReservationEvent;

/**
 * Servlet implementation class GetReservationDataBasedOnID
 */
//@WebServlet("/getReservationDataBasedOnId")
public class GetReservationDataBasedOnID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reservationId=request.getParameter("resId");
		ReservationEvent reservationEvent=RepositoryService.GetReservationDetails(Integer.parseInt(reservationId));
		System.out.println(reservationEvent);
		request.setAttribute("re", reservationEvent);
		if (reservationEvent!=null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("jsps/printDetails.jsp");
			rd.include(request, response);
		}
			
			
	}

}
