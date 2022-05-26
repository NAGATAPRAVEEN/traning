public class Ball {
    String material;
    string color;
    double price;
    public Ball(String material, string color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }
    public Ball(String material2, String string, int price2) {
    }
    @Override
    public String toString() {
        return "color=" + color + "\nmaterial="  + material + "\nprice=" + price;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public string getColor() {
        return color;
    }
    public void setColor(string color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class candy {
    public static void main(String[] args) {
        Ball b = new Ball("leather", "red",100);
        Ball b1 = new Ball("jumper", "brown", 220);

        b.setMaterial("Metal");
        System.out.println(b);
        System.out.println(b1);
    }

}