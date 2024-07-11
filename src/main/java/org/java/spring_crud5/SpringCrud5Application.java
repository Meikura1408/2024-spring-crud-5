package org.java.spring_crud5;

import java.util.List;
import java.util.Optional;

import org.java.spring_crud5.pojo.Customer;
import org.java.spring_crud5.pojo.Order;
import org.java.spring_crud5.pojo.OrderItem;
import org.java.spring_crud5.pojo.Product;
import org.java.spring_crud5.service.CustomerService;
import org.java.spring_crud5.service.OrderService;
import org.java.spring_crud5.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrud5Application implements CommandLineRunner {

	@Autowired
    private CustomerService customerService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
		SpringApplication.run(SpringCrud5Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello, World!");

        //customerTest();
        //productTest();
        //orderTest();

        System.out.println("The end");
    }

   /*  public void customerTest() {

        System.out.println("-----------------------------------------------------------");

        Customer c1 = new Customer("John", "Doe", "john.doe@example.com", "1234567890");
        Customer c2 = new Customer("Jane", "Doe", "jane.doe@example.com", "0987654321");

        customerService.save(c1);
        customerService.save(c2);

        List<Customer> customers = customerService.findAll();
        customers.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        Optional<Customer> optCustomerId1 = customerService.findById(1);

        if (optCustomerId1.isEmpty()) {
            System.out.println("Customer not found");
            return;
        }

        Customer customerId1 = optCustomerId1.get();
        customerService.delete(customerId1);

        customers = customerService.findAll();
        customers.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
    }

    public void productTest() {

        System.out.println("-----------------------------------------------------------");

        Product p1 = new Product("Product 1", 100, 22);
        Product p2 = new Product("Product 2", 200, 22);

        productService.save(p1);
        productService.save(p2);

        List<Product> products = productService.findAll();
        products.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        Optional<Product> optProductId1 = productService.findById(1);

        if (optProductId1.isEmpty()) {
            System.out.println("Product not found");
            return;
        }

        Product productId1 = optProductId1.get();
        productService.delete(productId1);

        products = productService.findAll();
        products.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
    }

    public void orderTest() {

        System.out.println("-----------------------------------------------------------");

        Customer customer = new Customer("Alice", "Wonderland", "alice@example.com", "1112223333");
        customerService.save(customer);

        Product product1 = new Product("Product 1", 100, 22);
        Product product2 = new Product("Product 2", 200, 22);
        productService.save(product1);
        productService.save(product2);

        Order order = new Order(customer);
        OrderItem orderItem1 = new OrderItem(product1, 2);
        OrderItem orderItem2 = new OrderItem(product2, 1);
        orderItem1.setOrder(order);
        orderItem2.setOrder(order);
        order.getItems().add(orderItem1);
        order.getItems().add(orderItem2);
        orderService.save(order);

        List<Order> orders = orderService.findAllWithItems();
        orders.forEach(o -> {
            System.out.println(o);
            o.getItems().forEach(System.out::println);
            System.out.println("");
        });

        System.out.println("-----------------------------------------------------------");

        Optional<Order> optOrderId1 = orderService.findByIdWithItems(1);

        if (optOrderId1.isEmpty()) {
            System.out.println("Order not found");
            return;
        }

        Order orderId1 = optOrderId1.get();
        System.out.println(orderId1);
        orderId1.getItems().forEach(System.out::println);

        orderService.delete(orderId1);
    } */
	/**
	 * REPO: 2024-spring-crud-5
	 * 
	 * TODO:
	 * 
	 * In nuovo esercizio sviluppare un'applicazione per gestire le seguenti
	 * entita':
	 * 
	 * Customer (cliente):
	 * - id : INT
	 * - name : STRING
	 * - lastname : STRING
	 * - email : STRING
	 * - phone : STRING
	 * 
	 * Order (ordine):
	 * - id : INT
	 * 
	 * Product (prodotto):
	 * - id : INT
	 * - name : STRING
	 * - price : INT
	 * - vat (iva percentuale) : INT
	 * 
	 * Un cliente puo' effettuare piu' ordini, ogni ordine contiene piu' prodotti.
	 * 
	 * La classe Order deve inoltre esporre il seguente metodo:
	 * - getFullPrice(boolean vat) : INT --> restituisce il prezzo totale
	 * dell'ordine
	 * comprensivo o meno dell'iva in base al
	 * parametro booleano in ingresso
	 * 
	 * La classe Product deve inoltre esporre il seguente metodo:
	 * - getFullPrice(boolean vat) : INT --> restituisce il prezzo totale del
	 * prodotto
	 * maggiorato dell'iva se la variabile booleana
	 * in ingresso e' true
	 * 
	 * Definire sensatamente le relazioni e testare adeguatamente sia classi che
	 * relazioni man mano che vengono implementate.
	 * 
	 * E' possibile definire altre classi/interfacce qualora lo si ritenga
	 * oppurtuno.
	 * 
	 */

	

}
