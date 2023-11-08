package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class OrderService {
private  CustomerService customerService;

@Autowired

   public OrderService (CustomerService customerService)
{
   this.customerService = customerService;
}

public void createOrder{

   }

   public void getOrderById( int orderID){

   }

}
