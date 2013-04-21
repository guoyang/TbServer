/**
 * 
 */
package logic.category;

import logic.LogicBase;
import parser.ProtocolParser;
import util.TaobaoMessageUtil;

import com.taobao.api.request.ItemcatsGetRequest;
import com.taobao.api.response.ItemcatsGetResponse;

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
		long parentCid = Long.parseLong((String)parser.get("parent_cid"));
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
		
		ItemcatsGetRequest req = new ItemcatsGetRequest();
		req.setFields(fileds);
		req.setParentCid(parentCid);
		req.setCids(cids);
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
