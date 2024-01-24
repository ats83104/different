package a.b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(TestServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("AAAAAAAAAAAA");
		logger.info("xxxxxxxxxxxxxxxxx");
		PrintWriter writer = resp.getWriter();
        
        writer.println("AAAAAAAAAAAAAAA");
        
        writer.close();
		
	}

}  
