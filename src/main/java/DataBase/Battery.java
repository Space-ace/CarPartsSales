package DataBase;

public class Battery {
    private int id;
    private String name;
    private String manufacturer;
    private String capacity;
    private String polaryti;
    private int count;
    private int autoId;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }

    public int getAutoId() {
        return autoId;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getPolaryti() {
        return polaryti;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPolaryti(String polaryti) {
        this.polaryti = polaryti;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
