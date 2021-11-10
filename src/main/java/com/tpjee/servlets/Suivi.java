package com.tpjee.servlets;
import com.tpjee.ejb.EnregistrementBeanLocal;
import com.tpjee.ejb.SuiviBeanLocal;
import com.tpjee.model.Colis;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suivi
 */
@WebServlet("/suivi")
public class Suivi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB SuiviBeanLocal bean;
	
    public Suivi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		if(id == null) {
			//TODO
		} else {
			Long idL = Long.parseLong(id);
			Colis c = bean.getColis(idL);
			if(c == null) {
				request.setAttribute("text", "Le numéro de colis n'est pas valide ...");
				request.getRequestDispatcher("/customText.jsp").forward(request, response);
				return;
			} else {
		        request.setAttribute("colis", c);
			}
		}
        
		request.getRequestDispatcher("/suivi.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
