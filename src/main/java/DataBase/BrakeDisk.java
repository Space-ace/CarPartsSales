package DataBase;

public class BrakeDisk {
    private int id;
    private String name;
    private String manufacturer;
    private String type;
    private int holies;
    private int diametr;
    private int count;
    private int autoId;
    private float Price;

    public void setPrice(float price) {
        Price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return Price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getDiametr() {
        return diametr;
    }

    public int getHolies() {
        return holies;
    }

    public String getType() {
        return type;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public void setHolies(int holies) {
        this.holies = holies;
    }

    public void setType(String type) {
        this.type = type;
    }
}
