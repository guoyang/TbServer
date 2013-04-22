/**
 * 
 */
package logic.taobaoke;

import com.taobao.api.response.TaobaokeItemsRelateGetResponse;

import enums.ErrorMessage;

import parser.ProtocolParser;
import service.TaobaokeService;
import logic.AuthenLogic;

/**
 * @author kakuyang
 *
 */
public class TaobaokeItemRelateGetLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		long relateType = Long.parseLong((String)parser.get("relate_type"));
		long numIid = Long.parseLong((String)parser.get("num_iid"));
		long sellerId = Long.parseLong((String)parser.get("seller_id"));
		long cid = Long.parseLong((String)parser.get("cid"));
		String sort = parser.get("sort");
		
		TaobaokeItemsRelateGetResponse res = TaobaokeService.getTaobaokeRelate(relateType, numIid, sellerId, cid, sort);
		
		if (res != null) {
			if(res.getErrorCode() != ErrorMessage.ERROR_NONE.getErrorCode()) {
				logger.error("query data from taobao error~ errorCode =" + res.getErrorCode() + ", errorMessage=" + res.getMsg());
			}
			System.out.println("result:" + res.getBody());
//			new Jsonssss
			return res.getBody();
		} else {
			System.out.println("taobao response is null~");
			return null;
		}
	}

}
