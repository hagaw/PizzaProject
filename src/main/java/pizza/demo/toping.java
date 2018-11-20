package pizza.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class toping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String topingitem;
    private double topingPrice;
    @ManyToMany
    private Set<Pizas> piazass;

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

    public Set<Pizas> getPiazass() {
        return piazass;
    }

    public void setPiazass(Set<Pizas> piazass) {
        this.piazass = piazass;
    }
}
