package DataBase;

//Класс, содержащий модель из базы данных для таблицы шин. Я делал как в лабах, но пришлось менять код и эта часть не сейчас не используется. Потом нужно будет просто всю инфу из базы сюда поместить
public class Tires {
    private int id;
    private String name;
    private int manufacturer;
    private String season;
    private float diameter;
    private int count;
    private int autoId;
    private float price;

    public Tires() {
        this.name = "";
        this.manufacturer = 0;
        this.season = "";
        this.diameter = 0;
        this.price = 0;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int getAutoId() {
        return autoId;
    }

    public Tires(String name, int ManufacturerId, String Season, float Diameter, float Price) {
        this.name = name;
        this.manufacturer = ManufacturerId;
        this.season = Season;
        this.diameter = Diameter;
        this.price = Price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getManufacturer() { return manufacturer; }

    public void setManufacturer(int ManufacturerId) {  this.manufacturer = ManufacturerId; }

    public String getSeason() { return season; }

    public void setSeason(String Season) {  this.season = Season; }

    public float getDiameter() { return diameter; }

    public void setDiameter(float Diameter) {  this.diameter = Diameter; }

    public float getPrice() { return price; }

    public void setPrice(float Price) {  this.price = Price; }
}
