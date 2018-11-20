package pizza.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @GetMapping("/")
    public String loadFormCustomer(Model model) {
        model.addAttribute("customer", new CustomerInfo());
        return "customer";

    }
//
//    @PostMapping("/")
//
//    public String ProcessForm(@Valid CustomerInfo customer,
//                              BindingResult result) {
//        if (result.hasErrors()) {
//            return "customer";
//        }
//        return "/";
//    }
//    @GetMapping("/add")
//    @
//
//    public String CalculateForm(Model model) {
//        model.addAttribute("order",PizzaOrder);

//        String pizabig ="";
//        String pizamidum="";
//        String pizsmall="";
//
//
//        double basePriceLarge = 0;
//        double basePriceMedium=0;
//        double basePriceSmall=0;
//
//        double priceCheese=0;
//        double priceMinues=0;
//        double priceCethap=0;
//        int qty = 0;
//
//        double totalPrice = 0;
//        double tax = .05;
//        double totaWithTax = 0;
//        double baseprice = 0;
//        double topingprice = 0;
//
//        model.addAttribute("order", new PizzaOrder());
//
//        PizzaOrder pizzaOrder=new PizzaOrder();



//================================================================
//total topping price
//
//        topingprice=priceCheese+priceMinues+priceCethap;
//
//        System.out.println(topingprice);
//================================================================

//To Calculate the price tax and total price

//    if (pizabig=="large") {
//
//        totalPrice = qty * (basePriceLarge + topingprice);
//        tax = totalPrice * tax;
//        totaWithTax = totalPrice + tax;
//    }else if (pizamidum=="medium"){
//        totalPrice = qty * (basePriceMedium + topingprice);
//        tax = totalPrice * tax;
//        totaWithTax = totalPrice + tax;
//    }else if (pizsmall=="small"){
//        totalPrice = qty * (baseprice + topingprice);
//        tax = totalPrice * tax;
//        totaWithTax = totalPrice + tax;
//    }
//        return "orderform";
//
//    }
//


@Autowired
    PizzaOrderRepository pizzaOrderRepository;

 @Autowired
   TopingRepository topingRepository;
 @RequestMapping("/add")
    public String orderForm(Model model){

     Pizas pizas=new Pizas();
     pizas.setPizaType("big");

     Set<Pizas> piza=new HashSet<Pizas>();
     piza.add(pizas);



     model.addAttribute("orders",pizzaOrderRepository.findAll());


     return "orderform";
 }
}


