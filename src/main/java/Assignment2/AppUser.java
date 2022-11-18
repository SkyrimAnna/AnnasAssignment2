package Assignment2;

import com.sun.org.apache.xpath.internal.objects.XObject;
import com.sun.xml.internal.bind.util.Which;

import java.util.Objects;

public class AppUser {

    private String userName;
    private String password; // todo: password type is not right
    private AppRole role;






    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null){
            throw new IllegalArgumentException("User name was null");
        }
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null){
            throw new IllegalArgumentException("Password was null");
        }
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null){
            throw new IllegalArgumentException("Role was null");
        }
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return password == appUser.password && Objects.equals(userName, appUser.userName) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, role);
    }


    @Override
    public String toString() {
        return "AppUser{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                '}';
    }
}
