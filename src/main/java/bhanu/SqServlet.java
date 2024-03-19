package bhanu;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")

public class SqServlet extends HttpServlet
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        int k=(int)req.getAttribute("k");
//
//        PrintWriter out=res.getWriter();
//        out.println("Hello to Sq");
//        out.println(("Result is "+ k ));
//        HttpSession session=req.getSession();
//        int k=(int)session.getAttribute("k");
       Cookie[] cookie = req.getCookies();
       int k=0;
       for(Cookie c:cookie)
       {
           if(c.getName().equals("k"))
           {
               k=Integer.parseInt(c.getValue());
           }
       }
        PrintWriter out=res.getWriter();
        out.println("RESULT IS BANANA --------"+k);
        System.out.println("sq called");
    }
}