package lesson_2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList = new ArrayList<>();

    @PostConstruct
    public void init() {
        productList.add(new Product(1, "product_1", 50));
        productList.add(new Product(2, "product_2", 120));
        productList.add(new Product(3, "product_3", 70));
        productList.add(new Product(4, "product_4", 950));
        productList.add(new Product(5, "product_5", 140));
    }

    public List<Product> findById(int id) {
        List<Product> list = new ArrayList<>();
        for(Product product: productList) {
            if (product.getId()==id) list.add(product);
        }
        return list;
    }
}
