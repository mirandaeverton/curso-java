package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Product p1 = new Product("TV", 1000.00);
		Product p2 = new Product("Mouse", 40.00);

		
		OrderItem item1 =new OrderItem(p1, 1);
		OrderItem item2 =new OrderItem(p2, 2);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Client client = new Client("Alex Green", "alex@gmail.com", LocalDate.parse("15/03/1985", fmt1));

		Order order = new Order(LocalDateTime.now(), OrderStatus.PENDING_PAYMENT, client);
		order.addItem(item1);
		order.addItem(item2);
		
		System.out.println(order);
		
	}

}
