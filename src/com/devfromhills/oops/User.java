package com.devfromhills.oops;

/*Encapsulation : bundling of data(attributes/properties) and method(functions) that operate on the
* data into the single unit called class*/
//provides data abstraction, modularity and enhancing code readability and reusability
public class User {

    private String name;
    private String emailId;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
