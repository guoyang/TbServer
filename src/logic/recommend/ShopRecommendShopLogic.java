/**
 * 
 */
package logic.recommend;

import enums.ErrorMessage;
import logic.AuthenLogic;
import model.response.ShopRecommendShopResponse;
import parser.ProtocolParser;
import service.RecommendService;
import util.NumberUtil;

/**
 * @author kakuyang
 *
 */
public class ShopRecommendShopLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		Integer sellerId = NumberUtil.getInteger(parser.get("seller_id"));
		Integer recommendType = NumberUtil.getInteger(parser.get("recommend_type"));
		Integer count = NumberUtil.getInteger(parser.get("count"));
		String ext = parser.get("ext");
		
		ShopRecommendShopResponse res = RecommendService.getShopRecommendShop(sellerId, recommendType, count, ext);
		
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
