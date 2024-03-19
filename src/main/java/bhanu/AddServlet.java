package bhanu;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    public void  service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
//        PrintWriter out=res.getWriter();
//        int k=i+j;
//        out.println("result is  "+k);
        int k=i+j;
//        HttpSession session =req.getSession();
////        session.removeAttribute("k");
//        session.setAttribute("k",k);
//        k=k*k;
        //Req Dis and Req Red
        //if we want to share the data from one servlet to another servlet then at
//         that time we use some thing known as session managemnt.
//        req.setAttribute("k",k);
//        RequestDispatcher rd= req.getRequestDispatcher("/sq");
//        rd.forward(req,res);
//        Cookie cookie =new Cookie("k",k+"");
//        res.addCookie(cookie);
//        res.sendRedirect("sq?k="+k);//this technique come under session management.//alias url writtig
        //now let us learn about sees
        //is there any other option other than url rewriting.
        //this can be done via session management.
        //that's how we use session.
        //we can also use cookies as well instead of  cookies.
        //now let us learn about servlet config and servlet context
//        PrintWriter out=res.getWriter();
        //the below thing is  the code for servlet conntext.
        //if we write something in web.xml file separately then it is applicable for whole servlet itself.
//        out.print("hi <br/>");
//        ServletContext ctx=getServletContext();
//        String str=ctx.getInitParameter("name");
//        String phone=ctx.getInitParameter("phone");
//        out.println("my name is"+str);
//        out.println("the phone i am using is "+phone);
//        //the below code is for serveletconfig
//        ServletConfig cg=getServletConfig();
//        String mom=cg.getInitParameter("name");
//        String mom_age=cg.getInitParameter("age");
//        out.println("My mother's  name  is "+ mom);
//        out.println("My mother's age is "+mom_age);
        //ok servlet config and servlet context both are over
        // now let us learn servlet annotations.
        PrintWriter out=res.getWriter();
        out.println("<html><body bgcolor='cyan'>");
        out.println(k);
        out.println("</body></html>");
        //above we are doing html even for simple code we doing writting so many line
        //to avoid this we are using jsp wich stands for java server pages.
        //ok now introduction to servlet done
        //ok now let us move further why do we need jsp.
    }
}
