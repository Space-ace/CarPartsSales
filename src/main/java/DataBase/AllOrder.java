package DataBase;

//Класс, содержащий модель из базы данных для таблицы заказов. Я делал как в лабах, но пришлось менять код и эта часть не сейчас не используется. Потом нужно будет просто всю инфу из базы сюда поместить
public class AllOrder {

    private  int id;
    private String accessoryName;
    private int accessoryId;
    private int customerId;
    private float price;

    public AllOrder() {
        this.accessoryName = "";
        this.accessoryId = 0;
        this.customerId = 0;
        this.price = 0;
    }

    public AllOrder(String accessoryName, int accessoryId, int customerId, float price) {
        this.accessoryName = accessoryName;
        this.accessoryId = accessoryId;
        this.customerId = customerId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccessoryName() { return accessoryName; }

    public void setAccessoryName(String accessoryName) {  this.accessoryName = accessoryName; }

    public int getAccessoryId() { return accessoryId; }

    public void setAccessoryId(int accessoryId) {  this.accessoryId = accessoryId; }

    public int getCustomerId() { return customerId; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public float getPrice() { return price; }

    public void setPrice(float price) {  this.price = price; }
}
