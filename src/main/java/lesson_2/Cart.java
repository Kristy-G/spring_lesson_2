package lesson_2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private final ProductRepository productRepository;
    private final List<Product> productList;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
        productList = new ArrayList<>();
    }

    public void addProduct(int id) {
        productList.addAll(productRepository.findById(id));
    }

    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

    @Override
    public String toString() {
        return "lesson_2.Cart{" +
                "productList=" + productList +
                '}';
    }
}
