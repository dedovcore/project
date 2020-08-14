package servlet;

import service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/Delete")

public class DeleteCarServlet extends HttpServlet {
    CarService service = new CarService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dis = req.getRequestDispatcher("views/deleteCar.jsp");
        dis.forward(req, resp);
    }



    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number = req.getParameter("number");
        try {
            if(service.deleteCar(service.getCar(number))){
                resp.sendRedirect("/CarInfo");

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}