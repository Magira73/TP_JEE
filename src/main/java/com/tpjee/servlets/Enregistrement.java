package com.tpjee.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpjee.ejb.EnregistrementBeanLocal;
import com.tpjee.model.Colis;

/**
 * Servlet implementation class Enregistrement
 */ 
@WebServlet("/enregistrement")
public class Enregistrement extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB EnregistrementBeanLocal bean;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enregistrement() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.getServletContext().getRequestDispatcher("/enregistrement.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p = request.getParameter("poids");
		String val = request.getParameter("valeur");
		String src = request.getParameter("origine");
		String dest = request.getParameter("destination");
		
		double poids = Double.parseDouble(p);

		long id = bean.ajouterColis(poids, val, src, dest);
		
		request.setAttribute("text", "Le colis " + id + " a bien été ajouté");
				
		this.getServletContext().getRequestDispatcher("/customText.jsp").forward(request, response);
	}

}
