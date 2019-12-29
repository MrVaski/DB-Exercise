package pl.edu.wszib.model;

import java.util.Date;

public class ProductHistory {
    private int id;
    private Date date;
    private int newProductId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNewProductId() {
        return newProductId;
    }

    public void setNewProductId(int newProductId) {
        this.newProductId = newProductId;
    }

    @Override
    public String toString() {
        return "ProductHistory{" +
                "id=" + id +
                ", date=" + date +
                ", newProductId=" + newProductId +
                '}';
    }
}
