package ie.atu.ordermanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private int CustomerID;
    private String Name;
    private int Age;
    private String email;
}
