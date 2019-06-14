package DataBase;

//Класс, содержащий модель из базы данных для таблицы производителей. Я делал как в лабах, но пришлось менять код и эта часть не сейчас не используется. Потом нужно будет просто всю инфу из базы сюда поместить
public class Manufacturer {

    private String name;

    public Manufacturer() {
        this.name = "";
    }

    public Manufacturer(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
