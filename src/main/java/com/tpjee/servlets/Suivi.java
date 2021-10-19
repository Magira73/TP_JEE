package com.tpjee.servlets;
import com.tpjee.model.Colis;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suivi
 */
@WebServlet("/Suivi")
public class Suivi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Suivi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		/*On récupère le colis en question*/
		
		Colis c = new Colis();
				
		
        request.setAttribute("colis", id);
        
		this.getServletContext().getRequestDispatcher("/WEB-INF/suivi.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
