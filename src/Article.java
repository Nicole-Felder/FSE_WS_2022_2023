import java.util.ArrayList;
import java.util.List;

public class Article {


    public Article(String Name, String Number, String Manufacturer) {
        this.Name = Name;
        this.Number = Number;
        this.Manufacturer = Manufacturer;
    }

    private String Name;
    private String Number;
    private String Manufacturer;

    public String getName() {
        return Name;
    }

    public String getNumber() {
        return Number;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
