package excersises.decorator;

import java.util.LinkedList;
import java.util.List;

public class ClientService {
    private List<Product> products;

    public ClientService() {
        products = new LinkedList<>();
    }

    public void addToList(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
