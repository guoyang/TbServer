/**
 * 
 */
package logic.recommend;

import enums.ErrorMessage;
import parser.ProtocolParser;
import service.RecommendService;
import util.NumberUtil;
import logic.AuthenLogic;
import model.response.CategoryRecommendItemResponse;

/**
 * @author Administrator
 *
 */
public class CategoryRecommendItemLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		int categoryId = NumberUtil.getInteger(parser.get("category_id"));
		int count = NumberUtil.getInteger(parser.get("count"));
		int recommendType = NumberUtil.getInteger(parser.get("recommend_type"));
		String ext = parser.get("ext");
		
		CategoryRecommendItemResponse res = RecommendService.getCategoryRecommendItems(categoryId, count, recommendType, ext);

		if (res != null) {
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
