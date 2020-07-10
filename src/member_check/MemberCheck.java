package member_check;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberCheck
 */
@WebServlet("/MemberCheck")
public class MemberCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String sname = request.getParameter("pname");
		String ssn = request.getParameter("psn");
		String sid = request.getParameter("pid");
		String spwd = request.getParameter("ppwd");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름 : <b>" + sname);
		out.print("</b><br>주민등록번호 : " + ssn);
		out.print("</body></html>");
		out.print("</b><br>아이디 : " + sid);
		out.print("</body></html>");
		out.print("</b><br>패스워드 : " + spwd);
		out.print("</body></html>");
		out.close();
	}
}
