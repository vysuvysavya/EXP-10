
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String n = request.getParameter("uname");
        String p = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        Cookie nam1 = new Cookie("user1", "user1");
        Cookie nam2 = new Cookie("user2", "user2");
        Cookie nam3 = new Cookie("user3", "user3");
        Cookie nam4 = new Cookie("user4", "user4");
        Cookie pas1 = new Cookie("pwd1", "pwd1");
        Cookie pas2 = new Cookie("pwd2", "pwd2");
        Cookie pas3 = new Cookie("pwd3", "pwd3");
        Cookie pas4 = new Cookie("pwd4", "pwd4");
        int flag = 0;
        String nam[] = {nam1.getValue(), nam2.getValue(), nam3.getValue(), nam4.getValue()};
        String pas[] = {pas1.getValue(), pas2.getValue(), pas3.getValue(), pas4.getValue()};
        for (int i = 0; i < 4; i++) {
            if (nam[i].equals(n) && pas[i].equals(p)) {
                flag = 1;
            }
        }
        if (flag == 1) {
            out.println("Wecome you " + n.toUpperCase());
        } else {
            out.println("You are not an authenticated user");
        }
    }
}
