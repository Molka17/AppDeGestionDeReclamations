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
import metier.reclamation.interfac.ReclamationServiceLocal;
import metier.reclamation.interfaces.Impl.*;




@WebServlet(name="/HomeEtudiantServlet",urlPatterns={"/etudiant"})
public class HomeEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context ;
	@EJB private AuthentificationServiceLocal authentification;
	@EJB private ReclamationServiceLocal reclam;
   
    public HomeEtudiantServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		context= request.getSession().getServletContext();
		List<Reclamation> listeE = reclam.listerReclamationParEtudiant(null);
		context.setAttribute("listeReclamations", listeE);
		context.getRequestDispatcher("/homeEtudiant.jsp").forward(request, response);
	
	}
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
context= request.getSession().getServletContext();
String action=request.getParameter("action"); 

if(action.equals("ajouter")) {
		String titre= request.getParameter("titre");
		String des=request.getParameter("description");
		Reclamation r =new Reclamation(titre,des);
		  reclam.ajouterReclamation(r);
			

		
		
		 context.getRequestDispatcher("/homeEtudiant.jsp").forward(request, response);
	//	doGet(request, response);
	}

	}}
