package pizza.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/")
    public String loadFormCustomer(Model model) {
        model.addAttribute("customer", new CustomerInfo());
        return "customer";

    }

    @PostMapping("/")

    public String ProcessForm(@Valid CustomerInfo customer,
                              BindingResult result) {
        if (result.hasErrors()) {
            return "customer";
        }
        return "/";
    }


    @GetMapping("/add")
    public String CalculateForm(Model model) {
        double price = 0;
        int qty = 0;
        double totalPrice = 0;
        double tax = .05;
        double totaWithTax = 0;
        double baseprice = 0;
        double topingprice = 0;


        model.addAttribute("order", new PizzaOrder());

        PizzaOrderRepository pizzaOrderRepository;

        totalPrice = qty * (baseprice + topingprice);
        tax = totalPrice * tax;
        totaWithTax = totalPrice + tax;

        return "xxx";

    }

}


