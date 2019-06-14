package DataBase;

//Класс, содержащий модель из базы данных для таблицы клиентов. Я делал как в лабах, но пришлось менять код и эта часть не сейчас не используется. Потом нужно будет просто всю инфу из базы сюда поместить
public class Customer {
    private int id;
    private String name;
    private String telephone;
    private String email;

    public Customer() {
        this.name = "";
        this.telephone = "";
        this.email = "";
    }

    public Customer(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getTelephone() { return telephone; }

    public void setTelephone(String telephone) {  this.telephone = telephone; }

    public String getEmail() { return email; }

    public void setEmail(String email) {  this.email = email; }
}
