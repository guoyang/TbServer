/**
 * 
 */
package logic.recommend;

import logic.AuthenLogic;
import model.response.ItemRecommendItemResponse;
import parser.ProtocolParser;
import service.RecommendService;
import util.NumberUtil;
import enums.ErrorMessage;

/**
 * @author kakuyang
 *
 */
public class ItemRecommendItemLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		Integer itemId = NumberUtil.getInteger(parser.get("item_id"));
		Integer recommendType = NumberUtil.getInteger(parser.get("recommend_type"));
		Integer count = NumberUtil.getInteger(parser.get("count"));
		String ext = parser.get("ext");
		
		ItemRecommendItemResponse res = RecommendService.getItemRecommendItem(itemId, recommendType, count, ext);
		
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
