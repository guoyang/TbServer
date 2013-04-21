package service;
import util.TaobaoMessageUtil;

import com.taobao.api.request.CategoryrecommendItemsGetRequest;
import com.taobao.api.request.ItemrecommendItemsGetRequest;
import com.taobao.api.request.ShoprecommendItemsGetRequest;
import com.taobao.api.request.ShoprecommendShopsGetRequest;
import com.taobao.api.request.UserrecommendItemsGetRequest;
import com.taobao.api.response.CategoryrecommendItemsGetResponse;
import com.taobao.api.response.ItemrecommendItemsGetResponse;
import com.taobao.api.response.ShoprecommendItemsGetResponse;
import com.taobao.api.response.ShoprecommendShopsGetResponse;
import com.taobao.api.response.UserrecommendItemsGetResponse;

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
	public static CategoryrecommendItemsGetResponse getCategoryRecommendItems(long categoryId, long count, long recommendType, String ext) {
//		CategoryRecommendItemRequest<CategoryRecommendItemResponse> req = new CategoryRecommendItemRequest<CategoryRecommendItemResponse>();
		CategoryrecommendItemsGetRequest req = new CategoryrecommendItemsGetRequest();
		req.setCount(count);
		req.setCategoryId(categoryId);
		req.setRecommendType(recommendType);
		req.setExt(ext);
		return (CategoryrecommendItemsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static ShoprecommendItemsGetResponse getShopRecommendItem(long sellerId, long recommendType, long count, String ext) {
//		ShopRecommendItemRequest<ShopRecommendItemResponse> req = new ShopRecommendItemRequest<ShopRecommendItemResponse>();
		ShoprecommendItemsGetRequest req = new ShoprecommendItemsGetRequest();
		req.setCount(count);
		req.setExt(ext);
		req.setSellerId(sellerId);
		req.setRecommendType(recommendType);
		
		return (ShoprecommendItemsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static ShoprecommendShopsGetResponse getShopRecommendShop(long sellerId, long recommendType, long count, String ext) {
//		ShopRecommendShopRequest<ShopRecommendShopResponse> req = new ShopRecommendShopRequest<ShopRecommendShopResponse>();
		ShoprecommendShopsGetRequest req = new ShoprecommendShopsGetRequest();
		req.setCount(count);
		req.setExt(ext);
		req.setSellerId(sellerId);
		req.setRecommendType(recommendType);
		
		return (ShoprecommendShopsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static UserrecommendItemsGetResponse getUserRecommendItem(long recommendType, long count, String ext) {
//		UserRecommendItemRequest<UserRecommendItemResponse> req = new UserRecommendItemRequest<UserRecommendItemResponse>();
		UserrecommendItemsGetRequest req = new UserrecommendItemsGetRequest();
		req.setCount(count);
		req.setExt(ext);
		req.setRecommendType(recommendType);
		
		return (UserrecommendItemsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static ItemrecommendItemsGetResponse getItemRecommendItem(long itemId, long recommendType, long count, String ext) {
//		ItemRecommendItemRequest<ItemRecommendItemResponse> req = new ItemRecommendItemRequest<ItemRecommendItemResponse>();
		ItemrecommendItemsGetRequest req = new ItemrecommendItemsGetRequest();
		req.setCount(count);
		req.setExt(ext);
		req.setItemId(itemId);
		req.setRecommendType(recommendType);
		
		return (ItemrecommendItemsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
}
