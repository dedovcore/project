package servlet;

import models.Car;
import service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Home", urlPatterns = "/")

public class AddCarServlet extends HttpServlet {
    CarService service = new CarService();


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dis = req.getRequestDispatcher("views/addCar.jsp");
        dis.forward(req,resp);
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String model = req.getParameter("model");
        String price = req.getParameter("price");
        String number = req.getParameter("number");

        Car car = new Car(name, model, price, number);
        RequestDispatcher dis;
        if(service.addCar(car)){
           dis = req.getRequestDispatcher("views/deleteCar.jsp");
           dis.forward(req, resp);
        }
    }
}
