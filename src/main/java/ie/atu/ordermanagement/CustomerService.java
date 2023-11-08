package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class CustomerService {
    private  CustomerService customerService;

    @Autowired

    public CustomerService (CustomerService customerService)
    {
        this.customerService = customerService;
    }


    public void getCustomerById( int orderID){

    }

}
