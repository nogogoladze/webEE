package user.utils;

public class User {

    private int id;
    private String firstName;
    private String mail;
    private String pssword;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setPssword(String pssword) {
        this.pssword = pssword;
    }

    public String getPssword() {
        return pssword;
    }

    public String toString(){
        return
                "firstName: " + firstName + "\nmail: " + mail + "\npassword: " + pssword ;
    }
}
