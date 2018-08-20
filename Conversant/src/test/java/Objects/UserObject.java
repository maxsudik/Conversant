package Objects;

public class UserObject {

    public String name;
    public String email;
    public String password;


    public static final String User_Name = "Maksym";
    public static final String User_Email = "maksym@conversant.im";
    public static final String User_Password = "Mak7783205720";



    public UserObject withName(String name) {
        this.name=name;
        return this;
    }

    public UserObject withEmail (String email) {
        this.email=email;
        return this;
    }

    public UserObject withPassword (String password) {
        this.password=password;
        return this;
    }

}
