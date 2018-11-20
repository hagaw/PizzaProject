package pizza.demo;


import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pizas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pizaType;
    @ManyToMany
    private Set<toping> mytoping;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPizaType() {
        return pizaType;
    }

    public void setPizaType(String pizaType) {
        this.pizaType = pizaType;
    }

    public Set<toping> getMytoping() {
        return mytoping;
    }

    public void setMytoping(Set<toping> mytoping) {
        this.mytoping = mytoping;
    }
}
