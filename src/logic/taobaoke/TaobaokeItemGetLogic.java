/**
 * 
 */
package logic.taobaoke;

import logic.AuthenLogic;
import parser.ProtocolParser;
import service.TaobaokeService;
import util.NumberUtil;

import com.taobao.api.response.TaobaokeItemsGetResponse;

import enums.ErrorMessage;

/**
 * @author kakuyang
 *
 */
public class TaobaokeItemGetLogic extends AuthenLogic {

	/* (non-Javadoc)
	 * @see logic.LogicBase#logic(parser.ProtocolParser)
	 */
	@Override
	public Object logic(ProtocolParser parser) {
		int pid = NumberUtil.getInteger(parser.get("pid"));
		String keyword = parser.get("keyword");
		String startPrice = parser.get("start_price");
		String endPrice = parser.get("end_price");
		String sort = parser.get("sort");
		int pageNo = NumberUtil.getInteger(parser.get("page_no"));
		
		
		TaobaokeItemsGetResponse res = TaobaokeService.getTaobaokeItem(pid, keyword, startPrice, endPrice, sort, pageNo);
		
		if (res != null) {
			if(res.getErrorCode() != ErrorMessage.ERROR_NONE.getErrorCode()) {
				logger.error("query data from taobao error~ errorCode =" + res.getErrorCode() + ", errorMessage=" + res.getMsg());
			}
			System.out.println("result:" + res.getBody());
//			new Jsonssss
			return res.getBody();
		} else {
			System.out.println("taobao response is null~");
			return null;
		}
	}

}
