package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Lyb {
    private int id;
    private String username;
    private String text;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lyb lyb = (Lyb) o;
        return id == lyb.id &&
                Objects.equals(username, lyb.username) &&
                Objects.equals(text, lyb.text) &&
                Objects.equals(date, lyb.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, text, date);
    }
}
