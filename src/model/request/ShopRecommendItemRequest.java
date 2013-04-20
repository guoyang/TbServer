/**
 * 
 */
package model.request;

import model.response.ShopRecommendShopResponse;

/**
 * @author Administrator
 *
 */
public class ShopRecommendItemRequest<T> extends TaobaoRequestImpl<ShopRecommendShopResponse> {

	private Integer sellerId;
	private Integer recommendType;
	private Integer count;
	private String ext;
	
	public ShopRecommendItemRequest() {
		this.methodName = "taobao.shoprecommend.items.get";
	}
	
	@Override
	public Class<ShopRecommendShopResponse> getResponseClass() {
		return ShopRecommendShopResponse.class;
	}

	@Override
	protected void filledTextParams() {
		maps.put("seller_id", String.valueOf(sellerId));
		maps.put("recommend_type", String.valueOf(recommendType));
		maps.put("count", String.valueOf(count));
		maps.put("ext", ext);
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getRecommendType() {
		return recommendType;
	}

	public void setRecommendType(Integer recommendType) {
		this.recommendType = recommendType;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}
}
