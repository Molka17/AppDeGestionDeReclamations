package metier.controller;



import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mertier.reclamation.Etudiant;
import metier.reclamation.interfac.AuthentificationServiceLocal;
import metier.reclamation.interfac.ReclamationServiceLocal;
import metier.reclamation.interfaces.Impl.*;
@WebServlet(name="/AuthentificationServlet" ,urlPatterns={"/controleur"}) //controleur

public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ServletContext context ;
	@EJB private AuthentificationServiceLocal authentification;
	@EJB private ReclamationServiceLocal reclam;
	
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	context= request.getSession().getServletContext();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 List<Etudiant> listeEtudiants=	authentification.listerEtudiants();
		 context.setAttribute("listeEtudiants", listeEtudiants);
		 context.getRequestDispatcher("/authentifier.jsp").forward(request, response);*/
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context= request.getSession().getServletContext();
		
		String username= request.getParameter("username");
		String password=request.getParameter("password");
		
		  Etudiant e=	(Etudiant) authentification.authentifier(username, password);
			
		  context.getRequestDispatcher("/authentifier.jsp").forward(request, response); 
			 
	}

}
