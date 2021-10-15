import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

//esto se llama anotacion y es una cosa que usa java para insertar codigo si hace falta
@WebServlet(value="/first")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Random random = new Random();

        int num = random.nextInt();


        int[][] aleatoris = new int[50][50];
        for (int i = 0; i < aleatoris.length; i++) {
            for (int j = 0; j < aleatoris[0].length; j++) {
                aleatoris[i][j] = random.nextInt();
            }
        }
        req.setAttribute("aleatoris",aleatoris);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/first.jsp");
        dispatcher.forward(req,resp);
        /*
        //si quiero pasarle como servidor algo al cliente he de usar el objeto resp
        //este objeto tiene un metodo getWriter
        Writer writer = resp.getWriter();
        writer.write("<html><head></head<body><h1>helloWorld!</h1></body></html>");
        */
    }
}
