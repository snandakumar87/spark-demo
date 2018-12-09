package com.spark.scorecard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreditdataAggregation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer accountId;
	
	private CardholderMasterCHD chd;
	private List<BalanceFLAP> flaps = new ArrayList<BalanceFLAP>();
	private CreditBureautimeSeriesCB cb ;
	private List<CreditBureautimeSeriesCB> cbs= new ArrayList<CreditBureautimeSeriesCB>();
	private DerviedVariables derivedVariables = new DerviedVariables();
	private List<String> cbAttr = new ArrayList<String>();
	
	public CardholderMasterCHD getChd() {
		return chd;
	}
	public void setChd(CardholderMasterCHD chd) {
		this.chd = chd;
	}
	public List<BalanceFLAP> getFlaps() {
		return flaps;
	}
	public void setFlaps(List<BalanceFLAP> flaps) {
		this.flaps = flaps;
	}
	public List<CreditBureautimeSeriesCB> getCbs() {
		return cbs;
	}
	public void setCbs(List<CreditBureautimeSeriesCB> cbs) {
		this.cbs = cbs;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public CreditBureautimeSeriesCB getCb() {
		return cb;
	}
	public void setCb(CreditBureautimeSeriesCB cb) {
		this.cb = cb;
	}
	public DerviedVariables getDerivedVariables() {
		return derivedVariables;
	}
	public void setDerivedVariables(DerviedVariables derivedVariables) {
		this.derivedVariables = derivedVariables;
	}
	public List<String> getCbAttr() {
		return cbAttr;
	}
	public void setCbAttr(List<String> cbAttr) {
		this.cbAttr = cbAttr;
	}
	
	
	
}
