package service;
import model.request.CategoryRecommendItemRequest;
import model.response.CategoryRecommendItemResponse;
import util.TaobaoMessageUtil;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class RecommendService {

	/**
	 * 
	 */
	public static CategoryRecommendItemResponse getCategoryRecommendItems(int categoryId, int count, int recommendType, String ext) {
		CategoryRecommendItemRequest<CategoryRecommendItemResponse> req = new CategoryRecommendItemRequest<CategoryRecommendItemResponse>();
		req.setCount(count);
		req.setCategoryId(categoryId);
		req.setRecommendType(recommendType);
		req.setExt(ext);
		return (CategoryRecommendItemResponse) TaobaoMessageUtil.getResponse(req);
	}
}
