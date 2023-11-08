package ie.atu.ordermanagement;

import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController


public class CustomerController {
    private final CustomerService customerService;

    @Autowired

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;

    }

    @GetMapping ("/createCustomer/{CustomerID}")

    public Response Entity <int> createCustomer(@PathVariable int CustomerID){
        return null;
    }

    @PostMapping("/ceateOrderBody")
    @ResponseStatus(HttpStatus.CREATED)

    public Order orderBody(@RequestBody Customer customer){

        System.out.println("customerID:" + customer.getID());

    }


}