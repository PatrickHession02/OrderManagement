package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service



public class OrderService {
private  CustomerService customerService;

@Autowired

   public OrderService (CustomerService customerService)
{
   this.customerService = customerService;
}

public void createOrder (Order order){
   System.out.println(order);
   Order.add(order);
   }

   public void getOrderById( int orderID){

   }

}
