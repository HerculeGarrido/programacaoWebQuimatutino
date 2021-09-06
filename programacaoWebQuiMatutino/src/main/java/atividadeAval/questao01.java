package atividadeAval;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class questao01
 */
@WebServlet("/questao01")
public class questao01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public questao01() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");	
        saida.write("Olá, o seu primeiro e ultimo nome são: <BR>");
        
        Enumeration<String> nomesParametros = request.getParameterNames();
        
        while (nomesParametros.hasMoreElements()) {
    	saida.write(nomesParametros.nextElement().toString());
    	saida.write(" ");
		}
        
        saida.write("</BODY></HTML>");	
    	saida.close();
	}
	
	

}
