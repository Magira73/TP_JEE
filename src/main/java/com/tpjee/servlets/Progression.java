package com.tpjee.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tpjee.ejb.ProgressionBeanLocal;
import com.tpjee.ejb.SuiviBeanLocal;
import com.tpjee.model.Colis;

/**
 * Servlet implementation class Progression
 */
@WebServlet("/progression")
public class Progression extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	@EJB ProgressionBeanLocal bean;

       
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
		String id = request.getParameter("id");
	
		long idL = Long.parseLong(id);
		Colis c = bean.getColis(idL);
		
		if(c == null) {
			request.setAttribute("text", "Le numéro de colis n'est pas valide ...");
			request.getRequestDispatcher("/customText.jsp").forward(request, response);
			return;
		} else {
	        request.setAttribute("colis", c);
		}					
		
		request.getRequestDispatcher("/progression.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		long id = Long.parseLong(request.getParameter("id"));

		bean.ajouterEmplacement(id, nom);
		
        request.setAttribute("text", "Le colis a bien été mis à jour !");
		this.getServletContext().getRequestDispatcher("/customText.jsp").forward(request, response);
	}

}
