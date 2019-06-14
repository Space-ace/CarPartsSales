package DataBase;

public class Employees {
    int id;
    String FirstName;
    String SecondName;
    String Phone;
    int Count;
    String Position;
    String Photo;
    String Login;
    String Password;

    public  Employees()
    {
        id =0 ;
        FirstName = "";
        SecondName = "";
        Phone = "";
        Count = 0;
        Position = "";
        Login = "";
        Photo = "";
        Password = "";
    }
    public  Employees(int id,String Name,String Surname,String Phn, int CNT,String Pos,String photo1,String log,String Pass)
    {
        this.id = id;
        FirstName =Name;
        SecondName = Surname;
        Phone = Phn;
        Count = CNT;
        Position = Pos;
        Login = log;
        Photo = photo1;
        Password = Pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public void setCount(int count) {
        Count = count;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLogin() {
        return Login;
    }

    public int getCount() {
        return Count;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }

    public String getPhoto() {
        return Photo;
    }

    public String getPosition() {
        return Position;
    }

    public String getSecondName() {
        return SecondName;
    }
}
