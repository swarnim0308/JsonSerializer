import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartVo {
	private int cartid;
	private List<LineItemVo> lineitem;
	public CartVo(int customerID, ArrayList<LineItemVo> arrayList) {
		// TODO Auto-generated constructor stub
		this.cartid=cartid;
		this.lineitem=arrayList;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public List<LineItemVo> getLineitem() {
		return lineitem;
	}
	public void setLineitem(List<LineItemVo> lineitem) {
		this.lineitem = lineitem;
	}
}
