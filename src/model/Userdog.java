package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Userdog {
    private int id;
    private String uername;
    private String leixing;
    private String dogname;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uername")
    public String getUername() {
        return uername;
    }

    public void setUername(String uername) {
        this.uername = uername;
    }

    @Basic
    @Column(name = "leixing")
    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    @Basic
    @Column(name = "dogname")
    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userdog userdog = (Userdog) o;
        return id == userdog.id &&
                Objects.equals(uername, userdog.uername) &&
                Objects.equals(leixing, userdog.leixing) &&
                Objects.equals(dogname, userdog.dogname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uername, leixing, dogname);
    }
}
