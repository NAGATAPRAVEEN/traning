import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Assignmentdatetime  {
    String weather;
    String color;
    double temperature;
    public Assignmentdatetime(String weather, String color, double temperature) {
        this.weather = weather;
        this.color = color;
        this.temperature = temperature;
    }
    public Assignmentdatetime(string weather,string color,double temperature){
}

    @Override
    public String toString() {
        return "Assignmentdatetime [color=" + color + ", temperature=" + temperature + ", weather=" + weather + "]";
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}

class details{
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
    
}
        

    

    
