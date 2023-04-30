import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerVo {
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public AddressVo getCustomerBillingAddress() {
		return customerBillingAddress;
	}
	public void setCustomerBillingAddress(AddressVo customerBillingAddress) {
		this.customerBillingAddress = customerBillingAddress;
	}
	public AddressVo getCustomerShippingAddress() {
		return customerShippingAddress;
	}
	public void setCustomerShippingAddress(AddressVo customerShippingAddress) {
		this.customerShippingAddress = customerShippingAddress;
	}
	private String customerName;
	private String customerEmail;
	private AddressVo customerBillingAddress;
	private AddressVo customerShippingAddress;
}
