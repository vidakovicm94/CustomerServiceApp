package at.fhtw.slm.customerserviceapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class
CustomersController {
    @GetMapping("/customers")
    public List<String> getCustomers() {
        List<String> customers = new ArrayList<>();
        customers.add("Anton");
        customers.add("Berta");
        customers.add("Cäsar");
        return customers;
    }
}
