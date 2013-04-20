/**
 * 
 */
package model.request;

import model.response.TaobaokeItemGetResponse;


/**
 * @author kakuyang
 *
 */
public class TaobaokeItemGetRequest<T> extends TaobaoRequestImpl<TaobaokeItemGetResponse> {

	private String fields;
	private String nick;
	private int pid;
	private String keyword;
	private int cid;
	private String startPrice;
	private String endPrice;
	private String autoSend;
	private String area;
	private String startCredit;
	private String endCredit;
	private String sort;
	private String guarantee;
	private String startCommissionRate;
	private String endCommissionRate;
	private String startCommissionNum;
	private String endCommissionNum;
	private String startTotalnum;
	private String endTotalnum;
	private String cashCoupon;
	private String vipCard;
	private String overseasItem;
	private String sevendaysReturn;
	private String realDescribe;
	private String onemonthRepair;
	private String cashOndelivery;
	private String mallItem;
	private int pageNo;
	private int pageSize;
	private String outerCode;
	private boolean isMobile;
	private String referType;
	
	
	@Override
	public String getApiMethodName() {
		return "taobao.taobaoke.items.get";
	}

	@Override
	public Class<TaobaokeItemGetResponse> getResponseClass() {
		return TaobaokeItemGetResponse.class;
	}

	@Override
	protected void filledTextParams() {
		maps.put("fields", fields);
		maps.put("nick",nick);
		maps.put("pid",String.valueOf(pid));
		maps.put("keyword",keyword);
		maps.put("cid",String.valueOf(cid));
		maps.put("start_price",startPrice);
		maps.put("end_price",endPrice);
		maps.put("auto_send",autoSend);
		maps.put("area",area);
		maps.put("start_credit",startCredit);
		maps.put("end_credit",endCredit);
		maps.put("sort",sort);
		maps.put("guarantee",guarantee);
		maps.put("start_commissionRate",startCommissionRate);
		maps.put("end_commissionRate",endCommissionRate);
		maps.put("start_commissionNum",startCommissionNum);
		maps.put("end_commissionNum",endCommissionNum);
		maps.put("start_totalnum",startTotalnum);
		maps.put("end_totalnum",endTotalnum);
		maps.put("cash_coupon",cashCoupon);
		maps.put("vip_card",vipCard);
		maps.put("overseas_item",overseasItem);
		maps.put("sevendays_return",sevendaysReturn);
		maps.put("real_describe",realDescribe);
		maps.put("onemonth_repair",onemonthRepair);
		maps.put("cash_ondelivery",cashOndelivery);
		maps.put("mall_item",mallItem);
		maps.put("page_no",String.valueOf(pageNo));
		maps.put("page_size",String.valueOf(pageSize));
		maps.put("outer_code",outerCode);
		maps.put("is_mobile",String.valueOf(isMobile));
		maps.put("refer_type",referType);
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public String getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public String getAutoSend() {
		return autoSend;
	}

	public void setAutoSend(String autoSend) {
		this.autoSend = autoSend;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStartCredit() {
		return startCredit;
	}

	public void setStartCredit(String startCredit) {
		this.startCredit = startCredit;
	}

	public String getEndCredit() {
		return endCredit;
	}

	public void setEndCredit(String endCredit) {
		this.endCredit = endCredit;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getStartCommissionRate() {
		return startCommissionRate;
	}

	public void setStartCommissionRate(String startCommissionRate) {
		this.startCommissionRate = startCommissionRate;
	}

	public String getEndCommissionRate() {
		return endCommissionRate;
	}

	public void setEndCommissionRate(String endCommissionRate) {
		this.endCommissionRate = endCommissionRate;
	}

	public String getStartCommissionNum() {
		return startCommissionNum;
	}

	public void setStartCommissionNum(String startCommissionNum) {
		this.startCommissionNum = startCommissionNum;
	}

	public String getEndCommissionNum() {
		return endCommissionNum;
	}

	public void setEndCommissionNum(String endCommissionNum) {
		this.endCommissionNum = endCommissionNum;
	}

	public String getStartTotalnum() {
		return startTotalnum;
	}

	public void setStartTotalnum(String startTotalnum) {
		this.startTotalnum = startTotalnum;
	}

	public String getEndTotalnum() {
		return endTotalnum;
	}

	public void setEndTotalnum(String endTotalnum) {
		this.endTotalnum = endTotalnum;
	}

	public String getCashCoupon() {
		return cashCoupon;
	}

	public void setCashCoupon(String cashCoupon) {
		this.cashCoupon = cashCoupon;
	}

	public String getVipCard() {
		return vipCard;
	}

	public void setVipCard(String vipCard) {
		this.vipCard = vipCard;
	}

	public String getOverseasItem() {
		return overseasItem;
	}

	public void setOverseasItem(String overseasItem) {
		this.overseasItem = overseasItem;
	}

	public String getSevendaysReturn() {
		return sevendaysReturn;
	}

	public void setSevendaysReturn(String sevendaysReturn) {
		this.sevendaysReturn = sevendaysReturn;
	}

	public String getRealDescribe() {
		return realDescribe;
	}

	public void setRealDescribe(String realDescribe) {
		this.realDescribe = realDescribe;
	}

	public String getOnemonthRepair() {
		return onemonthRepair;
	}

	public void setOnemonthRepair(String onemonthRepair) {
		this.onemonthRepair = onemonthRepair;
	}

	public String getCashOndelivery() {
		return cashOndelivery;
	}

	public void setCashOndelivery(String cashOndelivery) {
		this.cashOndelivery = cashOndelivery;
	}

	public String getMallItem() {
		return mallItem;
	}

	public void setMallItem(String mallItem) {
		this.mallItem = mallItem;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOuterCode() {
		return outerCode;
	}

	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public boolean isMobile() {
		return isMobile;
	}

	public void setMobile(boolean isMobile) {
		this.isMobile = isMobile;
	}

	public String getReferType() {
		return referType;
	}

	public void setReferType(String referType) {
		this.referType = referType;
	}

}
