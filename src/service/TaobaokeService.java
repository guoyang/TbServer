/**
 * 
 */
package service;

import util.TaobaoMessageUtil;

import com.taobao.api.request.TaobaokeItemsGetRequest;
import com.taobao.api.request.TaobaokeItemsRelateGetRequest;
import com.taobao.api.response.TaobaokeItemsGetResponse;
import com.taobao.api.response.TaobaokeItemsRelateGetResponse;

/**
 * @author kakuyang
 *
 */
public class TaobaokeService {

	public static TaobaokeItemsGetResponse getTaobaokeItem(int pid, String keyword, String startPrice, String endPrice, String sort, long pageNo) {
//		TaobaokeItemGetRequest<TaobaokeItemGetResponse> req = new TaobaokeItemGetRequest<TaobaokeItemGetResponse>();
		TaobaokeItemsGetRequest req = new TaobaokeItemsGetRequest();
		
		
		req.setFields("num_iid,title,nick,pic_url,price,click_url,commission,commission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume ");
		req.setKeyword(keyword);
		//TODO 需要制定推广code
		req.setOuterCode("");
		req.setStartPrice(startPrice);
		req.setEndPrice(endPrice);
		req.setSort(sort);
//		req.setPid(pid);
		req.setNick("dancintherain");
		req.setPageSize(40l);
		req.setPageNo(pageNo);
		req.setIsMobile(true);
//		req.setMobile(true);
		
		return (TaobaokeItemsGetResponse) TaobaoMessageUtil.getResponse(req);
	}
	
	public static TaobaokeItemsRelateGetResponse getTaobaokeRelate(long relateType, long numIid, long sellerId, long cid, String sort) {
		TaobaokeItemsRelateGetRequest req = new TaobaokeItemsRelateGetRequest();
		
		req.setCid(cid);
		req.setFields("num_iid,title,nick,pic_url,price,click_url,commission,ommission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume");
		req.setIsMobile(true);
		req.setRelateType(relateType);
		req.setNumIid(numIid);
		req.setSellerId(sellerId);
		req.setSort(sort);
		req.setNick("dancintherain");
		req.setMaxCount(40l);
		
		return (TaobaokeItemsRelateGetResponse) TaobaoMessageUtil.getResponse(req);
	}
}
