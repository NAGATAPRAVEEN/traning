

public class car {
    String model;
    String brand;
    String color;

    @Override
    public String toString() {
        return "car [color=" + color + ", brand=" + brand + ", model=" + model + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public car(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
    public static void main(String[] args) {
        car c1=new car("GL-60", "BMW", "white,");
        System.out.println(c1);
    }
    
    
}
