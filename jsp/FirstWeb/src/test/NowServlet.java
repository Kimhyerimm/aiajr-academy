package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���� ó��
// 1. ���� Ŭ���� ��������ؼ��� HttpServlet Ŭ������ �ݵ�� ��� �ؾ��Ѵ�.
public class NowServlet extends HttpServlet {

	// 2. ��û�� �´� ó���� ���� �޼��带 ���� �������̵� ���ش�.
	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
		
		// ����ó�� : HTML ������ �����.
		
		resp.setContentType("text/html; charset=utf-8"); 
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("\t<head>");
		out.println("\t\t<title>���� �׽�Ʈ</title>");
		out.println("\t</head>");
		out.println("\t<body>");
		out.println("\t\t<h1>�ȳ��ϼ���. ���� Ŭ������ ���� ó���� ������ �Դϴ�.</h1>");
		out.println("\t\t<p>���� �ð��� : "+ new Date() +"</p>");
		
		
		out.println("\t</body>");
		out.println("</html>");
		
		
		
		
		
	}

	@Override
	protected void doPost(
			HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
	
	
	
	

}