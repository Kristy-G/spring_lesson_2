package lesson_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Cart cart1 = context.getBean(Cart.class);
        Cart cart2 = context.getBean(Cart.class);
        Cart cart3 = context.getBean(Cart.class);

        cart1.addProduct(1);
        cart1.addProduct(4);

        cart2.addProduct(2);
        cart2.addProduct(3);
        cart2.addProduct(5);

        cart3.addProduct(1);
        cart3.addProduct(2);
        cart3.addProduct(5);

        System.out.println(cart1);
        System.out.println(cart2);
        System.out.println(cart3);
        System.out.println();

        cart1.deleteProduct(1);
        cart2.deleteProduct(3);
        cart3.deleteProduct(5);

        System.out.println(cart1);
        System.out.println(cart2);
        System.out.println(cart3);

        context.close();
    }
}
