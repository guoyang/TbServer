package service;
import model.request.CategoryRecommendItemRequest;
import model.request.ItemRecommendItemRequest;
import model.request.ShopRecommendItemRequest;
import model.request.ShopRecommendShopRequest;
import model.request.UserRecommendItemRequest;
import model.response.CategoryRecommendItemResponse;
import model.response.ItemRecommendItemResponse;
import model.response.ShopRecommendItemResponse;
import model.response.ShopRecommendShopResponse;
import model.response.UserRecommendItemResponse;
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
	
	public static ShopRecommendItemResponse getShopRecommendItem(int sellerId, int recommendType, int count, String ext) {
		ShopRecommendItemRequest<ShopRecommendItemResponse> req = new ShopRecommendItemRequest<ShopRecommendItemResponse>();
		req.setCount(count);
		req.setExt(ext);
		req.setSellerId(sellerId);
		req.setRecommendType(recommendType);
		
		return (ShopRecommendItemResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static ShopRecommendShopResponse getShopRecommendShop(int sellerId, int recommendType, int count, String ext) {
		ShopRecommendShopRequest<ShopRecommendShopResponse> req = new ShopRecommendShopRequest<ShopRecommendShopResponse>();
		req.setCount(count);
		req.setExt(ext);
		req.setSellerId(sellerId);
		req.setRecommendType(recommendType);
		
		return (ShopRecommendShopResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static UserRecommendItemResponse getUserRecommendItem(int recommendType, int count, String ext) {
		UserRecommendItemRequest<UserRecommendItemResponse> req = new UserRecommendItemRequest<UserRecommendItemResponse>();
		req.setCount(count);
		req.setExt(ext);
		req.setRecommendType(recommendType);
		
		return (UserRecommendItemResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static ItemRecommendItemResponse getItemRecommendItem(int itemId, int recommendType, int count, String ext) {
		ItemRecommendItemRequest<ItemRecommendItemResponse> req = new ItemRecommendItemRequest<ItemRecommendItemResponse>();
		req.setCount(count);
		req.setExt(ext);
		req.setItemId(itemId);
		req.setRecommendType(recommendType);
		
		return (ItemRecommendItemResponse) TaobaoMessageUtil.getResponse(req);
	}
}
