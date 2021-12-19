package basic;

public class User {
    public String login;
    public String password;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setP(String pass) {
        this.password = password;
    }


    public boolean equals(Object object) {
        if (object == this) return true;
        if (!(object instanceof User)) return false;
        return ((User)object).getLogin().equals(this.getLogin());
    }
}
