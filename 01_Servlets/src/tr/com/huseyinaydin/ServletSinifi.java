package tr.com.huseyinaydin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

@WebServlet(name = "ServletSinifi", urlPatterns = { "/ServletSinifi" })
public class ServletSinifi extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ServletSinifi() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String kullanciAdi = request.getParameter("kullanciAdi").toString();
			String parola = request.getParameter("parola").toString();

			out.println("<html>");
			out.println("<head>");
			out.println("<meta http-equiv=Content-Type content=text/html; charset=UTF-8>");
			out.println("<title>Merkez</title>");
			out.println("</head>");
			out.println("<body>");

			out.println("<h1>Servlet : " + request.getContextPath() + "</h1>");
			out.println("<h2> Kullanıcı Adı : <font color=red>" + kullanciAdi + "</font> HOŞ GELDİNİZ</h2>");
			out.println("<h2> Parola        : <font color=red>" + parola + "</font> </h2>");

			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}