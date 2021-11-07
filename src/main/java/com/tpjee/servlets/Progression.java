package com.tpjee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpjee.model.Colis;

/**
 * Servlet implementation class Progression
 */
@WebServlet("/progression")
public class Progression extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Progression() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/progression.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		String p = request.getParameter("poid");
//		String val = request.getParameter("valeur");
//		double poid = Double.parseDouble(p);
//		Colis co = ejb.ajouterColis(poid, val);
//		
//		request.setAttribute("colis", co);
		
		this.getServletContext().getRequestDispatcher("/progression.jsp").forward(request, response);
	}

}
