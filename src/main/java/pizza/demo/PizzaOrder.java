package pizza.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private String customer;
    private String typeOfPizaOrdered;
    }


