package ru.mvc.objects;

import javax.validation.constraints.Size;

public class User {

    @Size(min = 6,message = "{name.size.error}")
    private String username;

    @Size(min = 5,max = 10,message = "{password.size.error}")
    private String password;

    private Boolean admin;

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

    public Boolean getAdmin() {
        return admin;
    }
    public Boolean isAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }


}
