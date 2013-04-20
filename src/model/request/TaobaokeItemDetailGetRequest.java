/**
 * 
 */
package model.request;

import model.response.TaobaokeItemDetailGetResponse;

/**
 * @author kakuyang
 *
 */
public class TaobaokeItemDetailGetRequest<T> extends TaobaoRequestImpl<TaobaokeItemDetailGetResponse> {

	private String fields;
	private String nick;
	private String fields;
	private String fields;
	private String fields;
	private String fields;
	
	@Override
	public String getApiMethodName() {
		return "taobao.taobaoke.items.detail.get";
	}

	@Override
	public Class<TaobaokeItemDetailGetResponse> getResponseClass() {
		return TaobaokeItemDetailGetResponse.class;
	}

	@Override
	protected void filledTextParams() {
		
	}

}
