package metier.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mertier.reclamation.*;
import metier.reclamation.interfac.AuthentificationServiceLocal;
import metier.reclamation.interfac.EtudiantServiceLocal;
import metier.reclamation.interfac.ReclamationServiceLocal;
import metier.reclamation.interfaces.Impl.*;




@WebServlet("/HomeAdminServlet")
public class HomeAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context ;
	@EJB private AuthentificationServiceLocal authentification;
	@EJB private ReclamationServiceLocal reclam;
	@EJB private EtudiantServiceLocal service;
   
    public HomeAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		context= request.getSession().getServletContext();
	   List<Etudiant> listeEtudiants = authentification.listerEtudiants();
				context.setAttribute("listeEtudiants", listeEtudiants);
           context.getRequestDispatcher("/homeAdmin.jsp").forward(request, response);
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}

