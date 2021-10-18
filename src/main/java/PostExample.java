import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value="/postexemple")
public class PostExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/post1.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dni = req.getParameter("dni");
        String name = req.getParameter("name");
        if (DniValid(dni)){
            req.setAttribute("ok",true);
        }
        req.setAttribute("name",name);
        req.setAttribute("dni",dni);
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/jsp/post2.jsp");
        dispatcher.forward(req,resp);
    }
    static boolean DniValid(String dni){
        //check de que el formato del dni es valido

        String num = dni.substring(0,8);
        int n = Integer.parseInt(num);
        int r = n % 23;
        String taula = "TRWAGMYFPDXBNJZSQVHLCKE";
        char l = taula.charAt(r);
        if (l == dni.charAt(8)) return true;
        return false;
    }
}
