package pizza.demo;

import org.springframework.data.repository.CrudRepository;

public interface PizzaOrderRepository extends CrudRepository<PizzaOrder,Long> {
}
