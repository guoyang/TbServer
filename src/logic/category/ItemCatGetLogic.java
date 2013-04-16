/**
 * 
 */
package logic.category;

import com.taobao.api.response.ItemcatsGetResponse;

import logic.LogicBase;
import model.request.ItemscatsGetRequest;
import parser.ProtocolParser;
import util.NumberUtil;
import util.TaobaoMessageUtil;

/**
 * @author Administrator
 *
 */
public class ItemCatGetLogic implements LogicBase {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(java.util.Map)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		String fileds = parser.get("fields");
		int parentId = NumberUtil.getInteger(parser.get("parent_cid"));
		String cids = parser.get("cids");
		Number[] ids = null;
		if(cids != null && !"".equals(cids)) {
			String[] idStrs = cids.split(",");
			ids = new Number[idStrs.length];
			for(int i = 0;i<idStrs.length;i++) {
				String id = idStrs[i];
				Number num = Long.parseLong(id);
				ids[i] = num;
			}
		}
		
		ItemscatsGetRequest<ItemcatsGetResponse> req = new ItemscatsGetRequest<ItemcatsGetResponse>();
		req.setFields(fileds);
		req.setParent_cid(parentId);
		if(ids != null) {
			req.setCids(ids);
		}
		ItemcatsGetResponse res = (ItemcatsGetResponse) TaobaoMessageUtil.getResponse(req);
		
		if (res != null) {
			System.out.println("result:" + res.getBody());
			return res.getBody();
		} else {
			System.out.println("taobao response is null~");
			return null;
		}
	}

}
