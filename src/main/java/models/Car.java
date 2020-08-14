package models;

public class Car {
    private  String name;
    private  String model;
    private  String price;
    private String number;

    public Car(String name, String model, String price, String number){
        this.name = name;
        this.model = model;
        this.price = price;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{name"+name+", model"+model+",price"+price+",number"+number+"}";
    }
}
