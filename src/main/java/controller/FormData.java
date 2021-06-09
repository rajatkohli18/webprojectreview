package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormDaoImpl;
import model.Application;

/**
 * Servlet implementation class FormData
 */
public class FormData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");

		String phonenumber = request.getParameter("tel");
		String currentlocation = request.getParameter("address");
		String applicationdate = request.getParameter("applicationdate");
		String file = request.getParameter("file");
		String mid = request.getParameter("mid");
		String experience = request.getParameter("experience");
		String noticeperiord = request.getParameter("noticeperiod");
		Application application = new Application();

		application.setEmail(email);
		application.setFirtsname(firstname);
		application.setLastsname(lastname);
		application.setPhonenumber(phonenumber);
		application.setCurrentlocation(currentlocation);
		application.setApplicaiondate(applicationdate);
		application.setExperience(experience);
		application.setMid(mid);
		application.setNoiceperiod(noticeperiord);

		System.out.println("File path: " + file);

		PrintWriter out = response.getWriter();

		FormDaoImpl regdao = new FormDaoImpl();

//		String res = pdao.RegisterPlayer(player);

		if (regdao.RegisterData(application) == "Data added Successfully!!!") {

			System.out.println("VALID!!!");

			response.setStatus(200);

			out.println("<script type=\"text/javascript\">");
			out.println("alert('User Registerd Successfully!');");
			out.println("location='index.jsp';");
			out.println("</script>");
		} else {
			response.setStatus(401);

			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error while registering user!');");
			out.println("location='index.jsp';");
			out.println("</script>");
		}

	}
}
