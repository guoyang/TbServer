/**
 * 
 */
package model.request;

import model.response.ShopRecommendShopResponse;

/**
 * @author Administrator
 *
 */
public class ItemRecommendItemRequest<T> extends TaobaoRequestImpl<ShopRecommendShopResponse> {

	private Integer itemId;
	private Integer recommendType;
	private Integer count;
	private String ext;
	
	public ItemRecommendItemRequest() {
		this.methodName = "taobao.itemrecommend.items.get";
	}
	
	@Override
	public Class<ShopRecommendShopResponse> getResponseClass() {
		return ShopRecommendShopResponse.class;
	}

	@Override
	protected void filledTextParams() {
		maps.put("item_id", String.valueOf(itemId));
		maps.put("recommend_type", String.valueOf(recommendType));
		maps.put("count", String.valueOf(count));
		maps.put("ext", ext);
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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
