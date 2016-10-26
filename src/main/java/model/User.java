package model;

import java.util.Set;

/**
 * Created by Александр on 26.10.2016.
 */
public class User extends NamedEntity
{
    private String password;
    private String email;
    private Set<Role> roles;

    public User (){

    }

    public User(Integer id, String name) {
        super(id, name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}
