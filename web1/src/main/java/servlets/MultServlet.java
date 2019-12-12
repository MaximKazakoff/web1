package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String valueParam = request.getParameter("value");

        if (valueParam == null) {
            response.getWriter().print(0);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            response.getWriter().print(Integer.parseInt(valueParam) * 2);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        response.setContentType("text/html;charset=utf-8");
    }
}
