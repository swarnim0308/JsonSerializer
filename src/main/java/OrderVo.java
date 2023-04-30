import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderVo {
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public List<LineItemVo> getLineitem() {
		return lineitem;
	}
	public void setLineitem(List<LineItemVo> lineitem) {
		this.lineitem = lineitem;
	}
	private int orderid;
	List<LineItemVo> lineitem;
}
