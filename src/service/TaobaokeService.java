/**
 * 
 */
package service;

import util.TaobaoMessageUtil;
import model.request.TaobaokeItemGetRequest;
import model.response.TaobaokeItemGetResponse;

/**
 * @author kakuyang
 *
 */
public class TaobaokeService {

	public static TaobaokeItemGetResponse getTaobaokeItem(int pid, String keyword, String startPrice, String endPrice, String sort, int pageNo) {
		TaobaokeItemGetRequest<TaobaokeItemGetResponse> req = new TaobaokeItemGetRequest<TaobaokeItemGetResponse>();
		
		req.setFields("num_iid,title,nick,pic_url,price,click_url,commission,commission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume ");
		req.setKeyword(keyword);
		//TODO 需要制定推广code
		req.setOuterCode("");
		req.setStartPrice(startPrice);
		req.setEndPrice(endPrice);
		req.setSort(sort);
		req.setPid(pid);
		req.setPageSize(40);
		req.setPageNo(pageNo);
		//TODO 需要获取是否是手机用户
		req.setMobile(false);
		
		return (TaobaokeItemGetResponse) TaobaoMessageUtil.getResponse(req);
	}
}
