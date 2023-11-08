package ie.atu.ordermanagement;

import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController


public class OrderController {
    private final OrderService orderService;

    @Autowired

    public OrderController(OrderService orderService){
        this.orderService = orderService;

    }

    @GetMapping ("/createOrder/{OrderID}")

    public Response Entity <int> createOrder(@PathVariable int OrderID){
        return null;
    }

    @PostMapping("/ceateOrderBody")
    @ResponseStatus(HttpStatus.CREATED)

    public Order orderBody(@RequestBody Order order){

        System.out.println("orderID:" + order.getID());


    }


}
