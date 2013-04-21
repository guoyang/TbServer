/**
 * 
 */
package logic.recommend;

import logic.AuthenLogic;
import parser.ProtocolParser;
import service.RecommendService;

import com.taobao.api.response.CategoryrecommendItemsGetResponse;

import enums.ErrorMessage;

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
		long categoryId = Long.parseLong((String)(parser.get("category_id")));
		long count = Long.parseLong((String)(parser.get("count")));
		long recommendType = Long.parseLong((String)(parser.get("recommend_type")));
		String ext = parser.get("ext");
		
		CategoryrecommendItemsGetResponse res = RecommendService.getCategoryRecommendItems(categoryId, count, recommendType, ext);

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
