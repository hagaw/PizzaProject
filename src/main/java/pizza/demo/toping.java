package pizza.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class toping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String topingitem;
    private double topingPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopingitem() {
        return topingitem;
    }

    public void setTopingitem(String topingitem) {
        this.topingitem = topingitem;
    }

    public double getTopingPrice() {
        return topingPrice;
    }

    public void setTopingPrice(double topingPrice) {
        this.topingPrice = topingPrice;
    }
}
