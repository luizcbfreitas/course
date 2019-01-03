package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItems;
	}

	public void addItem(OrderItem item) {

		orderItems.add(item);

	}

	public void removeItem(OrderItem item) {

		orderItems.remove(item);

	}

	public Double total() {

		Double total = 0.00;

		for (OrderItem i : orderItems) {

			total += i.subTotal();

		}

		return total;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ");
		sb.append(moment + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: \n");
		for (OrderItem i : orderItems) {

			sb.append(i + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}

}
