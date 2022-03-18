package br.ceub.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet{
	private static final long serialVersionUID = 1l;
	
	private SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		log("A servlet iniciou em:"+formataData.format(new Date()));
		super.init();
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = resp.getWriter();
		saida.write("<HTML><BODY>OLA! ");
		saida.write("A data e a hora atual e: <br>"+formataData.format(new Date()));
		saida.write("</BODY></HTML>");
		saida.close();
		
		}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		log("A servelet terminou em: "+formataData.format(new Date()));
		super.destroy();
	}
}