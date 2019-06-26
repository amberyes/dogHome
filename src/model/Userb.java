package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Userb {
    private int id;
    private String username;
    private String password;
    private String email;
    private String tel;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userb userb = (Userb) o;
        return id == userb.id &&
                Objects.equals(username, userb.username) &&
                Objects.equals(password, userb.password) &&
                Objects.equals(email, userb.email) &&
                Objects.equals(tel, userb.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, tel);
    }

    private Dlb usernamer;

    @javax.persistence.OneToOne(optional = false)
    public Dlb getUsernamer() {
        return usernamer;
    }

    public void setUsernamer(Dlb usernamer) {
        this.usernamer = usernamer;
    }
}
