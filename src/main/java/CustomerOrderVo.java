import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
public class CustomerOrderVo {
	private CustomerVo customer;
	public CustomerVo getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerVo customer) {
		this.customer = customer;
	}
	public List<OrderVo> getOrders() {
		return orders;
	}
	public CustomerOrderVo(CustomerVo customer, List<OrderVo> orders) {
		super();
		this.customer = customer;
		this.orders = orders;
	}
	public void setOrders(List<OrderVo> orders) {
		this.orders = orders;
	}
	private List<OrderVo> orders;
}
