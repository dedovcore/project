package service;

import dataBase.JDBC;
import models.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    public boolean addCar(Car car) {
        try {
            Statement st = JDBC.getInstance().getConnection().createStatement();
            st.execute("insert into cars(name, model, price, number ) values ('" + car.getName() + "','" + car.getModel() + "','" + car.getPrice() + "','" + car.getNumber() + "')");
            st.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error update");
            e.printStackTrace();
        }
        return false;
    }


    public Car getCar(String number) {
        try {
            Statement st = JDBC.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from cars where number = '" + number + "'");
            if (rs.next()) {
                String name = rs.getString("name");
                String model = rs.getString("model");
                String price = rs.getString("price");
                return new Car(name, model, price, number);
            }
        } catch (SQLException e) {
            System.out.println("Пользователь не получен");
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Car> getAll() {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            Statement st = JDBC.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from cars");

            while (rs.next()) {
                String name = rs.getString("name");
                String model = rs.getString("model");
                String price = rs.getString("price");
                String number = rs.getString("number");
                Car car = new Car(name, model, price, number);
                cars.add(car);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

        public boolean deleteCar (Car car) throws SQLException {
            try {
                Statement st = JDBC.getInstance().getConnection().createStatement();
                st.executeUpdate("delete from cars where number = '" + car.getNumber() + "';");
            } catch (SQLException e) {
                System.out.println("Пользователь не удален");
                e.printStackTrace();
            }

            return false;
        }
    }

