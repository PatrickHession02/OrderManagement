package ie.atu.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service



public class OrderService {
private  OrderService orderService;

@Autowired

   public OrderService (OrderService orderService)
{
   this.orderService = orderService;
}

public void createOrder{

   }

}
