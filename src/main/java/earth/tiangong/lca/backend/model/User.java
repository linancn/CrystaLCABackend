package earth.tiangong.lca.backend.model;

public class User {
    private String name;

    private String username;

    private String password;

    private Boolean autologin;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAutologin() {
        return autologin;
    }

    public void setAutologin(Boolean autologin) {
        this.autologin = autologin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
