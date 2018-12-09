package com.spark.scorecard;

import java.io.Serializable;

public class BalanceFLAP implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String record;
	private String fileId;
	
	private String DAILYDTE;
	private int MONTHEND;
	private String FLAP_SYS_PRIN_AGNT_ID;
	private String FLAP_SYS_ID;
	private String FLAP_PRIN_ID;
	private String FLAP_AGNT_ID;
	private String FLAP_ACCT_ID_TX;
	private int FLAP_ACCT_ID;
	private int FLAP_KEY_ID;
	private int FLAP_OCCR_CT;
	private int FLAP_TOTL_FLAP_CT;
	private int FLAP_ASSC_FLAP_ID;
	private int FLAP_ID;
	private int FLAP_PLAN_FLAP_ID;
	private String FLAP_TYPE;
	private double FLAP_TRANSACTION_AMT;
	private int FLAP_TRAN_DATE;
	private int FLAP_EFFECTIVE_DATE;
	private int FLAP_POST_DATE;
	private int FLAP_DELAY_INT_END_DATE;
	private int FLAP_DELAY_PAY_END_DATE;
	private int FLAP_PAYOUT_PERIOD;
	private double FLAP_HIGH_NOM_APPLIED_RT;
	private double FLAP_LOW_NOM_APPLIED_RT;
	private double FLAP_ANN_INT_RATE;
	private double FLAP_MONTH_INT_RATE;
	private double FLAP_DAILY_INT_RATE;
	private double FLAP_ORIG_ANN_INT_RATE;
	private double FLAP_ORIG_MONTH_INT_RATE;
	private double FLAP_ORIG_DAILY_INT_RATE;
	private String FLAP_OLD_DEPT_CODE;
	private double FLAP_LIFE_BILLED_INT;
	private String FLAP_DISPUTE_FLAG;
	private String FLAP_TERMS_CODE;
	private int FLAP_CASH_OPT_END_DATE;
	private double FLAP_WAIVED_UNBILLED_INT;
	private String FLAP_PROMOTIONAL_ID;
	private int FLAP_PAID_OFF_MOS;
	private double FLAP_HIST_PURCHASES;
	private double FLAP_POB_AMT;
	private double FLAP_POB_RATE;
	private double FLAP_PERC_BPD;
	private int FLAP_ITEM_FEE_DLAY_DT;
	private double FLAP_UNBD_ITEM_FEE_CURR_AM;
	private String FLAP_INTRO_VAR_BR_SW;
	private double FLAP_RGLR_INDX_RT;
	private double FLAP_INTR_INDX_RT;
	private double FLAP_LS_ANN_APR;
	private double FLAP_LS_TEMP_APR;
	private String FLAPLS_CLLP_FLAP_MTRC_CD;
	private String FLAPPS_CLLP_FLAP_MTRC_CD;
	private String FLAP_DFRD_INT_CD;
	private double FLAPPS_APR_RT;
	private double FLAP_HIST_LS_BAL;
	private double FLAP_HIST_PS_BAL;
	private String FLAP_EXPR_UNPD_CD;
	private double FLAP_CTD_BLLD_INTR_AM;
	private double FLAP_EXPR_DALY_INTR_RT;
	private double FLAP_EXPR_MNTH_INTR_RT;
	private double FLAP_EXPR_ANNL_INTR_RT;
	private double FLAP_MIN_INTR_ITRO_RT;
	private double FLAP_MIN_RGLR_ANNL_RT;
	private int FLAP_RTRN_TO_RVLV_DT;
	private int FLAP_RTRN_TO_RVLV_CD_NR;
	private String FLAP_RTRN_TO_RVLV_CD;
	private String FLAP_LS_REVOLV_SW_TX;
	private int FLAP_LS_REVOLV_SW;
	private String FLAP_PS_REVOLV_SW_TX;
	private int FLAP_PS_REVOLV_SW;
	private String FLAP_LAST_REVOLV_SWTC_CD_TX;
	private int FLAP_LAST_REVOLV_SWTC_CD;
	private String FLAP_LS_RVLV_SWTC_CD_TX;
	private int FLAP_LS_RVLV_SWTC_CD;
	private String FLAP_PS_RVLV_SWTC_CD_TX;
	private int FLAP_PS_RVLV_SWTC_CD;
	private String FLAP_LAST_RVLV_SWTC_CD_TX;
	private int FLAP_LAST_RVLV_SWTC_CD;
	private int FLAP_REVOLV_INT_RATES;
	private int FLAP_REVOLV_INT_METHOD_NR;
	private String FLAP_REVOLV_INT_METHOD;
	private int FLAP_REVOLV_MPD_NR;
	private String FLAP_REVOLV_MPD;
	private int FLAP_REVOLV_ITEM_FEES_NR;
	private String FLAP_REVOLV_ITEM_FEES;
	private int FLAP_REVOLV_PAYOFF_EXCEPT_NR;
	private String FLAP_REVOLV_PAYOFF_EXCEPT;
	private int FLAP_REVOLV_BASE_INT_NR;
	private String FLAP_REVOLV_BASE_INT;
	private int FLAP_REVOLV_REBATE_NR;
	private String FLAP_REVOLV_REBATE;
	private int FLAP_REVOLV_BREAKRATES_NR;
	private String FLAP_REVOLV_BREAKRATES;
	private int FLAP_RVLV_INTR_ON_INTR_CD_NR;
	private String FLAP_RVLV_INTR_ON_INTR_CD;
	private int FLAP_PROMO_SQNC_NR;
	private String FLAP_BLNC_TYPE_CD;
	private String FLAP_DEPT_CODE;
	private int FLAP_RTRN_TO_RVLV_SSPN_CD;
	private double FLAPLS_FEE_APPL_AM;
	private String FLAP_INTR_DFLT_STRT_TX;
	private int FLAP_PRTC_BLNC_ID;
	private int FLAP_IP_STRT_DT;
	private int FLAP_IP_END_DT;
	private int FLAP_PRTC_BLNC_DT;
	private int FLAP_CIT_DT;
	private int FLAP_PB_TERMS_EFFC_DT;
	private int FLAP_TERM_FREZ_DT;
	private String FLAP_PB_MUF_TYPE_CD;
	private double FLAP_ANNV_INTR_RT;
	private int FLAP_RTR_DELY_DT;
	private String FLAP_RTR_DELY_RESN_CD;
	private double FLAP_SSPN_ANN_INT_RT;
	private double FLAP_SSPN_ORIG_ANN_INT_RT;
	private double FLAP_SSPN_MIN_RGLR_ANNL_RT;
	private double FLAP_SSPN_MIN_INTR_ITRO_RT;
	private double FLAP_SSPN_MAX_INTR_ITRO_RT;
	private double FLAP_SSPN_MAX_INTR_RGLR_RT;
	private int FLAP_SSPN_MTHD_SET_NR;
	private int FLAP_SSPN_FREZ_MPD_CD;
	private int FLAP_UNSS_DT;
	private int FLAP_SSPN_INT_RATE_CD;
	private int FLAP_SSPN_INT_MTHD_CD;
	private int FLAP_SSPN_MPD_CD;
	private int FLAP_SSPN_ITEM_FEES_CD;
	private int FLAP_SSPN_PYFF_EXCP_CD;
	private int FLAP_SSPN_BASE_INT_CD;
	private int FLAP_SSPN_REBT_CD;
	private int FLAP_SSPN_BREK_RATE_CD;
	private int FLAP_SSPN_INT_ON_INT_CD;
	private int FLAP_SSPN_INTR_DFLT_CD;
	private int FLAP_RTR_DSCL_CT;
	private int FLAP_POST_CLOS_DT;
	private int FLAP_RTR_DSCL_DT;
	private int FLAP_AMRT_MTRT_DT;
	private double FLAP_DFP_FEE_SAVE_AM;
	private String FLAP_VRBL_CD;
	private String FLAP_GOTO_VRBL_CD;
	private String FLAP_LOAN_TYPE_CD;
	private double FLAP_LS_HIST_INTR_AM;
	private double FLAP_LS_HIST_PRIN_AM;
	private double FLAP_LS_HIST_FEE_AM;
	private double FLAP_LS_HIST_RMPD_INTR_AM;
	private double FLAP_LS_HIST_RMPD_PRIN_AM;
	private double FLAP_LS_HIST_RMPD_FEE_AM;
	private double FLAP_LS_HIST_DMPD_INTR_AM;
	private double FLAP_LS_HIST_DMPD_PRIN_AM;
	private double FLAP_LS_HIST_DMPD_FEE_AM;
	private double FLAP_LS_HIST_PYMT_INTR_AM;
	private double FLAP_LS_HIST_PYMT_PRIN_AM;
	private double FLAP_LS_HIST_PYMT_FEE_AM;
	private double FLAP_YTD_BLLD_INTR_AM;
	private double FLAP_PY_BLLD_INTR_AM;
	private double FLAP_LS_HIST_POB_RATE_AM;
	private double FLAP_YTD_PAID_PRIN_AM;
	private String FLAP_UNIQ_MNTH_BLNC_CD;
	private int FLAP_BLNC_OPEN_DT;
	private String FLAP_CLASS_DR;
	private String FLAP_CLASS_DATE_TX;
	private int FLAP_CLASS_DATE;
	private String FLAP_INT_ON_INT;
	private String FLAP_MUF_TYPE;
	private String FLAP_PRCNG_STRAT_ID;
	private double FLAP_CURR_TOTAL_DELQ;
	private double FLAP_CURR_UNPAID_BPD;
	private double FLAP_CURR_UNPAID_INTSC;
	private double FLAP_BINT;
	private double FLAP_REPORTABLE_INT;
	private double FLAP_CTD_PRIN;
	private double FLAP_OLD_PRIN;
	private double FLAP_CTD_ITEM_FEES;
	private double FLAP_DISPUTE_AMOUNT;
	private double FLAP_CRRN_BLNC_AM;
	private double FLAPAP_UNPD_LATE_CHRG_AM;
	private double FLAPAP_UNPD_OVRL_CHRG_AM;
	private double FLAPAP_UNPD_CRDT_LIFE_AM;
	private double FLAPAP_UNPD_MSCL_CHRG_AM;
	private double FLAPAP_UNPD_ANNL_CHRG_AM;
	private double FLAPAP_UNPD_SRCHRG_AM;
	private double FLAPAP_UNPD_ITEM_CHRG_AM;
	private int FLAP_DLNQ_CYCL_NR;
	private double FLAPLS_OLD_PRIN;
	private double FLAPLS_BILLED_INT;
	private double FLAPLS_UNPAID_INTSC;
	private double FLAPLS_BPD;
	private double FLAPLS_TOTAL_DELQ;
	private double FLAPLS_ACCRUED_UNBILLED_INT;
	private double FLAPLS_ITEM_FEES;
	private double FLAPLS_REPORTABLE_INT;
	private double FLAPLS_DEFERRED_CR_LIFE;
	private double FLAPLS_DEF_ADB;
	private double FLAPLS_CYC_PRIN;
	private double FLAPLS_DISPUTE_AMOUNT;
	private double FLAPLS_UNBD_ITEM_FEE_AM;
	private double FLAPLS_TRANS_AMT;
	private String FLAPLS_PYFF_EXCP_CD_1;
	private String FLAPLS_PYFF_EXCP_CD_2;
	private String FLAPLS_PYFF_EXCP_CD_3;
	private double FLAPLS_REAL_INT_AM;
	private int FLAPLS_RTRN_TO_RVLV_CD_NR;
	private String FLAPLS_RTRN_TO_RVLV_CD;
	private double FLAPLS_DEFR_CRDT_LIFE_BASE_AM;
	private double FLAPLS_BLLD_INTR_AM;
	private double FLAPLS_FLAP_ADB_AM;
	private double FLAPLS_BLNC_AM;
	private double FLAPLS_LATE_CHRG_AM;
	private double FLAPLS_UNPD_LATE_CHRG_AM;
	private double FLAPLS_OVRL_CHRG_AM;
	private double FLAPLS_UNPD_OVRL_CHRG_AM;
	private double FLAPLS_MSCL_CHRG_AM;
	private double FLAPLS_UNPD_MSCL_CHRG_AM;
	private double FLAPLS_ANNL_CHRG_AM;
	private double FLAPLS_UNPD_ANNL_CHRG_AM;
	private double FLAPLS_SRCHG_AM;
	private double FLAPLS_UNPD_SRCHG_AM;
	private double FLAPLS_UNPD_ITEM_CHRG_AM;
	private double FLAPLS_MIN_FIN_CHRG_AM;
	private double FLAPLS_FRST_PERD_ADB_AM;
	private double FLAPLS_FRST_PERD_APR_RT;
	private String FLAPLS_RTR_DELY_RESN_CD;
	private String  FLAPLS_PYFF_EXCP_BINT_CD;
	private String FLAPLS_PYFF_EXCP_OLD_CD;
	private String FLAPLS_PYFF_EXCP_CTD_CD;
	private int FLAPLS_RTRN_TO_RVLV_SSPN_CD;
	private double FLAPPS_FEE_APPL_AM;
	private double FLAPPS_OLD_PRIN;
	private double FLAPPS_BILLED_INT;
	private double FLAPPS_UNPAID_INTSC;
	private double FLAPPS_BPD;
	private double FLAPPS_TOTAL_DELQ;
	private double FLAPPS_ACCRUED_UNBILLED_INT;
	private double FLAPPS_ITEM_FEES;
	private double FLAPPS_REPORTABLE_INT;
	private double FLAPPS_DEFERRED_CR_LIFE;
	private double FLAPPS_DEF_ADB;
	private double FLAPPS_CYC_PRIN;
	private double FLAPPS_DISPUTE_AMOUNT;
	private double FLAPPS_UNBD_ITEM_FEE_AM;
	private double FLAPPS_TRANS_AMT;
	private double FLAPPS_REAL_INT_AM;
	private int FLAPPS_RTRN_TO_RVLV_CD_NR;
	private String FLAPPS_RTRN_TO_RVLV_CD;
	private double FLAPPS_DEFR_CRDT_LIFE_BASE_AM;
	private double FLAPPS_BLLD_INTR_AM;
	private double FLAPPS_FLAP_ADB_AM;
	private double FLAPPS_BLNC_AM;
	private double FLAPPS_UNPD_CRDT_LIFE_AM;
	private double FLAPPS_CRDT_LIFE_CHRG_AM;
	private double FLAPPS_FRST_PERD_ADB_AM;
	private double FLAPPS_FRST_PERD_APR_RT;
	private String FLAPPS_PYFF_EXCP_CD_1;
	private String FLAPPS_PYFF_EXCP_CD_2;
	private String FLAPPS_PYFF_EXCP_CD_3;
	private String FLAPPS_RTR_DELY_RESN_CD;
	private String FLAPPS_PYFF_EXCP_BINT_CD;
	private String FLAPPS_PYFF_EXCP_OLD_CD;
	private String FLAPPS_PYFF_EXCP_CTD_CD;
	private double FLAP_MINIMUM_MPD_AMT;
	private String FLAP_MPD_METHOD;
	private double FLAP_FIXED_PAYMENT_AMT;
	private double FLAP_MPD_RATE;
	private String FLAP_MPD_ADD_INT;
	private String FLAP_INTRO_MPD_METHOD;
	private double FLAP_INTRO_FIXED_PAY_AMT;
	private double FLAP_INTRO_MPD_RATE;
	private String FLAP_INTRO_MPD_ADD_INT;
	private int FLAP_MPD_LOAN_END_DT;
	private double FLAP_BASE_MIN_PAY_AM;
	private int FLAP_PYMT_ALLC_BEGN_DT;
	private int FLAP_PYMT_ALLC_END_DT;
	private double FLAP_PYMT_ALLC_RT;
	private double FLAPLS_PYMT_ALLC_RT;
	private String SYS;
	private String PRIN;
	private String AGENT;
	private int ACCOUNT;
	private int ORG;
	private int DTPLAN;
	private int FL_EFFDATE;
	private int DTBEGINT;
	private int DTBEGPAY;
	private int R2R_DT;
	private int CLASS_DATE;
	private int FL_CSHOPT_END;
	private int IF_DELAY_DT;
	private int MPD_LOAN_END;
	private int ACCOUNT_ID;
	private int OLD_ACCOUNT_ID;
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getDAILYDTE() {
		return DAILYDTE;
	}
	public void setDAILYDTE(String dAILYDTE) {
		DAILYDTE = dAILYDTE;
	}
	public int getMONTHEND() {
		return MONTHEND;
	}
	public void setMONTHEND(int mONTHEND) {
		MONTHEND = mONTHEND;
	}
	public String getFLAP_SYS_PRIN_AGNT_ID() {
		return FLAP_SYS_PRIN_AGNT_ID;
	}
	public void setFLAP_SYS_PRIN_AGNT_ID(String fLAP_SYS_PRIN_AGNT_ID) {
		FLAP_SYS_PRIN_AGNT_ID = fLAP_SYS_PRIN_AGNT_ID;
	}
	public String getFLAP_SYS_ID() {
		return FLAP_SYS_ID;
	}
	public void setFLAP_SYS_ID(String fLAP_SYS_ID) {
		FLAP_SYS_ID = fLAP_SYS_ID;
	}
	public String getFLAP_PRIN_ID() {
		return FLAP_PRIN_ID;
	}
	public void setFLAP_PRIN_ID(String fLAP_PRIN_ID) {
		FLAP_PRIN_ID = fLAP_PRIN_ID;
	}
	public String getFLAP_AGNT_ID() {
		return FLAP_AGNT_ID;
	}
	public void setFLAP_AGNT_ID(String fLAP_AGNT_ID) {
		FLAP_AGNT_ID = fLAP_AGNT_ID;
	}
	public String getFLAP_ACCT_ID_TX() {
		return FLAP_ACCT_ID_TX;
	}
	public void setFLAP_ACCT_ID_TX(String fLAP_ACCT_ID_TX) {
		FLAP_ACCT_ID_TX = fLAP_ACCT_ID_TX;
	}
	public int getFLAP_ACCT_ID() {
		return FLAP_ACCT_ID;
	}
	public void setFLAP_ACCT_ID(int fLAP_ACCT_ID) {
		FLAP_ACCT_ID = fLAP_ACCT_ID;
	}
	public int getFLAP_KEY_ID() {
		return FLAP_KEY_ID;
	}
	public void setFLAP_KEY_ID(int fLAP_KEY_ID) {
		FLAP_KEY_ID = fLAP_KEY_ID;
	}
	public int getFLAP_OCCR_CT() {
		return FLAP_OCCR_CT;
	}
	public void setFLAP_OCCR_CT(int fLAP_OCCR_CT) {
		FLAP_OCCR_CT = fLAP_OCCR_CT;
	}
	public int getFLAP_TOTL_FLAP_CT() {
		return FLAP_TOTL_FLAP_CT;
	}
	public void setFLAP_TOTL_FLAP_CT(int fLAP_TOTL_FLAP_CT) {
		FLAP_TOTL_FLAP_CT = fLAP_TOTL_FLAP_CT;
	}
	public int getFLAP_ASSC_FLAP_ID() {
		return FLAP_ASSC_FLAP_ID;
	}
	public void setFLAP_ASSC_FLAP_ID(int fLAP_ASSC_FLAP_ID) {
		FLAP_ASSC_FLAP_ID = fLAP_ASSC_FLAP_ID;
	}
	public int getFLAP_ID() {
		return FLAP_ID;
	}
	public void setFLAP_ID(int fLAP_ID) {
		FLAP_ID = fLAP_ID;
	}
	public int getFLAP_PLAN_FLAP_ID() {
		return FLAP_PLAN_FLAP_ID;
	}
	public void setFLAP_PLAN_FLAP_ID(int fLAP_PLAN_FLAP_ID) {
		FLAP_PLAN_FLAP_ID = fLAP_PLAN_FLAP_ID;
	}
	
	public String getFLAP_TYPE() {
		return FLAP_TYPE;
	}
	public void setFLAP_TYPE(String fLAP_TYPE) {
		FLAP_TYPE = fLAP_TYPE;
	}
	public double getFLAP_TRANSACTION_AMT() {
		return FLAP_TRANSACTION_AMT;
	}
	public void setFLAP_TRANSACTION_AMT(double fLAP_TRANSACTION_AMT) {
		FLAP_TRANSACTION_AMT = fLAP_TRANSACTION_AMT;
	}
	public int getFLAP_TRAN_DATE() {
		return FLAP_TRAN_DATE;
	}
	public void setFLAP_TRAN_DATE(int fLAP_TRAN_DATE) {
		FLAP_TRAN_DATE = fLAP_TRAN_DATE;
	}
	public int getFLAP_EFFECTIVE_DATE() {
		return FLAP_EFFECTIVE_DATE;
	}
	public void setFLAP_EFFECTIVE_DATE(int fLAP_EFFECTIVE_DATE) {
		FLAP_EFFECTIVE_DATE = fLAP_EFFECTIVE_DATE;
	}
	public int getFLAP_POST_DATE() {
		return FLAP_POST_DATE;
	}
	public void setFLAP_POST_DATE(int fLAP_POST_DATE) {
		FLAP_POST_DATE = fLAP_POST_DATE;
	}
	public int getFLAP_DELAY_INT_END_DATE() {
		return FLAP_DELAY_INT_END_DATE;
	}
	public void setFLAP_DELAY_INT_END_DATE(int fLAP_DELAY_INT_END_DATE) {
		FLAP_DELAY_INT_END_DATE = fLAP_DELAY_INT_END_DATE;
	}
	public int getFLAP_DELAY_PAY_END_DATE() {
		return FLAP_DELAY_PAY_END_DATE;
	}
	public void setFLAP_DELAY_PAY_END_DATE(int fLAP_DELAY_PAY_END_DATE) {
		FLAP_DELAY_PAY_END_DATE = fLAP_DELAY_PAY_END_DATE;
	}
	public int getFLAP_PAYOUT_PERIOD() {
		return FLAP_PAYOUT_PERIOD;
	}
	public void setFLAP_PAYOUT_PERIOD(int fLAP_PAYOUT_PERIOD) {
		FLAP_PAYOUT_PERIOD = fLAP_PAYOUT_PERIOD;
	}
	public double getFLAP_HIGH_NOM_APPLIED_RT() {
		return FLAP_HIGH_NOM_APPLIED_RT;
	}
	public void setFLAP_HIGH_NOM_APPLIED_RT(double fLAP_HIGH_NOM_APPLIED_RT) {
		FLAP_HIGH_NOM_APPLIED_RT = fLAP_HIGH_NOM_APPLIED_RT;
	}
	public double getFLAP_LOW_NOM_APPLIED_RT() {
		return FLAP_LOW_NOM_APPLIED_RT;
	}
	public void setFLAP_LOW_NOM_APPLIED_RT(double fLAP_LOW_NOM_APPLIED_RT) {
		FLAP_LOW_NOM_APPLIED_RT = fLAP_LOW_NOM_APPLIED_RT;
	}
	public double getFLAP_ANN_INT_RATE() {
		return FLAP_ANN_INT_RATE;
	}
	public void setFLAP_ANN_INT_RATE(double fLAP_ANN_INT_RATE) {
		FLAP_ANN_INT_RATE = fLAP_ANN_INT_RATE;
	}
	public double getFLAP_MONTH_INT_RATE() {
		return FLAP_MONTH_INT_RATE;
	}
	public void setFLAP_MONTH_INT_RATE(double fLAP_MONTH_INT_RATE) {
		FLAP_MONTH_INT_RATE = fLAP_MONTH_INT_RATE;
	}
	public double getFLAP_DAILY_INT_RATE() {
		return FLAP_DAILY_INT_RATE;
	}
	public void setFLAP_DAILY_INT_RATE(double fLAP_DAILY_INT_RATE) {
		FLAP_DAILY_INT_RATE = fLAP_DAILY_INT_RATE;
	}
	public double getFLAP_ORIG_ANN_INT_RATE() {
		return FLAP_ORIG_ANN_INT_RATE;
	}
	public void setFLAP_ORIG_ANN_INT_RATE(double fLAP_ORIG_ANN_INT_RATE) {
		FLAP_ORIG_ANN_INT_RATE = fLAP_ORIG_ANN_INT_RATE;
	}
	public double getFLAP_ORIG_MONTH_INT_RATE() {
		return FLAP_ORIG_MONTH_INT_RATE;
	}
	public void setFLAP_ORIG_MONTH_INT_RATE(double fLAP_ORIG_MONTH_INT_RATE) {
		FLAP_ORIG_MONTH_INT_RATE = fLAP_ORIG_MONTH_INT_RATE;
	}
	public double getFLAP_ORIG_DAILY_INT_RATE() {
		return FLAP_ORIG_DAILY_INT_RATE;
	}
	public void setFLAP_ORIG_DAILY_INT_RATE(double fLAP_ORIG_DAILY_INT_RATE) {
		FLAP_ORIG_DAILY_INT_RATE = fLAP_ORIG_DAILY_INT_RATE;
	}
	public String getFLAP_OLD_DEPT_CODE() {
		return FLAP_OLD_DEPT_CODE;
	}
	public void setFLAP_OLD_DEPT_CODE(String fLAP_OLD_DEPT_CODE) {
		FLAP_OLD_DEPT_CODE = fLAP_OLD_DEPT_CODE;
	}
	public double getFLAP_LIFE_BILLED_INT() {
		return FLAP_LIFE_BILLED_INT;
	}
	public void setFLAP_LIFE_BILLED_INT(double fLAP_LIFE_BILLED_INT) {
		FLAP_LIFE_BILLED_INT = fLAP_LIFE_BILLED_INT;
	}
	public String getFLAP_DISPUTE_FLAG() {
		return FLAP_DISPUTE_FLAG;
	}
	public void setFLAP_DISPUTE_FLAG(String fLAP_DISPUTE_FLAG) {
		FLAP_DISPUTE_FLAG = fLAP_DISPUTE_FLAG;
	}
	public String getFLAP_TERMS_CODE() {
		return FLAP_TERMS_CODE;
	}
	public void setFLAP_TERMS_CODE(String fLAP_TERMS_CODE) {
		FLAP_TERMS_CODE = fLAP_TERMS_CODE;
	}
	public int getFLAP_CASH_OPT_END_DATE() {
		return FLAP_CASH_OPT_END_DATE;
	}
	public void setFLAP_CASH_OPT_END_DATE(int fLAP_CASH_OPT_END_DATE) {
		FLAP_CASH_OPT_END_DATE = fLAP_CASH_OPT_END_DATE;
	}
	public double getFLAP_WAIVED_UNBILLED_INT() {
		return FLAP_WAIVED_UNBILLED_INT;
	}
	public void setFLAP_WAIVED_UNBILLED_INT(double fLAP_WAIVED_UNBILLED_INT) {
		FLAP_WAIVED_UNBILLED_INT = fLAP_WAIVED_UNBILLED_INT;
	}
	public String getFLAP_PROMOTIONAL_ID() {
		return FLAP_PROMOTIONAL_ID;
	}
	public void setFLAP_PROMOTIONAL_ID(String fLAP_PROMOTIONAL_ID) {
		FLAP_PROMOTIONAL_ID = fLAP_PROMOTIONAL_ID;
	}
	public int getFLAP_PAID_OFF_MOS() {
		return FLAP_PAID_OFF_MOS;
	}
	public void setFLAP_PAID_OFF_MOS(int fLAP_PAID_OFF_MOS) {
		FLAP_PAID_OFF_MOS = fLAP_PAID_OFF_MOS;
	}
	public double getFLAP_HIST_PURCHASES() {
		return FLAP_HIST_PURCHASES;
	}
	public void setFLAP_HIST_PURCHASES(double fLAP_HIST_PURCHASES) {
		FLAP_HIST_PURCHASES = fLAP_HIST_PURCHASES;
	}
	public double getFLAP_POB_AMT() {
		return FLAP_POB_AMT;
	}
	public void setFLAP_POB_AMT(double fLAP_POB_AMT) {
		FLAP_POB_AMT = fLAP_POB_AMT;
	}
	public double getFLAP_POB_RATE() {
		return FLAP_POB_RATE;
	}
	public void setFLAP_POB_RATE(double fLAP_POB_RATE) {
		FLAP_POB_RATE = fLAP_POB_RATE;
	}
	public double getFLAP_PERC_BPD() {
		return FLAP_PERC_BPD;
	}
	public void setFLAP_PERC_BPD(double fLAP_PERC_BPD) {
		FLAP_PERC_BPD = fLAP_PERC_BPD;
	}
	public int getFLAP_ITEM_FEE_DLAY_DT() {
		return FLAP_ITEM_FEE_DLAY_DT;
	}
	public void setFLAP_ITEM_FEE_DLAY_DT(int fLAP_ITEM_FEE_DLAY_DT) {
		FLAP_ITEM_FEE_DLAY_DT = fLAP_ITEM_FEE_DLAY_DT;
	}
	public double getFLAP_UNBD_ITEM_FEE_CURR_AM() {
		return FLAP_UNBD_ITEM_FEE_CURR_AM;
	}
	public void setFLAP_UNBD_ITEM_FEE_CURR_AM(double fLAP_UNBD_ITEM_FEE_CURR_AM) {
		FLAP_UNBD_ITEM_FEE_CURR_AM = fLAP_UNBD_ITEM_FEE_CURR_AM;
	}
	public String getFLAP_INTRO_VAR_BR_SW() {
		return FLAP_INTRO_VAR_BR_SW;
	}
	public void setFLAP_INTRO_VAR_BR_SW(String fLAP_INTRO_VAR_BR_SW) {
		FLAP_INTRO_VAR_BR_SW = fLAP_INTRO_VAR_BR_SW;
	}
	public double getFLAP_RGLR_INDX_RT() {
		return FLAP_RGLR_INDX_RT;
	}
	public void setFLAP_RGLR_INDX_RT(double fLAP_RGLR_INDX_RT) {
		FLAP_RGLR_INDX_RT = fLAP_RGLR_INDX_RT;
	}
	public double getFLAP_INTR_INDX_RT() {
		return FLAP_INTR_INDX_RT;
	}
	public void setFLAP_INTR_INDX_RT(double fLAP_INTR_INDX_RT) {
		FLAP_INTR_INDX_RT = fLAP_INTR_INDX_RT;
	}
	public double getFLAP_LS_ANN_APR() {
		return FLAP_LS_ANN_APR;
	}
	public void setFLAP_LS_ANN_APR(double fLAP_LS_ANN_APR) {
		FLAP_LS_ANN_APR = fLAP_LS_ANN_APR;
	}
	public double getFLAP_LS_TEMP_APR() {
		return FLAP_LS_TEMP_APR;
	}
	public void setFLAP_LS_TEMP_APR(double fLAP_LS_TEMP_APR) {
		FLAP_LS_TEMP_APR = fLAP_LS_TEMP_APR;
	}
	public String getFLAPLS_CLLP_FLAP_MTRC_CD() {
		return FLAPLS_CLLP_FLAP_MTRC_CD;
	}
	public void setFLAPLS_CLLP_FLAP_MTRC_CD(String fLAPLS_CLLP_FLAP_MTRC_CD) {
		FLAPLS_CLLP_FLAP_MTRC_CD = fLAPLS_CLLP_FLAP_MTRC_CD;
	}
	public String getFLAPPS_CLLP_FLAP_MTRC_CD() {
		return FLAPPS_CLLP_FLAP_MTRC_CD;
	}
	public void setFLAPPS_CLLP_FLAP_MTRC_CD(String fLAPPS_CLLP_FLAP_MTRC_CD) {
		FLAPPS_CLLP_FLAP_MTRC_CD = fLAPPS_CLLP_FLAP_MTRC_CD;
	}
	public String getFLAP_DFRD_INT_CD() {
		return FLAP_DFRD_INT_CD;
	}
	public void setFLAP_DFRD_INT_CD(String fLAP_DFRD_INT_CD) {
		FLAP_DFRD_INT_CD = fLAP_DFRD_INT_CD;
	}
	public double getFLAPPS_APR_RT() {
		return FLAPPS_APR_RT;
	}
	public void setFLAPPS_APR_RT(double fLAPPS_APR_RT) {
		FLAPPS_APR_RT = fLAPPS_APR_RT;
	}
	public double getFLAP_HIST_LS_BAL() {
		return FLAP_HIST_LS_BAL;
	}
	public void setFLAP_HIST_LS_BAL(double fLAP_HIST_LS_BAL) {
		FLAP_HIST_LS_BAL = fLAP_HIST_LS_BAL;
	}
	public double getFLAP_HIST_PS_BAL() {
		return FLAP_HIST_PS_BAL;
	}
	public void setFLAP_HIST_PS_BAL(double fLAP_HIST_PS_BAL) {
		FLAP_HIST_PS_BAL = fLAP_HIST_PS_BAL;
	}
	public String getFLAP_EXPR_UNPD_CD() {
		return FLAP_EXPR_UNPD_CD;
	}
	public void setFLAP_EXPR_UNPD_CD(String fLAP_EXPR_UNPD_CD) {
		FLAP_EXPR_UNPD_CD = fLAP_EXPR_UNPD_CD;
	}
	public double getFLAP_CTD_BLLD_INTR_AM() {
		return FLAP_CTD_BLLD_INTR_AM;
	}
	public void setFLAP_CTD_BLLD_INTR_AM(double fLAP_CTD_BLLD_INTR_AM) {
		FLAP_CTD_BLLD_INTR_AM = fLAP_CTD_BLLD_INTR_AM;
	}
	public double getFLAP_EXPR_DALY_INTR_RT() {
		return FLAP_EXPR_DALY_INTR_RT;
	}
	public void setFLAP_EXPR_DALY_INTR_RT(double fLAP_EXPR_DALY_INTR_RT) {
		FLAP_EXPR_DALY_INTR_RT = fLAP_EXPR_DALY_INTR_RT;
	}
	public double getFLAP_EXPR_MNTH_INTR_RT() {
		return FLAP_EXPR_MNTH_INTR_RT;
	}
	public void setFLAP_EXPR_MNTH_INTR_RT(double fLAP_EXPR_MNTH_INTR_RT) {
		FLAP_EXPR_MNTH_INTR_RT = fLAP_EXPR_MNTH_INTR_RT;
	}
	public double getFLAP_EXPR_ANNL_INTR_RT() {
		return FLAP_EXPR_ANNL_INTR_RT;
	}
	public void setFLAP_EXPR_ANNL_INTR_RT(double fLAP_EXPR_ANNL_INTR_RT) {
		FLAP_EXPR_ANNL_INTR_RT = fLAP_EXPR_ANNL_INTR_RT;
	}
	public double getFLAP_MIN_INTR_ITRO_RT() {
		return FLAP_MIN_INTR_ITRO_RT;
	}
	public void setFLAP_MIN_INTR_ITRO_RT(double fLAP_MIN_INTR_ITRO_RT) {
		FLAP_MIN_INTR_ITRO_RT = fLAP_MIN_INTR_ITRO_RT;
	}
	public double getFLAP_MIN_RGLR_ANNL_RT() {
		return FLAP_MIN_RGLR_ANNL_RT;
	}
	public void setFLAP_MIN_RGLR_ANNL_RT(double fLAP_MIN_RGLR_ANNL_RT) {
		FLAP_MIN_RGLR_ANNL_RT = fLAP_MIN_RGLR_ANNL_RT;
	}
	public int getFLAP_RTRN_TO_RVLV_DT() {
		return FLAP_RTRN_TO_RVLV_DT;
	}
	public void setFLAP_RTRN_TO_RVLV_DT(int fLAP_RTRN_TO_RVLV_DT) {
		FLAP_RTRN_TO_RVLV_DT = fLAP_RTRN_TO_RVLV_DT;
	}
	public int getFLAP_RTRN_TO_RVLV_CD_NR() {
		return FLAP_RTRN_TO_RVLV_CD_NR;
	}
	public void setFLAP_RTRN_TO_RVLV_CD_NR(int fLAP_RTRN_TO_RVLV_CD_NR) {
		FLAP_RTRN_TO_RVLV_CD_NR = fLAP_RTRN_TO_RVLV_CD_NR;
	}
	public String getFLAP_RTRN_TO_RVLV_CD() {
		return FLAP_RTRN_TO_RVLV_CD;
	}
	public void setFLAP_RTRN_TO_RVLV_CD(String fLAP_RTRN_TO_RVLV_CD) {
		FLAP_RTRN_TO_RVLV_CD = fLAP_RTRN_TO_RVLV_CD;
	}
	public String getFLAP_LS_REVOLV_SW_TX() {
		return FLAP_LS_REVOLV_SW_TX;
	}
	public void setFLAP_LS_REVOLV_SW_TX(String fLAP_LS_REVOLV_SW_TX) {
		FLAP_LS_REVOLV_SW_TX = fLAP_LS_REVOLV_SW_TX;
	}
	public int getFLAP_LS_REVOLV_SW() {
		return FLAP_LS_REVOLV_SW;
	}
	public void setFLAP_LS_REVOLV_SW(int fLAP_LS_REVOLV_SW) {
		FLAP_LS_REVOLV_SW = fLAP_LS_REVOLV_SW;
	}
	public String getFLAP_PS_REVOLV_SW_TX() {
		return FLAP_PS_REVOLV_SW_TX;
	}
	public void setFLAP_PS_REVOLV_SW_TX(String fLAP_PS_REVOLV_SW_TX) {
		FLAP_PS_REVOLV_SW_TX = fLAP_PS_REVOLV_SW_TX;
	}
	public int getFLAP_PS_REVOLV_SW() {
		return FLAP_PS_REVOLV_SW;
	}
	public void setFLAP_PS_REVOLV_SW(int fLAP_PS_REVOLV_SW) {
		FLAP_PS_REVOLV_SW = fLAP_PS_REVOLV_SW;
	}
	public String getFLAP_LAST_REVOLV_SWTC_CD_TX() {
		return FLAP_LAST_REVOLV_SWTC_CD_TX;
	}
	public void setFLAP_LAST_REVOLV_SWTC_CD_TX(String fLAP_LAST_REVOLV_SWTC_CD_TX) {
		FLAP_LAST_REVOLV_SWTC_CD_TX = fLAP_LAST_REVOLV_SWTC_CD_TX;
	}
	public int getFLAP_LAST_REVOLV_SWTC_CD() {
		return FLAP_LAST_REVOLV_SWTC_CD;
	}
	public void setFLAP_LAST_REVOLV_SWTC_CD(int fLAP_LAST_REVOLV_SWTC_CD) {
		FLAP_LAST_REVOLV_SWTC_CD = fLAP_LAST_REVOLV_SWTC_CD;
	}
	public String getFLAP_LS_RVLV_SWTC_CD_TX() {
		return FLAP_LS_RVLV_SWTC_CD_TX;
	}
	public void setFLAP_LS_RVLV_SWTC_CD_TX(String fLAP_LS_RVLV_SWTC_CD_TX) {
		FLAP_LS_RVLV_SWTC_CD_TX = fLAP_LS_RVLV_SWTC_CD_TX;
	}
	public int getFLAP_LS_RVLV_SWTC_CD() {
		return FLAP_LS_RVLV_SWTC_CD;
	}
	public void setFLAP_LS_RVLV_SWTC_CD(int fLAP_LS_RVLV_SWTC_CD) {
		FLAP_LS_RVLV_SWTC_CD = fLAP_LS_RVLV_SWTC_CD;
	}
	public String getFLAP_PS_RVLV_SWTC_CD_TX() {
		return FLAP_PS_RVLV_SWTC_CD_TX;
	}
	public void setFLAP_PS_RVLV_SWTC_CD_TX(String fLAP_PS_RVLV_SWTC_CD_TX) {
		FLAP_PS_RVLV_SWTC_CD_TX = fLAP_PS_RVLV_SWTC_CD_TX;
	}
	public int getFLAP_PS_RVLV_SWTC_CD() {
		return FLAP_PS_RVLV_SWTC_CD;
	}
	public void setFLAP_PS_RVLV_SWTC_CD(int fLAP_PS_RVLV_SWTC_CD) {
		FLAP_PS_RVLV_SWTC_CD = fLAP_PS_RVLV_SWTC_CD;
	}
	public String getFLAP_LAST_RVLV_SWTC_CD_TX() {
		return FLAP_LAST_RVLV_SWTC_CD_TX;
	}
	public void setFLAP_LAST_RVLV_SWTC_CD_TX(String fLAP_LAST_RVLV_SWTC_CD_TX) {
		FLAP_LAST_RVLV_SWTC_CD_TX = fLAP_LAST_RVLV_SWTC_CD_TX;
	}
	public int getFLAP_LAST_RVLV_SWTC_CD() {
		return FLAP_LAST_RVLV_SWTC_CD;
	}
	public void setFLAP_LAST_RVLV_SWTC_CD(int fLAP_LAST_RVLV_SWTC_CD) {
		FLAP_LAST_RVLV_SWTC_CD = fLAP_LAST_RVLV_SWTC_CD;
	}
	public int getFLAP_REVOLV_INT_RATES() {
		return FLAP_REVOLV_INT_RATES;
	}
	public void setFLAP_REVOLV_INT_RATES(int fLAP_REVOLV_INT_RATES) {
		FLAP_REVOLV_INT_RATES = fLAP_REVOLV_INT_RATES;
	}
	public int getFLAP_REVOLV_INT_METHOD_NR() {
		return FLAP_REVOLV_INT_METHOD_NR;
	}
	public void setFLAP_REVOLV_INT_METHOD_NR(int fLAP_REVOLV_INT_METHOD_NR) {
		FLAP_REVOLV_INT_METHOD_NR = fLAP_REVOLV_INT_METHOD_NR;
	}
	public String getFLAP_REVOLV_INT_METHOD() {
		return FLAP_REVOLV_INT_METHOD;
	}
	public void setFLAP_REVOLV_INT_METHOD(String fLAP_REVOLV_INT_METHOD) {
		FLAP_REVOLV_INT_METHOD = fLAP_REVOLV_INT_METHOD;
	}
	public int getFLAP_REVOLV_MPD_NR() {
		return FLAP_REVOLV_MPD_NR;
	}
	public void setFLAP_REVOLV_MPD_NR(int fLAP_REVOLV_MPD_NR) {
		FLAP_REVOLV_MPD_NR = fLAP_REVOLV_MPD_NR;
	}
	public String getFLAP_REVOLV_MPD() {
		return FLAP_REVOLV_MPD;
	}
	public void setFLAP_REVOLV_MPD(String fLAP_REVOLV_MPD) {
		FLAP_REVOLV_MPD = fLAP_REVOLV_MPD;
	}
	public int getFLAP_REVOLV_ITEM_FEES_NR() {
		return FLAP_REVOLV_ITEM_FEES_NR;
	}
	public void setFLAP_REVOLV_ITEM_FEES_NR(int fLAP_REVOLV_ITEM_FEES_NR) {
		FLAP_REVOLV_ITEM_FEES_NR = fLAP_REVOLV_ITEM_FEES_NR;
	}
	public String getFLAP_REVOLV_ITEM_FEES() {
		return FLAP_REVOLV_ITEM_FEES;
	}
	public void setFLAP_REVOLV_ITEM_FEES(String fLAP_REVOLV_ITEM_FEES) {
		FLAP_REVOLV_ITEM_FEES = fLAP_REVOLV_ITEM_FEES;
	}
	public int getFLAP_REVOLV_PAYOFF_EXCEPT_NR() {
		return FLAP_REVOLV_PAYOFF_EXCEPT_NR;
	}
	public void setFLAP_REVOLV_PAYOFF_EXCEPT_NR(int fLAP_REVOLV_PAYOFF_EXCEPT_NR) {
		FLAP_REVOLV_PAYOFF_EXCEPT_NR = fLAP_REVOLV_PAYOFF_EXCEPT_NR;
	}
	public String getFLAP_REVOLV_PAYOFF_EXCEPT() {
		return FLAP_REVOLV_PAYOFF_EXCEPT;
	}
	public void setFLAP_REVOLV_PAYOFF_EXCEPT(String fLAP_REVOLV_PAYOFF_EXCEPT) {
		FLAP_REVOLV_PAYOFF_EXCEPT = fLAP_REVOLV_PAYOFF_EXCEPT;
	}
	public int getFLAP_REVOLV_BASE_INT_NR() {
		return FLAP_REVOLV_BASE_INT_NR;
	}
	public void setFLAP_REVOLV_BASE_INT_NR(int fLAP_REVOLV_BASE_INT_NR) {
		FLAP_REVOLV_BASE_INT_NR = fLAP_REVOLV_BASE_INT_NR;
	}
	public String getFLAP_REVOLV_BASE_INT() {
		return FLAP_REVOLV_BASE_INT;
	}
	public void setFLAP_REVOLV_BASE_INT(String fLAP_REVOLV_BASE_INT) {
		FLAP_REVOLV_BASE_INT = fLAP_REVOLV_BASE_INT;
	}
	public int getFLAP_REVOLV_REBATE_NR() {
		return FLAP_REVOLV_REBATE_NR;
	}
	public void setFLAP_REVOLV_REBATE_NR(int fLAP_REVOLV_REBATE_NR) {
		FLAP_REVOLV_REBATE_NR = fLAP_REVOLV_REBATE_NR;
	}
	public String getFLAP_REVOLV_REBATE() {
		return FLAP_REVOLV_REBATE;
	}
	public void setFLAP_REVOLV_REBATE(String fLAP_REVOLV_REBATE) {
		FLAP_REVOLV_REBATE = fLAP_REVOLV_REBATE;
	}
	public int getFLAP_REVOLV_BREAKRATES_NR() {
		return FLAP_REVOLV_BREAKRATES_NR;
	}
	public void setFLAP_REVOLV_BREAKRATES_NR(int fLAP_REVOLV_BREAKRATES_NR) {
		FLAP_REVOLV_BREAKRATES_NR = fLAP_REVOLV_BREAKRATES_NR;
	}
	public String getFLAP_REVOLV_BREAKRATES() {
		return FLAP_REVOLV_BREAKRATES;
	}
	public void setFLAP_REVOLV_BREAKRATES(String fLAP_REVOLV_BREAKRATES) {
		FLAP_REVOLV_BREAKRATES = fLAP_REVOLV_BREAKRATES;
	}
	public int getFLAP_RVLV_INTR_ON_INTR_CD_NR() {
		return FLAP_RVLV_INTR_ON_INTR_CD_NR;
	}
	public void setFLAP_RVLV_INTR_ON_INTR_CD_NR(int fLAP_RVLV_INTR_ON_INTR_CD_NR) {
		FLAP_RVLV_INTR_ON_INTR_CD_NR = fLAP_RVLV_INTR_ON_INTR_CD_NR;
	}
	public String getFLAP_RVLV_INTR_ON_INTR_CD() {
		return FLAP_RVLV_INTR_ON_INTR_CD;
	}
	public void setFLAP_RVLV_INTR_ON_INTR_CD(String fLAP_RVLV_INTR_ON_INTR_CD) {
		FLAP_RVLV_INTR_ON_INTR_CD = fLAP_RVLV_INTR_ON_INTR_CD;
	}
	public int getFLAP_PROMO_SQNC_NR() {
		return FLAP_PROMO_SQNC_NR;
	}
	public void setFLAP_PROMO_SQNC_NR(int fLAP_PROMO_SQNC_NR) {
		FLAP_PROMO_SQNC_NR = fLAP_PROMO_SQNC_NR;
	}
	public String getFLAP_BLNC_TYPE_CD() {
		return FLAP_BLNC_TYPE_CD;
	}
	public void setFLAP_BLNC_TYPE_CD(String fLAP_BLNC_TYPE_CD) {
		FLAP_BLNC_TYPE_CD = fLAP_BLNC_TYPE_CD;
	}
	public String getFLAP_DEPT_CODE() {
		return FLAP_DEPT_CODE;
	}
	public void setFLAP_DEPT_CODE(String fLAP_DEPT_CODE) {
		FLAP_DEPT_CODE = fLAP_DEPT_CODE;
	}
	public int getFLAP_RTRN_TO_RVLV_SSPN_CD() {
		return FLAP_RTRN_TO_RVLV_SSPN_CD;
	}
	public void setFLAP_RTRN_TO_RVLV_SSPN_CD(int fLAP_RTRN_TO_RVLV_SSPN_CD) {
		FLAP_RTRN_TO_RVLV_SSPN_CD = fLAP_RTRN_TO_RVLV_SSPN_CD;
	}
	public double getFLAPLS_FEE_APPL_AM() {
		return FLAPLS_FEE_APPL_AM;
	}
	public void setFLAPLS_FEE_APPL_AM(double fLAPLS_FEE_APPL_AM) {
		FLAPLS_FEE_APPL_AM = fLAPLS_FEE_APPL_AM;
	}
	public String getFLAP_INTR_DFLT_STRT_TX() {
		return FLAP_INTR_DFLT_STRT_TX;
	}
	public void setFLAP_INTR_DFLT_STRT_TX(String fLAP_INTR_DFLT_STRT_TX) {
		FLAP_INTR_DFLT_STRT_TX = fLAP_INTR_DFLT_STRT_TX;
	}
	public int getFLAP_PRTC_BLNC_ID() {
		return FLAP_PRTC_BLNC_ID;
	}
	public void setFLAP_PRTC_BLNC_ID(int fLAP_PRTC_BLNC_ID) {
		FLAP_PRTC_BLNC_ID = fLAP_PRTC_BLNC_ID;
	}
	public int getFLAP_IP_STRT_DT() {
		return FLAP_IP_STRT_DT;
	}
	public void setFLAP_IP_STRT_DT(int fLAP_IP_STRT_DT) {
		FLAP_IP_STRT_DT = fLAP_IP_STRT_DT;
	}
	public int getFLAP_IP_END_DT() {
		return FLAP_IP_END_DT;
	}
	public void setFLAP_IP_END_DT(int fLAP_IP_END_DT) {
		FLAP_IP_END_DT = fLAP_IP_END_DT;
	}
	public int getFLAP_PRTC_BLNC_DT() {
		return FLAP_PRTC_BLNC_DT;
	}
	public void setFLAP_PRTC_BLNC_DT(int fLAP_PRTC_BLNC_DT) {
		FLAP_PRTC_BLNC_DT = fLAP_PRTC_BLNC_DT;
	}
	public int getFLAP_CIT_DT() {
		return FLAP_CIT_DT;
	}
	public void setFLAP_CIT_DT(int fLAP_CIT_DT) {
		FLAP_CIT_DT = fLAP_CIT_DT;
	}
	public int getFLAP_PB_TERMS_EFFC_DT() {
		return FLAP_PB_TERMS_EFFC_DT;
	}
	public void setFLAP_PB_TERMS_EFFC_DT(int fLAP_PB_TERMS_EFFC_DT) {
		FLAP_PB_TERMS_EFFC_DT = fLAP_PB_TERMS_EFFC_DT;
	}
	public int getFLAP_TERM_FREZ_DT() {
		return FLAP_TERM_FREZ_DT;
	}
	public void setFLAP_TERM_FREZ_DT(int fLAP_TERM_FREZ_DT) {
		FLAP_TERM_FREZ_DT = fLAP_TERM_FREZ_DT;
	}
	public String getFLAP_PB_MUF_TYPE_CD() {
		return FLAP_PB_MUF_TYPE_CD;
	}
	public void setFLAP_PB_MUF_TYPE_CD(String fLAP_PB_MUF_TYPE_CD) {
		FLAP_PB_MUF_TYPE_CD = fLAP_PB_MUF_TYPE_CD;
	}
	public double getFLAP_ANNV_INTR_RT() {
		return FLAP_ANNV_INTR_RT;
	}
	public void setFLAP_ANNV_INTR_RT(double fLAP_ANNV_INTR_RT) {
		FLAP_ANNV_INTR_RT = fLAP_ANNV_INTR_RT;
	}
	public int getFLAP_RTR_DELY_DT() {
		return FLAP_RTR_DELY_DT;
	}
	public void setFLAP_RTR_DELY_DT(int fLAP_RTR_DELY_DT) {
		FLAP_RTR_DELY_DT = fLAP_RTR_DELY_DT;
	}
	public String getFLAP_RTR_DELY_RESN_CD() {
		return FLAP_RTR_DELY_RESN_CD;
	}
	public void setFLAP_RTR_DELY_RESN_CD(String fLAP_RTR_DELY_RESN_CD) {
		FLAP_RTR_DELY_RESN_CD = fLAP_RTR_DELY_RESN_CD;
	}
	public double getFLAP_SSPN_ANN_INT_RT() {
		return FLAP_SSPN_ANN_INT_RT;
	}
	public void setFLAP_SSPN_ANN_INT_RT(double fLAP_SSPN_ANN_INT_RT) {
		FLAP_SSPN_ANN_INT_RT = fLAP_SSPN_ANN_INT_RT;
	}
	public double getFLAP_SSPN_ORIG_ANN_INT_RT() {
		return FLAP_SSPN_ORIG_ANN_INT_RT;
	}
	public void setFLAP_SSPN_ORIG_ANN_INT_RT(double fLAP_SSPN_ORIG_ANN_INT_RT) {
		FLAP_SSPN_ORIG_ANN_INT_RT = fLAP_SSPN_ORIG_ANN_INT_RT;
	}
	public double getFLAP_SSPN_MIN_RGLR_ANNL_RT() {
		return FLAP_SSPN_MIN_RGLR_ANNL_RT;
	}
	public void setFLAP_SSPN_MIN_RGLR_ANNL_RT(double fLAP_SSPN_MIN_RGLR_ANNL_RT) {
		FLAP_SSPN_MIN_RGLR_ANNL_RT = fLAP_SSPN_MIN_RGLR_ANNL_RT;
	}
	public double getFLAP_SSPN_MIN_INTR_ITRO_RT() {
		return FLAP_SSPN_MIN_INTR_ITRO_RT;
	}
	public void setFLAP_SSPN_MIN_INTR_ITRO_RT(double fLAP_SSPN_MIN_INTR_ITRO_RT) {
		FLAP_SSPN_MIN_INTR_ITRO_RT = fLAP_SSPN_MIN_INTR_ITRO_RT;
	}
	public double getFLAP_SSPN_MAX_INTR_ITRO_RT() {
		return FLAP_SSPN_MAX_INTR_ITRO_RT;
	}
	public void setFLAP_SSPN_MAX_INTR_ITRO_RT(double fLAP_SSPN_MAX_INTR_ITRO_RT) {
		FLAP_SSPN_MAX_INTR_ITRO_RT = fLAP_SSPN_MAX_INTR_ITRO_RT;
	}
	public double getFLAP_SSPN_MAX_INTR_RGLR_RT() {
		return FLAP_SSPN_MAX_INTR_RGLR_RT;
	}
	public void setFLAP_SSPN_MAX_INTR_RGLR_RT(double fLAP_SSPN_MAX_INTR_RGLR_RT) {
		FLAP_SSPN_MAX_INTR_RGLR_RT = fLAP_SSPN_MAX_INTR_RGLR_RT;
	}
	public int getFLAP_SSPN_MTHD_SET_NR() {
		return FLAP_SSPN_MTHD_SET_NR;
	}
	public void setFLAP_SSPN_MTHD_SET_NR(int fLAP_SSPN_MTHD_SET_NR) {
		FLAP_SSPN_MTHD_SET_NR = fLAP_SSPN_MTHD_SET_NR;
	}
	public int getFLAP_SSPN_FREZ_MPD_CD() {
		return FLAP_SSPN_FREZ_MPD_CD;
	}
	public void setFLAP_SSPN_FREZ_MPD_CD(int fLAP_SSPN_FREZ_MPD_CD) {
		FLAP_SSPN_FREZ_MPD_CD = fLAP_SSPN_FREZ_MPD_CD;
	}
	public int getFLAP_UNSS_DT() {
		return FLAP_UNSS_DT;
	}
	public void setFLAP_UNSS_DT(int fLAP_UNSS_DT) {
		FLAP_UNSS_DT = fLAP_UNSS_DT;
	}
	public int getFLAP_SSPN_INT_RATE_CD() {
		return FLAP_SSPN_INT_RATE_CD;
	}
	public void setFLAP_SSPN_INT_RATE_CD(int fLAP_SSPN_INT_RATE_CD) {
		FLAP_SSPN_INT_RATE_CD = fLAP_SSPN_INT_RATE_CD;
	}
	public int getFLAP_SSPN_INT_MTHD_CD() {
		return FLAP_SSPN_INT_MTHD_CD;
	}
	public void setFLAP_SSPN_INT_MTHD_CD(int fLAP_SSPN_INT_MTHD_CD) {
		FLAP_SSPN_INT_MTHD_CD = fLAP_SSPN_INT_MTHD_CD;
	}
	public int getFLAP_SSPN_MPD_CD() {
		return FLAP_SSPN_MPD_CD;
	}
	public void setFLAP_SSPN_MPD_CD(int fLAP_SSPN_MPD_CD) {
		FLAP_SSPN_MPD_CD = fLAP_SSPN_MPD_CD;
	}
	public int getFLAP_SSPN_ITEM_FEES_CD() {
		return FLAP_SSPN_ITEM_FEES_CD;
	}
	public void setFLAP_SSPN_ITEM_FEES_CD(int fLAP_SSPN_ITEM_FEES_CD) {
		FLAP_SSPN_ITEM_FEES_CD = fLAP_SSPN_ITEM_FEES_CD;
	}
	public int getFLAP_SSPN_PYFF_EXCP_CD() {
		return FLAP_SSPN_PYFF_EXCP_CD;
	}
	public void setFLAP_SSPN_PYFF_EXCP_CD(int fLAP_SSPN_PYFF_EXCP_CD) {
		FLAP_SSPN_PYFF_EXCP_CD = fLAP_SSPN_PYFF_EXCP_CD;
	}
	public int getFLAP_SSPN_BASE_INT_CD() {
		return FLAP_SSPN_BASE_INT_CD;
	}
	public void setFLAP_SSPN_BASE_INT_CD(int fLAP_SSPN_BASE_INT_CD) {
		FLAP_SSPN_BASE_INT_CD = fLAP_SSPN_BASE_INT_CD;
	}
	public int getFLAP_SSPN_REBT_CD() {
		return FLAP_SSPN_REBT_CD;
	}
	public void setFLAP_SSPN_REBT_CD(int fLAP_SSPN_REBT_CD) {
		FLAP_SSPN_REBT_CD = fLAP_SSPN_REBT_CD;
	}
	public int getFLAP_SSPN_BREK_RATE_CD() {
		return FLAP_SSPN_BREK_RATE_CD;
	}
	public void setFLAP_SSPN_BREK_RATE_CD(int fLAP_SSPN_BREK_RATE_CD) {
		FLAP_SSPN_BREK_RATE_CD = fLAP_SSPN_BREK_RATE_CD;
	}
	public int getFLAP_SSPN_INT_ON_INT_CD() {
		return FLAP_SSPN_INT_ON_INT_CD;
	}
	public void setFLAP_SSPN_INT_ON_INT_CD(int fLAP_SSPN_INT_ON_INT_CD) {
		FLAP_SSPN_INT_ON_INT_CD = fLAP_SSPN_INT_ON_INT_CD;
	}
	public int getFLAP_SSPN_INTR_DFLT_CD() {
		return FLAP_SSPN_INTR_DFLT_CD;
	}
	public void setFLAP_SSPN_INTR_DFLT_CD(int fLAP_SSPN_INTR_DFLT_CD) {
		FLAP_SSPN_INTR_DFLT_CD = fLAP_SSPN_INTR_DFLT_CD;
	}
	public int getFLAP_RTR_DSCL_CT() {
		return FLAP_RTR_DSCL_CT;
	}
	public void setFLAP_RTR_DSCL_CT(int fLAP_RTR_DSCL_CT) {
		FLAP_RTR_DSCL_CT = fLAP_RTR_DSCL_CT;
	}
	public int getFLAP_POST_CLOS_DT() {
		return FLAP_POST_CLOS_DT;
	}
	public void setFLAP_POST_CLOS_DT(int fLAP_POST_CLOS_DT) {
		FLAP_POST_CLOS_DT = fLAP_POST_CLOS_DT;
	}
	public int getFLAP_RTR_DSCL_DT() {
		return FLAP_RTR_DSCL_DT;
	}
	public void setFLAP_RTR_DSCL_DT(int fLAP_RTR_DSCL_DT) {
		FLAP_RTR_DSCL_DT = fLAP_RTR_DSCL_DT;
	}
	public int getFLAP_AMRT_MTRT_DT() {
		return FLAP_AMRT_MTRT_DT;
	}
	public void setFLAP_AMRT_MTRT_DT(int fLAP_AMRT_MTRT_DT) {
		FLAP_AMRT_MTRT_DT = fLAP_AMRT_MTRT_DT;
	}
	public double getFLAP_DFP_FEE_SAVE_AM() {
		return FLAP_DFP_FEE_SAVE_AM;
	}
	public void setFLAP_DFP_FEE_SAVE_AM(double fLAP_DFP_FEE_SAVE_AM) {
		FLAP_DFP_FEE_SAVE_AM = fLAP_DFP_FEE_SAVE_AM;
	}
	public String getFLAP_VRBL_CD() {
		return FLAP_VRBL_CD;
	}
	public void setFLAP_VRBL_CD(String fLAP_VRBL_CD) {
		FLAP_VRBL_CD = fLAP_VRBL_CD;
	}
	public String getFLAP_GOTO_VRBL_CD() {
		return FLAP_GOTO_VRBL_CD;
	}
	public void setFLAP_GOTO_VRBL_CD(String fLAP_GOTO_VRBL_CD) {
		FLAP_GOTO_VRBL_CD = fLAP_GOTO_VRBL_CD;
	}
	public String getFLAP_LOAN_TYPE_CD() {
		return FLAP_LOAN_TYPE_CD;
	}
	public void setFLAP_LOAN_TYPE_CD(String fLAP_LOAN_TYPE_CD) {
		FLAP_LOAN_TYPE_CD = fLAP_LOAN_TYPE_CD;
	}
	
	public double getFLAP_LS_HIST_INTR_AM() {
		return FLAP_LS_HIST_INTR_AM;
	}
	public void setFLAP_LS_HIST_INTR_AM(double fLAP_LS_HIST_INTR_AM) {
		FLAP_LS_HIST_INTR_AM = fLAP_LS_HIST_INTR_AM;
	}
	public double getFLAP_LS_HIST_PRIN_AM() {
		return FLAP_LS_HIST_PRIN_AM;
	}
	public void setFLAP_LS_HIST_PRIN_AM(double fLAP_LS_HIST_PRIN_AM) {
		FLAP_LS_HIST_PRIN_AM = fLAP_LS_HIST_PRIN_AM;
	}
	public double getFLAP_LS_HIST_FEE_AM() {
		return FLAP_LS_HIST_FEE_AM;
	}
	public void setFLAP_LS_HIST_FEE_AM(double fLAP_LS_HIST_FEE_AM) {
		FLAP_LS_HIST_FEE_AM = fLAP_LS_HIST_FEE_AM;
	}
	public double getFLAP_LS_HIST_RMPD_INTR_AM() {
		return FLAP_LS_HIST_RMPD_INTR_AM;
	}
	public void setFLAP_LS_HIST_RMPD_INTR_AM(double fLAP_LS_HIST_RMPD_INTR_AM) {
		FLAP_LS_HIST_RMPD_INTR_AM = fLAP_LS_HIST_RMPD_INTR_AM;
	}
	public double getFLAP_LS_HIST_RMPD_PRIN_AM() {
		return FLAP_LS_HIST_RMPD_PRIN_AM;
	}
	public void setFLAP_LS_HIST_RMPD_PRIN_AM(double fLAP_LS_HIST_RMPD_PRIN_AM) {
		FLAP_LS_HIST_RMPD_PRIN_AM = fLAP_LS_HIST_RMPD_PRIN_AM;
	}
	public double getFLAP_LS_HIST_RMPD_FEE_AM() {
		return FLAP_LS_HIST_RMPD_FEE_AM;
	}
	public void setFLAP_LS_HIST_RMPD_FEE_AM(double fLAP_LS_HIST_RMPD_FEE_AM) {
		FLAP_LS_HIST_RMPD_FEE_AM = fLAP_LS_HIST_RMPD_FEE_AM;
	}
	public double getFLAP_LS_HIST_DMPD_INTR_AM() {
		return FLAP_LS_HIST_DMPD_INTR_AM;
	}
	public void setFLAP_LS_HIST_DMPD_INTR_AM(double fLAP_LS_HIST_DMPD_INTR_AM) {
		FLAP_LS_HIST_DMPD_INTR_AM = fLAP_LS_HIST_DMPD_INTR_AM;
	}
	public double getFLAP_LS_HIST_DMPD_PRIN_AM() {
		return FLAP_LS_HIST_DMPD_PRIN_AM;
	}
	public void setFLAP_LS_HIST_DMPD_PRIN_AM(double fLAP_LS_HIST_DMPD_PRIN_AM) {
		FLAP_LS_HIST_DMPD_PRIN_AM = fLAP_LS_HIST_DMPD_PRIN_AM;
	}
	public double getFLAP_LS_HIST_DMPD_FEE_AM() {
		return FLAP_LS_HIST_DMPD_FEE_AM;
	}
	public void setFLAP_LS_HIST_DMPD_FEE_AM(double fLAP_LS_HIST_DMPD_FEE_AM) {
		FLAP_LS_HIST_DMPD_FEE_AM = fLAP_LS_HIST_DMPD_FEE_AM;
	}
	public double getFLAP_LS_HIST_PYMT_INTR_AM() {
		return FLAP_LS_HIST_PYMT_INTR_AM;
	}
	public void setFLAP_LS_HIST_PYMT_INTR_AM(double fLAP_LS_HIST_PYMT_INTR_AM) {
		FLAP_LS_HIST_PYMT_INTR_AM = fLAP_LS_HIST_PYMT_INTR_AM;
	}
	public double getFLAP_LS_HIST_PYMT_PRIN_AM() {
		return FLAP_LS_HIST_PYMT_PRIN_AM;
	}
	public void setFLAP_LS_HIST_PYMT_PRIN_AM(double fLAP_LS_HIST_PYMT_PRIN_AM) {
		FLAP_LS_HIST_PYMT_PRIN_AM = fLAP_LS_HIST_PYMT_PRIN_AM;
	}
	public double getFLAP_LS_HIST_PYMT_FEE_AM() {
		return FLAP_LS_HIST_PYMT_FEE_AM;
	}
	public void setFLAP_LS_HIST_PYMT_FEE_AM(double fLAP_LS_HIST_PYMT_FEE_AM) {
		FLAP_LS_HIST_PYMT_FEE_AM = fLAP_LS_HIST_PYMT_FEE_AM;
	}
	public double getFLAP_YTD_BLLD_INTR_AM() {
		return FLAP_YTD_BLLD_INTR_AM;
	}
	public void setFLAP_YTD_BLLD_INTR_AM(double fLAP_YTD_BLLD_INTR_AM) {
		FLAP_YTD_BLLD_INTR_AM = fLAP_YTD_BLLD_INTR_AM;
	}
	public double getFLAP_PY_BLLD_INTR_AM() {
		return FLAP_PY_BLLD_INTR_AM;
	}
	public void setFLAP_PY_BLLD_INTR_AM(double fLAP_PY_BLLD_INTR_AM) {
		FLAP_PY_BLLD_INTR_AM = fLAP_PY_BLLD_INTR_AM;
	}
	public double getFLAP_LS_HIST_POB_RATE_AM() {
		return FLAP_LS_HIST_POB_RATE_AM;
	}
	public void setFLAP_LS_HIST_POB_RATE_AM(double fLAP_LS_HIST_POB_RATE_AM) {
		FLAP_LS_HIST_POB_RATE_AM = fLAP_LS_HIST_POB_RATE_AM;
	}
	public double getFLAP_YTD_PAID_PRIN_AM() {
		return FLAP_YTD_PAID_PRIN_AM;
	}
	public void setFLAP_YTD_PAID_PRIN_AM(double fLAP_YTD_PAID_PRIN_AM) {
		FLAP_YTD_PAID_PRIN_AM = fLAP_YTD_PAID_PRIN_AM;
	}
	public String getFLAP_UNIQ_MNTH_BLNC_CD() {
		return FLAP_UNIQ_MNTH_BLNC_CD;
	}
	public void setFLAP_UNIQ_MNTH_BLNC_CD(String fLAP_UNIQ_MNTH_BLNC_CD) {
		FLAP_UNIQ_MNTH_BLNC_CD = fLAP_UNIQ_MNTH_BLNC_CD;
	}
	public int getFLAP_BLNC_OPEN_DT() {
		return FLAP_BLNC_OPEN_DT;
	}
	public void setFLAP_BLNC_OPEN_DT(int fLAP_BLNC_OPEN_DT) {
		FLAP_BLNC_OPEN_DT = fLAP_BLNC_OPEN_DT;
	}
	public String getFLAP_CLASS_DR() {
		return FLAP_CLASS_DR;
	}
	public void setFLAP_CLASS_DR(String fLAP_CLASS_DR) {
		FLAP_CLASS_DR = fLAP_CLASS_DR;
	}
	public String getFLAP_CLASS_DATE_TX() {
		return FLAP_CLASS_DATE_TX;
	}
	public void setFLAP_CLASS_DATE_TX(String fLAP_CLASS_DATE_TX) {
		FLAP_CLASS_DATE_TX = fLAP_CLASS_DATE_TX;
	}
	public int getFLAP_CLASS_DATE() {
		return FLAP_CLASS_DATE;
	}
	public void setFLAP_CLASS_DATE(int fLAP_CLASS_DATE) {
		FLAP_CLASS_DATE = fLAP_CLASS_DATE;
	}
	public String getFLAP_INT_ON_INT() {
		return FLAP_INT_ON_INT;
	}
	public void setFLAP_INT_ON_INT(String fLAP_INT_ON_INT) {
		FLAP_INT_ON_INT = fLAP_INT_ON_INT;
	}
	public String getFLAP_MUF_TYPE() {
		return FLAP_MUF_TYPE;
	}
	public void setFLAP_MUF_TYPE(String fLAP_MUF_TYPE) {
		FLAP_MUF_TYPE = fLAP_MUF_TYPE;
	}
	public String getFLAP_PRCNG_STRAT_ID() {
		return FLAP_PRCNG_STRAT_ID;
	}
	public void setFLAP_PRCNG_STRAT_ID(String fLAP_PRCNG_STRAT_ID) {
		FLAP_PRCNG_STRAT_ID = fLAP_PRCNG_STRAT_ID;
	}
	public double getFLAP_CURR_TOTAL_DELQ() {
		return FLAP_CURR_TOTAL_DELQ;
	}
	public void setFLAP_CURR_TOTAL_DELQ(double fLAP_CURR_TOTAL_DELQ) {
		FLAP_CURR_TOTAL_DELQ = fLAP_CURR_TOTAL_DELQ;
	}
	public double getFLAP_CURR_UNPAID_BPD() {
		return FLAP_CURR_UNPAID_BPD;
	}
	public void setFLAP_CURR_UNPAID_BPD(double fLAP_CURR_UNPAID_BPD) {
		FLAP_CURR_UNPAID_BPD = fLAP_CURR_UNPAID_BPD;
	}
	public double getFLAP_CURR_UNPAID_INTSC() {
		return FLAP_CURR_UNPAID_INTSC;
	}
	public void setFLAP_CURR_UNPAID_INTSC(double fLAP_CURR_UNPAID_INTSC) {
		FLAP_CURR_UNPAID_INTSC = fLAP_CURR_UNPAID_INTSC;
	}
	public double getFLAP_BINT() {
		return FLAP_BINT;
	}
	public void setFLAP_BINT(double fLAP_BINT) {
		FLAP_BINT = fLAP_BINT;
	}
	public double getFLAP_REPORTABLE_INT() {
		return FLAP_REPORTABLE_INT;
	}
	public void setFLAP_REPORTABLE_INT(double fLAP_REPORTABLE_INT) {
		FLAP_REPORTABLE_INT = fLAP_REPORTABLE_INT;
	}
	public double getFLAP_CTD_PRIN() {
		return FLAP_CTD_PRIN;
	}
	public void setFLAP_CTD_PRIN(double fLAP_CTD_PRIN) {
		FLAP_CTD_PRIN = fLAP_CTD_PRIN;
	}
	public double getFLAP_OLD_PRIN() {
		return FLAP_OLD_PRIN;
	}
	public void setFLAP_OLD_PRIN(double fLAP_OLD_PRIN) {
		FLAP_OLD_PRIN = fLAP_OLD_PRIN;
	}
	public double getFLAP_CTD_ITEM_FEES() {
		return FLAP_CTD_ITEM_FEES;
	}
	public void setFLAP_CTD_ITEM_FEES(double fLAP_CTD_ITEM_FEES) {
		FLAP_CTD_ITEM_FEES = fLAP_CTD_ITEM_FEES;
	}
	public double getFLAP_DISPUTE_AMOUNT() {
		return FLAP_DISPUTE_AMOUNT;
	}
	public void setFLAP_DISPUTE_AMOUNT(double fLAP_DISPUTE_AMOUNT) {
		FLAP_DISPUTE_AMOUNT = fLAP_DISPUTE_AMOUNT;
	}
	public double getFLAP_CRRN_BLNC_AM() {
		return FLAP_CRRN_BLNC_AM;
	}
	public void setFLAP_CRRN_BLNC_AM(double fLAP_CRRN_BLNC_AM) {
		FLAP_CRRN_BLNC_AM = fLAP_CRRN_BLNC_AM;
	}
	public double getFLAPAP_UNPD_LATE_CHRG_AM() {
		return FLAPAP_UNPD_LATE_CHRG_AM;
	}
	public void setFLAPAP_UNPD_LATE_CHRG_AM(double fLAPAP_UNPD_LATE_CHRG_AM) {
		FLAPAP_UNPD_LATE_CHRG_AM = fLAPAP_UNPD_LATE_CHRG_AM;
	}
	public double getFLAPAP_UNPD_OVRL_CHRG_AM() {
		return FLAPAP_UNPD_OVRL_CHRG_AM;
	}
	public void setFLAPAP_UNPD_OVRL_CHRG_AM(double fLAPAP_UNPD_OVRL_CHRG_AM) {
		FLAPAP_UNPD_OVRL_CHRG_AM = fLAPAP_UNPD_OVRL_CHRG_AM;
	}
	public double getFLAPAP_UNPD_CRDT_LIFE_AM() {
		return FLAPAP_UNPD_CRDT_LIFE_AM;
	}
	public void setFLAPAP_UNPD_CRDT_LIFE_AM(double fLAPAP_UNPD_CRDT_LIFE_AM) {
		FLAPAP_UNPD_CRDT_LIFE_AM = fLAPAP_UNPD_CRDT_LIFE_AM;
	}
	public double getFLAPAP_UNPD_MSCL_CHRG_AM() {
		return FLAPAP_UNPD_MSCL_CHRG_AM;
	}
	public void setFLAPAP_UNPD_MSCL_CHRG_AM(double fLAPAP_UNPD_MSCL_CHRG_AM) {
		FLAPAP_UNPD_MSCL_CHRG_AM = fLAPAP_UNPD_MSCL_CHRG_AM;
	}
	public double getFLAPAP_UNPD_ANNL_CHRG_AM() {
		return FLAPAP_UNPD_ANNL_CHRG_AM;
	}
	public void setFLAPAP_UNPD_ANNL_CHRG_AM(double fLAPAP_UNPD_ANNL_CHRG_AM) {
		FLAPAP_UNPD_ANNL_CHRG_AM = fLAPAP_UNPD_ANNL_CHRG_AM;
	}
	public double getFLAPAP_UNPD_SRCHRG_AM() {
		return FLAPAP_UNPD_SRCHRG_AM;
	}
	public void setFLAPAP_UNPD_SRCHRG_AM(double fLAPAP_UNPD_SRCHRG_AM) {
		FLAPAP_UNPD_SRCHRG_AM = fLAPAP_UNPD_SRCHRG_AM;
	}
	public double getFLAPAP_UNPD_ITEM_CHRG_AM() {
		return FLAPAP_UNPD_ITEM_CHRG_AM;
	}
	public void setFLAPAP_UNPD_ITEM_CHRG_AM(double fLAPAP_UNPD_ITEM_CHRG_AM) {
		FLAPAP_UNPD_ITEM_CHRG_AM = fLAPAP_UNPD_ITEM_CHRG_AM;
	}
	public int getFLAP_DLNQ_CYCL_NR() {
		return FLAP_DLNQ_CYCL_NR;
	}
	public void setFLAP_DLNQ_CYCL_NR(int fLAP_DLNQ_CYCL_NR) {
		FLAP_DLNQ_CYCL_NR = fLAP_DLNQ_CYCL_NR;
	}
	public double getFLAPLS_OLD_PRIN() {
		return FLAPLS_OLD_PRIN;
	}
	public void setFLAPLS_OLD_PRIN(double fLAPLS_OLD_PRIN) {
		FLAPLS_OLD_PRIN = fLAPLS_OLD_PRIN;
	}
	public double getFLAPLS_BILLED_INT() {
		return FLAPLS_BILLED_INT;
	}
	public void setFLAPLS_BILLED_INT(double fLAPLS_BILLED_INT) {
		FLAPLS_BILLED_INT = fLAPLS_BILLED_INT;
	}
	public double getFLAPLS_UNPAID_INTSC() {
		return FLAPLS_UNPAID_INTSC;
	}
	public void setFLAPLS_UNPAID_INTSC(double fLAPLS_UNPAID_INTSC) {
		FLAPLS_UNPAID_INTSC = fLAPLS_UNPAID_INTSC;
	}
	public double getFLAPLS_BPD() {
		return FLAPLS_BPD;
	}
	public void setFLAPLS_BPD(double fLAPLS_BPD) {
		FLAPLS_BPD = fLAPLS_BPD;
	}
	public double getFLAPLS_TOTAL_DELQ() {
		return FLAPLS_TOTAL_DELQ;
	}
	public void setFLAPLS_TOTAL_DELQ(double fLAPLS_TOTAL_DELQ) {
		FLAPLS_TOTAL_DELQ = fLAPLS_TOTAL_DELQ;
	}
	public double getFLAPLS_ACCRUED_UNBILLED_INT() {
		return FLAPLS_ACCRUED_UNBILLED_INT;
	}
	public void setFLAPLS_ACCRUED_UNBILLED_INT(double fLAPLS_ACCRUED_UNBILLED_INT) {
		FLAPLS_ACCRUED_UNBILLED_INT = fLAPLS_ACCRUED_UNBILLED_INT;
	}
	public double getFLAPLS_ITEM_FEES() {
		return FLAPLS_ITEM_FEES;
	}
	public void setFLAPLS_ITEM_FEES(double fLAPLS_ITEM_FEES) {
		FLAPLS_ITEM_FEES = fLAPLS_ITEM_FEES;
	}
	public double getFLAPLS_REPORTABLE_INT() {
		return FLAPLS_REPORTABLE_INT;
	}
	public void setFLAPLS_REPORTABLE_INT(double fLAPLS_REPORTABLE_INT) {
		FLAPLS_REPORTABLE_INT = fLAPLS_REPORTABLE_INT;
	}
	public double getFLAPLS_DEFERRED_CR_LIFE() {
		return FLAPLS_DEFERRED_CR_LIFE;
	}
	public void setFLAPLS_DEFERRED_CR_LIFE(double fLAPLS_DEFERRED_CR_LIFE) {
		FLAPLS_DEFERRED_CR_LIFE = fLAPLS_DEFERRED_CR_LIFE;
	}
	public double getFLAPLS_DEF_ADB() {
		return FLAPLS_DEF_ADB;
	}
	public void setFLAPLS_DEF_ADB(double fLAPLS_DEF_ADB) {
		FLAPLS_DEF_ADB = fLAPLS_DEF_ADB;
	}
	public double getFLAPLS_CYC_PRIN() {
		return FLAPLS_CYC_PRIN;
	}
	public void setFLAPLS_CYC_PRIN(double fLAPLS_CYC_PRIN) {
		FLAPLS_CYC_PRIN = fLAPLS_CYC_PRIN;
	}
	public double getFLAPLS_DISPUTE_AMOUNT() {
		return FLAPLS_DISPUTE_AMOUNT;
	}
	public void setFLAPLS_DISPUTE_AMOUNT(double fLAPLS_DISPUTE_AMOUNT) {
		FLAPLS_DISPUTE_AMOUNT = fLAPLS_DISPUTE_AMOUNT;
	}
	public double getFLAPLS_UNBD_ITEM_FEE_AM() {
		return FLAPLS_UNBD_ITEM_FEE_AM;
	}
	public void setFLAPLS_UNBD_ITEM_FEE_AM(double fLAPLS_UNBD_ITEM_FEE_AM) {
		FLAPLS_UNBD_ITEM_FEE_AM = fLAPLS_UNBD_ITEM_FEE_AM;
	}
	public double getFLAPLS_TRANS_AMT() {
		return FLAPLS_TRANS_AMT;
	}
	public void setFLAPLS_TRANS_AMT(double fLAPLS_TRANS_AMT) {
		FLAPLS_TRANS_AMT = fLAPLS_TRANS_AMT;
	}
	public String getFLAPLS_PYFF_EXCP_CD_1() {
		return FLAPLS_PYFF_EXCP_CD_1;
	}
	public void setFLAPLS_PYFF_EXCP_CD_1(String fLAPLS_PYFF_EXCP_CD_1) {
		FLAPLS_PYFF_EXCP_CD_1 = fLAPLS_PYFF_EXCP_CD_1;
	}
	public String getFLAPLS_PYFF_EXCP_CD_2() {
		return FLAPLS_PYFF_EXCP_CD_2;
	}
	public void setFLAPLS_PYFF_EXCP_CD_2(String fLAPLS_PYFF_EXCP_CD_2) {
		FLAPLS_PYFF_EXCP_CD_2 = fLAPLS_PYFF_EXCP_CD_2;
	}
	public String getFLAPLS_PYFF_EXCP_CD_3() {
		return FLAPLS_PYFF_EXCP_CD_3;
	}
	public void setFLAPLS_PYFF_EXCP_CD_3(String fLAPLS_PYFF_EXCP_CD_3) {
		FLAPLS_PYFF_EXCP_CD_3 = fLAPLS_PYFF_EXCP_CD_3;
	}
	public double getFLAPLS_REAL_INT_AM() {
		return FLAPLS_REAL_INT_AM;
	}
	public void setFLAPLS_REAL_INT_AM(double fLAPLS_REAL_INT_AM) {
		FLAPLS_REAL_INT_AM = fLAPLS_REAL_INT_AM;
	}
	public int getFLAPLS_RTRN_TO_RVLV_CD_NR() {
		return FLAPLS_RTRN_TO_RVLV_CD_NR;
	}
	public void setFLAPLS_RTRN_TO_RVLV_CD_NR(int fLAPLS_RTRN_TO_RVLV_CD_NR) {
		FLAPLS_RTRN_TO_RVLV_CD_NR = fLAPLS_RTRN_TO_RVLV_CD_NR;
	}
	
	public String getFLAPLS_RTRN_TO_RVLV_CD() {
		return FLAPLS_RTRN_TO_RVLV_CD;
	}
	public void setFLAPLS_RTRN_TO_RVLV_CD(String fLAPLS_RTRN_TO_RVLV_CD) {
		FLAPLS_RTRN_TO_RVLV_CD = fLAPLS_RTRN_TO_RVLV_CD;
	}
	public double getFLAPLS_DEFR_CRDT_LIFE_BASE_AM() {
		return FLAPLS_DEFR_CRDT_LIFE_BASE_AM;
	}
	public void setFLAPLS_DEFR_CRDT_LIFE_BASE_AM(double fLAPLS_DEFR_CRDT_LIFE_BASE_AM) {
		FLAPLS_DEFR_CRDT_LIFE_BASE_AM = fLAPLS_DEFR_CRDT_LIFE_BASE_AM;
	}
	public double getFLAPLS_BLLD_INTR_AM() {
		return FLAPLS_BLLD_INTR_AM;
	}
	public void setFLAPLS_BLLD_INTR_AM(double fLAPLS_BLLD_INTR_AM) {
		FLAPLS_BLLD_INTR_AM = fLAPLS_BLLD_INTR_AM;
	}
	public double getFLAPLS_FLAP_ADB_AM() {
		return FLAPLS_FLAP_ADB_AM;
	}
	public void setFLAPLS_FLAP_ADB_AM(double fLAPLS_FLAP_ADB_AM) {
		FLAPLS_FLAP_ADB_AM = fLAPLS_FLAP_ADB_AM;
	}
	public double getFLAPLS_BLNC_AM() {
		return FLAPLS_BLNC_AM;
	}
	public void setFLAPLS_BLNC_AM(double fLAPLS_BLNC_AM) {
		FLAPLS_BLNC_AM = fLAPLS_BLNC_AM;
	}
	public double getFLAPLS_LATE_CHRG_AM() {
		return FLAPLS_LATE_CHRG_AM;
	}
	public void setFLAPLS_LATE_CHRG_AM(double fLAPLS_LATE_CHRG_AM) {
		FLAPLS_LATE_CHRG_AM = fLAPLS_LATE_CHRG_AM;
	}
	public double getFLAPLS_UNPD_LATE_CHRG_AM() {
		return FLAPLS_UNPD_LATE_CHRG_AM;
	}
	public void setFLAPLS_UNPD_LATE_CHRG_AM(double fLAPLS_UNPD_LATE_CHRG_AM) {
		FLAPLS_UNPD_LATE_CHRG_AM = fLAPLS_UNPD_LATE_CHRG_AM;
	}
	public double getFLAPLS_OVRL_CHRG_AM() {
		return FLAPLS_OVRL_CHRG_AM;
	}
	public void setFLAPLS_OVRL_CHRG_AM(double fLAPLS_OVRL_CHRG_AM) {
		FLAPLS_OVRL_CHRG_AM = fLAPLS_OVRL_CHRG_AM;
	}
	public double getFLAPLS_UNPD_OVRL_CHRG_AM() {
		return FLAPLS_UNPD_OVRL_CHRG_AM;
	}
	public void setFLAPLS_UNPD_OVRL_CHRG_AM(double fLAPLS_UNPD_OVRL_CHRG_AM) {
		FLAPLS_UNPD_OVRL_CHRG_AM = fLAPLS_UNPD_OVRL_CHRG_AM;
	}
	public double getFLAPLS_MSCL_CHRG_AM() {
		return FLAPLS_MSCL_CHRG_AM;
	}
	public void setFLAPLS_MSCL_CHRG_AM(double fLAPLS_MSCL_CHRG_AM) {
		FLAPLS_MSCL_CHRG_AM = fLAPLS_MSCL_CHRG_AM;
	}
	public double getFLAPLS_UNPD_MSCL_CHRG_AM() {
		return FLAPLS_UNPD_MSCL_CHRG_AM;
	}
	public void setFLAPLS_UNPD_MSCL_CHRG_AM(double fLAPLS_UNPD_MSCL_CHRG_AM) {
		FLAPLS_UNPD_MSCL_CHRG_AM = fLAPLS_UNPD_MSCL_CHRG_AM;
	}
	public double getFLAPLS_ANNL_CHRG_AM() {
		return FLAPLS_ANNL_CHRG_AM;
	}
	public void setFLAPLS_ANNL_CHRG_AM(double fLAPLS_ANNL_CHRG_AM) {
		FLAPLS_ANNL_CHRG_AM = fLAPLS_ANNL_CHRG_AM;
	}
	public double getFLAPLS_UNPD_ANNL_CHRG_AM() {
		return FLAPLS_UNPD_ANNL_CHRG_AM;
	}
	public void setFLAPLS_UNPD_ANNL_CHRG_AM(double fLAPLS_UNPD_ANNL_CHRG_AM) {
		FLAPLS_UNPD_ANNL_CHRG_AM = fLAPLS_UNPD_ANNL_CHRG_AM;
	}
	public double getFLAPLS_SRCHG_AM() {
		return FLAPLS_SRCHG_AM;
	}
	public void setFLAPLS_SRCHG_AM(double fLAPLS_SRCHG_AM) {
		FLAPLS_SRCHG_AM = fLAPLS_SRCHG_AM;
	}
	public double getFLAPLS_UNPD_SRCHG_AM() {
		return FLAPLS_UNPD_SRCHG_AM;
	}
	public void setFLAPLS_UNPD_SRCHG_AM(double fLAPLS_UNPD_SRCHG_AM) {
		FLAPLS_UNPD_SRCHG_AM = fLAPLS_UNPD_SRCHG_AM;
	}
	public double getFLAPLS_UNPD_ITEM_CHRG_AM() {
		return FLAPLS_UNPD_ITEM_CHRG_AM;
	}
	public void setFLAPLS_UNPD_ITEM_CHRG_AM(double fLAPLS_UNPD_ITEM_CHRG_AM) {
		FLAPLS_UNPD_ITEM_CHRG_AM = fLAPLS_UNPD_ITEM_CHRG_AM;
	}
	public double getFLAPLS_MIN_FIN_CHRG_AM() {
		return FLAPLS_MIN_FIN_CHRG_AM;
	}
	public void setFLAPLS_MIN_FIN_CHRG_AM(double fLAPLS_MIN_FIN_CHRG_AM) {
		FLAPLS_MIN_FIN_CHRG_AM = fLAPLS_MIN_FIN_CHRG_AM;
	}
	public double getFLAPLS_FRST_PERD_ADB_AM() {
		return FLAPLS_FRST_PERD_ADB_AM;
	}
	public void setFLAPLS_FRST_PERD_ADB_AM(double fLAPLS_FRST_PERD_ADB_AM) {
		FLAPLS_FRST_PERD_ADB_AM = fLAPLS_FRST_PERD_ADB_AM;
	}
	public double getFLAPLS_FRST_PERD_APR_RT() {
		return FLAPLS_FRST_PERD_APR_RT;
	}
	public void setFLAPLS_FRST_PERD_APR_RT(double fLAPLS_FRST_PERD_APR_RT) {
		FLAPLS_FRST_PERD_APR_RT = fLAPLS_FRST_PERD_APR_RT;
	}
	public String getFLAPLS_RTR_DELY_RESN_CD() {
		return FLAPLS_RTR_DELY_RESN_CD;
	}
	public void setFLAPLS_RTR_DELY_RESN_CD(String fLAPLS_RTR_DELY_RESN_CD) {
		FLAPLS_RTR_DELY_RESN_CD = fLAPLS_RTR_DELY_RESN_CD;
	}
	public String getFLAPLS_PYFF_EXCP_BINT_CD() {
		return FLAPLS_PYFF_EXCP_BINT_CD;
	}
	public void setFLAPLS_PYFF_EXCP_BINT_CD(String fLAPLS_PYFF_EXCP_BINT_CD) {
		FLAPLS_PYFF_EXCP_BINT_CD = fLAPLS_PYFF_EXCP_BINT_CD;
	}
	public String getFLAPLS_PYFF_EXCP_OLD_CD() {
		return FLAPLS_PYFF_EXCP_OLD_CD;
	}
	public void setFLAPLS_PYFF_EXCP_OLD_CD(String fLAPLS_PYFF_EXCP_OLD_CD) {
		FLAPLS_PYFF_EXCP_OLD_CD = fLAPLS_PYFF_EXCP_OLD_CD;
	}
	public String getFLAPLS_PYFF_EXCP_CTD_CD() {
		return FLAPLS_PYFF_EXCP_CTD_CD;
	}
	public void setFLAPLS_PYFF_EXCP_CTD_CD(String fLAPLS_PYFF_EXCP_CTD_CD) {
		FLAPLS_PYFF_EXCP_CTD_CD = fLAPLS_PYFF_EXCP_CTD_CD;
	}
	public int getFLAPLS_RTRN_TO_RVLV_SSPN_CD() {
		return FLAPLS_RTRN_TO_RVLV_SSPN_CD;
	}
	public void setFLAPLS_RTRN_TO_RVLV_SSPN_CD(int fLAPLS_RTRN_TO_RVLV_SSPN_CD) {
		FLAPLS_RTRN_TO_RVLV_SSPN_CD = fLAPLS_RTRN_TO_RVLV_SSPN_CD;
	}
	public double getFLAPPS_FEE_APPL_AM() {
		return FLAPPS_FEE_APPL_AM;
	}
	public void setFLAPPS_FEE_APPL_AM(double fLAPPS_FEE_APPL_AM) {
		FLAPPS_FEE_APPL_AM = fLAPPS_FEE_APPL_AM;
	}
	public double getFLAPPS_OLD_PRIN() {
		return FLAPPS_OLD_PRIN;
	}
	public void setFLAPPS_OLD_PRIN(double fLAPPS_OLD_PRIN) {
		FLAPPS_OLD_PRIN = fLAPPS_OLD_PRIN;
	}
	public double getFLAPPS_BILLED_INT() {
		return FLAPPS_BILLED_INT;
	}
	public void setFLAPPS_BILLED_INT(double fLAPPS_BILLED_INT) {
		FLAPPS_BILLED_INT = fLAPPS_BILLED_INT;
	}
	public double getFLAPPS_UNPAID_INTSC() {
		return FLAPPS_UNPAID_INTSC;
	}
	public void setFLAPPS_UNPAID_INTSC(double fLAPPS_UNPAID_INTSC) {
		FLAPPS_UNPAID_INTSC = fLAPPS_UNPAID_INTSC;
	}
	public double getFLAPPS_BPD() {
		return FLAPPS_BPD;
	}
	public void setFLAPPS_BPD(double fLAPPS_BPD) {
		FLAPPS_BPD = fLAPPS_BPD;
	}
	public double getFLAPPS_TOTAL_DELQ() {
		return FLAPPS_TOTAL_DELQ;
	}
	public void setFLAPPS_TOTAL_DELQ(double fLAPPS_TOTAL_DELQ) {
		FLAPPS_TOTAL_DELQ = fLAPPS_TOTAL_DELQ;
	}
	public double getFLAPPS_ACCRUED_UNBILLED_INT() {
		return FLAPPS_ACCRUED_UNBILLED_INT;
	}
	public void setFLAPPS_ACCRUED_UNBILLED_INT(double fLAPPS_ACCRUED_UNBILLED_INT) {
		FLAPPS_ACCRUED_UNBILLED_INT = fLAPPS_ACCRUED_UNBILLED_INT;
	}
	public double getFLAPPS_ITEM_FEES() {
		return FLAPPS_ITEM_FEES;
	}
	public void setFLAPPS_ITEM_FEES(double fLAPPS_ITEM_FEES) {
		FLAPPS_ITEM_FEES = fLAPPS_ITEM_FEES;
	}
	public double getFLAPPS_REPORTABLE_INT() {
		return FLAPPS_REPORTABLE_INT;
	}
	public void setFLAPPS_REPORTABLE_INT(double fLAPPS_REPORTABLE_INT) {
		FLAPPS_REPORTABLE_INT = fLAPPS_REPORTABLE_INT;
	}
	public double getFLAPPS_DEFERRED_CR_LIFE() {
		return FLAPPS_DEFERRED_CR_LIFE;
	}
	public void setFLAPPS_DEFERRED_CR_LIFE(double fLAPPS_DEFERRED_CR_LIFE) {
		FLAPPS_DEFERRED_CR_LIFE = fLAPPS_DEFERRED_CR_LIFE;
	}
	public double getFLAPPS_DEF_ADB() {
		return FLAPPS_DEF_ADB;
	}
	public void setFLAPPS_DEF_ADB(double fLAPPS_DEF_ADB) {
		FLAPPS_DEF_ADB = fLAPPS_DEF_ADB;
	}
	public double getFLAPPS_CYC_PRIN() {
		return FLAPPS_CYC_PRIN;
	}
	public void setFLAPPS_CYC_PRIN(double fLAPPS_CYC_PRIN) {
		FLAPPS_CYC_PRIN = fLAPPS_CYC_PRIN;
	}
	public double getFLAPPS_DISPUTE_AMOUNT() {
		return FLAPPS_DISPUTE_AMOUNT;
	}
	public void setFLAPPS_DISPUTE_AMOUNT(double fLAPPS_DISPUTE_AMOUNT) {
		FLAPPS_DISPUTE_AMOUNT = fLAPPS_DISPUTE_AMOUNT;
	}
	public double getFLAPPS_UNBD_ITEM_FEE_AM() {
		return FLAPPS_UNBD_ITEM_FEE_AM;
	}
	public void setFLAPPS_UNBD_ITEM_FEE_AM(double fLAPPS_UNBD_ITEM_FEE_AM) {
		FLAPPS_UNBD_ITEM_FEE_AM = fLAPPS_UNBD_ITEM_FEE_AM;
	}
	public double getFLAPPS_TRANS_AMT() {
		return FLAPPS_TRANS_AMT;
	}
	public void setFLAPPS_TRANS_AMT(double fLAPPS_TRANS_AMT) {
		FLAPPS_TRANS_AMT = fLAPPS_TRANS_AMT;
	}
	public double getFLAPPS_REAL_INT_AM() {
		return FLAPPS_REAL_INT_AM;
	}
	public void setFLAPPS_REAL_INT_AM(double fLAPPS_REAL_INT_AM) {
		FLAPPS_REAL_INT_AM = fLAPPS_REAL_INT_AM;
	}
	public int getFLAPPS_RTRN_TO_RVLV_CD_NR() {
		return FLAPPS_RTRN_TO_RVLV_CD_NR;
	}
	public void setFLAPPS_RTRN_TO_RVLV_CD_NR(int fLAPPS_RTRN_TO_RVLV_CD_NR) {
		FLAPPS_RTRN_TO_RVLV_CD_NR = fLAPPS_RTRN_TO_RVLV_CD_NR;
	}
	public String getFLAPPS_RTRN_TO_RVLV_CD() {
		return FLAPPS_RTRN_TO_RVLV_CD;
	}
	public void setFLAPPS_RTRN_TO_RVLV_CD(String fLAPPS_RTRN_TO_RVLV_CD) {
		FLAPPS_RTRN_TO_RVLV_CD = fLAPPS_RTRN_TO_RVLV_CD;
	}
	public double getFLAPPS_DEFR_CRDT_LIFE_BASE_AM() {
		return FLAPPS_DEFR_CRDT_LIFE_BASE_AM;
	}
	public void setFLAPPS_DEFR_CRDT_LIFE_BASE_AM(double fLAPPS_DEFR_CRDT_LIFE_BASE_AM) {
		FLAPPS_DEFR_CRDT_LIFE_BASE_AM = fLAPPS_DEFR_CRDT_LIFE_BASE_AM;
	}
	public double getFLAPPS_BLLD_INTR_AM() {
		return FLAPPS_BLLD_INTR_AM;
	}
	public void setFLAPPS_BLLD_INTR_AM(double fLAPPS_BLLD_INTR_AM) {
		FLAPPS_BLLD_INTR_AM = fLAPPS_BLLD_INTR_AM;
	}
	public double getFLAPPS_FLAP_ADB_AM() {
		return FLAPPS_FLAP_ADB_AM;
	}
	public void setFLAPPS_FLAP_ADB_AM(double fLAPPS_FLAP_ADB_AM) {
		FLAPPS_FLAP_ADB_AM = fLAPPS_FLAP_ADB_AM;
	}
	public double getFLAPPS_BLNC_AM() {
		return FLAPPS_BLNC_AM;
	}
	public void setFLAPPS_BLNC_AM(double fLAPPS_BLNC_AM) {
		FLAPPS_BLNC_AM = fLAPPS_BLNC_AM;
	}
	public double getFLAPPS_UNPD_CRDT_LIFE_AM() {
		return FLAPPS_UNPD_CRDT_LIFE_AM;
	}
	public void setFLAPPS_UNPD_CRDT_LIFE_AM(double fLAPPS_UNPD_CRDT_LIFE_AM) {
		FLAPPS_UNPD_CRDT_LIFE_AM = fLAPPS_UNPD_CRDT_LIFE_AM;
	}
	public double getFLAPPS_CRDT_LIFE_CHRG_AM() {
		return FLAPPS_CRDT_LIFE_CHRG_AM;
	}
	public void setFLAPPS_CRDT_LIFE_CHRG_AM(double fLAPPS_CRDT_LIFE_CHRG_AM) {
		FLAPPS_CRDT_LIFE_CHRG_AM = fLAPPS_CRDT_LIFE_CHRG_AM;
	}
	public double getFLAPPS_FRST_PERD_ADB_AM() {
		return FLAPPS_FRST_PERD_ADB_AM;
	}
	public void setFLAPPS_FRST_PERD_ADB_AM(double fLAPPS_FRST_PERD_ADB_AM) {
		FLAPPS_FRST_PERD_ADB_AM = fLAPPS_FRST_PERD_ADB_AM;
	}
	public double getFLAPPS_FRST_PERD_APR_RT() {
		return FLAPPS_FRST_PERD_APR_RT;
	}
	public void setFLAPPS_FRST_PERD_APR_RT(double fLAPPS_FRST_PERD_APR_RT) {
		FLAPPS_FRST_PERD_APR_RT = fLAPPS_FRST_PERD_APR_RT;
	}
	public String getFLAPPS_PYFF_EXCP_CD_1() {
		return FLAPPS_PYFF_EXCP_CD_1;
	}
	public void setFLAPPS_PYFF_EXCP_CD_1(String fLAPPS_PYFF_EXCP_CD_1) {
		FLAPPS_PYFF_EXCP_CD_1 = fLAPPS_PYFF_EXCP_CD_1;
	}
	public String getFLAPPS_PYFF_EXCP_CD_2() {
		return FLAPPS_PYFF_EXCP_CD_2;
	}
	public void setFLAPPS_PYFF_EXCP_CD_2(String fLAPPS_PYFF_EXCP_CD_2) {
		FLAPPS_PYFF_EXCP_CD_2 = fLAPPS_PYFF_EXCP_CD_2;
	}
	public String getFLAPPS_PYFF_EXCP_CD_3() {
		return FLAPPS_PYFF_EXCP_CD_3;
	}
	public void setFLAPPS_PYFF_EXCP_CD_3(String fLAPPS_PYFF_EXCP_CD_3) {
		FLAPPS_PYFF_EXCP_CD_3 = fLAPPS_PYFF_EXCP_CD_3;
	}
	public String getFLAPPS_RTR_DELY_RESN_CD() {
		return FLAPPS_RTR_DELY_RESN_CD;
	}
	public void setFLAPPS_RTR_DELY_RESN_CD(String fLAPPS_RTR_DELY_RESN_CD) {
		FLAPPS_RTR_DELY_RESN_CD = fLAPPS_RTR_DELY_RESN_CD;
	}
	public String getFLAPPS_PYFF_EXCP_BINT_CD() {
		return FLAPPS_PYFF_EXCP_BINT_CD;
	}
	public void setFLAPPS_PYFF_EXCP_BINT_CD(String fLAPPS_PYFF_EXCP_BINT_CD) {
		FLAPPS_PYFF_EXCP_BINT_CD = fLAPPS_PYFF_EXCP_BINT_CD;
	}
	public String getFLAPPS_PYFF_EXCP_OLD_CD() {
		return FLAPPS_PYFF_EXCP_OLD_CD;
	}
	public void setFLAPPS_PYFF_EXCP_OLD_CD(String fLAPPS_PYFF_EXCP_OLD_CD) {
		FLAPPS_PYFF_EXCP_OLD_CD = fLAPPS_PYFF_EXCP_OLD_CD;
	}
	public String getFLAPPS_PYFF_EXCP_CTD_CD() {
		return FLAPPS_PYFF_EXCP_CTD_CD;
	}
	public void setFLAPPS_PYFF_EXCP_CTD_CD(String fLAPPS_PYFF_EXCP_CTD_CD) {
		FLAPPS_PYFF_EXCP_CTD_CD = fLAPPS_PYFF_EXCP_CTD_CD;
	}
	public double getFLAP_MINIMUM_MPD_AMT() {
		return FLAP_MINIMUM_MPD_AMT;
	}
	public void setFLAP_MINIMUM_MPD_AMT(double fLAP_MINIMUM_MPD_AMT) {
		FLAP_MINIMUM_MPD_AMT = fLAP_MINIMUM_MPD_AMT;
	}
	public String getFLAP_MPD_METHOD() {
		return FLAP_MPD_METHOD;
	}
	public void setFLAP_MPD_METHOD(String fLAP_MPD_METHOD) {
		FLAP_MPD_METHOD = fLAP_MPD_METHOD;
	}
	public double getFLAP_FIXED_PAYMENT_AMT() {
		return FLAP_FIXED_PAYMENT_AMT;
	}
	public void setFLAP_FIXED_PAYMENT_AMT(double fLAP_FIXED_PAYMENT_AMT) {
		FLAP_FIXED_PAYMENT_AMT = fLAP_FIXED_PAYMENT_AMT;
	}
	public double getFLAP_MPD_RATE() {
		return FLAP_MPD_RATE;
	}
	public void setFLAP_MPD_RATE(double fLAP_MPD_RATE) {
		FLAP_MPD_RATE = fLAP_MPD_RATE;
	}
	public String getFLAP_MPD_ADD_INT() {
		return FLAP_MPD_ADD_INT;
	}
	public void setFLAP_MPD_ADD_INT(String fLAP_MPD_ADD_INT) {
		FLAP_MPD_ADD_INT = fLAP_MPD_ADD_INT;
	}
	public String getFLAP_INTRO_MPD_METHOD() {
		return FLAP_INTRO_MPD_METHOD;
	}
	public void setFLAP_INTRO_MPD_METHOD(String fLAP_INTRO_MPD_METHOD) {
		FLAP_INTRO_MPD_METHOD = fLAP_INTRO_MPD_METHOD;
	}
	public double getFLAP_INTRO_FIXED_PAY_AMT() {
		return FLAP_INTRO_FIXED_PAY_AMT;
	}
	public void setFLAP_INTRO_FIXED_PAY_AMT(double fLAP_INTRO_FIXED_PAY_AMT) {
		FLAP_INTRO_FIXED_PAY_AMT = fLAP_INTRO_FIXED_PAY_AMT;
	}
	public double getFLAP_INTRO_MPD_RATE() {
		return FLAP_INTRO_MPD_RATE;
	}
	public void setFLAP_INTRO_MPD_RATE(double fLAP_INTRO_MPD_RATE) {
		FLAP_INTRO_MPD_RATE = fLAP_INTRO_MPD_RATE;
	}
	public String getFLAP_INTRO_MPD_ADD_INT() {
		return FLAP_INTRO_MPD_ADD_INT;
	}
	public void setFLAP_INTRO_MPD_ADD_INT(String fLAP_INTRO_MPD_ADD_INT) {
		FLAP_INTRO_MPD_ADD_INT = fLAP_INTRO_MPD_ADD_INT;
	}
	public int getFLAP_MPD_LOAN_END_DT() {
		return FLAP_MPD_LOAN_END_DT;
	}
	public void setFLAP_MPD_LOAN_END_DT(int fLAP_MPD_LOAN_END_DT) {
		FLAP_MPD_LOAN_END_DT = fLAP_MPD_LOAN_END_DT;
	}
	public double getFLAP_BASE_MIN_PAY_AM() {
		return FLAP_BASE_MIN_PAY_AM;
	}
	public void setFLAP_BASE_MIN_PAY_AM(double fLAP_BASE_MIN_PAY_AM) {
		FLAP_BASE_MIN_PAY_AM = fLAP_BASE_MIN_PAY_AM;
	}
	public int getFLAP_PYMT_ALLC_BEGN_DT() {
		return FLAP_PYMT_ALLC_BEGN_DT;
	}
	public void setFLAP_PYMT_ALLC_BEGN_DT(int fLAP_PYMT_ALLC_BEGN_DT) {
		FLAP_PYMT_ALLC_BEGN_DT = fLAP_PYMT_ALLC_BEGN_DT;
	}
	public int getFLAP_PYMT_ALLC_END_DT() {
		return FLAP_PYMT_ALLC_END_DT;
	}
	public void setFLAP_PYMT_ALLC_END_DT(int fLAP_PYMT_ALLC_END_DT) {
		FLAP_PYMT_ALLC_END_DT = fLAP_PYMT_ALLC_END_DT;
	}
	public double getFLAP_PYMT_ALLC_RT() {
		return FLAP_PYMT_ALLC_RT;
	}
	public void setFLAP_PYMT_ALLC_RT(double fLAP_PYMT_ALLC_RT) {
		FLAP_PYMT_ALLC_RT = fLAP_PYMT_ALLC_RT;
	}
	public double getFLAPLS_PYMT_ALLC_RT() {
		return FLAPLS_PYMT_ALLC_RT;
	}
	public void setFLAPLS_PYMT_ALLC_RT(double fLAPLS_PYMT_ALLC_RT) {
		FLAPLS_PYMT_ALLC_RT = fLAPLS_PYMT_ALLC_RT;
	}
	public String getSYS() {
		return SYS;
	}
	public void setSYS(String sYS) {
		SYS = sYS;
	}
	public String getPRIN() {
		return PRIN;
	}
	public void setPRIN(String pRIN) {
		PRIN = pRIN;
	}
	public String getAGENT() {
		return AGENT;
	}
	public void setAGENT(String aGENT) {
		AGENT = aGENT;
	}
	public int getACCOUNT() {
		return ACCOUNT;
	}
	public void setACCOUNT(int aCCOUNT) {
		ACCOUNT = aCCOUNT;
	}
	public int getORG() {
		return ORG;
	}
	public void setORG(int oRG) {
		ORG = oRG;
	}
	public int getDTPLAN() {
		return DTPLAN;
	}
	public void setDTPLAN(int dTPLAN) {
		DTPLAN = dTPLAN;
	}
	public int getFL_EFFDATE() {
		return FL_EFFDATE;
	}
	public void setFL_EFFDATE(int fL_EFFDATE) {
		FL_EFFDATE = fL_EFFDATE;
	}
	public int getDTBEGINT() {
		return DTBEGINT;
	}
	public void setDTBEGINT(int dTBEGINT) {
		DTBEGINT = dTBEGINT;
	}
	public int getDTBEGPAY() {
		return DTBEGPAY;
	}
	public void setDTBEGPAY(int dTBEGPAY) {
		DTBEGPAY = dTBEGPAY;
	}
	
	public int getR2R_DT() {
		return R2R_DT;
	}
	public void setR2R_DT(int r2r_DT) {
		R2R_DT = r2r_DT;
	}
	public int getCLASS_DATE() {
		return CLASS_DATE;
	}
	public void setCLASS_DATE(int cLASS_DATE) {
		CLASS_DATE = cLASS_DATE;
	}
	public int getFL_CSHOPT_END() {
		return FL_CSHOPT_END;
	}
	public void setFL_CSHOPT_END(int fL_CSHOPT_END) {
		FL_CSHOPT_END = fL_CSHOPT_END;
	}
	public int getIF_DELAY_DT() {
		return IF_DELAY_DT;
	}
	public void setIF_DELAY_DT(int iF_DELAY_DT) {
		IF_DELAY_DT = iF_DELAY_DT;
	}
	public int getMPD_LOAN_END() {
		return MPD_LOAN_END;
	}
	public void setMPD_LOAN_END(int mPD_LOAN_END) {
		MPD_LOAN_END = mPD_LOAN_END;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}
	public int getOLD_ACCOUNT_ID() {
		return OLD_ACCOUNT_ID;
	}
	public void setOLD_ACCOUNT_ID(int oLD_ACCOUNT_ID) {
		OLD_ACCOUNT_ID = oLD_ACCOUNT_ID;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	
}
