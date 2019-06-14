package DataBase;

//Класс, содержащий модель из базы данных для таблицы дисков. Я делал как в лабах, но пришлось менять код и эта часть не сейчас не используется. Потом нужно будет просто всю инфу из базы сюда поместить
public class Rim {

    private int id;
    private String name;
    private int manufacturer;
    private float diameter;
    private int autoId;
    private int count;
    private float price;

    public Rim() {
        this.name = "";
        this.manufacturer = 0;
        this.diameter = 0;
        this.price = 0;
    }

    public Rim(String name, int ManufacturerId, float Diameter, float Price) {
        this.name = name;
        this.manufacturer = ManufacturerId;
        this.diameter = Diameter;
        this.price = Price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getManufacturer() { return manufacturer; }

    public void setManufacturer(int ManufacturerId) {  this.manufacturer = ManufacturerId; }

    public float getDiameter() { return diameter; }

    public void setDiameter(float Diameter) {  this.diameter = Diameter; }

    public float getPrice() { return price; }

    public void setPrice(float Price) {  this.price = Price; }
}
