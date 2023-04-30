import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class ProductInventoryVo {
	private ProductVo product;
	private InventoryVo inventory;
	public ProductVo getProduct() {
		return product;
	}
	public void setProduct(ProductVo product) {
		this.product = product;
	}
	public InventoryVo getInventory() {
		return inventory;
	}
	public ProductInventoryVo(ProductVo product, InventoryVo inventory) {
		super();
		this.product = product;
		this.inventory = inventory;
	}
	public void setInventory(InventoryVo inventory) {
		this.inventory = inventory;
	}
}
