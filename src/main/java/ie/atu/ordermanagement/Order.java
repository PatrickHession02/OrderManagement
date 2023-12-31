package ie.atu.ordermanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private int OrderID;
    private int productID;
    private int quantity;
    private int customerID;
}
