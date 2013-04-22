/**
 * 
 */
package logic.recommend;

import logic.AuthenLogic;
import parser.ProtocolParser;
import service.RecommendService;

import com.taobao.api.response.ShoprecommendItemsGetResponse;

import enums.ErrorMessage;

/**
 * @author kakuyang
 *
 */
public class ShopRecommendItemLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		long sellerId = Long.parseLong((String)(parser.get("seller_id")));
		long recommendType = Long.parseLong((String)(parser.get("recommend_type")));
		long count = Long.parseLong((String)(parser.get("count")));
		String ext = parser.get("ext");
		
		ShoprecommendItemsGetResponse res = RecommendService.getShopRecommendItem(sellerId, recommendType, count, ext);
		
		if(res != null) {
			if(res.getErrorCode() != ErrorMessage.ERROR_NONE.getErrorCode()) {
				logger.error("query data from taobao error~ errorCode =" + res.getErrorCode() + ", errorMessage=" + res.getMsg());
			}
			System.out.println("result:" + res.getBody());
			return res.getBody();
		} else {
			System.out.println("taobao response is null~");
			return null;
		}
	}

}