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
 * Servlet implementation class questao03
 */
@WebServlet("/questao03")
public class questao03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public questao03() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");	
        saida.write("O resultado do calculo é <BR>");
        
        Enumeration<String> valoresParametros = request.getParameterNames();
        
        while (valoresParametros.hasMoreElements()) {
    	saida.write(valoresParametros.nextElement());
    	int resultado = valoresParametros + valoresParametros;
    	saida.write(" ");
		}
        
        saida.write("</BODY></HTML>");	
    	saida.close();
	}
	
	