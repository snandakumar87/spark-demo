package com.spark.scorecard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardholderMasterCHD implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String record;
	private String fileId;	
	
	private double CHD_ACCOUNT_NUMBER;
	private double[] pay;
	private double[] due;
	private double[] bal;
	private List<Integer> stmtData ;
	private int[] stmtDate ;

	
	private String ACCTBLK;
	private double ACCTCASH;
	private String ACCTSTAT;
	private int AGE;
	private String AGENT;
	private double AMTCURR;
	private int BSDATE3;
	private int BSDATE4;
	private int BSDATE5;
	private int BSDATE6;
	private int CHDACS_PREV_SCOR_NR_1;
	private double CHDAP_CASH_MUF;
	private double CHDAP_CURR_CTD_CASH_PRIN;
	private double CHDAP_CURR_CTD_MRCH_PRIN;
	private double CHDAP_DISPUTED_AMOUNT;
	private double CHDAP_MISCELLANEOUS;
	private double CHDAP_MISC_CHGS;
	private double CHDAP_MRCH_MUF;
	private double CHDAP_MUF_CRDT_BLNC_AM;
	private double CHDAP_MUF_CASH_INTSC;
	private double CHDAP_MUF_DISPUTE;
	private double CHDAP_MUF_MRCH_INTSC;
	private double CHDAP_MUF_UNPD_ANNL_CHRG_AM;
	private double CHDAP_MUF_UNPD_CRDT_LIFE_AM;
	private double CHDAP_MUF_UNPD_ITEM_CHRG_AM;
	private double CHDAP_MUF_UNPD_LATE_CHRG_AM;
	private double CHDAP_MUF_UNPD_MSCL_CHRG_AM;
	private double CHDAP_MUF_UNPD_OVRL_CHRG_AM;
	private double CHDAP_MUF_UNPD_SRCH_AM;
	private double CHDAP_OPEN_CYC_CASH_INTSC;
	private double CHDAP_OPEN_CYC_CASH_PRIN;
	private double CHDAP_OPEN_CYC_FLAP_PRIN;
	private double CHDAP_OPEN_CYC_INTSC;
	private double CHDAP_OPEN_CYC_LOAN_PRIN;
	private double CHDAP_OPEN_CYC_MRCH_BINT;
	private double CHDAP_OPEN_CYC_MRCH_NBINT;
	private double CHDAP_REPORTABLE_UNPAID_INT;
	private double CHDAP_SRCHG_AM;
	private double CHDAP_UNPD_ANNL_CHRG_AM;
	private double CHDAP_UNPD_CASH_ITEM_AM;
	private double CHDAP_UNPD_CRDLF_PRMM_AM;
	private double CHDAP_UNPD_LATE_CHRG_AM;
	private double CHDAP_UNPD_OVRL_CHRG_AM;
	private double CHDAP_UNPD_SALE_ITEM_AM;
	private double CHDBS_BPS_CASH_1;
	private double CHDBS_BPS_CASH_2;
	private double CHDBS_BPS_CASH_3;
	private double CHDBS_BPS_CASH_4;
	private double CHDBS_BPS_CASH_5;
	private double CHDBS_BPS_CASH_6;
	private double CHDBS_BPS_CASH_7;
	private double CHDBS_BPS_CASH_8;
	private double CHDBS_BPS_CASH_9;
	private double CHDBS_BPS_CASH_10;
	private double CHDBS_BPS_CASH_11;
	private double CHDBS_BPS_MIN_PAY_DUE_1;
	private double CHDBS_BPS_MIN_PAY_DUE_2;
	private double CHDBS_BPS_MIN_PAY_DUE_3;
	private double CHDBS_BPS_MIN_PAY_DUE_4;
	private double CHDBS_BPS_MIN_PAY_DUE_5;
	private double CHDBS_BPS_MIN_PAY_DUE_6;
	private double CHDBS_BPS_MIN_PAY_DUE_7;
	private double CHDBS_BPS_MIN_PAY_DUE_8;
	private double CHDBS_BPS_MIN_PAY_DUE_9;
	private double CHDBS_BPS_MIN_PAY_DUE_10;
	private double CHDBS_BPS_MIN_PAY_DUE_11;
	private double CHDBS_BPS_PAST_DUE_1;
	private double CHDBS_BPS_PAST_DUE_2;
	private double CHDBS_BPS_PAST_DUE_3;
	private double CHDBS_BPS_PAST_DUE_4;
	private double CHDBS_BPS_PAST_DUE_5;
	private double CHDBS_BPS_PAST_DUE_6;
	private double CHDBS_BPS_PAST_DUE_7;
	private double CHDBS_BPS_PAST_DUE_8;
	private double CHDBS_BPS_PAST_DUE_9;
	private double CHDBS_BPS_PAST_DUE_10;
	private double CHDBS_BPS_PAST_DUE_11;
	private double CHDBS_BPS_PAYMENTS_1;
	private double CHDBS_BPS_PAYMENTS_2;
	private double CHDBS_BPS_PAYMENTS_3;
	private double CHDBS_BPS_PAYMENTS_4;
	private double CHDBS_BPS_PAYMENTS_5;
	private double CHDBS_BPS_PAYMENTS_6;
	private double CHDBS_BPS_PAYMENTS_7;
	private double CHDBS_BPS_PAYMENTS_8;
	private double CHDBS_BPS_PAYMENTS_9;
	private double CHDBS_BPS_PAYMENTS_10;
	private double CHDBS_BPS_PAYMENTS_11;
	private double CHDBS_BPS_RETURNS_1;
	private double CHDBS_BPS_RETURNS_2;
	private double CHDBS_BPS_RETURNS_3;
	private double CHDBS_BPS_RETURNS_4;
	private double CHDBS_BPS_RETURNS_5;
	private double CHDBS_BPS_RETURNS_6;
	private double CHDBS_BPS_RETURNS_7;
	private double CHDBS_BPS_RETURNS_8;
	private double CHDBS_BPS_RETURNS_9;
	private double CHDBS_BPS_RETURNS_10;
	private double CHDBS_BPS_RETURNS_11;
	private int CHDBS_BPS_REVERSALS_CT_1;
	private int CHDBS_BPS_REVERSALS_CT_2;
	private double CHDBS_BPS_SALES_1;
	private double CHDBS_BPS_SALES_2;
	private double CHDBS_BPS_SALES_3;
	private double CHDBS_BPS_SALES_4;
	private double CHDBS_BPS_SALES_5;
	private double CHDBS_BPS_SALES_6;
	private double CHDBS_BPS_SALES_7;
	private double CHDBS_BPS_SALES_8;
	private double CHDBS_BPS_SALES_9;
	private double CHDBS_BPS_SALES_10;
	private double CHDBS_BPS_SALES_11;
	private double CHDBS_BPS_STMT_BAL_1;
	private double CHDBS_BPS_STMT_BAL_2;
	private double CHDBS_BPS_STMT_BAL_3;
	private double CHDBS_BPS_STMT_BAL_4;
	private double CHDBS_BPS_STMT_BAL_5;
	private double CHDBS_BPS_STMT_BAL_6;
	private double CHDBS_BPS_STMT_BAL_7;
	private double CHDBS_BPS_STMT_BAL_8;
	private double CHDBS_BPS_STMT_BAL_9;
	private double CHDBS_BPS_STMT_BAL_10;
	private double CHDBS_BPS_STMT_BAL_11;
	private int CHDBS_BPS_STMT_DATE_1;
	private int CHDBS_BPS_STMT_DATE_2;
	private int CHDBS_BPS_STMT_DATE_3;
	private int CHDBS_BPS_STMT_DATE_4;
	private int CHDBS_BPS_STMT_DATE_5;
	private int CHDBS_BPS_STMT_DATE_6;
	private int CHDBS_BPS_STMT_DATE_7;
	private int CHDBS_BPS_STMT_DATE_8;
	private int CHDBS_BPS_STMT_DATE_9;
	private int CHDBS_BPS_STMT_DATE_10;
	private int CHDBS_BPS_STMT_DATE_11;
	private double CHDBS_FINC_CHRG_AM_1;
	private double CHDBS_FINC_CHRG_AM_2;
	private double CHDBS_FINC_CHRG_AM_3;
	private double CHDBS_FINC_CHRG_AM_4;
	private double CHDBS_PS_CASH;
	private double CHDBS_PS_PAYMENTS;
	private double CHDBS_PS_RETURNS;
	private double CHDBS_PS_REVERSALS_CT;
	private double CHDBS_PS_SALES;
	private double CHDHD_1STY_MXFE_PSTD_AM;
	private double CHDHD_AMT_LAST_CASH;
	private double CHDHD_AMT_LAST_SALE;
	private double CHDHD_BS_DELQ_SCENARIO;
	private double CHDHD_BS_SCORECARD_ID;
	private double CHDHD_BS_TEMP_COLL_CODE;
	private double CHDHD_CHG_OFF_AMT;
	private int CHDHD_CHG_OFF_DATE;
	private double CHDHD_CM_FIRST_PMT_AMT;
	private double CHDHD_COLLECTOR_ASSIGNED;
	private int CHDHD_DATE_HI_BALANCE;
	private int CHDHD_DATE_LAST_CASH;
	private int CHDHD_DATE_LAST_DELINQUENT;
	private int CHDHD_DATE_LAST_DR;
	private int CHDHD_DATE_LAST_REAGE;
	private int CHDHD_DATE_LAST_SALE_ADVANCE;
	private int CHDHD_DEC_AUTH_DAY1;
	private int CHDHD_DEC_AUTH_DAY2;
	private int CHDHD_DEC_AUTH_DAY3;
	private int CHDHD_DEC_AUTH_DAY4;
	private int CHDHD_DEC_AUTH_DAY5;
	private int CHDHD_DEC_AUTH_DAY6;
	private int CHDHD_FORB_END_DT;
	private String CHDHD_FORB_PLAN_CD;
	private int CHDHD_FORB_STRT_DT;
	private String CHDHD_LAST_TRUE_REAG_CD;
	private String CHDHD_LATE_FEE_CTD;
	private String CHDHD_LATE_FEE_HSTR;
	private int CHDHD_MTHS_RTRN_CHECKS;
	private String CHDHD_PAYMENT_HISTORY;
	private String CHDHD_PAY_HIST_13_24;
	private int CHDHD_POC_DT;
	private int CHDHD_PRIR_REAG_DT;
	private int CHDHD_PRVS_REAG_DT;
	private int CHDHD_PYMT_FLOAT_DATE;
	private double CHDHD_PY_CHD_INTEREST;
	private double CHDHD_PY_CREDIT_INT;
	private int CHDHD_PY_HIGH_BALANCE;
	private double CHDHD_PY_NET_AMT_PURCH;
	private int CHDHD_PY_NET_NO_PURCH;
	private int CHDHD_PY_NMO_DELIN;
	private int CHDHD_PY_NO_1CYC_DEL;
	private int CHDHD_PY_NO_2CYC_DEL;
	private int CHDHD_PY_NO_3CYC_DEL;
	private int CHDHD_PY_NO_RTRN_CHECKS;
	private int CHDHD_PY_REAGE;
	private int CHDHD_REAGE_NEXT_DATE;
	private int CHDHD_REAGE_NUM_PAYMENTS;
	private String  CHDHD_REAGE_TYPE;
	private String CHDHD_STATUSES_MET;
	private int CHDHD_TOTAL_REAGE_NO;
	private int CHDHD_TOTAL_RTRN_CHECKS_NO;
	private int CHDHD_VD_HIGH_ARREARS;
	private int CHDHD_VD_HIGH_BALANCE;
	private int CHDHD_VD_NMO_ACT_GROSS;
	private int CHDHD_VD_NMO_DELIN;
	private int CHDHD_VD_NMO_EARNINGS;
	private int CHDHD_VD_NMO_TOP_LINE;
	private int CHDHD_VD_NO_1CYC_DEL;
	private int CHDHD_VD_NO_2CYC_DEL;
	private int CHDHD_VD_NO_3CYC_DEL;
	private int CHDHD_VD_NO_RTRN_CHECKS;
	private double CHDHD_YTD_BILLED_CASH_INT;
	private double CHDHD_YTD_BILLED_LATE_CHG;
	private double CHDHD_YTD_BILLED_MRCH_INT;
	private double CHDHD_YTD_NET_AMT_PURCH;
	private int CHDHD_YTD_NET_NO_PURCH;
	private int CHDHD_YTD_NO_1CYC_DEL;
	private int CHDHD_YTD_NO_2CYC_DEL;
	private int CHDHD_YTD_NO_3CYC_DEL;
	private int CHDHD_YTD_NO_RTRN_CHECKS;
	private double CHDHD_YTD_OVERLIMIT_CHG;
	private int CHDHD_YTD_REAGE;
	private double CHDLS_ADB;
	private double CHDLS_ANNUAL_CHARGES_BILLED;
	private double CHDLS_BILLED_PAY_DUE;
	private double CHDLS_CASH_INT;
	private double CHDLS_CASH_IPP;
	private double CHDLS_CASH_MUF;
	private double CHDLS_CASH_MUF_INT;
	private double CHDLS_CLI_PREMIUM_1;
	private double CHDLS_CLI_PREMIUM_2;
	private double CHDLS_CLI_PREMIUM_3;
	private double CHDLS_CLI_PREMIUM_4;
	private double CHDLS_CLI_PREMIUM_5;
	private double CHDLS_CLI_PREMIUM_6;
	private double CHDLS_CREDIT_INT;
	private double CHDLS_CR_LIFE_CHG;
	private double CHDLS_CYC_CASH;
	private double CHDLS_CYC_MRCH;
	private double CHDLS_DEF_AVE;
	private double CHDLS_DEF_AVE_2;
	private double CHDLS_DISPUTED_AMOUNT;
	private double CHDLS_END_CASH;
	private double CHDLS_END_LOAN;
	private double CHDLS_END_MRCH_BINT;
	private double CHDLS_END_MRCH_NBINT;
	private double CHDLS_FLAP_BALANCE;
	private double CHDLS_FLAP_INT;
	private double CHDLS_ITEM_CHG;
	private double CHDLS_LATE_CHG;
	private double CHDLS_MIN_CHG;
	private double CHDLS_MISCELLANEOUS;
	private double CHDLS_MISC_CHGS;
	private double CHDLS_MRCH_INT;
	private double CHDLS_MRCH_IPP;
	private double CHDLS_MRCH_MUF;
	private double CHDLS_MRCH_MUF_INT;
	private double CHDLS_MUF_CASH_INTSC;
	private double CHDLS_MUF_CRDT_LIFE_AM;
	private double CHDLS_MUF_CTD_ANNL_CHRG_AM;
	private double CHDLS_MUF_CTD_ITEM_CHRG_AM;
	private double CHDLS_MUF_CTD_MSCL_CHRG_AM;
	private double CHDLS_MUF_CTD_SRCH_AM;
	private double CHDLS_MUF_DISPUTE;
	private double CHDLS_MUF_LATE_CHRG_AM;
	private double CHDLS_MUF_MIN_FIN_CHRG_AM;
	private double CHDLS_MUF_MRCH_INTSC;
	private double CHDLS_MUF_OVRL_CHRG_AM;
	private double CHDLS_MUF_UNPD_ANNL_CHRG_AM;
	private double CHDLS_MUF_UNPD_CRDT_LIFE_AM;
	private double CHDLS_MUF_UNPD_ITEM_CHRG_AM;
	private double CHDLS_MUF_UNPD_LATE_CHRG_AM;
	private double CHDLS_MUF_UNPD_MSCL_CHRG_AM;
	private double CHDLS_MUF_UNPD_OVRL_CHRG_AM;
	private double CHDLS_MUF_UNPD_SRCH_AM;
	private String CHDLS_NEXT_PRICING_STRATEGY;
	private String CHDLS_NEXT_STRAT_CYCLE_FLAG;
	private String CHDLS_NEXT_STRT_CIT_MTHD_ID;
	private int CHDLS_NEXT_STRT_DT;
	private String CHDLS_NEXT_STRT_HONR_ID;
	private String CHDLS_NEXT_STRT_TMNG_CD;
	private int CHDLS_NO_MOS_PAY_AHEAD;
	private String CHDLS_NXT2_STRT_BA_CD;
	private String CHDLS_NXT2_STRT_CIT_MTHD_ID;
	private int CHDLS_NXT2_STRT_DT;
	private String CHDLS_NXT2_STRT_HONR_ID;
	private String CHDLS_NXT2_STRT_ID;
	private String CHDLS_NXT2_STRT_TMNG_CD;
	private double CHDLS_OTHER_CHARGES_BILLED;
	private double CHDLS_OVERLIMIT_CHG;
	private double CHDLS_OVERPAYMENT_AMT;
	private double CHDLS_PAY_AHEAD_AMT;
	private int CHDLS_PP_DELINQ_LEVEL;
	private int CHDLS_PRCN_STRT_CT;
	private String CHDLS_PYFF_EXCP_18_CD;
	private double CHDLS_REBATE_AMT;
	private double CHDLS_SALE_ITEM_CHGS;
	private String CHDLS_SPEC_RATE_FLAG;
	private double CHDLS_SRCHG_AM_1;
	private double CHDLS_UNPAID_CASH_INTSC;
	private double CHDLS_UNPAID_INTSC;
	private double CHDLS_UNPD_ANNL_CHRG_AM;
	private double CHDLS_UNPD_CASH_ITEM_AM;
	private double CHDLS_UNPD_CRDLF_PRMM_AM;
	private double CHDLS_UNPD_LATE_CHRG_AM;
	private double CHDLS_UNPD_OVRL_CHRG_AM;
	private double CHDLS_UNPD_SALE_ITEM_AM;
	private double CHDLS_UNPD_SRCHG_AM;
	private double CHDPS_ANNUAL_CHARGES_BILLED;
	private double CHDPS_BALANCE;
	private double CHDPS_BILLED_PAY_DUE;
	private double CHDPS_CASH_INT;
	private double CHDPS_CASH_MUF;
	private double CHDPS_CASH_MUF_INT;
	private double CHDPS_CR_LIFE_CHG;
	private double CHDPS_CYC_CASH;
	private double CHDPS_CYC_MRCH;
	private double CHDPS_DEF_AVE;
	private double CHDPS_DEF_AVE_2;
	private double CHDPS_DISPUTED_AMOUNT;
	private double CHDPS_END_CASH;
	private double CHDPS_END_MRCH_BINT;
	private double CHDPS_END_MRCH_NBINT;
	private double CHDPS_FLAP_BALANCE;
	private double CHDPS_FLAP_INT;
	private double CHDPS_ITEM_CHG;
	private double CHDPS_LATE_CHG;
	private double CHDPS_MIN_CHG;
	private double CHDPS_MISCELLANEOUS;
	private double CHDPS_MISC_CHGS;
	private double CHDPS_MRCH_APR_RT;
	private double CHDPS_MRCH_INT;
	private double CHDPS_MRCH_MUF;
	private double CHDPS_MRCH_MUF_INT;
	private double CHDPS_MUF_CASH_INTSC;
	private double CHDPS_MUF_CRDT_LIFE_AM;
	private double CHDPS_MUF_CTD_ANNL_CHRG_AM;
	private double CHDPS_MUF_CTD_ITEM_CHRG_AM;
	private double CHDPS_MUF_CTD_MSCL_CHRG_AM;
	private double CHDPS_MUF_CTD_SRCH_AM;
	private double CHDPS_MUF_DISPUTE;
	private double CHDPS_MUF_LATE_CHRG_AM;
	private double CHDPS_MUF_MIN_FIN_CHRG_AM;
	private double CHDPS_MUF_MRCH_INTSC;
	private double CHDPS_MUF_OVRL_CHRG_AM;
	private double CHDPS_MUF_UNPD_ANNL_CHRG_AM;
	private double CHDPS_MUF_UNPD_CRDT_LIFE_AM;
	private double CHDPS_MUF_UNPD_ITEM_CHRG_AM;
	private double CHDPS_MUF_UNPD_LATE_CHRG_AM;
	private double CHDPS_MUF_UNPD_MSCL_CHRG_AM;
	private double CHDPS_MUF_UNPD_OVRL_CHRG_AM;
	private double CHDPS_MUF_UNPD_SRCH_AM;
	private int CHDPS_NO_MOS_PAY_AHEAD;
	private double CHDPS_OVERLIMIT_CHG;
	private double CHDPS_OVERPAYMENT_AMT;
	private double CHDPS_PAY_AHEAD_AMT;
	private String CHDPS_PYFF_EXCP_18_CD;
	private double CHDPS_SALE_ITEM_CHGS;
	private double CHDPS_SRCHG_AM_1;
	private double CHDPS_SRCHG_AM_2;
	private double CHDPS_SRCHG_AM_3;
	private double CHDPS_SRCHG_AM_4;
	private double CHDPS_SRCHG_AM_5;
	private double CHDPS_UNPAID_CASH_INTSC;
	private double CHDPS_UNPAID_INTSC;
	private double CHDPS_UNPD_ANNL_CHRG_AM;
	private double CHDPS_UNPD_CASH_ITEM_AM;
	private double CHDPS_UNPD_CRDLF_PRMM_AM;
	private double CHDPS_UNPD_LATE_CHRG_AM;
	private double CHDPS_UNPD_OVRL_CHRG_AM;
	private double CHDPS_UNPD_SALE_ITEM_AM;
	private double CHDPS_UNPD_SRCHG_AM;
	private double CHDTAP_BINT;
	private double CHDTAP_CASH;
	private double CHDTAP_CYC_CASH;
	private double CHDTAP_CYC_MRCH;
	private double CHDTAP_NBINT;
	private double CHD_1STY_MXFE_ALLW_AM;
	private int CHD_90_DAY_FLAG;
	private String CHD_ACCT_TRANSFER;
	private int CHD_ACCT_TRANSFER_DATE;
	private String CHD_ACCT_TRANSFER_FLAG;
	private String CHD_ACS_AUTH_OVRR_STRT_ID;
	private int CHD_ACS_CLNT_ID;
	private int CHD_ACS_CURR_PORT;
	private int CHD_ACS_OVERRIDE_PORT;
	private String CHD_ACS_RNDM_DGT;
	private int CHD_ACTV_DSPT_CT;
	private int CHD_ADJ_EXPIRATION_DATE;
	private int CHD_AFK_ENTITY;
	private int CHD_AGENT_BANK;
	private String CHD_ALTERNATE_LANGUAGE_FLAG;
	private String CHD_ALTR_STMT_FRMT_CD;
	private String CHD_ALWY_REFR_CD;
	private double CHD_AMT_LAST_PAYMENT;
	private double CHD_ANNL_CHRG_BLLD_LAST_AM;
	private int CHD_ANNL_CHRG_BLLD_LAST_DT;
	private String CHD_ANNUAL_CHARGE_FLAG;
	private int CHD_ANNUAL_CHG_DATE;
	private double CHD_ANN_RATE_CASH;
	private double CHD_ANN_RATE_CASH_MAX;
	private double CHD_ANN_RATE_CASH_MIN;
	private double CHD_ANN_RATE_MRCH;
	private double CHD_ANN_RATE_MRCH_MAX;
	private double CHD_ANN_RATE_MRCH_MIN;
	private int CHD_APPLICATION_SCORE;
	private int CHD_AT_AUTH_AGAINST_NEW;
	private String CHD_AUTH_FLAG;
	private int CHD_AUTH_TOTAL_AMT;
	private String CHD_AUTOPAY_SKIP_FLAG;
	private double CHD_AVLB_CRDT_AMT;
	private String CHD_BASIC_ACTIVE;
	private int CHD_BEHAVIOR_SCORE;
	private int CHD_BHVR_SCOR_DT;
	private int CHD_BHVR_SCOR_PRTF_ID;
	private String CHD_BONUS_STRATEGY;
	private int CHD_BS_REASON_CODE_1;
	private int CHD_BS_REASON_CODE_2;
	private int CHD_BS_REASON_CODE_3;
	private int CHD_BS_REASON_CODE_4;
	private String CHD_CACS_COLLECTOR;
	private String CHD_CACS_REASON;
	private String CHD_CACS_USER_ROUTING;
	private double CHD_CAINT_CTD_AMT;
	private double CHD_CAINT_LS_AMT;
	private int CHD_CASH_CRDT_LINE_AM;
	private int CHD_CASH_CREDIT_LINE_CHG_DT;
	private int CHD_CASH_LINE_REVW_DT;
	private String CHD_CB_ATTR1;
	private String CHD_CB_ATTR2;
	private String CHD_CB_ATTR3;
	private String CHD_CB_CODE;
	private String CHD_CB_ID;
	private String CHD_CB_REASON1;
	private String CHD_CB_REASON2;
	private String CHD_CB_REASON3;
	private String CHD_CB_REASON4;
	private int CHD_CB_SCORE;
	private int CHD_CB_SCORE_DATE;
	private String CHD_CHARGE_DDA_CODE;
	private String CHD_CHECK_ORD_SPEC_FLAG;
	private int CHD_CHGMEOFF_TOMORROW;
	private int CHD_CHGOFF_INDIC;
	private String CHD_CIMS_PRODUCT_CODE;
	private int CHD_CIT_TOTL_CT;
	private String CHD_CLIENT_NUMBER;
	private int CHD_CLI_EFFECTIVE_DATE_1;
	private int CHD_CLI_EFFECTIVE_DATE_2;
	private int CHD_CLI_EFFECTIVE_DATE_3;
	private int CHD_CLI_EFFECTIVE_DATE_4;
	private int CHD_CLI_EFFECTIVE_DATE_5;
	private int CHD_CLI_EFFECTIVE_DATE_6;
	private int CHD_CLI_FREE_CYCLES_REMAIN_1;
	private int CHD_CLI_FREE_CYCLES_REMAIN_2;
	private int CHD_CLI_FREE_CYCLES_REMAIN_3;
	private int CHD_CLI_FREE_CYCLES_REMAIN_4;
	private int CHD_CLI_FREE_CYCLES_REMAIN_5;
	private int CHD_CLI_FREE_CYCLES_REMAIN_6;
	private String CHD_CLI_PRODUCT_CODE_1;
	private String CHD_CLI_PRODUCT_CODE_2;
	private String CHD_CLI_PRODUCT_CODE_3;
	private String CHD_CLI_PRODUCT_CODE_4;
	private String CHD_CLI_PRODUCT_CODE_5;
	private String CHD_CLI_PRODUCT_CODE_6;
	private String CHD_CLI_RATE_STATE_1;
	private String CHD_CLI_RATE_STATE_2;
	private String CHD_CLI_RATE_STATE_3;
	private String CHD_CLI_RATE_STATE_4;
	private String CHD_CLI_RATE_STATE_5;
	private String CHD_CLI_RATE_STATE_6;
	private String CHD_CLI_STATUS_CODE_1;
	private String CHD_CLI_STATUS_CODE_2;
	private String CHD_CLI_STATUS_CODE_3;
	private String CHD_CLI_STATUS_CODE_4;
	private String CHD_CLI_STATUS_CODE_5;
	private String CHD_CLI_STATUS_CODE_6;
	private String CHD_CMPN_ID;
	private int CHD_CNSM_ACCT_CLSD_DT;
	private int CHD_COLLECTION_CODE;
	private int CHD_COLL_PROC_FLAG;
	private String CHD_CORRESPOND_FLAG;
	private String CHD_COV_STRATEGY_ID;
	private String CHD_CRBR_CNSM_INFR_CD;
	private double CHD_CRDINT_AMT;
	private String CHD_CRBR_LAST_RPRT_ID;
	private int CHD_CRDT_LINE_CHNG_DT;
	private String CHD_CRD_BUR_FLAG_2;
	private int CHD_CREDBAL_START_DATE;
	private String CHD_CREDIT_BUREAU_FLAG;
	private int CHD_CREDIT_LIFE_FLAG_N;
	private int CHD_CREDIT_LINE;
	private String CHD_CREDIT_SCORE;
	private String CHD_CRLIFE_ORIG_STATE;
	private int CHD_CRLINE_CHANGE_AMT;
	private int CHD_CROSS_REFERENCE_ACCT_NO;
	private double CHD_CRRN_ANNL_CASH_RT;
	private double CHD_CRRN_ANNL_MRCH_RT;
	private String CHD_CR_LIFE_STATUS;
	private int CHD_CR_LINE_DATE;
	private int CHD_CR_SCORE_DATE;
	private double CHD_CTD_AMT_CASH;
	private double CHD_CTD_AMT_DEBITS;
	private double CHD_CTD_AMT_ITEM_CHG;
	private double CHD_CTD_AMT_LATE_CHG;
	private double CHD_CTD_AMT_MISC_CHGS;
	private double CHD_CTD_AMT_PAYMENT;
	private double CHD_CTD_AMT_RETURN;
	private double CHD_CTD_AMT_SALE;
	private double CHD_CTD_ANNUAL_CHARGE;
	private double CHD_CTD_DEF_INT;
	private int CHD_CTD_NO_CASH;
	private int CHD_CTD_NO_MOS_PAY_AHEAD;
	private int CHD_CTD_NO_PAYMENT;
	private int CHD_CTD_NO_RETURN;
	private int CHD_CTD_NO_SALE;
	private double CHD_CTD_OVERLIMIT_CHG;
	private double CHD_CTD_PAY_AHEAD_AMT;
	private int CHD_CTD_REVERSALS_CT;
	private double CHD_CTD_SALE_ITEM_CHGS;
	private double CHD_CTD_SRCHG_AM_1;
	private double CHD_CTD_SRCHG_AM_2;
	private double CHD_CTD_SRCHG_AM_3;
	private double CHD_CTD_SRCHG_AM_4;
	private double CHD_CTD_SRCHG_AM_5;
	private int CHD_CTD_TERMS_FLAG;
	private double CHD_CTD_UNPAID_BPD;
	private double CHD_CURRENT_BALANCE;
	private double CHD_CURR_OTHER_CHARGES_BILLED;
	private int CHD_CURR_PRICE_STRATEGY_DATE;
	private int CHD_CURR_PRICING_PORTFOLIO;
	private String CHD_CURR_PRICING_STRATEGY;
	private int CHD_CURR_STRT_ALLC_DT;
	private String CHD_CURR_STRT_CIT_MTHD_ID;
	private int CHD_CURR_STRT_EVNT_DT;
	private String CHD_CURR_STRT_TMNG_CD;
	private int CHD_CUR_LATE_PYMT_DAYS;
	private String CHD_CUST_FLG_1;
	private String CHD_CUST_FLG_2;
	private String CHD_CUST_FLG_3;
	private String CHD_CUST_FLG_4;
	private int CHD_CUST_SRVC_REAG_DT;
	private String CHD_CUST_XREF_ID;
	private int CHD_CYCLE_CODE;
	private int CHD_CYCL_PRCN_PORT_ID;
	private String CHD_CYCL_PRCN_STRT_ID;
	private int CHD_DATE_FIRST_ACT;
	private int CHD_DATE_IN_COLLECTION;
	private int CHD_DATE_LAST_ADDR_CHANGE;
	private int CHD_DATE_LAST_MON_TRAN;
	private int CHD_DATE_LAST_NONMON;
	private int CHD_DATE_LAST_PAYMENT;
	private int CHD_DATE_LAST_PIN_MAILER;
	private int CHD_DATE_LAST_PLASTIC;
	private int CHD_DATE_LAST_REVIEW;
	private int CHD_DATE_LAST_RSNCD_CHNG;
	private int CHD_DATE_LAST_SALE;
	private int CHD_DATE_LAST_STMT;
	private int CHD_DATE_LOST_STOLEN;
	private int CHD_DATE_NEXT_REVIEW;
	private int CHD_DATE_PREV_STMT;
	private int CHD_DATE_STATUS_CHG;
	private int CHD_DAYS_LAST_STMT;
	private int CHD_DAYS_PREV_STMT;
	private int CHD_DBT_RTFC_GRAC_MNTH_CT;
	private int CHD_DBT_RTFC_LAST_NTFC_DT;
	private int CHD_DBT_RTFC_NTFC_MNTH_CT;
	private String CHD_DEBIT_ACTIVE;
	private String CHD_DECEASED_FLAG;
	private int CHD_DEFER_PAY_FLAG;
	private String CHD_DELETE_FLAG;
	private double CHD_DEL_AMT_001;
	private double CHD_DEL_AMT_002;
	private double CHD_DEL_AMT_003;
	private double CHD_DEL_AMT_004;
	private double CHD_DEL_AMT_005;
	private double CHD_DEL_AMT_006;
	private double CHD_DEL_AMT_007;
	private double CHD_DEL_AMT_008;
	private double CHD_DEL_AMT_009;
	private double CHD_DEL_AMT_010;
	private double CHD_DEL_AMT_011;
	private double CHD_DEL_AMT_012;
	private double CHD_DEL_AMT_021;
	private double CHD_DEL_AMT_041;
	private double CHD_DEL_AMT_121;
	private double CHD_DEL_AMT_141;
	private double CHD_DEL_AMT_161;
	private String CHD_DEL_DEFER_FLAG;
	private int CHD_DEL_LS_NO_CYCLES;
	private int CHD_DEL_NMO_CONT;
	private int CHD_DEL_NO_CYCLES;
	private int CHD_DEL_NO_DAYS;
	private int CHD_DEL_PS_NO_CYCLES;
	private String CHD_DFLT_PLAN_ID;
	private double CHD_DISPUTE_AMOUNT;
	private int CHD_DISPUTE_DATE;
	private int CHD_DLNQ_STRT_OVRR_DT;
	private String CHD_EPMT_PART_IND_ID;
	private String CHD_EXTERNAL_STATUS;
	private String CHD_FDR_USE_MISC_FIELD_1;
	private double CHD_FIXD_MPD_OVRR_AM_1;
	private double CHD_FIXD_MPD_OVRR_AM_2;
	private double CHD_FIXD_MPD_OVRR_AM_3;
	private double CHD_FIXD_MPD_OVRR_AM_4;
	private int CHD_FIXD_MPD_OVRR_DT_1;
	private int CHD_FIXD_MPD_OVRR_DT_2;
	private int CHD_FIXD_MPD_OVRR_DT_3;
	private int CHD_FIXD_MPD_OVRR_DT_4;
	private int CHD_FIXD_MPD_USAG_CD;
	private double CHD_FIXED_PAYMENT_AMT;
	private double CHD_FPS_PAY_1;
	private String CHD_FRAUD_ASSG_STRATEGY;
	private String CHD_FRAUD_PORT_ID;
	private String CHD_FRAUD_SUSPEND_STRATEGY;
	private int CHD_FRAUD_SUSP_STRATEGY_DATE;
	private double CHD_FULL_BAL_DSPT_AM;
	private int CHD_FULL_BAL_DSPT_BEGN_DT;
	private String CHD_GROSS_ACTIVE;
	private double CHD_HIGH_BAL_LIFE;
	private double CHD_HIST_LS_BAL;
	private double CHD_HIST_PS_BAL;
	private String CHD_INCT_CIT_PB_CD;
	private String CHD_INTEREST_SWITCH;
	private String CHD_INTERNAL_STATUS;
	private double CHD_IP_CASH_RATE_ANN;
	private int CHD_IP_EFF_END_DATE;
	private double CHD_IP_MRCH_RATE_ANN;
	private int CHD_IP_PLANNED_END_DATE;
	private int CHD_IP_START_DATE;
	private int CHD_LAST_CASH_ADVANCE_DATE;
	private String CHD_LAST_CASH_ADVANCE_TYPE;
	private int CHD_LAST_CIT_CHNG_DT;
	private String CHD_LAST_CRDT_BURE_IN;
	private String CHD_LAST_DFFR_STRT_ID;
	private int CHD_LAST_DSCL_DT;
	private int CHD_LAST_LTTR_DT;
	private String CHD_LAST_LTTR_ID;
	private String CHD_LAST_PLASTIC_SOURCE;
	private int CHD_LAST_PYMT_EFFECTIVE_DATE;
	private double CHD_LAST_STATEMENTED_BAL;
	private int CHD_LAST_STMT_RELJUL;
	private int CHD_LAST_STRATEGY_CHANGE_DATE;
	private int CHD_LAST_TRMS_CHNG_NTFC_DT;
	private int CHD_LATE_CHRG_RLJL_DT;
	private int CHD_LATE_FEE_WAIVER_CT;
	private int CHD_LFTM_NET_PRCH_AM;
	private int CHD_LIFE_SALES_ACTIVITY_CT;
	private int CHD_LIFE_1_CYCLE_DELQ_CT;
	private int CHD_LIFE_2_CYCLE_DELQ_CT;
	private int CHD_LIFE_3_CYCLE_DELQ_CT;
	private int CHD_LIFE_4_CYCLE_DELQ_CT;
	private int CHD_LIFE_5_CYCLE_DELQ_CT;
	private int CHD_LIFE_6_CYCLE_DELQ_CT;
	private int CHD_LIFE_7_CYCLE_DELQ_CT;
	private double CHD_LS_AMT_CASH_AM;
	private double CHD_LS_AMT_PAYMENT;
	private double CHD_LS_AMT_RETURN;
	private double CHD_LS_AMT_SALE_AM;
	private double CHD_LS_CASH_APR;
	private double CHD_LS_FRST_PERD_CASH_ADB_AM;
	private double CHD_LS_FRST_PERD_CASH_ANNL_RT;
	private int CHD_LS_FRST_PERD_DAYS_CT;
	private double CHD_LS_FRST_PERD_MRCH_ADB_AM;
	private double CHD_LS_FRST_PERD_MRCH_ANNL_RT;
	private double CHD_LS_MRCH_APR;
	private int CHD_LS_NO_CASH;
	private int CHD_LS_NO_PAYMENT;
	private int CHD_LS_NO_RETURN;
	private int CHD_LS_NO_SALE;
	private String  CHD_LS_PRICING_STRATEGY;
	private String CHD_LS_PYFF_EXCP_BINT_CD;
	private String CHD_LS_PYFF_EXCP_CTD_CASH_CD;
	private String CHD_LS_PYFF_EXCP_CTD_MRCH_CD;
	private String CHD_LS_PYFF_EXCP_NBINT_CD;
	private String CHD_LS_PYFF_EXCP_OLD_CASH_CD;
	private String CHD_LS_PYFF_EXCP_RVLV_CD_1;
	private String CHD_LS_PYFF_EXCP_RVLV_CD_2;
	private String CHD_LS_PYFF_EXCP_RVLV_CD_3;
	private String CHD_LS_PYFF_EXCP_RVLV_CD_4;
	private String CHD_LS_PYFF_EXCP_RVLV_CD_5;
	private int CHD_LS_REVERSALS_CT;
	private int CHD_MEMBER_SINCE_DATE;
	private int CHD_MID_CYC_STRT_DT;
	private String CHD_MID_CYC_STRT_ID;
	private int CHD_MIN_PMNT_DUE_END_DT;
	private double CHD_MIN_PMNT_DUE_RT;
	private int CHD_MIN_PMNT_DUE_STRT_DT;
	private String CHD_MISCELLANEOUS_FIELD_1;
	private String CHD_MISCELLANEOUS_FIELD_2;
	private String CHD_MISCELLANEOUS_FIELD_3;
	private String CHD_MISCELLANEOUS_FIELD_4;
	private String CHD_MISCELLANEOUS_FIELD_5;
	private String CHD_MISCELLANEOUS_FIELD_6;
	private String CHD_MISCELLANEOUS_FIELD_7;
	private String CHD_MISCELLANEOUS_FIELD_8;
	private double CHD_MISCELLANEOUS_FIELD_9;
	private String CHD_MISC_FIELD_9;
	private String CHD_MISC_FIELD_10;
	private String CHD_MISC_FIELD_11_TX;
	private String CHD_MISC_FIELD_12_TX;
	private String CHD_MISC_FIELD_13_TX;
	private String CHD_MPD_STBL_CD;
	private int CHD_MPW_APR_OVRR_USAG_CD;
	private int CHD_MPW_APR_OVRR_USAG_DT;
	private double CHD_MRCHINT_AMT;
	private double CHD_MUF_CTD_ANNL_CHRG_AM;
	private double CHD_MUF_CTD_ITEM_CHRG_AM;
	private double CHD_MUF_CTD_LATE_CHRG_AM;
	private double CHD_MUF_CTD_MSCL_CHRG_AM;
	private double CHD_MUF_CTD_OVRL_CHRG_AM;
	private double CHD_MUF_CTD_SRCH_AM;
	private String CHD_MULTRAN_FLAG;
	private String CHD_NEWCARD_FLAG;
	private int CHD_NEW_XREF_NO_1;
	private int CHD_NEW_XREF_NO_2;
	private int CHD_NEXT_CYCL_DT;
	private int CHD_NEXT_PRICE_STRATEGY_DATE;
	private String CHD_NEXT_PRICING_STRATEGY;
	private String CHD_NEXT_STRAT_CYCLE_FLAG;
	private String CHD_NEXT_STRT_CIT_MTHD_ID;
	private int CHD_NEXT_STRT_DT;
	private int CHD_NEXT_STRT_EVNT_DT;
	private String CHD_NEXT_STRT_HONR_ID;
	private String CHD_NEXT_STRT_REVW_IN;
	private String CHD_NEXT_STRT_TMNG_CD;
	private int CHD_NO_ALP_STAG_SEGS;
	private int CHD_NO_DEL_ITEMS;
	private int CHD_NO_FLAP_SEGS;
	private int CHD_NO_MAIL_FLAG;
	private int CHD_NO_PLASTICS;
	private int CHD_NO_SLS_SYD_SEGS;
	private String CHD_NXT2_STRT_BA_CD;
	private String CHD_NXT2_STRT_CIT_MTHD_ID;
	private int CHD_NXT2_STRT_DT;
	private int CHD_NXT2_STRT_EVNT_DT;
	private String CHD_NXT2_STRT_HONR_ID;
	private String CHD_NXT2_STRT_ID;
	private String CHD_NXT2_STRT_REVW_IN;
	private String CHD_NXT2_STRT_TMNG_CD;
	private String CHD_OLD_NEXT_STRAT_CYCLE_FLAG;
	private String CHD_OLD_NEXT_STRT_STAGE_REASON;
	private int CHD_OPEN_DATE;
	private double CHD_OTST_AUTH_BAL_AM;
	private int CHD_OTST_PLST_CT;
	private double CHD_OVERPAYMENT_AMT;
	private int CHD_PAY_AHEAD_FLAG;
	private int CHD_PLAN_LOCK_BEGN_DT;
	private int CHD_PLAN_LOCK_END_DT;
	private double CHD_POB_AMOUNT;
	private double CHD_POB_RATE;
	private int CHD_PORTFOLIO_NO;
	private int CHD_PP_2CYC_DELQ_DATE;
	private int CHD_PP_ADD_ON_DELY_DT;
	private int CHD_PP_DELINQ_LEVEL;
	private int CHD_PP_EXCL_ADD_ON_FLAG;
	private int CHD_PP_EXCL_MPD_FLAG;
	private int CHD_PRCN_STRT_CT;
	private int CHD_PREVIOUS_CYCLE_CODE;
	private int CHD_PREV_BHVR_SCORE;
	private int CHD_PREV_CRDT_LINE_CHNG_DT;
	private int CHD_PREV_CRLINE_CHANGE_DATE;
	private String CHD_PREV_EXT_STATUS;
	private String CHD_PREV_INTERNAL_STATUS;
	private int CHD_PREV_TRMS_CHNG_NTFC_DT;
	private String CHD_PRICING_STRATEGY_STATUS;
	private int CHD_PRIN_BANK;
	private String CHD_PRMR_ACCT_CD;
	private int CHD_PRMR_ACCT_CHNG_DT;
	private String CHD_PRTN_ID;
	private double CHD_PS_FRST_PERD_CASH_ADB_AM;
	private int CHD_PS_FRST_PERD_CASH_ANNL_RT;
	private int CHD_PS_FRST_PERD_DAYS_CT;
	private double CHD_PS_FRST_PERD_MRCH_ADB_AM;
	private int CHD_PS_FRST_PERD_MRCH_ANNL_RT;
	private String CHD_PS_PYFF_EXCP_BINT_CD;
	private String CHD_PS_PYFF_EXCP_CTD_CASH_CD;
	private String CHD_PS_PYFF_EXCP_CTD_MRCH_CD;
	private String CHD_PS_PYFF_EXCP_NBINT_CD;
	private String CHD_PS_PYFF_EXCP_OLD_CASH_CD;
	private String CHD_PS_PYFF_EXCP_RVLV_CD_1;
	private String CHD_PS_PYFF_EXCP_RVLV_CD_2;
	private String CHD_PS_PYFF_EXCP_RVLV_CD_3;
	private String CHD_PS_PYFF_EXCP_RVLV_CD_4;
	private String CHD_PS_PYFF_EXCP_RVLV_CD_5;
	private int CHD_PYMN_DUE_DT;
	private String CHD_RANDOM_DIGITS;
	private int CHD_RECORD_FORMAT;
	private String CHD_RECOURSE_FLAG;
	private String CHD_RECOVERY_IND;
	private double CHD_RECOVER_DOLLARS_FACTOR;
	private int CHD_REISSUE_CONTROL;
	private int CHD_RENEWAL_CODE;
	private int CHD_REQ_CLOSED_DATE;
	private String CHD_RISK_PREDICTOR_BUREAU;
	private String CHD_RISK_PREDICTOR_MODEL;
	private int CHD_RISK_PREDICTOR_SCORE;
	private double CHD_RSRV_CRDT_LINE_AVLB_AM;
	private int CHD_RSRV_CRDT_LINE_PRCN_RT;
	private int CHD_RTRN_CHECK_DT;
	private int CHD_SCOR_EGHT_DT;
	private int CHD_SCOR_EGHT_NR;
	private int CHD_SCOR_EGHT_RESN_FOUR_NR;
	private int CHD_SCOR_EGHT_RESN_ONE_NR;
	private int CHD_SCOR_EGHT_RESN_THRE_NR;
	private int CHD_SCOR_EGHT_RESN_TWO_NR;
	private int CHD_SCOR_FIVE_DT;
	private int CHD_SCOR_FIVE_NR;
	private int CHD_SCOR_FIVE_RESN_FOUR_NR;
	private int CHD_SCOR_FIVE_RESN_ONE_NR;
	private int CHD_SCOR_FIVE_RESN_THRE_NR;
	private int CHD_SCOR_FIVE_RESN_TWO_NR;
	private int CHD_SCOR_FOUR_DT;
	private int CHD_SCOR_FOUR_NR;
	private int CHD_SCOR_FOUR_RESN_FOUR_NR;
	private int CHD_SCOR_FOUR_RESN_ONE_NR;
	private int CHD_SCOR_FOUR_RESN_THRE_NR;
	private int CHD_SCOR_FOUR_RESN_TWO_NR;
	private int CHD_SCOR_NINE_DT;
	private int CHD_SCOR_NINE_NR;
	private int CHD_SCOR_NINE_RESN_FOUR_NR;
	private int CHD_SCOR_NINE_RESN_ONE_NR;
	private int CHD_SCOR_NINE_RESN_THRE_NR;
	private int CHD_SCOR_NINE_RESN_TWO_NR;
	private int CHD_SCOR_ONE_DT;
	private int CHD_SCOR_ONE_NR;
	private int CHD_SCOR_ONE_RESN_FOUR_NR;
	private int CHD_SCOR_ONE_RESN_ONE_NR;
	private int CHD_SCOR_ONE_RESN_THRE_NR;
	private int CHD_SCOR_ONE_RESN_TWO_NR;
	private int CHD_SCOR_SEVN_DT;
	private int CHD_SCOR_SEVN_NR;
	private int CHD_SCOR_SEVN_RESN_FOUR_NR;
	private int CHD_SCOR_SEVN_RESN_ONE_NR;
	private int CHD_SCOR_SEVN_RESN_THRE_NR;
	private int CHD_SCOR_SEVN_RESN_TWO_NR;
	private int CHD_SCOR_SIX_DT;
	private int CHD_SCOR_SIX_NR;
	private int CHD_SCOR_SIX_RESN_FOUR_NR;
	private int CHD_SCOR_SIX_RESN_ONE_NR;
	private int CHD_SCOR_SIX_RESN_THRE_NR;
	private int CHD_SCOR_SIX_RESN_TWO_NR;
	private int CHD_SCOR_TEN_DT;
	private int CHD_SCOR_TEN_NR;
	private int CHD_SCOR_TEN_RESN_FOUR_NR;
	private int CHD_SCOR_TEN_RESN_ONE_NR;
	private int CHD_SCOR_TEN_RESN_THRE_NR;
	private int CHD_SCOR_TEN_RESN_TWO_NR;
	private int CHD_SCOR_THRE_DT;
	private int CHD_SCOR_THRE_NR;
	private int CHD_SCOR_THRE_RESN_FOUR_NR;
	private int CHD_SCOR_THRE_RESN_ONE_NR;
	private int CHD_SCOR_THRE_RESN_THRE_NR;
	private int CHD_SCOR_THRE_RESN_TWO_NR;
	private int CHD_SCOR_TWO_DT;
	private int CHD_SCOR_TWO_NR;
	private int CHD_SCOR_TWO_RESN_FOUR_NR;
	private int CHD_SCOR_TWO_RESN_ONE_NR;
	private int CHD_SCOR_TWO_RESN_THRE_NR;
	private int CHD_SCOR_TWO_RESN_TWO_NR;
	private String CHD_SC_1;
	private String CHD_SC_2;
	private String CHD_SC_3;
	private String CHD_SC_4;
	private String CHD_SC_5;
	private String CHD_SC_6;
	private String CHD_SC_7;
	private String CHD_SC_8;
	private double CHD_SHDW_LINE_AM;
	private int CHD_SHDW_LINE_CHNG_DT;
	private int CHD_SHDW_LINE_EXPR_DT;
	private int CHD_SHDW_LINE_REVW_DT;
	private String CHD_SKIP_ELGB_IN;
	private double CHD_SLS_ANNL_CHRG;
	private double CHD_SLS_CASH_INTR_CHRG;
	private double CHD_SLS_CASH_ITEM_CHRG;
	private double CHD_SLS_CRDT_LIFE_FEES;
	private double CHD_SLS_CRDT_LIFE_INTR;
	private double CHD_SLS_CSTM_FEES;
	private double CHD_SLS_CSTM_INTR;
	private double CHD_SLS_DCLN_AUTH_CHRG;
	private double CHD_SLS_LATE_CHRG;
	private double CHD_SLS_MIN_FIN_CHRG;
	private double CHD_SLS_MISC_FEES;
	private double CHD_SLS_MISC_INTR;
	private double CHD_SLS_MMB_FEES;
	private double CHD_SLS_MMB_INTR;
	private double CHD_SLS_MRCH_INTR_CHRG;
	private double CHD_SLS_MRCH_ITEM_CHRG;
	private double CHD_SLS_NSF_CHRG;
	private double CHD_SLS_OIF_CHRG;
	private double CHD_SLS_OVRL_CHRG;
	private double CHD_SLS_STMT_CHRG;
	private String CHD_SPA;
	private int CHD_START_DATE_OF_DELQ;
	private int CHD_STATUS_REASON_CODE;
	private String CHD_STMT_HOLD_FLAG;
	private String CHD_STOP_CYCL_CODE_CHNG_CD;
	private String CHD_SUB_ACCT_CD;
	private double CHD_SYD_ANNL_CHRG;
	private double CHD_SYD_CASH_INTR_CHRG;
	private double CHD_SYD_CASH_ITEM_CHRG;
	private double CHD_SYD_CRDT_LIFE_FEES;
	private double CHD_SYD_CRDT_LIFE_INTR;
	private double CHD_SYD_CSTM_FEES;
	private double CHD_SYD_CSTM_INTR;
	private double CHD_SYD_DCLN_AUTH_CHRG;
	private double CHD_SYD_HOLD_LS_STMT_CHRG;
	private double CHD_SYD_LATE_CHRG;
	private double CHD_SYD_MIN_FIN_CHRG;
	private double CHD_SYD_MISC_FEES;
	private double CHD_SYD_MISC_INTR;
	private double CHD_SYD_MMB_FEES;
	private double CHD_SYD_MMB_INTR;
	private double CHD_SYD_MRCH_INTR_CHRG;
	private double CHD_SYD_MRCH_ITEM_CHRG;
	private double CHD_SYD_NSF_CHRG;
	private double CHD_SYD_OIF_CHRG;
	private double CHD_SYD_OVRL_CHRG;
	private double CHD_SYD_STMT_CHRG;
	private int CHD_SYSTEM_NO;
	private int CHD_TERMS_DATE;
	private int CHD_TMPR_CRDT_LINE_AM;
	private int CHD_TMPR_CRDT_LINE_END_DT;
	private int CHD_TMPR_CRDT_LINE_STRT_DT;
	private double CHD_TOTL_CASH_ADVN_LFTM_AM;
	private int CHD_TRANSFER_FLAG;
	private String CHD_TYPE_CRED_LINE_CHG;
	private String CHD_TYPE_LAST_MON_TRAN;
	private String CHD_TYPE_PLASTIC;
	private int CHD_UD_AD_MESSAGE_FLAG;
	private int CHD_UD_APPROVAL_OFFICER_CODE;
	private int CHD_UD_FINANCIAL_INSTITUTION;
	private int CHD_UD_LIFESTYLE_IND;
	private int CHD_UD_PRODUCT_TYPE;
	private int CHD_UD_PROFITABILITY_INDEX;
	private int CHD_UD_RISK_SCORE;
	private String CHD_UD_RPT1;
	private String CHD_UD_RPT2;
	private String CHD_UD_RPT4;
	private String CHD_UD_SOURCE_CODE;
	private String CHD_UPC_1;
	private String CHD_UPC_2;
	private String CHD_UPC_3;
	private String CHD_UPC_4;
	private String CHD_UPC_5;
	private String CHD_UPC_6;
	private String CHD_UPC_7;
	private String CHD_UPC_8;
	private String CHD_UPC_9;
	private String CHD_UPC_10;
	private String CHD_UPC_11;
	private String CHD_UPC_12;
	private String CHD_UPC_13;
	private String CHD_UPC_14;
	private String CHD_UPC_15;
	private String CHD_UPC_16;
	private String CHD_UPC_17;
	private int CHD_UPC_19_NR;
	private int CHD_UPC_20_NR;
	private double CHD_UPC_21_AM;
	private int CHD_UPC_22_NR;
	private String CHD_USER_TX;
	private String CHD_WAIV_OVERLATE_FEES;
	private String CHD_XCEPT_CHARGE_OFF_FLAG;
	private int DTCLOSE;
	private int DTCO;
	private int DTCURSCR;
	private int DTHIBAL;
	private int DTLSTACT;
	private int DTLSTCRD;
	private int DTLSTDEL;
	private int DTLSTDR;
	private int DTLSTPAY;
	private int DTLSTPUR;
	private int DTLSTSTM;
	private int DTOPEN;
	private int DTPAYDUE;
	private int DTPRVSTM;
	private int DTXFER;
	private int DT_ACTIVE;
	private int DT_LOST_STOLEN;
	private int DT_LST_NONMON;
	private int FRD_SUSP_DT;
	private String HDEL1;
	private String HDEL2;
	private String HDEL3;
	private String HDEL4;
	private String HDEL5;
	private String HDEL6;
	private double INPUT_VERSION;
	private int MONTHEND;
	private double NETBAL;
	private double NETCSHBAL;
	private double NETPURBAL;
	private int NOTIFYDT;
	private int ORG;
	private String PRIN;
	private int STATUS_CHG_DT;
	private String SYS;
	private int URSCR1;
	private String product;
	private int ACCOUNT_ID;
	private int PRIORITY;
	private String CLIENT_PRODUCT_CODE;
	private String CYCLE_IND;
	private String PRE_CYCLE_IND;
	private String PORTFOLIO;
	private String PARTITION;
	private String CHD_CMMR_BKCY_CHPT_CD;
	private int CHD_CMMR_BKCY_CHPT_DT;
	private int CHD_CRDT_BUR_BKCY_DT;
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public double getCHD_ACCOUNT_NUMBER() {
		return CHD_ACCOUNT_NUMBER;
	}
	public void setCHD_ACCOUNT_NUMBER(double cHD_ACCOUNT_NUMBER) {
		CHD_ACCOUNT_NUMBER = cHD_ACCOUNT_NUMBER;
	}
	public String getACCTBLK() {
		return ACCTBLK;
	}
	public void setACCTBLK(String aCCTBLK) {
		ACCTBLK = aCCTBLK;
	}
	public double getACCTCASH() {
		return ACCTCASH;
	}
	public void setACCTCASH(double aCCTCASH) {
		ACCTCASH = aCCTCASH;
	}
	public String getACCTSTAT() {
		return ACCTSTAT;
	}
	public void setACCTSTAT(String aCCTSTAT) {
		ACCTSTAT = aCCTSTAT;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getAGENT() {
		return AGENT;
	}
	public void setAGENT(String aGENT) {
		AGENT = aGENT;
	}
	
	public double getAMTCURR() {
		return AMTCURR;
	}
	public void setAMTCURR(double aMTCURR) {
		AMTCURR = aMTCURR;
	}
	public int getBSDATE3() {
		return BSDATE3;
	}
	public void setBSDATE3(int bSDATE3) {
		BSDATE3 = bSDATE3;
	}
	public int getBSDATE4() {
		return BSDATE4;
	}
	public void setBSDATE4(int bSDATE4) {
		BSDATE4 = bSDATE4;
	}
	public int getBSDATE5() {
		return BSDATE5;
	}
	public void setBSDATE5(int bSDATE5) {
		BSDATE5 = bSDATE5;
	}
	public int getBSDATE6() {
		return BSDATE6;
	}
	public void setBSDATE6(int bSDATE6) {
		BSDATE6 = bSDATE6;
	}
	public int getCHDACS_PREV_SCOR_NR_1() {
		return CHDACS_PREV_SCOR_NR_1;
	}
	public void setCHDACS_PREV_SCOR_NR_1(int cHDACS_PREV_SCOR_NR_1) {
		CHDACS_PREV_SCOR_NR_1 = cHDACS_PREV_SCOR_NR_1;
	}
	public double getCHDAP_CASH_MUF() {
		return CHDAP_CASH_MUF;
	}
	public void setCHDAP_CASH_MUF(double cHDAP_CASH_MUF) {
		CHDAP_CASH_MUF = cHDAP_CASH_MUF;
	}
	public double getCHDAP_CURR_CTD_CASH_PRIN() {
		return CHDAP_CURR_CTD_CASH_PRIN;
	}
	public void setCHDAP_CURR_CTD_CASH_PRIN(double cHDAP_CURR_CTD_CASH_PRIN) {
		CHDAP_CURR_CTD_CASH_PRIN = cHDAP_CURR_CTD_CASH_PRIN;
	}
	public double getCHDAP_CURR_CTD_MRCH_PRIN() {
		return CHDAP_CURR_CTD_MRCH_PRIN;
	}
	public void setCHDAP_CURR_CTD_MRCH_PRIN(double cHDAP_CURR_CTD_MRCH_PRIN) {
		CHDAP_CURR_CTD_MRCH_PRIN = cHDAP_CURR_CTD_MRCH_PRIN;
	}
	public double getCHDAP_DISPUTED_AMOUNT() {
		return CHDAP_DISPUTED_AMOUNT;
	}
	public void setCHDAP_DISPUTED_AMOUNT(double cHDAP_DISPUTED_AMOUNT) {
		CHDAP_DISPUTED_AMOUNT = cHDAP_DISPUTED_AMOUNT;
	}
	public double getCHDAP_MISCELLANEOUS() {
		return CHDAP_MISCELLANEOUS;
	}
	public void setCHDAP_MISCELLANEOUS(double cHDAP_MISCELLANEOUS) {
		CHDAP_MISCELLANEOUS = cHDAP_MISCELLANEOUS;
	}
	public double getCHDAP_MISC_CHGS() {
		return CHDAP_MISC_CHGS;
	}
	public void setCHDAP_MISC_CHGS(double cHDAP_MISC_CHGS) {
		CHDAP_MISC_CHGS = cHDAP_MISC_CHGS;
	}
	public double getCHDAP_MRCH_MUF() {
		return CHDAP_MRCH_MUF;
	}
	public void setCHDAP_MRCH_MUF(double cHDAP_MRCH_MUF) {
		CHDAP_MRCH_MUF = cHDAP_MRCH_MUF;
	}
	public double getCHDAP_MUF_CRDT_BLNC_AM() {
		return CHDAP_MUF_CRDT_BLNC_AM;
	}
	public void setCHDAP_MUF_CRDT_BLNC_AM(double cHDAP_MUF_CRDT_BLNC_AM) {
		CHDAP_MUF_CRDT_BLNC_AM = cHDAP_MUF_CRDT_BLNC_AM;
	}
	public double getCHDAP_MUF_CASH_INTSC() {
		return CHDAP_MUF_CASH_INTSC;
	}
	public void setCHDAP_MUF_CASH_INTSC(double cHDAP_MUF_CASH_INTSC) {
		CHDAP_MUF_CASH_INTSC = cHDAP_MUF_CASH_INTSC;
	}
	public double getCHDAP_MUF_DISPUTE() {
		return CHDAP_MUF_DISPUTE;
	}
	public void setCHDAP_MUF_DISPUTE(double cHDAP_MUF_DISPUTE) {
		CHDAP_MUF_DISPUTE = cHDAP_MUF_DISPUTE;
	}
	public double getCHDAP_MUF_MRCH_INTSC() {
		return CHDAP_MUF_MRCH_INTSC;
	}
	public void setCHDAP_MUF_MRCH_INTSC(double cHDAP_MUF_MRCH_INTSC) {
		CHDAP_MUF_MRCH_INTSC = cHDAP_MUF_MRCH_INTSC;
	}
	public double getCHDAP_MUF_UNPD_ANNL_CHRG_AM() {
		return CHDAP_MUF_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDAP_MUF_UNPD_ANNL_CHRG_AM(double cHDAP_MUF_UNPD_ANNL_CHRG_AM) {
		CHDAP_MUF_UNPD_ANNL_CHRG_AM = cHDAP_MUF_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDAP_MUF_UNPD_CRDT_LIFE_AM() {
		return CHDAP_MUF_UNPD_CRDT_LIFE_AM;
	}
	public void setCHDAP_MUF_UNPD_CRDT_LIFE_AM(double cHDAP_MUF_UNPD_CRDT_LIFE_AM) {
		CHDAP_MUF_UNPD_CRDT_LIFE_AM = cHDAP_MUF_UNPD_CRDT_LIFE_AM;
	}
	public double getCHDAP_MUF_UNPD_ITEM_CHRG_AM() {
		return CHDAP_MUF_UNPD_ITEM_CHRG_AM;
	}
	public void setCHDAP_MUF_UNPD_ITEM_CHRG_AM(double cHDAP_MUF_UNPD_ITEM_CHRG_AM) {
		CHDAP_MUF_UNPD_ITEM_CHRG_AM = cHDAP_MUF_UNPD_ITEM_CHRG_AM;
	}
	public double getCHDAP_MUF_UNPD_LATE_CHRG_AM() {
		return CHDAP_MUF_UNPD_LATE_CHRG_AM;
	}
	public void setCHDAP_MUF_UNPD_LATE_CHRG_AM(double cHDAP_MUF_UNPD_LATE_CHRG_AM) {
		CHDAP_MUF_UNPD_LATE_CHRG_AM = cHDAP_MUF_UNPD_LATE_CHRG_AM;
	}
	public double getCHDAP_MUF_UNPD_MSCL_CHRG_AM() {
		return CHDAP_MUF_UNPD_MSCL_CHRG_AM;
	}
	public void setCHDAP_MUF_UNPD_MSCL_CHRG_AM(double cHDAP_MUF_UNPD_MSCL_CHRG_AM) {
		CHDAP_MUF_UNPD_MSCL_CHRG_AM = cHDAP_MUF_UNPD_MSCL_CHRG_AM;
	}
	public double getCHDAP_MUF_UNPD_OVRL_CHRG_AM() {
		return CHDAP_MUF_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDAP_MUF_UNPD_OVRL_CHRG_AM(double cHDAP_MUF_UNPD_OVRL_CHRG_AM) {
		CHDAP_MUF_UNPD_OVRL_CHRG_AM = cHDAP_MUF_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDAP_MUF_UNPD_SRCH_AM() {
		return CHDAP_MUF_UNPD_SRCH_AM;
	}
	public void setCHDAP_MUF_UNPD_SRCH_AM(double cHDAP_MUF_UNPD_SRCH_AM) {
		CHDAP_MUF_UNPD_SRCH_AM = cHDAP_MUF_UNPD_SRCH_AM;
	}
	public double getCHDAP_OPEN_CYC_CASH_INTSC() {
		return CHDAP_OPEN_CYC_CASH_INTSC;
	}
	public void setCHDAP_OPEN_CYC_CASH_INTSC(double cHDAP_OPEN_CYC_CASH_INTSC) {
		CHDAP_OPEN_CYC_CASH_INTSC = cHDAP_OPEN_CYC_CASH_INTSC;
	}
	public double getCHDAP_OPEN_CYC_CASH_PRIN() {
		return CHDAP_OPEN_CYC_CASH_PRIN;
	}
	public void setCHDAP_OPEN_CYC_CASH_PRIN(double cHDAP_OPEN_CYC_CASH_PRIN) {
		CHDAP_OPEN_CYC_CASH_PRIN = cHDAP_OPEN_CYC_CASH_PRIN;
	}
	public double getCHDAP_OPEN_CYC_FLAP_PRIN() {
		return CHDAP_OPEN_CYC_FLAP_PRIN;
	}
	public void setCHDAP_OPEN_CYC_FLAP_PRIN(double cHDAP_OPEN_CYC_FLAP_PRIN) {
		CHDAP_OPEN_CYC_FLAP_PRIN = cHDAP_OPEN_CYC_FLAP_PRIN;
	}
	public double getCHDAP_OPEN_CYC_INTSC() {
		return CHDAP_OPEN_CYC_INTSC;
	}
	public void setCHDAP_OPEN_CYC_INTSC(double cHDAP_OPEN_CYC_INTSC) {
		CHDAP_OPEN_CYC_INTSC = cHDAP_OPEN_CYC_INTSC;
	}
	public double getCHDAP_OPEN_CYC_LOAN_PRIN() {
		return CHDAP_OPEN_CYC_LOAN_PRIN;
	}
	public void setCHDAP_OPEN_CYC_LOAN_PRIN(double cHDAP_OPEN_CYC_LOAN_PRIN) {
		CHDAP_OPEN_CYC_LOAN_PRIN = cHDAP_OPEN_CYC_LOAN_PRIN;
	}
	public double getCHDAP_OPEN_CYC_MRCH_BINT() {
		return CHDAP_OPEN_CYC_MRCH_BINT;
	}
	public void setCHDAP_OPEN_CYC_MRCH_BINT(double cHDAP_OPEN_CYC_MRCH_BINT) {
		CHDAP_OPEN_CYC_MRCH_BINT = cHDAP_OPEN_CYC_MRCH_BINT;
	}
	public double getCHDAP_OPEN_CYC_MRCH_NBINT() {
		return CHDAP_OPEN_CYC_MRCH_NBINT;
	}
	public void setCHDAP_OPEN_CYC_MRCH_NBINT(double cHDAP_OPEN_CYC_MRCH_NBINT) {
		CHDAP_OPEN_CYC_MRCH_NBINT = cHDAP_OPEN_CYC_MRCH_NBINT;
	}
	public double getCHDAP_REPORTABLE_UNPAID_INT() {
		return CHDAP_REPORTABLE_UNPAID_INT;
	}
	public void setCHDAP_REPORTABLE_UNPAID_INT(double cHDAP_REPORTABLE_UNPAID_INT) {
		CHDAP_REPORTABLE_UNPAID_INT = cHDAP_REPORTABLE_UNPAID_INT;
	}
	public double getCHDAP_SRCHG_AM() {
		return CHDAP_SRCHG_AM;
	}
	public void setCHDAP_SRCHG_AM(double cHDAP_SRCHG_AM) {
		CHDAP_SRCHG_AM = cHDAP_SRCHG_AM;
	}
	public double getCHDAP_UNPD_ANNL_CHRG_AM() {
		return CHDAP_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDAP_UNPD_ANNL_CHRG_AM(double cHDAP_UNPD_ANNL_CHRG_AM) {
		CHDAP_UNPD_ANNL_CHRG_AM = cHDAP_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDAP_UNPD_CASH_ITEM_AM() {
		return CHDAP_UNPD_CASH_ITEM_AM;
	}
	public void setCHDAP_UNPD_CASH_ITEM_AM(double cHDAP_UNPD_CASH_ITEM_AM) {
		CHDAP_UNPD_CASH_ITEM_AM = cHDAP_UNPD_CASH_ITEM_AM;
	}
	public double getCHDAP_UNPD_CRDLF_PRMM_AM() {
		return CHDAP_UNPD_CRDLF_PRMM_AM;
	}
	public void setCHDAP_UNPD_CRDLF_PRMM_AM(double cHDAP_UNPD_CRDLF_PRMM_AM) {
		CHDAP_UNPD_CRDLF_PRMM_AM = cHDAP_UNPD_CRDLF_PRMM_AM;
	}
	public double getCHDAP_UNPD_LATE_CHRG_AM() {
		return CHDAP_UNPD_LATE_CHRG_AM;
	}
	public void setCHDAP_UNPD_LATE_CHRG_AM(double cHDAP_UNPD_LATE_CHRG_AM) {
		CHDAP_UNPD_LATE_CHRG_AM = cHDAP_UNPD_LATE_CHRG_AM;
	}
	public double getCHDAP_UNPD_OVRL_CHRG_AM() {
		return CHDAP_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDAP_UNPD_OVRL_CHRG_AM(double cHDAP_UNPD_OVRL_CHRG_AM) {
		CHDAP_UNPD_OVRL_CHRG_AM = cHDAP_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDAP_UNPD_SALE_ITEM_AM() {
		return CHDAP_UNPD_SALE_ITEM_AM;
	}
	public void setCHDAP_UNPD_SALE_ITEM_AM(double cHDAP_UNPD_SALE_ITEM_AM) {
		CHDAP_UNPD_SALE_ITEM_AM = cHDAP_UNPD_SALE_ITEM_AM;
	}
	public double getCHDBS_BPS_CASH_1() {
		return CHDBS_BPS_CASH_1;
	}
	public void setCHDBS_BPS_CASH_1(double cHDBS_BPS_CASH_1) {
		CHDBS_BPS_CASH_1 = cHDBS_BPS_CASH_1;
	}
	public double getCHDBS_BPS_CASH_2() {
		return CHDBS_BPS_CASH_2;
	}
	public void setCHDBS_BPS_CASH_2(double cHDBS_BPS_CASH_2) {
		CHDBS_BPS_CASH_2 = cHDBS_BPS_CASH_2;
	}
	public double getCHDBS_BPS_CASH_3() {
		return CHDBS_BPS_CASH_3;
	}
	public void setCHDBS_BPS_CASH_3(double cHDBS_BPS_CASH_3) {
		CHDBS_BPS_CASH_3 = cHDBS_BPS_CASH_3;
	}
	public double getCHDBS_BPS_CASH_4() {
		return CHDBS_BPS_CASH_4;
	}
	public void setCHDBS_BPS_CASH_4(double cHDBS_BPS_CASH_4) {
		CHDBS_BPS_CASH_4 = cHDBS_BPS_CASH_4;
	}
	public double getCHDBS_BPS_CASH_5() {
		return CHDBS_BPS_CASH_5;
	}
	public void setCHDBS_BPS_CASH_5(double cHDBS_BPS_CASH_5) {
		CHDBS_BPS_CASH_5 = cHDBS_BPS_CASH_5;
	}
	public double getCHDBS_BPS_CASH_6() {
		return CHDBS_BPS_CASH_6;
	}
	public void setCHDBS_BPS_CASH_6(double cHDBS_BPS_CASH_6) {
		CHDBS_BPS_CASH_6 = cHDBS_BPS_CASH_6;
	}
	public double getCHDBS_BPS_CASH_7() {
		return CHDBS_BPS_CASH_7;
	}
	public void setCHDBS_BPS_CASH_7(double cHDBS_BPS_CASH_7) {
		CHDBS_BPS_CASH_7 = cHDBS_BPS_CASH_7;
	}
	public double getCHDBS_BPS_CASH_8() {
		return CHDBS_BPS_CASH_8;
	}
	public void setCHDBS_BPS_CASH_8(double cHDBS_BPS_CASH_8) {
		CHDBS_BPS_CASH_8 = cHDBS_BPS_CASH_8;
	}
	public double getCHDBS_BPS_CASH_9() {
		return CHDBS_BPS_CASH_9;
	}
	public void setCHDBS_BPS_CASH_9(double cHDBS_BPS_CASH_9) {
		CHDBS_BPS_CASH_9 = cHDBS_BPS_CASH_9;
	}
	public double getCHDBS_BPS_CASH_10() {
		return CHDBS_BPS_CASH_10;
	}
	public void setCHDBS_BPS_CASH_10(double cHDBS_BPS_CASH_10) {
		CHDBS_BPS_CASH_10 = cHDBS_BPS_CASH_10;
	}
	public double getCHDBS_BPS_CASH_11() {
		return CHDBS_BPS_CASH_11;
	}
	public void setCHDBS_BPS_CASH_11(double cHDBS_BPS_CASH_11) {
		CHDBS_BPS_CASH_11 = cHDBS_BPS_CASH_11;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_1() {
		return CHDBS_BPS_MIN_PAY_DUE_1;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_1(double cHDBS_BPS_MIN_PAY_DUE_1) {
		CHDBS_BPS_MIN_PAY_DUE_1 = cHDBS_BPS_MIN_PAY_DUE_1;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_2() {
		return CHDBS_BPS_MIN_PAY_DUE_2;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_2(double cHDBS_BPS_MIN_PAY_DUE_2) {
		CHDBS_BPS_MIN_PAY_DUE_2 = cHDBS_BPS_MIN_PAY_DUE_2;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_3() {
		return CHDBS_BPS_MIN_PAY_DUE_3;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_3(double cHDBS_BPS_MIN_PAY_DUE_3) {
		CHDBS_BPS_MIN_PAY_DUE_3 = cHDBS_BPS_MIN_PAY_DUE_3;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_4() {
		return CHDBS_BPS_MIN_PAY_DUE_4;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_4(double cHDBS_BPS_MIN_PAY_DUE_4) {
		CHDBS_BPS_MIN_PAY_DUE_4 = cHDBS_BPS_MIN_PAY_DUE_4;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_5() {
		return CHDBS_BPS_MIN_PAY_DUE_5;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_5(double cHDBS_BPS_MIN_PAY_DUE_5) {
		CHDBS_BPS_MIN_PAY_DUE_5 = cHDBS_BPS_MIN_PAY_DUE_5;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_6() {
		return CHDBS_BPS_MIN_PAY_DUE_6;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_6(double cHDBS_BPS_MIN_PAY_DUE_6) {
		CHDBS_BPS_MIN_PAY_DUE_6 = cHDBS_BPS_MIN_PAY_DUE_6;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_7() {
		return CHDBS_BPS_MIN_PAY_DUE_7;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_7(double cHDBS_BPS_MIN_PAY_DUE_7) {
		CHDBS_BPS_MIN_PAY_DUE_7 = cHDBS_BPS_MIN_PAY_DUE_7;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_8() {
		return CHDBS_BPS_MIN_PAY_DUE_8;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_8(double cHDBS_BPS_MIN_PAY_DUE_8) {
		CHDBS_BPS_MIN_PAY_DUE_8 = cHDBS_BPS_MIN_PAY_DUE_8;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_9() {
		return CHDBS_BPS_MIN_PAY_DUE_9;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_9(double cHDBS_BPS_MIN_PAY_DUE_9) {
		CHDBS_BPS_MIN_PAY_DUE_9 = cHDBS_BPS_MIN_PAY_DUE_9;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_10() {
		return CHDBS_BPS_MIN_PAY_DUE_10;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_10(double cHDBS_BPS_MIN_PAY_DUE_10) {
		CHDBS_BPS_MIN_PAY_DUE_10 = cHDBS_BPS_MIN_PAY_DUE_10;
	}
	public double getCHDBS_BPS_MIN_PAY_DUE_11() {
		return CHDBS_BPS_MIN_PAY_DUE_11;
	}
	public void setCHDBS_BPS_MIN_PAY_DUE_11(double cHDBS_BPS_MIN_PAY_DUE_11) {
		CHDBS_BPS_MIN_PAY_DUE_11 = cHDBS_BPS_MIN_PAY_DUE_11;
	}
	public double getCHDBS_BPS_PAST_DUE_1() {
		return CHDBS_BPS_PAST_DUE_1;
	}
	public void setCHDBS_BPS_PAST_DUE_1(double cHDBS_BPS_PAST_DUE_1) {
		CHDBS_BPS_PAST_DUE_1 = cHDBS_BPS_PAST_DUE_1;
	}
	public double getCHDBS_BPS_PAST_DUE_2() {
		return CHDBS_BPS_PAST_DUE_2;
	}
	public void setCHDBS_BPS_PAST_DUE_2(double cHDBS_BPS_PAST_DUE_2) {
		CHDBS_BPS_PAST_DUE_2 = cHDBS_BPS_PAST_DUE_2;
	}
	public double getCHDBS_BPS_PAST_DUE_3() {
		return CHDBS_BPS_PAST_DUE_3;
	}
	public void setCHDBS_BPS_PAST_DUE_3(double cHDBS_BPS_PAST_DUE_3) {
		CHDBS_BPS_PAST_DUE_3 = cHDBS_BPS_PAST_DUE_3;
	}
	public double getCHDBS_BPS_PAST_DUE_4() {
		return CHDBS_BPS_PAST_DUE_4;
	}
	public void setCHDBS_BPS_PAST_DUE_4(double cHDBS_BPS_PAST_DUE_4) {
		CHDBS_BPS_PAST_DUE_4 = cHDBS_BPS_PAST_DUE_4;
	}
	public double getCHDBS_BPS_PAST_DUE_5() {
		return CHDBS_BPS_PAST_DUE_5;
	}
	public void setCHDBS_BPS_PAST_DUE_5(double cHDBS_BPS_PAST_DUE_5) {
		CHDBS_BPS_PAST_DUE_5 = cHDBS_BPS_PAST_DUE_5;
	}
	public double getCHDBS_BPS_PAST_DUE_6() {
		return CHDBS_BPS_PAST_DUE_6;
	}
	public void setCHDBS_BPS_PAST_DUE_6(double cHDBS_BPS_PAST_DUE_6) {
		CHDBS_BPS_PAST_DUE_6 = cHDBS_BPS_PAST_DUE_6;
	}
	public double getCHDBS_BPS_PAST_DUE_7() {
		return CHDBS_BPS_PAST_DUE_7;
	}
	public void setCHDBS_BPS_PAST_DUE_7(double cHDBS_BPS_PAST_DUE_7) {
		CHDBS_BPS_PAST_DUE_7 = cHDBS_BPS_PAST_DUE_7;
	}
	public double getCHDBS_BPS_PAST_DUE_8() {
		return CHDBS_BPS_PAST_DUE_8;
	}
	public void setCHDBS_BPS_PAST_DUE_8(double cHDBS_BPS_PAST_DUE_8) {
		CHDBS_BPS_PAST_DUE_8 = cHDBS_BPS_PAST_DUE_8;
	}
	public double getCHDBS_BPS_PAST_DUE_9() {
		return CHDBS_BPS_PAST_DUE_9;
	}
	public void setCHDBS_BPS_PAST_DUE_9(double cHDBS_BPS_PAST_DUE_9) {
		CHDBS_BPS_PAST_DUE_9 = cHDBS_BPS_PAST_DUE_9;
	}
	public double getCHDBS_BPS_PAST_DUE_10() {
		return CHDBS_BPS_PAST_DUE_10;
	}
	public void setCHDBS_BPS_PAST_DUE_10(double cHDBS_BPS_PAST_DUE_10) {
		CHDBS_BPS_PAST_DUE_10 = cHDBS_BPS_PAST_DUE_10;
	}
	public double getCHDBS_BPS_PAST_DUE_11() {
		return CHDBS_BPS_PAST_DUE_11;
	}
	public void setCHDBS_BPS_PAST_DUE_11(double cHDBS_BPS_PAST_DUE_11) {
		CHDBS_BPS_PAST_DUE_11 = cHDBS_BPS_PAST_DUE_11;
	}
	public double getCHDBS_BPS_PAYMENTS_1() {
		return CHDBS_BPS_PAYMENTS_1;
	}
	public void setCHDBS_BPS_PAYMENTS_1(double cHDBS_BPS_PAYMENTS_1) {
		CHDBS_BPS_PAYMENTS_1 = cHDBS_BPS_PAYMENTS_1;
	}
	public double getCHDBS_BPS_PAYMENTS_2() {
		return CHDBS_BPS_PAYMENTS_2;
	}
	public void setCHDBS_BPS_PAYMENTS_2(double cHDBS_BPS_PAYMENTS_2) {
		CHDBS_BPS_PAYMENTS_2 = cHDBS_BPS_PAYMENTS_2;
	}
	public double getCHDBS_BPS_PAYMENTS_3() {
		return CHDBS_BPS_PAYMENTS_3;
	}
	public void setCHDBS_BPS_PAYMENTS_3(double cHDBS_BPS_PAYMENTS_3) {
		CHDBS_BPS_PAYMENTS_3 = cHDBS_BPS_PAYMENTS_3;
	}
	public double getCHDBS_BPS_PAYMENTS_4() {
		return CHDBS_BPS_PAYMENTS_4;
	}
	public void setCHDBS_BPS_PAYMENTS_4(double cHDBS_BPS_PAYMENTS_4) {
		CHDBS_BPS_PAYMENTS_4 = cHDBS_BPS_PAYMENTS_4;
	}
	public double getCHDBS_BPS_PAYMENTS_5() {
		return CHDBS_BPS_PAYMENTS_5;
	}
	public void setCHDBS_BPS_PAYMENTS_5(double cHDBS_BPS_PAYMENTS_5) {
		CHDBS_BPS_PAYMENTS_5 = cHDBS_BPS_PAYMENTS_5;
	}
	public double getCHDBS_BPS_PAYMENTS_6() {
		return CHDBS_BPS_PAYMENTS_6;
	}
	public void setCHDBS_BPS_PAYMENTS_6(double cHDBS_BPS_PAYMENTS_6) {
		CHDBS_BPS_PAYMENTS_6 = cHDBS_BPS_PAYMENTS_6;
	}
	public double getCHDBS_BPS_PAYMENTS_7() {
		return CHDBS_BPS_PAYMENTS_7;
	}
	public void setCHDBS_BPS_PAYMENTS_7(double cHDBS_BPS_PAYMENTS_7) {
		CHDBS_BPS_PAYMENTS_7 = cHDBS_BPS_PAYMENTS_7;
	}
	public double getCHDBS_BPS_PAYMENTS_8() {
		return CHDBS_BPS_PAYMENTS_8;
	}
	public void setCHDBS_BPS_PAYMENTS_8(double cHDBS_BPS_PAYMENTS_8) {
		CHDBS_BPS_PAYMENTS_8 = cHDBS_BPS_PAYMENTS_8;
	}
	public double getCHDBS_BPS_PAYMENTS_9() {
		return CHDBS_BPS_PAYMENTS_9;
	}
	public void setCHDBS_BPS_PAYMENTS_9(double cHDBS_BPS_PAYMENTS_9) {
		CHDBS_BPS_PAYMENTS_9 = cHDBS_BPS_PAYMENTS_9;
	}
	public double getCHDBS_BPS_PAYMENTS_10() {
		return CHDBS_BPS_PAYMENTS_10;
	}
	public void setCHDBS_BPS_PAYMENTS_10(double cHDBS_BPS_PAYMENTS_10) {
		CHDBS_BPS_PAYMENTS_10 = cHDBS_BPS_PAYMENTS_10;
	}
	public double getCHDBS_BPS_PAYMENTS_11() {
		return CHDBS_BPS_PAYMENTS_11;
	}
	public void setCHDBS_BPS_PAYMENTS_11(double cHDBS_BPS_PAYMENTS_11) {
		CHDBS_BPS_PAYMENTS_11 = cHDBS_BPS_PAYMENTS_11;
	}
	public double getCHDBS_BPS_RETURNS_1() {
		return CHDBS_BPS_RETURNS_1;
	}
	public void setCHDBS_BPS_RETURNS_1(double cHDBS_BPS_RETURNS_1) {
		CHDBS_BPS_RETURNS_1 = cHDBS_BPS_RETURNS_1;
	}
	public double getCHDBS_BPS_RETURNS_2() {
		return CHDBS_BPS_RETURNS_2;
	}
	public void setCHDBS_BPS_RETURNS_2(double cHDBS_BPS_RETURNS_2) {
		CHDBS_BPS_RETURNS_2 = cHDBS_BPS_RETURNS_2;
	}
	public double getCHDBS_BPS_RETURNS_3() {
		return CHDBS_BPS_RETURNS_3;
	}
	public void setCHDBS_BPS_RETURNS_3(double cHDBS_BPS_RETURNS_3) {
		CHDBS_BPS_RETURNS_3 = cHDBS_BPS_RETURNS_3;
	}
	public double getCHDBS_BPS_RETURNS_4() {
		return CHDBS_BPS_RETURNS_4;
	}
	public void setCHDBS_BPS_RETURNS_4(double cHDBS_BPS_RETURNS_4) {
		CHDBS_BPS_RETURNS_4 = cHDBS_BPS_RETURNS_4;
	}
	public double getCHDBS_BPS_RETURNS_5() {
		return CHDBS_BPS_RETURNS_5;
	}
	public void setCHDBS_BPS_RETURNS_5(double cHDBS_BPS_RETURNS_5) {
		CHDBS_BPS_RETURNS_5 = cHDBS_BPS_RETURNS_5;
	}
	public double getCHDBS_BPS_RETURNS_6() {
		return CHDBS_BPS_RETURNS_6;
	}
	public void setCHDBS_BPS_RETURNS_6(double cHDBS_BPS_RETURNS_6) {
		CHDBS_BPS_RETURNS_6 = cHDBS_BPS_RETURNS_6;
	}
	public double getCHDBS_BPS_RETURNS_7() {
		return CHDBS_BPS_RETURNS_7;
	}
	public void setCHDBS_BPS_RETURNS_7(double cHDBS_BPS_RETURNS_7) {
		CHDBS_BPS_RETURNS_7 = cHDBS_BPS_RETURNS_7;
	}
	public double getCHDBS_BPS_RETURNS_8() {
		return CHDBS_BPS_RETURNS_8;
	}
	public void setCHDBS_BPS_RETURNS_8(double cHDBS_BPS_RETURNS_8) {
		CHDBS_BPS_RETURNS_8 = cHDBS_BPS_RETURNS_8;
	}
	public double getCHDBS_BPS_RETURNS_9() {
		return CHDBS_BPS_RETURNS_9;
	}
	public void setCHDBS_BPS_RETURNS_9(double cHDBS_BPS_RETURNS_9) {
		CHDBS_BPS_RETURNS_9 = cHDBS_BPS_RETURNS_9;
	}
	public double getCHDBS_BPS_RETURNS_10() {
		return CHDBS_BPS_RETURNS_10;
	}
	public void setCHDBS_BPS_RETURNS_10(double cHDBS_BPS_RETURNS_10) {
		CHDBS_BPS_RETURNS_10 = cHDBS_BPS_RETURNS_10;
	}
	public double getCHDBS_BPS_RETURNS_11() {
		return CHDBS_BPS_RETURNS_11;
	}
	public void setCHDBS_BPS_RETURNS_11(double cHDBS_BPS_RETURNS_11) {
		CHDBS_BPS_RETURNS_11 = cHDBS_BPS_RETURNS_11;
	}
	public int getCHDBS_BPS_REVERSALS_CT_1() {
		return CHDBS_BPS_REVERSALS_CT_1;
	}
	public void setCHDBS_BPS_REVERSALS_CT_1(int cHDBS_BPS_REVERSALS_CT_1) {
		CHDBS_BPS_REVERSALS_CT_1 = cHDBS_BPS_REVERSALS_CT_1;
	}
	public int getCHDBS_BPS_REVERSALS_CT_2() {
		return CHDBS_BPS_REVERSALS_CT_2;
	}
	public void setCHDBS_BPS_REVERSALS_CT_2(int cHDBS_BPS_REVERSALS_CT_2) {
		CHDBS_BPS_REVERSALS_CT_2 = cHDBS_BPS_REVERSALS_CT_2;
	}
	public double getCHDBS_BPS_SALES_1() {
		return CHDBS_BPS_SALES_1;
	}
	public void setCHDBS_BPS_SALES_1(double cHDBS_BPS_SALES_1) {
		CHDBS_BPS_SALES_1 = cHDBS_BPS_SALES_1;
	}
	public double getCHDBS_BPS_SALES_2() {
		return CHDBS_BPS_SALES_2;
	}
	public void setCHDBS_BPS_SALES_2(double cHDBS_BPS_SALES_2) {
		CHDBS_BPS_SALES_2 = cHDBS_BPS_SALES_2;
	}
	public double getCHDBS_BPS_SALES_3() {
		return CHDBS_BPS_SALES_3;
	}
	public void setCHDBS_BPS_SALES_3(double cHDBS_BPS_SALES_3) {
		CHDBS_BPS_SALES_3 = cHDBS_BPS_SALES_3;
	}
	public double getCHDBS_BPS_SALES_4() {
		return CHDBS_BPS_SALES_4;
	}
	public void setCHDBS_BPS_SALES_4(double cHDBS_BPS_SALES_4) {
		CHDBS_BPS_SALES_4 = cHDBS_BPS_SALES_4;
	}
	public double getCHDBS_BPS_SALES_5() {
		return CHDBS_BPS_SALES_5;
	}
	public void setCHDBS_BPS_SALES_5(double cHDBS_BPS_SALES_5) {
		CHDBS_BPS_SALES_5 = cHDBS_BPS_SALES_5;
	}
	public double getCHDBS_BPS_SALES_6() {
		return CHDBS_BPS_SALES_6;
	}
	public void setCHDBS_BPS_SALES_6(double cHDBS_BPS_SALES_6) {
		CHDBS_BPS_SALES_6 = cHDBS_BPS_SALES_6;
	}
	public double getCHDBS_BPS_SALES_7() {
		return CHDBS_BPS_SALES_7;
	}
	public void setCHDBS_BPS_SALES_7(double cHDBS_BPS_SALES_7) {
		CHDBS_BPS_SALES_7 = cHDBS_BPS_SALES_7;
	}
	public double getCHDBS_BPS_SALES_8() {
		return CHDBS_BPS_SALES_8;
	}
	public void setCHDBS_BPS_SALES_8(double cHDBS_BPS_SALES_8) {
		CHDBS_BPS_SALES_8 = cHDBS_BPS_SALES_8;
	}
	public double getCHDBS_BPS_SALES_9() {
		return CHDBS_BPS_SALES_9;
	}
	public void setCHDBS_BPS_SALES_9(double cHDBS_BPS_SALES_9) {
		CHDBS_BPS_SALES_9 = cHDBS_BPS_SALES_9;
	}
	public double getCHDBS_BPS_SALES_10() {
		return CHDBS_BPS_SALES_10;
	}
	public void setCHDBS_BPS_SALES_10(double cHDBS_BPS_SALES_10) {
		CHDBS_BPS_SALES_10 = cHDBS_BPS_SALES_10;
	}
	public double getCHDBS_BPS_SALES_11() {
		return CHDBS_BPS_SALES_11;
	}
	public void setCHDBS_BPS_SALES_11(double cHDBS_BPS_SALES_11) {
		CHDBS_BPS_SALES_11 = cHDBS_BPS_SALES_11;
	}
	public double getCHDBS_BPS_STMT_BAL_1() {
		return CHDBS_BPS_STMT_BAL_1;
	}
	public void setCHDBS_BPS_STMT_BAL_1(double cHDBS_BPS_STMT_BAL_1) {
		CHDBS_BPS_STMT_BAL_1 = cHDBS_BPS_STMT_BAL_1;
	}
	public double getCHDBS_BPS_STMT_BAL_2() {
		return CHDBS_BPS_STMT_BAL_2;
	}
	public void setCHDBS_BPS_STMT_BAL_2(double cHDBS_BPS_STMT_BAL_2) {
		CHDBS_BPS_STMT_BAL_2 = cHDBS_BPS_STMT_BAL_2;
	}
	public double getCHDBS_BPS_STMT_BAL_3() {
		return CHDBS_BPS_STMT_BAL_3;
	}
	public void setCHDBS_BPS_STMT_BAL_3(double cHDBS_BPS_STMT_BAL_3) {
		CHDBS_BPS_STMT_BAL_3 = cHDBS_BPS_STMT_BAL_3;
	}
	public double getCHDBS_BPS_STMT_BAL_4() {
		return CHDBS_BPS_STMT_BAL_4;
	}
	public void setCHDBS_BPS_STMT_BAL_4(double cHDBS_BPS_STMT_BAL_4) {
		CHDBS_BPS_STMT_BAL_4 = cHDBS_BPS_STMT_BAL_4;
	}
	public double getCHDBS_BPS_STMT_BAL_5() {
		return CHDBS_BPS_STMT_BAL_5;
	}
	public void setCHDBS_BPS_STMT_BAL_5(double cHDBS_BPS_STMT_BAL_5) {
		CHDBS_BPS_STMT_BAL_5 = cHDBS_BPS_STMT_BAL_5;
	}
	public double getCHDBS_BPS_STMT_BAL_6() {
		return CHDBS_BPS_STMT_BAL_6;
	}
	public void setCHDBS_BPS_STMT_BAL_6(double cHDBS_BPS_STMT_BAL_6) {
		CHDBS_BPS_STMT_BAL_6 = cHDBS_BPS_STMT_BAL_6;
	}
	public double getCHDBS_BPS_STMT_BAL_7() {
		return CHDBS_BPS_STMT_BAL_7;
	}
	public void setCHDBS_BPS_STMT_BAL_7(double cHDBS_BPS_STMT_BAL_7) {
		CHDBS_BPS_STMT_BAL_7 = cHDBS_BPS_STMT_BAL_7;
	}
	public double getCHDBS_BPS_STMT_BAL_8() {
		return CHDBS_BPS_STMT_BAL_8;
	}
	public void setCHDBS_BPS_STMT_BAL_8(double cHDBS_BPS_STMT_BAL_8) {
		CHDBS_BPS_STMT_BAL_8 = cHDBS_BPS_STMT_BAL_8;
	}
	public double getCHDBS_BPS_STMT_BAL_9() {
		return CHDBS_BPS_STMT_BAL_9;
	}
	public void setCHDBS_BPS_STMT_BAL_9(double cHDBS_BPS_STMT_BAL_9) {
		CHDBS_BPS_STMT_BAL_9 = cHDBS_BPS_STMT_BAL_9;
	}
	public double getCHDBS_BPS_STMT_BAL_10() {
		return CHDBS_BPS_STMT_BAL_10;
	}
	public void setCHDBS_BPS_STMT_BAL_10(double cHDBS_BPS_STMT_BAL_10) {
		CHDBS_BPS_STMT_BAL_10 = cHDBS_BPS_STMT_BAL_10;
	}
	public double getCHDBS_BPS_STMT_BAL_11() {
		return CHDBS_BPS_STMT_BAL_11;
	}
	public void setCHDBS_BPS_STMT_BAL_11(double cHDBS_BPS_STMT_BAL_11) {
		CHDBS_BPS_STMT_BAL_11 = cHDBS_BPS_STMT_BAL_11;
	}
	public int getCHDBS_BPS_STMT_DATE_1() {
		return CHDBS_BPS_STMT_DATE_1;
	}
	public void setCHDBS_BPS_STMT_DATE_1(int cHDBS_BPS_STMT_DATE_1) {
		CHDBS_BPS_STMT_DATE_1 = cHDBS_BPS_STMT_DATE_1;
	}
	public int getCHDBS_BPS_STMT_DATE_2() {
		return CHDBS_BPS_STMT_DATE_2;
	}
	public void setCHDBS_BPS_STMT_DATE_2(int cHDBS_BPS_STMT_DATE_2) {
		CHDBS_BPS_STMT_DATE_2 = cHDBS_BPS_STMT_DATE_2;
	}
	public int getCHDBS_BPS_STMT_DATE_3() {
		return CHDBS_BPS_STMT_DATE_3;
	}
	public void setCHDBS_BPS_STMT_DATE_3(int cHDBS_BPS_STMT_DATE_3) {
		CHDBS_BPS_STMT_DATE_3 = cHDBS_BPS_STMT_DATE_3;
	}
	public int getCHDBS_BPS_STMT_DATE_4() {
		return CHDBS_BPS_STMT_DATE_4;
	}
	public void setCHDBS_BPS_STMT_DATE_4(int cHDBS_BPS_STMT_DATE_4) {
		CHDBS_BPS_STMT_DATE_4 = cHDBS_BPS_STMT_DATE_4;
	}
	public int getCHDBS_BPS_STMT_DATE_5() {
		return CHDBS_BPS_STMT_DATE_5;
	}
	public void setCHDBS_BPS_STMT_DATE_5(int cHDBS_BPS_STMT_DATE_5) {
		CHDBS_BPS_STMT_DATE_5 = cHDBS_BPS_STMT_DATE_5;
	}
	public int getCHDBS_BPS_STMT_DATE_6() {
		return CHDBS_BPS_STMT_DATE_6;
	}
	public void setCHDBS_BPS_STMT_DATE_6(int cHDBS_BPS_STMT_DATE_6) {
		CHDBS_BPS_STMT_DATE_6 = cHDBS_BPS_STMT_DATE_6;
	}
	public int getCHDBS_BPS_STMT_DATE_7() {
		return CHDBS_BPS_STMT_DATE_7;
	}
	public void setCHDBS_BPS_STMT_DATE_7(int cHDBS_BPS_STMT_DATE_7) {
		CHDBS_BPS_STMT_DATE_7 = cHDBS_BPS_STMT_DATE_7;
	}
	public int getCHDBS_BPS_STMT_DATE_8() {
		return CHDBS_BPS_STMT_DATE_8;
	}
	public void setCHDBS_BPS_STMT_DATE_8(int cHDBS_BPS_STMT_DATE_8) {
		CHDBS_BPS_STMT_DATE_8 = cHDBS_BPS_STMT_DATE_8;
	}
	public int getCHDBS_BPS_STMT_DATE_9() {
		return CHDBS_BPS_STMT_DATE_9;
	}
	public void setCHDBS_BPS_STMT_DATE_9(int cHDBS_BPS_STMT_DATE_9) {
		CHDBS_BPS_STMT_DATE_9 = cHDBS_BPS_STMT_DATE_9;
	}
	public int getCHDBS_BPS_STMT_DATE_10() {
		return CHDBS_BPS_STMT_DATE_10;
	}
	public void setCHDBS_BPS_STMT_DATE_10(int cHDBS_BPS_STMT_DATE_10) {
		CHDBS_BPS_STMT_DATE_10 = cHDBS_BPS_STMT_DATE_10;
	}
	public int getCHDBS_BPS_STMT_DATE_11() {
		return CHDBS_BPS_STMT_DATE_11;
	}
	public void setCHDBS_BPS_STMT_DATE_11(int cHDBS_BPS_STMT_DATE_11) {
		CHDBS_BPS_STMT_DATE_11 = cHDBS_BPS_STMT_DATE_11;
	}
	public double getCHDBS_FINC_CHRG_AM_1() {
		return CHDBS_FINC_CHRG_AM_1;
	}
	public void setCHDBS_FINC_CHRG_AM_1(double cHDBS_FINC_CHRG_AM_1) {
		CHDBS_FINC_CHRG_AM_1 = cHDBS_FINC_CHRG_AM_1;
	}
	public double getCHDBS_FINC_CHRG_AM_2() {
		return CHDBS_FINC_CHRG_AM_2;
	}
	public void setCHDBS_FINC_CHRG_AM_2(double cHDBS_FINC_CHRG_AM_2) {
		CHDBS_FINC_CHRG_AM_2 = cHDBS_FINC_CHRG_AM_2;
	}
	public double getCHDBS_FINC_CHRG_AM_3() {
		return CHDBS_FINC_CHRG_AM_3;
	}
	public void setCHDBS_FINC_CHRG_AM_3(double cHDBS_FINC_CHRG_AM_3) {
		CHDBS_FINC_CHRG_AM_3 = cHDBS_FINC_CHRG_AM_3;
	}
	public double getCHDBS_FINC_CHRG_AM_4() {
		return CHDBS_FINC_CHRG_AM_4;
	}
	public void setCHDBS_FINC_CHRG_AM_4(double cHDBS_FINC_CHRG_AM_4) {
		CHDBS_FINC_CHRG_AM_4 = cHDBS_FINC_CHRG_AM_4;
	}
	public double getCHDBS_PS_CASH() {
		return CHDBS_PS_CASH;
	}
	public void setCHDBS_PS_CASH(double cHDBS_PS_CASH) {
		CHDBS_PS_CASH = cHDBS_PS_CASH;
	}
	public double getCHDBS_PS_PAYMENTS() {
		return CHDBS_PS_PAYMENTS;
	}
	public void setCHDBS_PS_PAYMENTS(double cHDBS_PS_PAYMENTS) {
		CHDBS_PS_PAYMENTS = cHDBS_PS_PAYMENTS;
	}
	public double getCHDBS_PS_RETURNS() {
		return CHDBS_PS_RETURNS;
	}
	public void setCHDBS_PS_RETURNS(double cHDBS_PS_RETURNS) {
		CHDBS_PS_RETURNS = cHDBS_PS_RETURNS;
	}
	public double getCHDBS_PS_REVERSALS_CT() {
		return CHDBS_PS_REVERSALS_CT;
	}
	public void setCHDBS_PS_REVERSALS_CT(double cHDBS_PS_REVERSALS_CT) {
		CHDBS_PS_REVERSALS_CT = cHDBS_PS_REVERSALS_CT;
	}
	public double getCHDBS_PS_SALES() {
		return CHDBS_PS_SALES;
	}
	public void setCHDBS_PS_SALES(double cHDBS_PS_SALES) {
		CHDBS_PS_SALES = cHDBS_PS_SALES;
	}
	public double getCHDHD_1STY_MXFE_PSTD_AM() {
		return CHDHD_1STY_MXFE_PSTD_AM;
	}
	public void setCHDHD_1STY_MXFE_PSTD_AM(double cHDHD_1STY_MXFE_PSTD_AM) {
		CHDHD_1STY_MXFE_PSTD_AM = cHDHD_1STY_MXFE_PSTD_AM;
	}
	public double getCHDHD_AMT_LAST_CASH() {
		return CHDHD_AMT_LAST_CASH;
	}
	public void setCHDHD_AMT_LAST_CASH(double cHDHD_AMT_LAST_CASH) {
		CHDHD_AMT_LAST_CASH = cHDHD_AMT_LAST_CASH;
	}
	public double getCHDHD_AMT_LAST_SALE() {
		return CHDHD_AMT_LAST_SALE;
	}
	public void setCHDHD_AMT_LAST_SALE(double cHDHD_AMT_LAST_SALE) {
		CHDHD_AMT_LAST_SALE = cHDHD_AMT_LAST_SALE;
	}
	public double getCHDHD_BS_DELQ_SCENARIO() {
		return CHDHD_BS_DELQ_SCENARIO;
	}
	public void setCHDHD_BS_DELQ_SCENARIO(double cHDHD_BS_DELQ_SCENARIO) {
		CHDHD_BS_DELQ_SCENARIO = cHDHD_BS_DELQ_SCENARIO;
	}
	public double getCHDHD_BS_SCORECARD_ID() {
		return CHDHD_BS_SCORECARD_ID;
	}
	public void setCHDHD_BS_SCORECARD_ID(double cHDHD_BS_SCORECARD_ID) {
		CHDHD_BS_SCORECARD_ID = cHDHD_BS_SCORECARD_ID;
	}
	public double getCHDHD_BS_TEMP_COLL_CODE() {
		return CHDHD_BS_TEMP_COLL_CODE;
	}
	public void setCHDHD_BS_TEMP_COLL_CODE(double cHDHD_BS_TEMP_COLL_CODE) {
		CHDHD_BS_TEMP_COLL_CODE = cHDHD_BS_TEMP_COLL_CODE;
	}
	public double getCHDHD_CHG_OFF_AMT() {
		return CHDHD_CHG_OFF_AMT;
	}
	public void setCHDHD_CHG_OFF_AMT(double cHDHD_CHG_OFF_AMT) {
		CHDHD_CHG_OFF_AMT = cHDHD_CHG_OFF_AMT;
	}
	public int getCHDHD_CHG_OFF_DATE() {
		return CHDHD_CHG_OFF_DATE;
	}
	public void setCHDHD_CHG_OFF_DATE(int cHDHD_CHG_OFF_DATE) {
		CHDHD_CHG_OFF_DATE = cHDHD_CHG_OFF_DATE;
	}
	public double getCHDHD_CM_FIRST_PMT_AMT() {
		return CHDHD_CM_FIRST_PMT_AMT;
	}
	public void setCHDHD_CM_FIRST_PMT_AMT(double cHDHD_CM_FIRST_PMT_AMT) {
		CHDHD_CM_FIRST_PMT_AMT = cHDHD_CM_FIRST_PMT_AMT;
	}
	public double getCHDHD_COLLECTOR_ASSIGNED() {
		return CHDHD_COLLECTOR_ASSIGNED;
	}
	public void setCHDHD_COLLECTOR_ASSIGNED(double cHDHD_COLLECTOR_ASSIGNED) {
		CHDHD_COLLECTOR_ASSIGNED = cHDHD_COLLECTOR_ASSIGNED;
	}
	public int getCHDHD_DATE_HI_BALANCE() {
		return CHDHD_DATE_HI_BALANCE;
	}
	public void setCHDHD_DATE_HI_BALANCE(int cHDHD_DATE_HI_BALANCE) {
		CHDHD_DATE_HI_BALANCE = cHDHD_DATE_HI_BALANCE;
	}
	public int getCHDHD_DATE_LAST_CASH() {
		return CHDHD_DATE_LAST_CASH;
	}
	public void setCHDHD_DATE_LAST_CASH(int cHDHD_DATE_LAST_CASH) {
		CHDHD_DATE_LAST_CASH = cHDHD_DATE_LAST_CASH;
	}
	public int getCHDHD_DATE_LAST_DELINQUENT() {
		return CHDHD_DATE_LAST_DELINQUENT;
	}
	public void setCHDHD_DATE_LAST_DELINQUENT(int cHDHD_DATE_LAST_DELINQUENT) {
		CHDHD_DATE_LAST_DELINQUENT = cHDHD_DATE_LAST_DELINQUENT;
	}
	public int getCHDHD_DATE_LAST_DR() {
		return CHDHD_DATE_LAST_DR;
	}
	public void setCHDHD_DATE_LAST_DR(int cHDHD_DATE_LAST_DR) {
		CHDHD_DATE_LAST_DR = cHDHD_DATE_LAST_DR;
	}
	public int getCHDHD_DATE_LAST_REAGE() {
		return CHDHD_DATE_LAST_REAGE;
	}
	public void setCHDHD_DATE_LAST_REAGE(int cHDHD_DATE_LAST_REAGE) {
		CHDHD_DATE_LAST_REAGE = cHDHD_DATE_LAST_REAGE;
	}
	public int getCHDHD_DATE_LAST_SALE_ADVANCE() {
		return CHDHD_DATE_LAST_SALE_ADVANCE;
	}
	public void setCHDHD_DATE_LAST_SALE_ADVANCE(int cHDHD_DATE_LAST_SALE_ADVANCE) {
		CHDHD_DATE_LAST_SALE_ADVANCE = cHDHD_DATE_LAST_SALE_ADVANCE;
	}
	public int getCHDHD_DEC_AUTH_DAY1() {
		return CHDHD_DEC_AUTH_DAY1;
	}
	public void setCHDHD_DEC_AUTH_DAY1(int cHDHD_DEC_AUTH_DAY1) {
		CHDHD_DEC_AUTH_DAY1 = cHDHD_DEC_AUTH_DAY1;
	}
	public int getCHDHD_DEC_AUTH_DAY2() {
		return CHDHD_DEC_AUTH_DAY2;
	}
	public void setCHDHD_DEC_AUTH_DAY2(int cHDHD_DEC_AUTH_DAY2) {
		CHDHD_DEC_AUTH_DAY2 = cHDHD_DEC_AUTH_DAY2;
	}
	public int getCHDHD_DEC_AUTH_DAY3() {
		return CHDHD_DEC_AUTH_DAY3;
	}
	public void setCHDHD_DEC_AUTH_DAY3(int cHDHD_DEC_AUTH_DAY3) {
		CHDHD_DEC_AUTH_DAY3 = cHDHD_DEC_AUTH_DAY3;
	}
	public int getCHDHD_DEC_AUTH_DAY4() {
		return CHDHD_DEC_AUTH_DAY4;
	}
	public void setCHDHD_DEC_AUTH_DAY4(int cHDHD_DEC_AUTH_DAY4) {
		CHDHD_DEC_AUTH_DAY4 = cHDHD_DEC_AUTH_DAY4;
	}
	public int getCHDHD_DEC_AUTH_DAY5() {
		return CHDHD_DEC_AUTH_DAY5;
	}
	public void setCHDHD_DEC_AUTH_DAY5(int cHDHD_DEC_AUTH_DAY5) {
		CHDHD_DEC_AUTH_DAY5 = cHDHD_DEC_AUTH_DAY5;
	}
	public int getCHDHD_DEC_AUTH_DAY6() {
		return CHDHD_DEC_AUTH_DAY6;
	}
	public void setCHDHD_DEC_AUTH_DAY6(int cHDHD_DEC_AUTH_DAY6) {
		CHDHD_DEC_AUTH_DAY6 = cHDHD_DEC_AUTH_DAY6;
	}
	public int getCHDHD_FORB_END_DT() {
		return CHDHD_FORB_END_DT;
	}
	public void setCHDHD_FORB_END_DT(int cHDHD_FORB_END_DT) {
		CHDHD_FORB_END_DT = cHDHD_FORB_END_DT;
	}
	public String getCHDHD_FORB_PLAN_CD() {
		return CHDHD_FORB_PLAN_CD;
	}
	public void setCHDHD_FORB_PLAN_CD(String cHDHD_FORB_PLAN_CD) {
		CHDHD_FORB_PLAN_CD = cHDHD_FORB_PLAN_CD;
	}
	public int getCHDHD_FORB_STRT_DT() {
		return CHDHD_FORB_STRT_DT;
	}
	public void setCHDHD_FORB_STRT_DT(int cHDHD_FORB_STRT_DT) {
		CHDHD_FORB_STRT_DT = cHDHD_FORB_STRT_DT;
	}
	public String getCHDHD_LAST_TRUE_REAG_CD() {
		return CHDHD_LAST_TRUE_REAG_CD;
	}
	public void setCHDHD_LAST_TRUE_REAG_CD(String cHDHD_LAST_TRUE_REAG_CD) {
		CHDHD_LAST_TRUE_REAG_CD = cHDHD_LAST_TRUE_REAG_CD;
	}
	public String getCHDHD_LATE_FEE_CTD() {
		return CHDHD_LATE_FEE_CTD;
	}
	public void setCHDHD_LATE_FEE_CTD(String cHDHD_LATE_FEE_CTD) {
		CHDHD_LATE_FEE_CTD = cHDHD_LATE_FEE_CTD;
	}
	public String getCHDHD_LATE_FEE_HSTR() {
		return CHDHD_LATE_FEE_HSTR;
	}
	public void setCHDHD_LATE_FEE_HSTR(String cHDHD_LATE_FEE_HSTR) {
		CHDHD_LATE_FEE_HSTR = cHDHD_LATE_FEE_HSTR;
	}
	public int getCHDHD_MTHS_RTRN_CHECKS() {
		return CHDHD_MTHS_RTRN_CHECKS;
	}
	public void setCHDHD_MTHS_RTRN_CHECKS(int cHDHD_MTHS_RTRN_CHECKS) {
		CHDHD_MTHS_RTRN_CHECKS = cHDHD_MTHS_RTRN_CHECKS;
	}
	public String getCHDHD_PAYMENT_HISTORY() {
		return CHDHD_PAYMENT_HISTORY;
	}
	public void setCHDHD_PAYMENT_HISTORY(String cHDHD_PAYMENT_HISTORY) {
		CHDHD_PAYMENT_HISTORY = cHDHD_PAYMENT_HISTORY;
	}
	public String getCHDHD_PAY_HIST_13_24() {
		return CHDHD_PAY_HIST_13_24;
	}
	public void setCHDHD_PAY_HIST_13_24(String cHDHD_PAY_HIST_13_24) {
		CHDHD_PAY_HIST_13_24 = cHDHD_PAY_HIST_13_24;
	}
	public int getCHDHD_POC_DT() {
		return CHDHD_POC_DT;
	}
	public void setCHDHD_POC_DT(int cHDHD_POC_DT) {
		CHDHD_POC_DT = cHDHD_POC_DT;
	}
	public int getCHDHD_PRIR_REAG_DT() {
		return CHDHD_PRIR_REAG_DT;
	}
	public void setCHDHD_PRIR_REAG_DT(int cHDHD_PRIR_REAG_DT) {
		CHDHD_PRIR_REAG_DT = cHDHD_PRIR_REAG_DT;
	}
	public int getCHDHD_PRVS_REAG_DT() {
		return CHDHD_PRVS_REAG_DT;
	}
	public void setCHDHD_PRVS_REAG_DT(int cHDHD_PRVS_REAG_DT) {
		CHDHD_PRVS_REAG_DT = cHDHD_PRVS_REAG_DT;
	}
	public int getCHDHD_PYMT_FLOAT_DATE() {
		return CHDHD_PYMT_FLOAT_DATE;
	}
	public void setCHDHD_PYMT_FLOAT_DATE(int cHDHD_PYMT_FLOAT_DATE) {
		CHDHD_PYMT_FLOAT_DATE = cHDHD_PYMT_FLOAT_DATE;
	}
	public double getCHDHD_PY_CHD_INTEREST() {
		return CHDHD_PY_CHD_INTEREST;
	}
	public void setCHDHD_PY_CHD_INTEREST(double cHDHD_PY_CHD_INTEREST) {
		CHDHD_PY_CHD_INTEREST = cHDHD_PY_CHD_INTEREST;
	}
	public double getCHDHD_PY_CREDIT_INT() {
		return CHDHD_PY_CREDIT_INT;
	}
	public void setCHDHD_PY_CREDIT_INT(double cHDHD_PY_CREDIT_INT) {
		CHDHD_PY_CREDIT_INT = cHDHD_PY_CREDIT_INT;
	}
	public int getCHDHD_PY_HIGH_BALANCE() {
		return CHDHD_PY_HIGH_BALANCE;
	}
	public void setCHDHD_PY_HIGH_BALANCE(int cHDHD_PY_HIGH_BALANCE) {
		CHDHD_PY_HIGH_BALANCE = cHDHD_PY_HIGH_BALANCE;
	}
	public double getCHDHD_PY_NET_AMT_PURCH() {
		return CHDHD_PY_NET_AMT_PURCH;
	}
	public void setCHDHD_PY_NET_AMT_PURCH(double cHDHD_PY_NET_AMT_PURCH) {
		CHDHD_PY_NET_AMT_PURCH = cHDHD_PY_NET_AMT_PURCH;
	}
	public int getCHDHD_PY_NET_NO_PURCH() {
		return CHDHD_PY_NET_NO_PURCH;
	}
	public void setCHDHD_PY_NET_NO_PURCH(int cHDHD_PY_NET_NO_PURCH) {
		CHDHD_PY_NET_NO_PURCH = cHDHD_PY_NET_NO_PURCH;
	}
	public int getCHDHD_PY_NMO_DELIN() {
		return CHDHD_PY_NMO_DELIN;
	}
	public void setCHDHD_PY_NMO_DELIN(int cHDHD_PY_NMO_DELIN) {
		CHDHD_PY_NMO_DELIN = cHDHD_PY_NMO_DELIN;
	}
	public int getCHDHD_PY_NO_1CYC_DEL() {
		return CHDHD_PY_NO_1CYC_DEL;
	}
	public void setCHDHD_PY_NO_1CYC_DEL(int cHDHD_PY_NO_1CYC_DEL) {
		CHDHD_PY_NO_1CYC_DEL = cHDHD_PY_NO_1CYC_DEL;
	}
	public int getCHDHD_PY_NO_2CYC_DEL() {
		return CHDHD_PY_NO_2CYC_DEL;
	}
	public void setCHDHD_PY_NO_2CYC_DEL(int cHDHD_PY_NO_2CYC_DEL) {
		CHDHD_PY_NO_2CYC_DEL = cHDHD_PY_NO_2CYC_DEL;
	}
	public int getCHDHD_PY_NO_3CYC_DEL() {
		return CHDHD_PY_NO_3CYC_DEL;
	}
	public void setCHDHD_PY_NO_3CYC_DEL(int cHDHD_PY_NO_3CYC_DEL) {
		CHDHD_PY_NO_3CYC_DEL = cHDHD_PY_NO_3CYC_DEL;
	}
	public int getCHDHD_PY_NO_RTRN_CHECKS() {
		return CHDHD_PY_NO_RTRN_CHECKS;
	}
	public void setCHDHD_PY_NO_RTRN_CHECKS(int cHDHD_PY_NO_RTRN_CHECKS) {
		CHDHD_PY_NO_RTRN_CHECKS = cHDHD_PY_NO_RTRN_CHECKS;
	}
	public int getCHDHD_PY_REAGE() {
		return CHDHD_PY_REAGE;
	}
	public void setCHDHD_PY_REAGE(int cHDHD_PY_REAGE) {
		CHDHD_PY_REAGE = cHDHD_PY_REAGE;
	}
	public int getCHDHD_REAGE_NEXT_DATE() {
		return CHDHD_REAGE_NEXT_DATE;
	}
	public void setCHDHD_REAGE_NEXT_DATE(int cHDHD_REAGE_NEXT_DATE) {
		CHDHD_REAGE_NEXT_DATE = cHDHD_REAGE_NEXT_DATE;
	}
	public int getCHDHD_REAGE_NUM_PAYMENTS() {
		return CHDHD_REAGE_NUM_PAYMENTS;
	}
	public void setCHDHD_REAGE_NUM_PAYMENTS(int cHDHD_REAGE_NUM_PAYMENTS) {
		CHDHD_REAGE_NUM_PAYMENTS = cHDHD_REAGE_NUM_PAYMENTS;
	}
	public String getCHDHD_REAGE_TYPE() {
		return CHDHD_REAGE_TYPE;
	}
	public void setCHDHD_REAGE_TYPE(String cHDHD_REAGE_TYPE) {
		CHDHD_REAGE_TYPE = cHDHD_REAGE_TYPE;
	}
	public String getCHDHD_STATUSES_MET() {
		return CHDHD_STATUSES_MET;
	}
	public void setCHDHD_STATUSES_MET(String cHDHD_STATUSES_MET) {
		CHDHD_STATUSES_MET = cHDHD_STATUSES_MET;
	}
	public int getCHDHD_TOTAL_REAGE_NO() {
		return CHDHD_TOTAL_REAGE_NO;
	}
	public void setCHDHD_TOTAL_REAGE_NO(int cHDHD_TOTAL_REAGE_NO) {
		CHDHD_TOTAL_REAGE_NO = cHDHD_TOTAL_REAGE_NO;
	}
	public int getCHDHD_TOTAL_RTRN_CHECKS_NO() {
		return CHDHD_TOTAL_RTRN_CHECKS_NO;
	}
	public void setCHDHD_TOTAL_RTRN_CHECKS_NO(int cHDHD_TOTAL_RTRN_CHECKS_NO) {
		CHDHD_TOTAL_RTRN_CHECKS_NO = cHDHD_TOTAL_RTRN_CHECKS_NO;
	}
	public int getCHDHD_VD_HIGH_ARREARS() {
		return CHDHD_VD_HIGH_ARREARS;
	}
	public void setCHDHD_VD_HIGH_ARREARS(int cHDHD_VD_HIGH_ARREARS) {
		CHDHD_VD_HIGH_ARREARS = cHDHD_VD_HIGH_ARREARS;
	}
	public int getCHDHD_VD_HIGH_BALANCE() {
		return CHDHD_VD_HIGH_BALANCE;
	}
	public void setCHDHD_VD_HIGH_BALANCE(int cHDHD_VD_HIGH_BALANCE) {
		CHDHD_VD_HIGH_BALANCE = cHDHD_VD_HIGH_BALANCE;
	}
	public int getCHDHD_VD_NMO_ACT_GROSS() {
		return CHDHD_VD_NMO_ACT_GROSS;
	}
	public void setCHDHD_VD_NMO_ACT_GROSS(int cHDHD_VD_NMO_ACT_GROSS) {
		CHDHD_VD_NMO_ACT_GROSS = cHDHD_VD_NMO_ACT_GROSS;
	}
	public int getCHDHD_VD_NMO_DELIN() {
		return CHDHD_VD_NMO_DELIN;
	}
	public void setCHDHD_VD_NMO_DELIN(int cHDHD_VD_NMO_DELIN) {
		CHDHD_VD_NMO_DELIN = cHDHD_VD_NMO_DELIN;
	}
	public int getCHDHD_VD_NMO_EARNINGS() {
		return CHDHD_VD_NMO_EARNINGS;
	}
	public void setCHDHD_VD_NMO_EARNINGS(int cHDHD_VD_NMO_EARNINGS) {
		CHDHD_VD_NMO_EARNINGS = cHDHD_VD_NMO_EARNINGS;
	}
	public int getCHDHD_VD_NMO_TOP_LINE() {
		return CHDHD_VD_NMO_TOP_LINE;
	}
	public void setCHDHD_VD_NMO_TOP_LINE(int cHDHD_VD_NMO_TOP_LINE) {
		CHDHD_VD_NMO_TOP_LINE = cHDHD_VD_NMO_TOP_LINE;
	}
	public int getCHDHD_VD_NO_1CYC_DEL() {
		return CHDHD_VD_NO_1CYC_DEL;
	}
	public void setCHDHD_VD_NO_1CYC_DEL(int cHDHD_VD_NO_1CYC_DEL) {
		CHDHD_VD_NO_1CYC_DEL = cHDHD_VD_NO_1CYC_DEL;
	}
	public int getCHDHD_VD_NO_2CYC_DEL() {
		return CHDHD_VD_NO_2CYC_DEL;
	}
	public void setCHDHD_VD_NO_2CYC_DEL(int cHDHD_VD_NO_2CYC_DEL) {
		CHDHD_VD_NO_2CYC_DEL = cHDHD_VD_NO_2CYC_DEL;
	}
	public int getCHDHD_VD_NO_3CYC_DEL() {
		return CHDHD_VD_NO_3CYC_DEL;
	}
	public void setCHDHD_VD_NO_3CYC_DEL(int cHDHD_VD_NO_3CYC_DEL) {
		CHDHD_VD_NO_3CYC_DEL = cHDHD_VD_NO_3CYC_DEL;
	}
	public int getCHDHD_VD_NO_RTRN_CHECKS() {
		return CHDHD_VD_NO_RTRN_CHECKS;
	}
	public void setCHDHD_VD_NO_RTRN_CHECKS(int cHDHD_VD_NO_RTRN_CHECKS) {
		CHDHD_VD_NO_RTRN_CHECKS = cHDHD_VD_NO_RTRN_CHECKS;
	}
	public double getCHDHD_YTD_BILLED_CASH_INT() {
		return CHDHD_YTD_BILLED_CASH_INT;
	}
	public void setCHDHD_YTD_BILLED_CASH_INT(double cHDHD_YTD_BILLED_CASH_INT) {
		CHDHD_YTD_BILLED_CASH_INT = cHDHD_YTD_BILLED_CASH_INT;
	}
	public double getCHDHD_YTD_BILLED_LATE_CHG() {
		return CHDHD_YTD_BILLED_LATE_CHG;
	}
	public void setCHDHD_YTD_BILLED_LATE_CHG(double cHDHD_YTD_BILLED_LATE_CHG) {
		CHDHD_YTD_BILLED_LATE_CHG = cHDHD_YTD_BILLED_LATE_CHG;
	}
	public double getCHDHD_YTD_BILLED_MRCH_INT() {
		return CHDHD_YTD_BILLED_MRCH_INT;
	}
	public void setCHDHD_YTD_BILLED_MRCH_INT(double cHDHD_YTD_BILLED_MRCH_INT) {
		CHDHD_YTD_BILLED_MRCH_INT = cHDHD_YTD_BILLED_MRCH_INT;
	}
	public double getCHDHD_YTD_NET_AMT_PURCH() {
		return CHDHD_YTD_NET_AMT_PURCH;
	}
	public void setCHDHD_YTD_NET_AMT_PURCH(double cHDHD_YTD_NET_AMT_PURCH) {
		CHDHD_YTD_NET_AMT_PURCH = cHDHD_YTD_NET_AMT_PURCH;
	}
	public int getCHDHD_YTD_NET_NO_PURCH() {
		return CHDHD_YTD_NET_NO_PURCH;
	}
	public void setCHDHD_YTD_NET_NO_PURCH(int cHDHD_YTD_NET_NO_PURCH) {
		CHDHD_YTD_NET_NO_PURCH = cHDHD_YTD_NET_NO_PURCH;
	}
	public int getCHDHD_YTD_NO_1CYC_DEL() {
		return CHDHD_YTD_NO_1CYC_DEL;
	}
	public void setCHDHD_YTD_NO_1CYC_DEL(int cHDHD_YTD_NO_1CYC_DEL) {
		CHDHD_YTD_NO_1CYC_DEL = cHDHD_YTD_NO_1CYC_DEL;
	}
	public int getCHDHD_YTD_NO_2CYC_DEL() {
		return CHDHD_YTD_NO_2CYC_DEL;
	}
	public void setCHDHD_YTD_NO_2CYC_DEL(int cHDHD_YTD_NO_2CYC_DEL) {
		CHDHD_YTD_NO_2CYC_DEL = cHDHD_YTD_NO_2CYC_DEL;
	}
	public int getCHDHD_YTD_NO_3CYC_DEL() {
		return CHDHD_YTD_NO_3CYC_DEL;
	}
	public void setCHDHD_YTD_NO_3CYC_DEL(int cHDHD_YTD_NO_3CYC_DEL) {
		CHDHD_YTD_NO_3CYC_DEL = cHDHD_YTD_NO_3CYC_DEL;
	}
	public int getCHDHD_YTD_NO_RTRN_CHECKS() {
		return CHDHD_YTD_NO_RTRN_CHECKS;
	}
	public void setCHDHD_YTD_NO_RTRN_CHECKS(int cHDHD_YTD_NO_RTRN_CHECKS) {
		CHDHD_YTD_NO_RTRN_CHECKS = cHDHD_YTD_NO_RTRN_CHECKS;
	}
	public double getCHDHD_YTD_OVERLIMIT_CHG() {
		return CHDHD_YTD_OVERLIMIT_CHG;
	}
	public void setCHDHD_YTD_OVERLIMIT_CHG(double cHDHD_YTD_OVERLIMIT_CHG) {
		CHDHD_YTD_OVERLIMIT_CHG = cHDHD_YTD_OVERLIMIT_CHG;
	}
	public int getCHDHD_YTD_REAGE() {
		return CHDHD_YTD_REAGE;
	}
	public void setCHDHD_YTD_REAGE(int cHDHD_YTD_REAGE) {
		CHDHD_YTD_REAGE = cHDHD_YTD_REAGE;
	}
	
	public double getCHDLS_ADB() {
		return CHDLS_ADB;
	}
	public void setCHDLS_ADB(double cHDLS_ADB) {
		CHDLS_ADB = cHDLS_ADB;
	}
	public double getCHDLS_ANNUAL_CHARGES_BILLED() {
		return CHDLS_ANNUAL_CHARGES_BILLED;
	}
	public void setCHDLS_ANNUAL_CHARGES_BILLED(double cHDLS_ANNUAL_CHARGES_BILLED) {
		CHDLS_ANNUAL_CHARGES_BILLED = cHDLS_ANNUAL_CHARGES_BILLED;
	}
	public double getCHDLS_BILLED_PAY_DUE() {
		return CHDLS_BILLED_PAY_DUE;
	}
	public void setCHDLS_BILLED_PAY_DUE(double cHDLS_BILLED_PAY_DUE) {
		CHDLS_BILLED_PAY_DUE = cHDLS_BILLED_PAY_DUE;
	}
	public double getCHDLS_CASH_INT() {
		return CHDLS_CASH_INT;
	}
	public void setCHDLS_CASH_INT(double cHDLS_CASH_INT) {
		CHDLS_CASH_INT = cHDLS_CASH_INT;
	}
	public double getCHDLS_CASH_IPP() {
		return CHDLS_CASH_IPP;
	}
	public void setCHDLS_CASH_IPP(double cHDLS_CASH_IPP) {
		CHDLS_CASH_IPP = cHDLS_CASH_IPP;
	}
	public double getCHDLS_CASH_MUF() {
		return CHDLS_CASH_MUF;
	}
	public void setCHDLS_CASH_MUF(double cHDLS_CASH_MUF) {
		CHDLS_CASH_MUF = cHDLS_CASH_MUF;
	}
	public double getCHDLS_CASH_MUF_INT() {
		return CHDLS_CASH_MUF_INT;
	}
	public void setCHDLS_CASH_MUF_INT(double cHDLS_CASH_MUF_INT) {
		CHDLS_CASH_MUF_INT = cHDLS_CASH_MUF_INT;
	}
	public double getCHDLS_CLI_PREMIUM_1() {
		return CHDLS_CLI_PREMIUM_1;
	}
	public void setCHDLS_CLI_PREMIUM_1(double cHDLS_CLI_PREMIUM_1) {
		CHDLS_CLI_PREMIUM_1 = cHDLS_CLI_PREMIUM_1;
	}
	public double getCHDLS_CLI_PREMIUM_2() {
		return CHDLS_CLI_PREMIUM_2;
	}
	public void setCHDLS_CLI_PREMIUM_2(double cHDLS_CLI_PREMIUM_2) {
		CHDLS_CLI_PREMIUM_2 = cHDLS_CLI_PREMIUM_2;
	}
	public double getCHDLS_CLI_PREMIUM_3() {
		return CHDLS_CLI_PREMIUM_3;
	}
	public void setCHDLS_CLI_PREMIUM_3(double cHDLS_CLI_PREMIUM_3) {
		CHDLS_CLI_PREMIUM_3 = cHDLS_CLI_PREMIUM_3;
	}
	public double getCHDLS_CLI_PREMIUM_4() {
		return CHDLS_CLI_PREMIUM_4;
	}
	public void setCHDLS_CLI_PREMIUM_4(double cHDLS_CLI_PREMIUM_4) {
		CHDLS_CLI_PREMIUM_4 = cHDLS_CLI_PREMIUM_4;
	}
	public double getCHDLS_CLI_PREMIUM_5() {
		return CHDLS_CLI_PREMIUM_5;
	}
	public void setCHDLS_CLI_PREMIUM_5(double cHDLS_CLI_PREMIUM_5) {
		CHDLS_CLI_PREMIUM_5 = cHDLS_CLI_PREMIUM_5;
	}
	public double getCHDLS_CLI_PREMIUM_6() {
		return CHDLS_CLI_PREMIUM_6;
	}
	public void setCHDLS_CLI_PREMIUM_6(double cHDLS_CLI_PREMIUM_6) {
		CHDLS_CLI_PREMIUM_6 = cHDLS_CLI_PREMIUM_6;
	}
	public double getCHDLS_CREDIT_INT() {
		return CHDLS_CREDIT_INT;
	}
	public void setCHDLS_CREDIT_INT(double cHDLS_CREDIT_INT) {
		CHDLS_CREDIT_INT = cHDLS_CREDIT_INT;
	}
	public double getCHDLS_CR_LIFE_CHG() {
		return CHDLS_CR_LIFE_CHG;
	}
	public void setCHDLS_CR_LIFE_CHG(double cHDLS_CR_LIFE_CHG) {
		CHDLS_CR_LIFE_CHG = cHDLS_CR_LIFE_CHG;
	}
	public double getCHDLS_CYC_CASH() {
		return CHDLS_CYC_CASH;
	}
	public void setCHDLS_CYC_CASH(double cHDLS_CYC_CASH) {
		CHDLS_CYC_CASH = cHDLS_CYC_CASH;
	}
	public double getCHDLS_CYC_MRCH() {
		return CHDLS_CYC_MRCH;
	}
	public void setCHDLS_CYC_MRCH(double cHDLS_CYC_MRCH) {
		CHDLS_CYC_MRCH = cHDLS_CYC_MRCH;
	}
	public double getCHDLS_DEF_AVE() {
		return CHDLS_DEF_AVE;
	}
	public void setCHDLS_DEF_AVE(double cHDLS_DEF_AVE) {
		CHDLS_DEF_AVE = cHDLS_DEF_AVE;
	}
	public double getCHDLS_DEF_AVE_2() {
		return CHDLS_DEF_AVE_2;
	}
	public void setCHDLS_DEF_AVE_2(double cHDLS_DEF_AVE_2) {
		CHDLS_DEF_AVE_2 = cHDLS_DEF_AVE_2;
	}
	public double getCHDLS_DISPUTED_AMOUNT() {
		return CHDLS_DISPUTED_AMOUNT;
	}
	public void setCHDLS_DISPUTED_AMOUNT(double cHDLS_DISPUTED_AMOUNT) {
		CHDLS_DISPUTED_AMOUNT = cHDLS_DISPUTED_AMOUNT;
	}
	public double getCHDLS_END_CASH() {
		return CHDLS_END_CASH;
	}
	public void setCHDLS_END_CASH(double cHDLS_END_CASH) {
		CHDLS_END_CASH = cHDLS_END_CASH;
	}
	public double getCHDLS_END_LOAN() {
		return CHDLS_END_LOAN;
	}
	public void setCHDLS_END_LOAN(double cHDLS_END_LOAN) {
		CHDLS_END_LOAN = cHDLS_END_LOAN;
	}
	public double getCHDLS_END_MRCH_BINT() {
		return CHDLS_END_MRCH_BINT;
	}
	public void setCHDLS_END_MRCH_BINT(double cHDLS_END_MRCH_BINT) {
		CHDLS_END_MRCH_BINT = cHDLS_END_MRCH_BINT;
	}
	public double getCHDLS_END_MRCH_NBINT() {
		return CHDLS_END_MRCH_NBINT;
	}
	public void setCHDLS_END_MRCH_NBINT(double cHDLS_END_MRCH_NBINT) {
		CHDLS_END_MRCH_NBINT = cHDLS_END_MRCH_NBINT;
	}
	public double getCHDLS_FLAP_BALANCE() {
		return CHDLS_FLAP_BALANCE;
	}
	public void setCHDLS_FLAP_BALANCE(double cHDLS_FLAP_BALANCE) {
		CHDLS_FLAP_BALANCE = cHDLS_FLAP_BALANCE;
	}
	public double getCHDLS_FLAP_INT() {
		return CHDLS_FLAP_INT;
	}
	public void setCHDLS_FLAP_INT(double cHDLS_FLAP_INT) {
		CHDLS_FLAP_INT = cHDLS_FLAP_INT;
	}
	public double getCHDLS_ITEM_CHG() {
		return CHDLS_ITEM_CHG;
	}
	public void setCHDLS_ITEM_CHG(double cHDLS_ITEM_CHG) {
		CHDLS_ITEM_CHG = cHDLS_ITEM_CHG;
	}
	public double getCHDLS_LATE_CHG() {
		return CHDLS_LATE_CHG;
	}
	public void setCHDLS_LATE_CHG(double cHDLS_LATE_CHG) {
		CHDLS_LATE_CHG = cHDLS_LATE_CHG;
	}
	public double getCHDLS_MIN_CHG() {
		return CHDLS_MIN_CHG;
	}
	public void setCHDLS_MIN_CHG(double cHDLS_MIN_CHG) {
		CHDLS_MIN_CHG = cHDLS_MIN_CHG;
	}
	public double getCHDLS_MISCELLANEOUS() {
		return CHDLS_MISCELLANEOUS;
	}
	public void setCHDLS_MISCELLANEOUS(double cHDLS_MISCELLANEOUS) {
		CHDLS_MISCELLANEOUS = cHDLS_MISCELLANEOUS;
	}
	public double getCHDLS_MISC_CHGS() {
		return CHDLS_MISC_CHGS;
	}
	public void setCHDLS_MISC_CHGS(double cHDLS_MISC_CHGS) {
		CHDLS_MISC_CHGS = cHDLS_MISC_CHGS;
	}
	public double getCHDLS_MRCH_INT() {
		return CHDLS_MRCH_INT;
	}
	public void setCHDLS_MRCH_INT(double cHDLS_MRCH_INT) {
		CHDLS_MRCH_INT = cHDLS_MRCH_INT;
	}
	public double getCHDLS_MRCH_IPP() {
		return CHDLS_MRCH_IPP;
	}
	public void setCHDLS_MRCH_IPP(double cHDLS_MRCH_IPP) {
		CHDLS_MRCH_IPP = cHDLS_MRCH_IPP;
	}
	public double getCHDLS_MRCH_MUF() {
		return CHDLS_MRCH_MUF;
	}
	public void setCHDLS_MRCH_MUF(double cHDLS_MRCH_MUF) {
		CHDLS_MRCH_MUF = cHDLS_MRCH_MUF;
	}
	public double getCHDLS_MRCH_MUF_INT() {
		return CHDLS_MRCH_MUF_INT;
	}
	public void setCHDLS_MRCH_MUF_INT(double cHDLS_MRCH_MUF_INT) {
		CHDLS_MRCH_MUF_INT = cHDLS_MRCH_MUF_INT;
	}
	public double getCHDLS_MUF_CASH_INTSC() {
		return CHDLS_MUF_CASH_INTSC;
	}
	public void setCHDLS_MUF_CASH_INTSC(double cHDLS_MUF_CASH_INTSC) {
		CHDLS_MUF_CASH_INTSC = cHDLS_MUF_CASH_INTSC;
	}
	public double getCHDLS_MUF_CRDT_LIFE_AM() {
		return CHDLS_MUF_CRDT_LIFE_AM;
	}
	public void setCHDLS_MUF_CRDT_LIFE_AM(double cHDLS_MUF_CRDT_LIFE_AM) {
		CHDLS_MUF_CRDT_LIFE_AM = cHDLS_MUF_CRDT_LIFE_AM;
	}
	public double getCHDLS_MUF_CTD_ANNL_CHRG_AM() {
		return CHDLS_MUF_CTD_ANNL_CHRG_AM;
	}
	public void setCHDLS_MUF_CTD_ANNL_CHRG_AM(double cHDLS_MUF_CTD_ANNL_CHRG_AM) {
		CHDLS_MUF_CTD_ANNL_CHRG_AM = cHDLS_MUF_CTD_ANNL_CHRG_AM;
	}
	public double getCHDLS_MUF_CTD_ITEM_CHRG_AM() {
		return CHDLS_MUF_CTD_ITEM_CHRG_AM;
	}
	public void setCHDLS_MUF_CTD_ITEM_CHRG_AM(double cHDLS_MUF_CTD_ITEM_CHRG_AM) {
		CHDLS_MUF_CTD_ITEM_CHRG_AM = cHDLS_MUF_CTD_ITEM_CHRG_AM;
	}
	public double getCHDLS_MUF_CTD_MSCL_CHRG_AM() {
		return CHDLS_MUF_CTD_MSCL_CHRG_AM;
	}
	public void setCHDLS_MUF_CTD_MSCL_CHRG_AM(double cHDLS_MUF_CTD_MSCL_CHRG_AM) {
		CHDLS_MUF_CTD_MSCL_CHRG_AM = cHDLS_MUF_CTD_MSCL_CHRG_AM;
	}
	public double getCHDLS_MUF_CTD_SRCH_AM() {
		return CHDLS_MUF_CTD_SRCH_AM;
	}
	public void setCHDLS_MUF_CTD_SRCH_AM(double cHDLS_MUF_CTD_SRCH_AM) {
		CHDLS_MUF_CTD_SRCH_AM = cHDLS_MUF_CTD_SRCH_AM;
	}
	public double getCHDLS_MUF_DISPUTE() {
		return CHDLS_MUF_DISPUTE;
	}
	public void setCHDLS_MUF_DISPUTE(double cHDLS_MUF_DISPUTE) {
		CHDLS_MUF_DISPUTE = cHDLS_MUF_DISPUTE;
	}
	public double getCHDLS_MUF_LATE_CHRG_AM() {
		return CHDLS_MUF_LATE_CHRG_AM;
	}
	public void setCHDLS_MUF_LATE_CHRG_AM(double cHDLS_MUF_LATE_CHRG_AM) {
		CHDLS_MUF_LATE_CHRG_AM = cHDLS_MUF_LATE_CHRG_AM;
	}
	public double getCHDLS_MUF_MIN_FIN_CHRG_AM() {
		return CHDLS_MUF_MIN_FIN_CHRG_AM;
	}
	public void setCHDLS_MUF_MIN_FIN_CHRG_AM(double cHDLS_MUF_MIN_FIN_CHRG_AM) {
		CHDLS_MUF_MIN_FIN_CHRG_AM = cHDLS_MUF_MIN_FIN_CHRG_AM;
	}
	public double getCHDLS_MUF_MRCH_INTSC() {
		return CHDLS_MUF_MRCH_INTSC;
	}
	public void setCHDLS_MUF_MRCH_INTSC(double cHDLS_MUF_MRCH_INTSC) {
		CHDLS_MUF_MRCH_INTSC = cHDLS_MUF_MRCH_INTSC;
	}
	public double getCHDLS_MUF_OVRL_CHRG_AM() {
		return CHDLS_MUF_OVRL_CHRG_AM;
	}
	public void setCHDLS_MUF_OVRL_CHRG_AM(double cHDLS_MUF_OVRL_CHRG_AM) {
		CHDLS_MUF_OVRL_CHRG_AM = cHDLS_MUF_OVRL_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_ANNL_CHRG_AM() {
		return CHDLS_MUF_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDLS_MUF_UNPD_ANNL_CHRG_AM(double cHDLS_MUF_UNPD_ANNL_CHRG_AM) {
		CHDLS_MUF_UNPD_ANNL_CHRG_AM = cHDLS_MUF_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_CRDT_LIFE_AM() {
		return CHDLS_MUF_UNPD_CRDT_LIFE_AM;
	}
	public void setCHDLS_MUF_UNPD_CRDT_LIFE_AM(double cHDLS_MUF_UNPD_CRDT_LIFE_AM) {
		CHDLS_MUF_UNPD_CRDT_LIFE_AM = cHDLS_MUF_UNPD_CRDT_LIFE_AM;
	}
	public double getCHDLS_MUF_UNPD_ITEM_CHRG_AM() {
		return CHDLS_MUF_UNPD_ITEM_CHRG_AM;
	}
	public void setCHDLS_MUF_UNPD_ITEM_CHRG_AM(double cHDLS_MUF_UNPD_ITEM_CHRG_AM) {
		CHDLS_MUF_UNPD_ITEM_CHRG_AM = cHDLS_MUF_UNPD_ITEM_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_LATE_CHRG_AM() {
		return CHDLS_MUF_UNPD_LATE_CHRG_AM;
	}
	public void setCHDLS_MUF_UNPD_LATE_CHRG_AM(double cHDLS_MUF_UNPD_LATE_CHRG_AM) {
		CHDLS_MUF_UNPD_LATE_CHRG_AM = cHDLS_MUF_UNPD_LATE_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_MSCL_CHRG_AM() {
		return CHDLS_MUF_UNPD_MSCL_CHRG_AM;
	}
	public void setCHDLS_MUF_UNPD_MSCL_CHRG_AM(double cHDLS_MUF_UNPD_MSCL_CHRG_AM) {
		CHDLS_MUF_UNPD_MSCL_CHRG_AM = cHDLS_MUF_UNPD_MSCL_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_OVRL_CHRG_AM() {
		return CHDLS_MUF_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDLS_MUF_UNPD_OVRL_CHRG_AM(double cHDLS_MUF_UNPD_OVRL_CHRG_AM) {
		CHDLS_MUF_UNPD_OVRL_CHRG_AM = cHDLS_MUF_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDLS_MUF_UNPD_SRCH_AM() {
		return CHDLS_MUF_UNPD_SRCH_AM;
	}
	public void setCHDLS_MUF_UNPD_SRCH_AM(double cHDLS_MUF_UNPD_SRCH_AM) {
		CHDLS_MUF_UNPD_SRCH_AM = cHDLS_MUF_UNPD_SRCH_AM;
	}
	public String getCHDLS_NEXT_PRICING_STRATEGY() {
		return CHDLS_NEXT_PRICING_STRATEGY;
	}
	public void setCHDLS_NEXT_PRICING_STRATEGY(String cHDLS_NEXT_PRICING_STRATEGY) {
		CHDLS_NEXT_PRICING_STRATEGY = cHDLS_NEXT_PRICING_STRATEGY;
	}
	public String getCHDLS_NEXT_STRAT_CYCLE_FLAG() {
		return CHDLS_NEXT_STRAT_CYCLE_FLAG;
	}
	public void setCHDLS_NEXT_STRAT_CYCLE_FLAG(String cHDLS_NEXT_STRAT_CYCLE_FLAG) {
		CHDLS_NEXT_STRAT_CYCLE_FLAG = cHDLS_NEXT_STRAT_CYCLE_FLAG;
	}
	public String getCHDLS_NEXT_STRT_CIT_MTHD_ID() {
		return CHDLS_NEXT_STRT_CIT_MTHD_ID;
	}
	public void setCHDLS_NEXT_STRT_CIT_MTHD_ID(String cHDLS_NEXT_STRT_CIT_MTHD_ID) {
		CHDLS_NEXT_STRT_CIT_MTHD_ID = cHDLS_NEXT_STRT_CIT_MTHD_ID;
	}
	public int getCHDLS_NEXT_STRT_DT() {
		return CHDLS_NEXT_STRT_DT;
	}
	public void setCHDLS_NEXT_STRT_DT(int cHDLS_NEXT_STRT_DT) {
		CHDLS_NEXT_STRT_DT = cHDLS_NEXT_STRT_DT;
	}
	public String getCHDLS_NEXT_STRT_HONR_ID() {
		return CHDLS_NEXT_STRT_HONR_ID;
	}
	public void setCHDLS_NEXT_STRT_HONR_ID(String cHDLS_NEXT_STRT_HONR_ID) {
		CHDLS_NEXT_STRT_HONR_ID = cHDLS_NEXT_STRT_HONR_ID;
	}
	public String getCHDLS_NEXT_STRT_TMNG_CD() {
		return CHDLS_NEXT_STRT_TMNG_CD;
	}
	public void setCHDLS_NEXT_STRT_TMNG_CD(String cHDLS_NEXT_STRT_TMNG_CD) {
		CHDLS_NEXT_STRT_TMNG_CD = cHDLS_NEXT_STRT_TMNG_CD;
	}
	public int getCHDLS_NO_MOS_PAY_AHEAD() {
		return CHDLS_NO_MOS_PAY_AHEAD;
	}
	public void setCHDLS_NO_MOS_PAY_AHEAD(int cHDLS_NO_MOS_PAY_AHEAD) {
		CHDLS_NO_MOS_PAY_AHEAD = cHDLS_NO_MOS_PAY_AHEAD;
	}
	public String getCHDLS_NXT2_STRT_BA_CD() {
		return CHDLS_NXT2_STRT_BA_CD;
	}
	public void setCHDLS_NXT2_STRT_BA_CD(String cHDLS_NXT2_STRT_BA_CD) {
		CHDLS_NXT2_STRT_BA_CD = cHDLS_NXT2_STRT_BA_CD;
	}
	public String getCHDLS_NXT2_STRT_CIT_MTHD_ID() {
		return CHDLS_NXT2_STRT_CIT_MTHD_ID;
	}
	public void setCHDLS_NXT2_STRT_CIT_MTHD_ID(String cHDLS_NXT2_STRT_CIT_MTHD_ID) {
		CHDLS_NXT2_STRT_CIT_MTHD_ID = cHDLS_NXT2_STRT_CIT_MTHD_ID;
	}
	public int getCHDLS_NXT2_STRT_DT() {
		return CHDLS_NXT2_STRT_DT;
	}
	public void setCHDLS_NXT2_STRT_DT(int cHDLS_NXT2_STRT_DT) {
		CHDLS_NXT2_STRT_DT = cHDLS_NXT2_STRT_DT;
	}
	public String getCHDLS_NXT2_STRT_HONR_ID() {
		return CHDLS_NXT2_STRT_HONR_ID;
	}
	public void setCHDLS_NXT2_STRT_HONR_ID(String cHDLS_NXT2_STRT_HONR_ID) {
		CHDLS_NXT2_STRT_HONR_ID = cHDLS_NXT2_STRT_HONR_ID;
	}
	public String getCHDLS_NXT2_STRT_ID() {
		return CHDLS_NXT2_STRT_ID;
	}
	public void setCHDLS_NXT2_STRT_ID(String cHDLS_NXT2_STRT_ID) {
		CHDLS_NXT2_STRT_ID = cHDLS_NXT2_STRT_ID;
	}
	public String getCHDLS_NXT2_STRT_TMNG_CD() {
		return CHDLS_NXT2_STRT_TMNG_CD;
	}
	public void setCHDLS_NXT2_STRT_TMNG_CD(String cHDLS_NXT2_STRT_TMNG_CD) {
		CHDLS_NXT2_STRT_TMNG_CD = cHDLS_NXT2_STRT_TMNG_CD;
	}
	public double getCHDLS_OTHER_CHARGES_BILLED() {
		return CHDLS_OTHER_CHARGES_BILLED;
	}
	public void setCHDLS_OTHER_CHARGES_BILLED(double cHDLS_OTHER_CHARGES_BILLED) {
		CHDLS_OTHER_CHARGES_BILLED = cHDLS_OTHER_CHARGES_BILLED;
	}
	public double getCHDLS_OVERLIMIT_CHG() {
		return CHDLS_OVERLIMIT_CHG;
	}
	public void setCHDLS_OVERLIMIT_CHG(double cHDLS_OVERLIMIT_CHG) {
		CHDLS_OVERLIMIT_CHG = cHDLS_OVERLIMIT_CHG;
	}
	public double getCHDLS_OVERPAYMENT_AMT() {
		return CHDLS_OVERPAYMENT_AMT;
	}
	public void setCHDLS_OVERPAYMENT_AMT(double cHDLS_OVERPAYMENT_AMT) {
		CHDLS_OVERPAYMENT_AMT = cHDLS_OVERPAYMENT_AMT;
	}
	public double getCHDLS_PAY_AHEAD_AMT() {
		return CHDLS_PAY_AHEAD_AMT;
	}
	public void setCHDLS_PAY_AHEAD_AMT(double cHDLS_PAY_AHEAD_AMT) {
		CHDLS_PAY_AHEAD_AMT = cHDLS_PAY_AHEAD_AMT;
	}
	public int getCHDLS_PP_DELINQ_LEVEL() {
		return CHDLS_PP_DELINQ_LEVEL;
	}
	public void setCHDLS_PP_DELINQ_LEVEL(int cHDLS_PP_DELINQ_LEVEL) {
		CHDLS_PP_DELINQ_LEVEL = cHDLS_PP_DELINQ_LEVEL;
	}
	public int getCHDLS_PRCN_STRT_CT() {
		return CHDLS_PRCN_STRT_CT;
	}
	public void setCHDLS_PRCN_STRT_CT(int cHDLS_PRCN_STRT_CT) {
		CHDLS_PRCN_STRT_CT = cHDLS_PRCN_STRT_CT;
	}
	public String getCHDLS_PYFF_EXCP_18_CD() {
		return CHDLS_PYFF_EXCP_18_CD;
	}
	public void setCHDLS_PYFF_EXCP_18_CD(String cHDLS_PYFF_EXCP_18_CD) {
		CHDLS_PYFF_EXCP_18_CD = cHDLS_PYFF_EXCP_18_CD;
	}
	public double getCHDLS_REBATE_AMT() {
		return CHDLS_REBATE_AMT;
	}
	public void setCHDLS_REBATE_AMT(double cHDLS_REBATE_AMT) {
		CHDLS_REBATE_AMT = cHDLS_REBATE_AMT;
	}
	public double getCHDLS_SALE_ITEM_CHGS() {
		return CHDLS_SALE_ITEM_CHGS;
	}
	public void setCHDLS_SALE_ITEM_CHGS(double cHDLS_SALE_ITEM_CHGS) {
		CHDLS_SALE_ITEM_CHGS = cHDLS_SALE_ITEM_CHGS;
	}
	public String getCHDLS_SPEC_RATE_FLAG() {
		return CHDLS_SPEC_RATE_FLAG;
	}
	public void setCHDLS_SPEC_RATE_FLAG(String cHDLS_SPEC_RATE_FLAG) {
		CHDLS_SPEC_RATE_FLAG = cHDLS_SPEC_RATE_FLAG;
	}
	public double getCHDLS_SRCHG_AM_1() {
		return CHDLS_SRCHG_AM_1;
	}
	public void setCHDLS_SRCHG_AM_1(double cHDLS_SRCHG_AM_1) {
		CHDLS_SRCHG_AM_1 = cHDLS_SRCHG_AM_1;
	}
	public double getCHDLS_UNPAID_CASH_INTSC() {
		return CHDLS_UNPAID_CASH_INTSC;
	}
	public void setCHDLS_UNPAID_CASH_INTSC(double cHDLS_UNPAID_CASH_INTSC) {
		CHDLS_UNPAID_CASH_INTSC = cHDLS_UNPAID_CASH_INTSC;
	}
	public double getCHDLS_UNPAID_INTSC() {
		return CHDLS_UNPAID_INTSC;
	}
	public void setCHDLS_UNPAID_INTSC(double cHDLS_UNPAID_INTSC) {
		CHDLS_UNPAID_INTSC = cHDLS_UNPAID_INTSC;
	}
	public double getCHDLS_UNPD_ANNL_CHRG_AM() {
		return CHDLS_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDLS_UNPD_ANNL_CHRG_AM(double cHDLS_UNPD_ANNL_CHRG_AM) {
		CHDLS_UNPD_ANNL_CHRG_AM = cHDLS_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDLS_UNPD_CASH_ITEM_AM() {
		return CHDLS_UNPD_CASH_ITEM_AM;
	}
	public void setCHDLS_UNPD_CASH_ITEM_AM(double cHDLS_UNPD_CASH_ITEM_AM) {
		CHDLS_UNPD_CASH_ITEM_AM = cHDLS_UNPD_CASH_ITEM_AM;
	}
	public double getCHDLS_UNPD_CRDLF_PRMM_AM() {
		return CHDLS_UNPD_CRDLF_PRMM_AM;
	}
	public void setCHDLS_UNPD_CRDLF_PRMM_AM(double cHDLS_UNPD_CRDLF_PRMM_AM) {
		CHDLS_UNPD_CRDLF_PRMM_AM = cHDLS_UNPD_CRDLF_PRMM_AM;
	}
	public double getCHDLS_UNPD_LATE_CHRG_AM() {
		return CHDLS_UNPD_LATE_CHRG_AM;
	}
	public void setCHDLS_UNPD_LATE_CHRG_AM(double cHDLS_UNPD_LATE_CHRG_AM) {
		CHDLS_UNPD_LATE_CHRG_AM = cHDLS_UNPD_LATE_CHRG_AM;
	}
	public double getCHDLS_UNPD_OVRL_CHRG_AM() {
		return CHDLS_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDLS_UNPD_OVRL_CHRG_AM(double cHDLS_UNPD_OVRL_CHRG_AM) {
		CHDLS_UNPD_OVRL_CHRG_AM = cHDLS_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDLS_UNPD_SALE_ITEM_AM() {
		return CHDLS_UNPD_SALE_ITEM_AM;
	}
	public void setCHDLS_UNPD_SALE_ITEM_AM(double cHDLS_UNPD_SALE_ITEM_AM) {
		CHDLS_UNPD_SALE_ITEM_AM = cHDLS_UNPD_SALE_ITEM_AM;
	}
	public double getCHDLS_UNPD_SRCHG_AM() {
		return CHDLS_UNPD_SRCHG_AM;
	}
	public void setCHDLS_UNPD_SRCHG_AM(double cHDLS_UNPD_SRCHG_AM) {
		CHDLS_UNPD_SRCHG_AM = cHDLS_UNPD_SRCHG_AM;
	}
	public double getCHDPS_ANNUAL_CHARGES_BILLED() {
		return CHDPS_ANNUAL_CHARGES_BILLED;
	}
	public void setCHDPS_ANNUAL_CHARGES_BILLED(double cHDPS_ANNUAL_CHARGES_BILLED) {
		CHDPS_ANNUAL_CHARGES_BILLED = cHDPS_ANNUAL_CHARGES_BILLED;
	}
	public double getCHDPS_BALANCE() {
		return CHDPS_BALANCE;
	}
	public void setCHDPS_BALANCE(double cHDPS_BALANCE) {
		CHDPS_BALANCE = cHDPS_BALANCE;
	}
	public double getCHDPS_BILLED_PAY_DUE() {
		return CHDPS_BILLED_PAY_DUE;
	}
	public void setCHDPS_BILLED_PAY_DUE(double cHDPS_BILLED_PAY_DUE) {
		CHDPS_BILLED_PAY_DUE = cHDPS_BILLED_PAY_DUE;
	}
	public double getCHDPS_CASH_INT() {
		return CHDPS_CASH_INT;
	}
	public void setCHDPS_CASH_INT(double cHDPS_CASH_INT) {
		CHDPS_CASH_INT = cHDPS_CASH_INT;
	}
	public double getCHDPS_CASH_MUF() {
		return CHDPS_CASH_MUF;
	}
	public void setCHDPS_CASH_MUF(double cHDPS_CASH_MUF) {
		CHDPS_CASH_MUF = cHDPS_CASH_MUF;
	}
	public double getCHDPS_CASH_MUF_INT() {
		return CHDPS_CASH_MUF_INT;
	}
	public void setCHDPS_CASH_MUF_INT(double cHDPS_CASH_MUF_INT) {
		CHDPS_CASH_MUF_INT = cHDPS_CASH_MUF_INT;
	}
	public double getCHDPS_CR_LIFE_CHG() {
		return CHDPS_CR_LIFE_CHG;
	}
	public void setCHDPS_CR_LIFE_CHG(double cHDPS_CR_LIFE_CHG) {
		CHDPS_CR_LIFE_CHG = cHDPS_CR_LIFE_CHG;
	}
	public double getCHDPS_CYC_CASH() {
		return CHDPS_CYC_CASH;
	}
	public void setCHDPS_CYC_CASH(double cHDPS_CYC_CASH) {
		CHDPS_CYC_CASH = cHDPS_CYC_CASH;
	}
	public double getCHDPS_CYC_MRCH() {
		return CHDPS_CYC_MRCH;
	}
	public void setCHDPS_CYC_MRCH(double cHDPS_CYC_MRCH) {
		CHDPS_CYC_MRCH = cHDPS_CYC_MRCH;
	}
	public double getCHDPS_DEF_AVE() {
		return CHDPS_DEF_AVE;
	}
	public void setCHDPS_DEF_AVE(double cHDPS_DEF_AVE) {
		CHDPS_DEF_AVE = cHDPS_DEF_AVE;
	}
	public double getCHDPS_DEF_AVE_2() {
		return CHDPS_DEF_AVE_2;
	}
	public void setCHDPS_DEF_AVE_2(double cHDPS_DEF_AVE_2) {
		CHDPS_DEF_AVE_2 = cHDPS_DEF_AVE_2;
	}
	public double getCHDPS_DISPUTED_AMOUNT() {
		return CHDPS_DISPUTED_AMOUNT;
	}
	public void setCHDPS_DISPUTED_AMOUNT(double cHDPS_DISPUTED_AMOUNT) {
		CHDPS_DISPUTED_AMOUNT = cHDPS_DISPUTED_AMOUNT;
	}
	public double getCHDPS_END_CASH() {
		return CHDPS_END_CASH;
	}
	public void setCHDPS_END_CASH(double cHDPS_END_CASH) {
		CHDPS_END_CASH = cHDPS_END_CASH;
	}
	public double getCHDPS_END_MRCH_BINT() {
		return CHDPS_END_MRCH_BINT;
	}
	public void setCHDPS_END_MRCH_BINT(double cHDPS_END_MRCH_BINT) {
		CHDPS_END_MRCH_BINT = cHDPS_END_MRCH_BINT;
	}
	public double getCHDPS_END_MRCH_NBINT() {
		return CHDPS_END_MRCH_NBINT;
	}
	public void setCHDPS_END_MRCH_NBINT(double cHDPS_END_MRCH_NBINT) {
		CHDPS_END_MRCH_NBINT = cHDPS_END_MRCH_NBINT;
	}
	public double getCHDPS_FLAP_BALANCE() {
		return CHDPS_FLAP_BALANCE;
	}
	public void setCHDPS_FLAP_BALANCE(double cHDPS_FLAP_BALANCE) {
		CHDPS_FLAP_BALANCE = cHDPS_FLAP_BALANCE;
	}
	public double getCHDPS_FLAP_INT() {
		return CHDPS_FLAP_INT;
	}
	public void setCHDPS_FLAP_INT(double cHDPS_FLAP_INT) {
		CHDPS_FLAP_INT = cHDPS_FLAP_INT;
	}
	public double getCHDPS_ITEM_CHG() {
		return CHDPS_ITEM_CHG;
	}
	public void setCHDPS_ITEM_CHG(double cHDPS_ITEM_CHG) {
		CHDPS_ITEM_CHG = cHDPS_ITEM_CHG;
	}
	public double getCHDPS_LATE_CHG() {
		return CHDPS_LATE_CHG;
	}
	public void setCHDPS_LATE_CHG(double cHDPS_LATE_CHG) {
		CHDPS_LATE_CHG = cHDPS_LATE_CHG;
	}
	public double getCHDPS_MIN_CHG() {
		return CHDPS_MIN_CHG;
	}
	public void setCHDPS_MIN_CHG(double cHDPS_MIN_CHG) {
		CHDPS_MIN_CHG = cHDPS_MIN_CHG;
	}
	public double getCHDPS_MISCELLANEOUS() {
		return CHDPS_MISCELLANEOUS;
	}
	public void setCHDPS_MISCELLANEOUS(double cHDPS_MISCELLANEOUS) {
		CHDPS_MISCELLANEOUS = cHDPS_MISCELLANEOUS;
	}
	public double getCHDPS_MISC_CHGS() {
		return CHDPS_MISC_CHGS;
	}
	public void setCHDPS_MISC_CHGS(double cHDPS_MISC_CHGS) {
		CHDPS_MISC_CHGS = cHDPS_MISC_CHGS;
	}
	public double getCHDPS_MRCH_APR_RT() {
		return CHDPS_MRCH_APR_RT;
	}
	public void setCHDPS_MRCH_APR_RT(double cHDPS_MRCH_APR_RT) {
		CHDPS_MRCH_APR_RT = cHDPS_MRCH_APR_RT;
	}
	public double getCHDPS_MRCH_INT() {
		return CHDPS_MRCH_INT;
	}
	public void setCHDPS_MRCH_INT(double cHDPS_MRCH_INT) {
		CHDPS_MRCH_INT = cHDPS_MRCH_INT;
	}
	public double getCHDPS_MRCH_MUF() {
		return CHDPS_MRCH_MUF;
	}
	public void setCHDPS_MRCH_MUF(double cHDPS_MRCH_MUF) {
		CHDPS_MRCH_MUF = cHDPS_MRCH_MUF;
	}
	public double getCHDPS_MRCH_MUF_INT() {
		return CHDPS_MRCH_MUF_INT;
	}
	public void setCHDPS_MRCH_MUF_INT(double cHDPS_MRCH_MUF_INT) {
		CHDPS_MRCH_MUF_INT = cHDPS_MRCH_MUF_INT;
	}
	public double getCHDPS_MUF_CASH_INTSC() {
		return CHDPS_MUF_CASH_INTSC;
	}
	public void setCHDPS_MUF_CASH_INTSC(double cHDPS_MUF_CASH_INTSC) {
		CHDPS_MUF_CASH_INTSC = cHDPS_MUF_CASH_INTSC;
	}
	public double getCHDPS_MUF_CRDT_LIFE_AM() {
		return CHDPS_MUF_CRDT_LIFE_AM;
	}
	public void setCHDPS_MUF_CRDT_LIFE_AM(double cHDPS_MUF_CRDT_LIFE_AM) {
		CHDPS_MUF_CRDT_LIFE_AM = cHDPS_MUF_CRDT_LIFE_AM;
	}
	public double getCHDPS_MUF_CTD_ANNL_CHRG_AM() {
		return CHDPS_MUF_CTD_ANNL_CHRG_AM;
	}
	public void setCHDPS_MUF_CTD_ANNL_CHRG_AM(double cHDPS_MUF_CTD_ANNL_CHRG_AM) {
		CHDPS_MUF_CTD_ANNL_CHRG_AM = cHDPS_MUF_CTD_ANNL_CHRG_AM;
	}
	public double getCHDPS_MUF_CTD_ITEM_CHRG_AM() {
		return CHDPS_MUF_CTD_ITEM_CHRG_AM;
	}
	public void setCHDPS_MUF_CTD_ITEM_CHRG_AM(double cHDPS_MUF_CTD_ITEM_CHRG_AM) {
		CHDPS_MUF_CTD_ITEM_CHRG_AM = cHDPS_MUF_CTD_ITEM_CHRG_AM;
	}
	public double getCHDPS_MUF_CTD_MSCL_CHRG_AM() {
		return CHDPS_MUF_CTD_MSCL_CHRG_AM;
	}
	public void setCHDPS_MUF_CTD_MSCL_CHRG_AM(double cHDPS_MUF_CTD_MSCL_CHRG_AM) {
		CHDPS_MUF_CTD_MSCL_CHRG_AM = cHDPS_MUF_CTD_MSCL_CHRG_AM;
	}
	public double getCHDPS_MUF_CTD_SRCH_AM() {
		return CHDPS_MUF_CTD_SRCH_AM;
	}
	public void setCHDPS_MUF_CTD_SRCH_AM(double cHDPS_MUF_CTD_SRCH_AM) {
		CHDPS_MUF_CTD_SRCH_AM = cHDPS_MUF_CTD_SRCH_AM;
	}
	public double getCHDPS_MUF_DISPUTE() {
		return CHDPS_MUF_DISPUTE;
	}
	public void setCHDPS_MUF_DISPUTE(double cHDPS_MUF_DISPUTE) {
		CHDPS_MUF_DISPUTE = cHDPS_MUF_DISPUTE;
	}
	public double getCHDPS_MUF_LATE_CHRG_AM() {
		return CHDPS_MUF_LATE_CHRG_AM;
	}
	public void setCHDPS_MUF_LATE_CHRG_AM(double cHDPS_MUF_LATE_CHRG_AM) {
		CHDPS_MUF_LATE_CHRG_AM = cHDPS_MUF_LATE_CHRG_AM;
	}
	public double getCHDPS_MUF_MIN_FIN_CHRG_AM() {
		return CHDPS_MUF_MIN_FIN_CHRG_AM;
	}
	public void setCHDPS_MUF_MIN_FIN_CHRG_AM(double cHDPS_MUF_MIN_FIN_CHRG_AM) {
		CHDPS_MUF_MIN_FIN_CHRG_AM = cHDPS_MUF_MIN_FIN_CHRG_AM;
	}
	public double getCHDPS_MUF_MRCH_INTSC() {
		return CHDPS_MUF_MRCH_INTSC;
	}
	public void setCHDPS_MUF_MRCH_INTSC(double cHDPS_MUF_MRCH_INTSC) {
		CHDPS_MUF_MRCH_INTSC = cHDPS_MUF_MRCH_INTSC;
	}
	public double getCHDPS_MUF_OVRL_CHRG_AM() {
		return CHDPS_MUF_OVRL_CHRG_AM;
	}
	public void setCHDPS_MUF_OVRL_CHRG_AM(double cHDPS_MUF_OVRL_CHRG_AM) {
		CHDPS_MUF_OVRL_CHRG_AM = cHDPS_MUF_OVRL_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_ANNL_CHRG_AM() {
		return CHDPS_MUF_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDPS_MUF_UNPD_ANNL_CHRG_AM(double cHDPS_MUF_UNPD_ANNL_CHRG_AM) {
		CHDPS_MUF_UNPD_ANNL_CHRG_AM = cHDPS_MUF_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_CRDT_LIFE_AM() {
		return CHDPS_MUF_UNPD_CRDT_LIFE_AM;
	}
	public void setCHDPS_MUF_UNPD_CRDT_LIFE_AM(double cHDPS_MUF_UNPD_CRDT_LIFE_AM) {
		CHDPS_MUF_UNPD_CRDT_LIFE_AM = cHDPS_MUF_UNPD_CRDT_LIFE_AM;
	}
	public double getCHDPS_MUF_UNPD_ITEM_CHRG_AM() {
		return CHDPS_MUF_UNPD_ITEM_CHRG_AM;
	}
	public void setCHDPS_MUF_UNPD_ITEM_CHRG_AM(double cHDPS_MUF_UNPD_ITEM_CHRG_AM) {
		CHDPS_MUF_UNPD_ITEM_CHRG_AM = cHDPS_MUF_UNPD_ITEM_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_LATE_CHRG_AM() {
		return CHDPS_MUF_UNPD_LATE_CHRG_AM;
	}
	public void setCHDPS_MUF_UNPD_LATE_CHRG_AM(double cHDPS_MUF_UNPD_LATE_CHRG_AM) {
		CHDPS_MUF_UNPD_LATE_CHRG_AM = cHDPS_MUF_UNPD_LATE_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_MSCL_CHRG_AM() {
		return CHDPS_MUF_UNPD_MSCL_CHRG_AM;
	}
	public void setCHDPS_MUF_UNPD_MSCL_CHRG_AM(double cHDPS_MUF_UNPD_MSCL_CHRG_AM) {
		CHDPS_MUF_UNPD_MSCL_CHRG_AM = cHDPS_MUF_UNPD_MSCL_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_OVRL_CHRG_AM() {
		return CHDPS_MUF_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDPS_MUF_UNPD_OVRL_CHRG_AM(double cHDPS_MUF_UNPD_OVRL_CHRG_AM) {
		CHDPS_MUF_UNPD_OVRL_CHRG_AM = cHDPS_MUF_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDPS_MUF_UNPD_SRCH_AM() {
		return CHDPS_MUF_UNPD_SRCH_AM;
	}
	public void setCHDPS_MUF_UNPD_SRCH_AM(double cHDPS_MUF_UNPD_SRCH_AM) {
		CHDPS_MUF_UNPD_SRCH_AM = cHDPS_MUF_UNPD_SRCH_AM;
	}
	public int getCHDPS_NO_MOS_PAY_AHEAD() {
		return CHDPS_NO_MOS_PAY_AHEAD;
	}
	public void setCHDPS_NO_MOS_PAY_AHEAD(int cHDPS_NO_MOS_PAY_AHEAD) {
		CHDPS_NO_MOS_PAY_AHEAD = cHDPS_NO_MOS_PAY_AHEAD;
	}
	public double getCHDPS_OVERLIMIT_CHG() {
		return CHDPS_OVERLIMIT_CHG;
	}
	public void setCHDPS_OVERLIMIT_CHG(double cHDPS_OVERLIMIT_CHG) {
		CHDPS_OVERLIMIT_CHG = cHDPS_OVERLIMIT_CHG;
	}
	public double getCHDPS_OVERPAYMENT_AMT() {
		return CHDPS_OVERPAYMENT_AMT;
	}
	public void setCHDPS_OVERPAYMENT_AMT(double cHDPS_OVERPAYMENT_AMT) {
		CHDPS_OVERPAYMENT_AMT = cHDPS_OVERPAYMENT_AMT;
	}
	public double getCHDPS_PAY_AHEAD_AMT() {
		return CHDPS_PAY_AHEAD_AMT;
	}
	public void setCHDPS_PAY_AHEAD_AMT(double cHDPS_PAY_AHEAD_AMT) {
		CHDPS_PAY_AHEAD_AMT = cHDPS_PAY_AHEAD_AMT;
	}
	public String getCHDPS_PYFF_EXCP_18_CD() {
		return CHDPS_PYFF_EXCP_18_CD;
	}
	public void setCHDPS_PYFF_EXCP_18_CD(String cHDPS_PYFF_EXCP_18_CD) {
		CHDPS_PYFF_EXCP_18_CD = cHDPS_PYFF_EXCP_18_CD;
	}
	public double getCHDPS_SALE_ITEM_CHGS() {
		return CHDPS_SALE_ITEM_CHGS;
	}
	public void setCHDPS_SALE_ITEM_CHGS(double cHDPS_SALE_ITEM_CHGS) {
		CHDPS_SALE_ITEM_CHGS = cHDPS_SALE_ITEM_CHGS;
	}
	public double getCHDPS_SRCHG_AM_1() {
		return CHDPS_SRCHG_AM_1;
	}
	public void setCHDPS_SRCHG_AM_1(double cHDPS_SRCHG_AM_1) {
		CHDPS_SRCHG_AM_1 = cHDPS_SRCHG_AM_1;
	}
	public double getCHDPS_SRCHG_AM_2() {
		return CHDPS_SRCHG_AM_2;
	}
	public void setCHDPS_SRCHG_AM_2(double cHDPS_SRCHG_AM_2) {
		CHDPS_SRCHG_AM_2 = cHDPS_SRCHG_AM_2;
	}
	public double getCHDPS_SRCHG_AM_3() {
		return CHDPS_SRCHG_AM_3;
	}
	public void setCHDPS_SRCHG_AM_3(double cHDPS_SRCHG_AM_3) {
		CHDPS_SRCHG_AM_3 = cHDPS_SRCHG_AM_3;
	}
	public double getCHDPS_SRCHG_AM_4() {
		return CHDPS_SRCHG_AM_4;
	}
	public void setCHDPS_SRCHG_AM_4(double cHDPS_SRCHG_AM_4) {
		CHDPS_SRCHG_AM_4 = cHDPS_SRCHG_AM_4;
	}
	public double getCHDPS_SRCHG_AM_5() {
		return CHDPS_SRCHG_AM_5;
	}
	public void setCHDPS_SRCHG_AM_5(double cHDPS_SRCHG_AM_5) {
		CHDPS_SRCHG_AM_5 = cHDPS_SRCHG_AM_5;
	}
	public double getCHDPS_UNPAID_CASH_INTSC() {
		return CHDPS_UNPAID_CASH_INTSC;
	}
	public void setCHDPS_UNPAID_CASH_INTSC(double cHDPS_UNPAID_CASH_INTSC) {
		CHDPS_UNPAID_CASH_INTSC = cHDPS_UNPAID_CASH_INTSC;
	}
	public double getCHDPS_UNPAID_INTSC() {
		return CHDPS_UNPAID_INTSC;
	}
	public void setCHDPS_UNPAID_INTSC(double cHDPS_UNPAID_INTSC) {
		CHDPS_UNPAID_INTSC = cHDPS_UNPAID_INTSC;
	}
	public double getCHDPS_UNPD_ANNL_CHRG_AM() {
		return CHDPS_UNPD_ANNL_CHRG_AM;
	}
	public void setCHDPS_UNPD_ANNL_CHRG_AM(double cHDPS_UNPD_ANNL_CHRG_AM) {
		CHDPS_UNPD_ANNL_CHRG_AM = cHDPS_UNPD_ANNL_CHRG_AM;
	}
	public double getCHDPS_UNPD_CASH_ITEM_AM() {
		return CHDPS_UNPD_CASH_ITEM_AM;
	}
	public void setCHDPS_UNPD_CASH_ITEM_AM(double cHDPS_UNPD_CASH_ITEM_AM) {
		CHDPS_UNPD_CASH_ITEM_AM = cHDPS_UNPD_CASH_ITEM_AM;
	}
	public double getCHDPS_UNPD_CRDLF_PRMM_AM() {
		return CHDPS_UNPD_CRDLF_PRMM_AM;
	}
	public void setCHDPS_UNPD_CRDLF_PRMM_AM(double cHDPS_UNPD_CRDLF_PRMM_AM) {
		CHDPS_UNPD_CRDLF_PRMM_AM = cHDPS_UNPD_CRDLF_PRMM_AM;
	}
	public double getCHDPS_UNPD_LATE_CHRG_AM() {
		return CHDPS_UNPD_LATE_CHRG_AM;
	}
	public void setCHDPS_UNPD_LATE_CHRG_AM(double cHDPS_UNPD_LATE_CHRG_AM) {
		CHDPS_UNPD_LATE_CHRG_AM = cHDPS_UNPD_LATE_CHRG_AM;
	}
	public double getCHDPS_UNPD_OVRL_CHRG_AM() {
		return CHDPS_UNPD_OVRL_CHRG_AM;
	}
	public void setCHDPS_UNPD_OVRL_CHRG_AM(double cHDPS_UNPD_OVRL_CHRG_AM) {
		CHDPS_UNPD_OVRL_CHRG_AM = cHDPS_UNPD_OVRL_CHRG_AM;
	}
	public double getCHDPS_UNPD_SALE_ITEM_AM() {
		return CHDPS_UNPD_SALE_ITEM_AM;
	}
	public void setCHDPS_UNPD_SALE_ITEM_AM(double cHDPS_UNPD_SALE_ITEM_AM) {
		CHDPS_UNPD_SALE_ITEM_AM = cHDPS_UNPD_SALE_ITEM_AM;
	}
	public double getCHDPS_UNPD_SRCHG_AM() {
		return CHDPS_UNPD_SRCHG_AM;
	}
	public void setCHDPS_UNPD_SRCHG_AM(double cHDPS_UNPD_SRCHG_AM) {
		CHDPS_UNPD_SRCHG_AM = cHDPS_UNPD_SRCHG_AM;
	}
	public double getCHDTAP_BINT() {
		return CHDTAP_BINT;
	}
	public void setCHDTAP_BINT(double cHDTAP_BINT) {
		CHDTAP_BINT = cHDTAP_BINT;
	}
	public double getCHDTAP_CASH() {
		return CHDTAP_CASH;
	}
	public void setCHDTAP_CASH(double cHDTAP_CASH) {
		CHDTAP_CASH = cHDTAP_CASH;
	}
	public double getCHDTAP_CYC_CASH() {
		return CHDTAP_CYC_CASH;
	}
	public void setCHDTAP_CYC_CASH(double cHDTAP_CYC_CASH) {
		CHDTAP_CYC_CASH = cHDTAP_CYC_CASH;
	}
	public double getCHDTAP_CYC_MRCH() {
		return CHDTAP_CYC_MRCH;
	}
	public void setCHDTAP_CYC_MRCH(double cHDTAP_CYC_MRCH) {
		CHDTAP_CYC_MRCH = cHDTAP_CYC_MRCH;
	}
	public double getCHDTAP_NBINT() {
		return CHDTAP_NBINT;
	}
	public void setCHDTAP_NBINT(double cHDTAP_NBINT) {
		CHDTAP_NBINT = cHDTAP_NBINT;
	}
	public double getCHD_1STY_MXFE_ALLW_AM() {
		return CHD_1STY_MXFE_ALLW_AM;
	}
	public void setCHD_1STY_MXFE_ALLW_AM(double cHD_1STY_MXFE_ALLW_AM) {
		CHD_1STY_MXFE_ALLW_AM = cHD_1STY_MXFE_ALLW_AM;
	}
	public int getCHD_90_DAY_FLAG() {
		return CHD_90_DAY_FLAG;
	}
	public void setCHD_90_DAY_FLAG(int cHD_90_DAY_FLAG) {
		CHD_90_DAY_FLAG = cHD_90_DAY_FLAG;
	}
	public String getCHD_ACCT_TRANSFER() {
		return CHD_ACCT_TRANSFER;
	}
	public void setCHD_ACCT_TRANSFER(String cHD_ACCT_TRANSFER) {
		CHD_ACCT_TRANSFER = cHD_ACCT_TRANSFER;
	}
	public int getCHD_ACCT_TRANSFER_DATE() {
		return CHD_ACCT_TRANSFER_DATE;
	}
	public void setCHD_ACCT_TRANSFER_DATE(int cHD_ACCT_TRANSFER_DATE) {
		CHD_ACCT_TRANSFER_DATE = cHD_ACCT_TRANSFER_DATE;
	}
	public String getCHD_ACCT_TRANSFER_FLAG() {
		return CHD_ACCT_TRANSFER_FLAG;
	}
	public void setCHD_ACCT_TRANSFER_FLAG(String cHD_ACCT_TRANSFER_FLAG) {
		CHD_ACCT_TRANSFER_FLAG = cHD_ACCT_TRANSFER_FLAG;
	}
	public String getCHD_ACS_AUTH_OVRR_STRT_ID() {
		return CHD_ACS_AUTH_OVRR_STRT_ID;
	}
	public void setCHD_ACS_AUTH_OVRR_STRT_ID(String cHD_ACS_AUTH_OVRR_STRT_ID) {
		CHD_ACS_AUTH_OVRR_STRT_ID = cHD_ACS_AUTH_OVRR_STRT_ID;
	}
	public int getCHD_ACS_CLNT_ID() {
		return CHD_ACS_CLNT_ID;
	}
	public void setCHD_ACS_CLNT_ID(int cHD_ACS_CLNT_ID) {
		CHD_ACS_CLNT_ID = cHD_ACS_CLNT_ID;
	}
	public int getCHD_ACS_CURR_PORT() {
		return CHD_ACS_CURR_PORT;
	}
	public void setCHD_ACS_CURR_PORT(int cHD_ACS_CURR_PORT) {
		CHD_ACS_CURR_PORT = cHD_ACS_CURR_PORT;
	}
	public int getCHD_ACS_OVERRIDE_PORT() {
		return CHD_ACS_OVERRIDE_PORT;
	}
	public void setCHD_ACS_OVERRIDE_PORT(int cHD_ACS_OVERRIDE_PORT) {
		CHD_ACS_OVERRIDE_PORT = cHD_ACS_OVERRIDE_PORT;
	}
	public String getCHD_ACS_RNDM_DGT() {
		return CHD_ACS_RNDM_DGT;
	}
	public void setCHD_ACS_RNDM_DGT(String cHD_ACS_RNDM_DGT) {
		CHD_ACS_RNDM_DGT = cHD_ACS_RNDM_DGT;
	}
	public int getCHD_ACTV_DSPT_CT() {
		return CHD_ACTV_DSPT_CT;
	}
	public void setCHD_ACTV_DSPT_CT(int cHD_ACTV_DSPT_CT) {
		CHD_ACTV_DSPT_CT = cHD_ACTV_DSPT_CT;
	}
	public int getCHD_ADJ_EXPIRATION_DATE() {
		return CHD_ADJ_EXPIRATION_DATE;
	}
	public void setCHD_ADJ_EXPIRATION_DATE(int cHD_ADJ_EXPIRATION_DATE) {
		CHD_ADJ_EXPIRATION_DATE = cHD_ADJ_EXPIRATION_DATE;
	}
	public int getCHD_AFK_ENTITY() {
		return CHD_AFK_ENTITY;
	}
	public void setCHD_AFK_ENTITY(int cHD_AFK_ENTITY) {
		CHD_AFK_ENTITY = cHD_AFK_ENTITY;
	}
	public int getCHD_AGENT_BANK() {
		return CHD_AGENT_BANK;
	}
	public void setCHD_AGENT_BANK(int cHD_AGENT_BANK) {
		CHD_AGENT_BANK = cHD_AGENT_BANK;
	}
	public String getCHD_ALTERNATE_LANGUAGE_FLAG() {
		return CHD_ALTERNATE_LANGUAGE_FLAG;
	}
	public void setCHD_ALTERNATE_LANGUAGE_FLAG(String cHD_ALTERNATE_LANGUAGE_FLAG) {
		CHD_ALTERNATE_LANGUAGE_FLAG = cHD_ALTERNATE_LANGUAGE_FLAG;
	}
	public String getCHD_ALTR_STMT_FRMT_CD() {
		return CHD_ALTR_STMT_FRMT_CD;
	}
	public void setCHD_ALTR_STMT_FRMT_CD(String cHD_ALTR_STMT_FRMT_CD) {
		CHD_ALTR_STMT_FRMT_CD = cHD_ALTR_STMT_FRMT_CD;
	}
	public String getCHD_ALWY_REFR_CD() {
		return CHD_ALWY_REFR_CD;
	}
	public void setCHD_ALWY_REFR_CD(String cHD_ALWY_REFR_CD) {
		CHD_ALWY_REFR_CD = cHD_ALWY_REFR_CD;
	}
	public double getCHD_AMT_LAST_PAYMENT() {
		return CHD_AMT_LAST_PAYMENT;
	}
	public void setCHD_AMT_LAST_PAYMENT(double cHD_AMT_LAST_PAYMENT) {
		CHD_AMT_LAST_PAYMENT = cHD_AMT_LAST_PAYMENT;
	}
	public double getCHD_ANNL_CHRG_BLLD_LAST_AM() {
		return CHD_ANNL_CHRG_BLLD_LAST_AM;
	}
	public void setCHD_ANNL_CHRG_BLLD_LAST_AM(double cHD_ANNL_CHRG_BLLD_LAST_AM) {
		CHD_ANNL_CHRG_BLLD_LAST_AM = cHD_ANNL_CHRG_BLLD_LAST_AM;
	}
	public int getCHD_ANNL_CHRG_BLLD_LAST_DT() {
		return CHD_ANNL_CHRG_BLLD_LAST_DT;
	}
	public void setCHD_ANNL_CHRG_BLLD_LAST_DT(int cHD_ANNL_CHRG_BLLD_LAST_DT) {
		CHD_ANNL_CHRG_BLLD_LAST_DT = cHD_ANNL_CHRG_BLLD_LAST_DT;
	}
	public String getCHD_ANNUAL_CHARGE_FLAG() {
		return CHD_ANNUAL_CHARGE_FLAG;
	}
	public void setCHD_ANNUAL_CHARGE_FLAG(String cHD_ANNUAL_CHARGE_FLAG) {
		CHD_ANNUAL_CHARGE_FLAG = cHD_ANNUAL_CHARGE_FLAG;
	}
	public int getCHD_ANNUAL_CHG_DATE() {
		return CHD_ANNUAL_CHG_DATE;
	}
	public void setCHD_ANNUAL_CHG_DATE(int cHD_ANNUAL_CHG_DATE) {
		CHD_ANNUAL_CHG_DATE = cHD_ANNUAL_CHG_DATE;
	}
	public double getCHD_ANN_RATE_CASH() {
		return CHD_ANN_RATE_CASH;
	}
	public void setCHD_ANN_RATE_CASH(double cHD_ANN_RATE_CASH) {
		CHD_ANN_RATE_CASH = cHD_ANN_RATE_CASH;
	}
	public double getCHD_ANN_RATE_CASH_MAX() {
		return CHD_ANN_RATE_CASH_MAX;
	}
	public void setCHD_ANN_RATE_CASH_MAX(double cHD_ANN_RATE_CASH_MAX) {
		CHD_ANN_RATE_CASH_MAX = cHD_ANN_RATE_CASH_MAX;
	}
	public double getCHD_ANN_RATE_CASH_MIN() {
		return CHD_ANN_RATE_CASH_MIN;
	}
	public void setCHD_ANN_RATE_CASH_MIN(double cHD_ANN_RATE_CASH_MIN) {
		CHD_ANN_RATE_CASH_MIN = cHD_ANN_RATE_CASH_MIN;
	}
	public double getCHD_ANN_RATE_MRCH() {
		return CHD_ANN_RATE_MRCH;
	}
	public void setCHD_ANN_RATE_MRCH(double cHD_ANN_RATE_MRCH) {
		CHD_ANN_RATE_MRCH = cHD_ANN_RATE_MRCH;
	}
	public double getCHD_ANN_RATE_MRCH_MAX() {
		return CHD_ANN_RATE_MRCH_MAX;
	}
	public void setCHD_ANN_RATE_MRCH_MAX(double cHD_ANN_RATE_MRCH_MAX) {
		CHD_ANN_RATE_MRCH_MAX = cHD_ANN_RATE_MRCH_MAX;
	}
	public double getCHD_ANN_RATE_MRCH_MIN() {
		return CHD_ANN_RATE_MRCH_MIN;
	}
	public void setCHD_ANN_RATE_MRCH_MIN(double cHD_ANN_RATE_MRCH_MIN) {
		CHD_ANN_RATE_MRCH_MIN = cHD_ANN_RATE_MRCH_MIN;
	}
	public int getCHD_APPLICATION_SCORE() {
		return CHD_APPLICATION_SCORE;
	}
	public void setCHD_APPLICATION_SCORE(int cHD_APPLICATION_SCORE) {
		CHD_APPLICATION_SCORE = cHD_APPLICATION_SCORE;
	}
	public int getCHD_AT_AUTH_AGAINST_NEW() {
		return CHD_AT_AUTH_AGAINST_NEW;
	}
	public void setCHD_AT_AUTH_AGAINST_NEW(int cHD_AT_AUTH_AGAINST_NEW) {
		CHD_AT_AUTH_AGAINST_NEW = cHD_AT_AUTH_AGAINST_NEW;
	}
	public String getCHD_AUTH_FLAG() {
		return CHD_AUTH_FLAG;
	}
	public void setCHD_AUTH_FLAG(String cHD_AUTH_FLAG) {
		CHD_AUTH_FLAG = cHD_AUTH_FLAG;
	}
	public int getCHD_AUTH_TOTAL_AMT() {
		return CHD_AUTH_TOTAL_AMT;
	}
	public void setCHD_AUTH_TOTAL_AMT(int cHD_AUTH_TOTAL_AMT) {
		CHD_AUTH_TOTAL_AMT = cHD_AUTH_TOTAL_AMT;
	}
	public String getCHD_AUTOPAY_SKIP_FLAG() {
		return CHD_AUTOPAY_SKIP_FLAG;
	}
	public void setCHD_AUTOPAY_SKIP_FLAG(String cHD_AUTOPAY_SKIP_FLAG) {
		CHD_AUTOPAY_SKIP_FLAG = cHD_AUTOPAY_SKIP_FLAG;
	}
	public double getCHD_AVLB_CRDT_AMT() {
		return CHD_AVLB_CRDT_AMT;
	}
	public void setCHD_AVLB_CRDT_AMT(double cHD_AVLB_CRDT_AMT) {
		CHD_AVLB_CRDT_AMT = cHD_AVLB_CRDT_AMT;
	}
	public String getCHD_BASIC_ACTIVE() {
		return CHD_BASIC_ACTIVE;
	}
	public void setCHD_BASIC_ACTIVE(String cHD_BASIC_ACTIVE) {
		CHD_BASIC_ACTIVE = cHD_BASIC_ACTIVE;
	}
	public int getCHD_BEHAVIOR_SCORE() {
		return CHD_BEHAVIOR_SCORE;
	}
	public void setCHD_BEHAVIOR_SCORE(int cHD_BEHAVIOR_SCORE) {
		CHD_BEHAVIOR_SCORE = cHD_BEHAVIOR_SCORE;
	}
	public int getCHD_BHVR_SCOR_DT() {
		return CHD_BHVR_SCOR_DT;
	}
	public void setCHD_BHVR_SCOR_DT(int cHD_BHVR_SCOR_DT) {
		CHD_BHVR_SCOR_DT = cHD_BHVR_SCOR_DT;
	}
	public int getCHD_BHVR_SCOR_PRTF_ID() {
		return CHD_BHVR_SCOR_PRTF_ID;
	}
	public void setCHD_BHVR_SCOR_PRTF_ID(int cHD_BHVR_SCOR_PRTF_ID) {
		CHD_BHVR_SCOR_PRTF_ID = cHD_BHVR_SCOR_PRTF_ID;
	}
	public String getCHD_BONUS_STRATEGY() {
		return CHD_BONUS_STRATEGY;
	}
	public void setCHD_BONUS_STRATEGY(String cHD_BONUS_STRATEGY) {
		CHD_BONUS_STRATEGY = cHD_BONUS_STRATEGY;
	}
	public int getCHD_BS_REASON_CODE_1() {
		return CHD_BS_REASON_CODE_1;
	}
	public void setCHD_BS_REASON_CODE_1(int cHD_BS_REASON_CODE_1) {
		CHD_BS_REASON_CODE_1 = cHD_BS_REASON_CODE_1;
	}
	public int getCHD_BS_REASON_CODE_2() {
		return CHD_BS_REASON_CODE_2;
	}
	public void setCHD_BS_REASON_CODE_2(int cHD_BS_REASON_CODE_2) {
		CHD_BS_REASON_CODE_2 = cHD_BS_REASON_CODE_2;
	}
	public int getCHD_BS_REASON_CODE_3() {
		return CHD_BS_REASON_CODE_3;
	}
	public void setCHD_BS_REASON_CODE_3(int cHD_BS_REASON_CODE_3) {
		CHD_BS_REASON_CODE_3 = cHD_BS_REASON_CODE_3;
	}
	public int getCHD_BS_REASON_CODE_4() {
		return CHD_BS_REASON_CODE_4;
	}
	public void setCHD_BS_REASON_CODE_4(int cHD_BS_REASON_CODE_4) {
		CHD_BS_REASON_CODE_4 = cHD_BS_REASON_CODE_4;
	}
	public String getCHD_CACS_COLLECTOR() {
		return CHD_CACS_COLLECTOR;
	}
	public void setCHD_CACS_COLLECTOR(String cHD_CACS_COLLECTOR) {
		CHD_CACS_COLLECTOR = cHD_CACS_COLLECTOR;
	}
	public String getCHD_CACS_REASON() {
		return CHD_CACS_REASON;
	}
	public void setCHD_CACS_REASON(String cHD_CACS_REASON) {
		CHD_CACS_REASON = cHD_CACS_REASON;
	}
	public String getCHD_CACS_USER_ROUTING() {
		return CHD_CACS_USER_ROUTING;
	}
	public void setCHD_CACS_USER_ROUTING(String cHD_CACS_USER_ROUTING) {
		CHD_CACS_USER_ROUTING = cHD_CACS_USER_ROUTING;
	}
	public double getCHD_CAINT_CTD_AMT() {
		return CHD_CAINT_CTD_AMT;
	}
	public void setCHD_CAINT_CTD_AMT(double cHD_CAINT_CTD_AMT) {
		CHD_CAINT_CTD_AMT = cHD_CAINT_CTD_AMT;
	}
	public double getCHD_CAINT_LS_AMT() {
		return CHD_CAINT_LS_AMT;
	}
	public void setCHD_CAINT_LS_AMT(double cHD_CAINT_LS_AMT) {
		CHD_CAINT_LS_AMT = cHD_CAINT_LS_AMT;
	}
	public int getCHD_CASH_CRDT_LINE_AM() {
		return CHD_CASH_CRDT_LINE_AM;
	}
	public void setCHD_CASH_CRDT_LINE_AM(int cHD_CASH_CRDT_LINE_AM) {
		CHD_CASH_CRDT_LINE_AM = cHD_CASH_CRDT_LINE_AM;
	}
	public int getCHD_CASH_CREDIT_LINE_CHG_DT() {
		return CHD_CASH_CREDIT_LINE_CHG_DT;
	}
	public void setCHD_CASH_CREDIT_LINE_CHG_DT(int cHD_CASH_CREDIT_LINE_CHG_DT) {
		CHD_CASH_CREDIT_LINE_CHG_DT = cHD_CASH_CREDIT_LINE_CHG_DT;
	}
	public int getCHD_CASH_LINE_REVW_DT() {
		return CHD_CASH_LINE_REVW_DT;
	}
	public void setCHD_CASH_LINE_REVW_DT(int cHD_CASH_LINE_REVW_DT) {
		CHD_CASH_LINE_REVW_DT = cHD_CASH_LINE_REVW_DT;
	}
	public String getCHD_CB_ATTR1() {
		return CHD_CB_ATTR1;
	}
	public void setCHD_CB_ATTR1(String cHD_CB_ATTR1) {
		CHD_CB_ATTR1 = cHD_CB_ATTR1;
	}
	public String getCHD_CB_ATTR2() {
		return CHD_CB_ATTR2;
	}
	public void setCHD_CB_ATTR2(String cHD_CB_ATTR2) {
		CHD_CB_ATTR2 = cHD_CB_ATTR2;
	}
	public String getCHD_CB_ATTR3() {
		return CHD_CB_ATTR3;
	}
	public void setCHD_CB_ATTR3(String cHD_CB_ATTR3) {
		CHD_CB_ATTR3 = cHD_CB_ATTR3;
	}
	public String getCHD_CB_CODE() {
		return CHD_CB_CODE;
	}
	public void setCHD_CB_CODE(String cHD_CB_CODE) {
		CHD_CB_CODE = cHD_CB_CODE;
	}
	public String getCHD_CB_ID() {
		return CHD_CB_ID;
	}
	public void setCHD_CB_ID(String cHD_CB_ID) {
		CHD_CB_ID = cHD_CB_ID;
	}
	public String getCHD_CB_REASON1() {
		return CHD_CB_REASON1;
	}
	public void setCHD_CB_REASON1(String cHD_CB_REASON1) {
		CHD_CB_REASON1 = cHD_CB_REASON1;
	}
	public String getCHD_CB_REASON2() {
		return CHD_CB_REASON2;
	}
	public void setCHD_CB_REASON2(String cHD_CB_REASON2) {
		CHD_CB_REASON2 = cHD_CB_REASON2;
	}
	public String getCHD_CB_REASON3() {
		return CHD_CB_REASON3;
	}
	public void setCHD_CB_REASON3(String cHD_CB_REASON3) {
		CHD_CB_REASON3 = cHD_CB_REASON3;
	}
	public String getCHD_CB_REASON4() {
		return CHD_CB_REASON4;
	}
	public void setCHD_CB_REASON4(String cHD_CB_REASON4) {
		CHD_CB_REASON4 = cHD_CB_REASON4;
	}
	public int getCHD_CB_SCORE() {
		return CHD_CB_SCORE;
	}
	public void setCHD_CB_SCORE(int cHD_CB_SCORE) {
		CHD_CB_SCORE = cHD_CB_SCORE;
	}
	public int getCHD_CB_SCORE_DATE() {
		return CHD_CB_SCORE_DATE;
	}
	public void setCHD_CB_SCORE_DATE(int cHD_CB_SCORE_DATE) {
		CHD_CB_SCORE_DATE = cHD_CB_SCORE_DATE;
	}
	public String getCHD_CHARGE_DDA_CODE() {
		return CHD_CHARGE_DDA_CODE;
	}
	public void setCHD_CHARGE_DDA_CODE(String cHD_CHARGE_DDA_CODE) {
		CHD_CHARGE_DDA_CODE = cHD_CHARGE_DDA_CODE;
	}
	public String getCHD_CHECK_ORD_SPEC_FLAG() {
		return CHD_CHECK_ORD_SPEC_FLAG;
	}
	public void setCHD_CHECK_ORD_SPEC_FLAG(String cHD_CHECK_ORD_SPEC_FLAG) {
		CHD_CHECK_ORD_SPEC_FLAG = cHD_CHECK_ORD_SPEC_FLAG;
	}
	public int getCHD_CHGMEOFF_TOMORROW() {
		return CHD_CHGMEOFF_TOMORROW;
	}
	public void setCHD_CHGMEOFF_TOMORROW(int cHD_CHGMEOFF_TOMORROW) {
		CHD_CHGMEOFF_TOMORROW = cHD_CHGMEOFF_TOMORROW;
	}
	public int getCHD_CHGOFF_INDIC() {
		return CHD_CHGOFF_INDIC;
	}
	public void setCHD_CHGOFF_INDIC(int cHD_CHGOFF_INDIC) {
		CHD_CHGOFF_INDIC = cHD_CHGOFF_INDIC;
	}
	public String getCHD_CIMS_PRODUCT_CODE() {
		return CHD_CIMS_PRODUCT_CODE;
	}
	public void setCHD_CIMS_PRODUCT_CODE(String cHD_CIMS_PRODUCT_CODE) {
		CHD_CIMS_PRODUCT_CODE = cHD_CIMS_PRODUCT_CODE;
	}
	public int getCHD_CIT_TOTL_CT() {
		return CHD_CIT_TOTL_CT;
	}
	public void setCHD_CIT_TOTL_CT(int cHD_CIT_TOTL_CT) {
		CHD_CIT_TOTL_CT = cHD_CIT_TOTL_CT;
	}
	public String getCHD_CLIENT_NUMBER() {
		return CHD_CLIENT_NUMBER;
	}
	public void setCHD_CLIENT_NUMBER(String cHD_CLIENT_NUMBER) {
		CHD_CLIENT_NUMBER = cHD_CLIENT_NUMBER;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_1() {
		return CHD_CLI_EFFECTIVE_DATE_1;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_1(int cHD_CLI_EFFECTIVE_DATE_1) {
		CHD_CLI_EFFECTIVE_DATE_1 = cHD_CLI_EFFECTIVE_DATE_1;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_2() {
		return CHD_CLI_EFFECTIVE_DATE_2;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_2(int cHD_CLI_EFFECTIVE_DATE_2) {
		CHD_CLI_EFFECTIVE_DATE_2 = cHD_CLI_EFFECTIVE_DATE_2;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_3() {
		return CHD_CLI_EFFECTIVE_DATE_3;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_3(int cHD_CLI_EFFECTIVE_DATE_3) {
		CHD_CLI_EFFECTIVE_DATE_3 = cHD_CLI_EFFECTIVE_DATE_3;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_4() {
		return CHD_CLI_EFFECTIVE_DATE_4;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_4(int cHD_CLI_EFFECTIVE_DATE_4) {
		CHD_CLI_EFFECTIVE_DATE_4 = cHD_CLI_EFFECTIVE_DATE_4;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_5() {
		return CHD_CLI_EFFECTIVE_DATE_5;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_5(int cHD_CLI_EFFECTIVE_DATE_5) {
		CHD_CLI_EFFECTIVE_DATE_5 = cHD_CLI_EFFECTIVE_DATE_5;
	}
	public int getCHD_CLI_EFFECTIVE_DATE_6() {
		return CHD_CLI_EFFECTIVE_DATE_6;
	}
	public void setCHD_CLI_EFFECTIVE_DATE_6(int cHD_CLI_EFFECTIVE_DATE_6) {
		CHD_CLI_EFFECTIVE_DATE_6 = cHD_CLI_EFFECTIVE_DATE_6;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_1() {
		return CHD_CLI_FREE_CYCLES_REMAIN_1;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_1(int cHD_CLI_FREE_CYCLES_REMAIN_1) {
		CHD_CLI_FREE_CYCLES_REMAIN_1 = cHD_CLI_FREE_CYCLES_REMAIN_1;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_2() {
		return CHD_CLI_FREE_CYCLES_REMAIN_2;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_2(int cHD_CLI_FREE_CYCLES_REMAIN_2) {
		CHD_CLI_FREE_CYCLES_REMAIN_2 = cHD_CLI_FREE_CYCLES_REMAIN_2;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_3() {
		return CHD_CLI_FREE_CYCLES_REMAIN_3;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_3(int cHD_CLI_FREE_CYCLES_REMAIN_3) {
		CHD_CLI_FREE_CYCLES_REMAIN_3 = cHD_CLI_FREE_CYCLES_REMAIN_3;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_4() {
		return CHD_CLI_FREE_CYCLES_REMAIN_4;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_4(int cHD_CLI_FREE_CYCLES_REMAIN_4) {
		CHD_CLI_FREE_CYCLES_REMAIN_4 = cHD_CLI_FREE_CYCLES_REMAIN_4;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_5() {
		return CHD_CLI_FREE_CYCLES_REMAIN_5;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_5(int cHD_CLI_FREE_CYCLES_REMAIN_5) {
		CHD_CLI_FREE_CYCLES_REMAIN_5 = cHD_CLI_FREE_CYCLES_REMAIN_5;
	}
	public int getCHD_CLI_FREE_CYCLES_REMAIN_6() {
		return CHD_CLI_FREE_CYCLES_REMAIN_6;
	}
	public void setCHD_CLI_FREE_CYCLES_REMAIN_6(int cHD_CLI_FREE_CYCLES_REMAIN_6) {
		CHD_CLI_FREE_CYCLES_REMAIN_6 = cHD_CLI_FREE_CYCLES_REMAIN_6;
	}
	public String getCHD_CLI_PRODUCT_CODE_1() {
		return CHD_CLI_PRODUCT_CODE_1;
	}
	public void setCHD_CLI_PRODUCT_CODE_1(String cHD_CLI_PRODUCT_CODE_1) {
		CHD_CLI_PRODUCT_CODE_1 = cHD_CLI_PRODUCT_CODE_1;
	}
	public String getCHD_CLI_PRODUCT_CODE_2() {
		return CHD_CLI_PRODUCT_CODE_2;
	}
	public void setCHD_CLI_PRODUCT_CODE_2(String cHD_CLI_PRODUCT_CODE_2) {
		CHD_CLI_PRODUCT_CODE_2 = cHD_CLI_PRODUCT_CODE_2;
	}
	public String getCHD_CLI_PRODUCT_CODE_3() {
		return CHD_CLI_PRODUCT_CODE_3;
	}
	public void setCHD_CLI_PRODUCT_CODE_3(String cHD_CLI_PRODUCT_CODE_3) {
		CHD_CLI_PRODUCT_CODE_3 = cHD_CLI_PRODUCT_CODE_3;
	}
	public String getCHD_CLI_PRODUCT_CODE_4() {
		return CHD_CLI_PRODUCT_CODE_4;
	}
	public void setCHD_CLI_PRODUCT_CODE_4(String cHD_CLI_PRODUCT_CODE_4) {
		CHD_CLI_PRODUCT_CODE_4 = cHD_CLI_PRODUCT_CODE_4;
	}
	public String getCHD_CLI_PRODUCT_CODE_5() {
		return CHD_CLI_PRODUCT_CODE_5;
	}
	public void setCHD_CLI_PRODUCT_CODE_5(String cHD_CLI_PRODUCT_CODE_5) {
		CHD_CLI_PRODUCT_CODE_5 = cHD_CLI_PRODUCT_CODE_5;
	}
	public String getCHD_CLI_PRODUCT_CODE_6() {
		return CHD_CLI_PRODUCT_CODE_6;
	}
	public void setCHD_CLI_PRODUCT_CODE_6(String cHD_CLI_PRODUCT_CODE_6) {
		CHD_CLI_PRODUCT_CODE_6 = cHD_CLI_PRODUCT_CODE_6;
	}
	public String getCHD_CLI_RATE_STATE_1() {
		return CHD_CLI_RATE_STATE_1;
	}
	public void setCHD_CLI_RATE_STATE_1(String cHD_CLI_RATE_STATE_1) {
		CHD_CLI_RATE_STATE_1 = cHD_CLI_RATE_STATE_1;
	}
	public String getCHD_CLI_RATE_STATE_2() {
		return CHD_CLI_RATE_STATE_2;
	}
	public void setCHD_CLI_RATE_STATE_2(String cHD_CLI_RATE_STATE_2) {
		CHD_CLI_RATE_STATE_2 = cHD_CLI_RATE_STATE_2;
	}
	public String getCHD_CLI_RATE_STATE_3() {
		return CHD_CLI_RATE_STATE_3;
	}
	public void setCHD_CLI_RATE_STATE_3(String cHD_CLI_RATE_STATE_3) {
		CHD_CLI_RATE_STATE_3 = cHD_CLI_RATE_STATE_3;
	}
	public String getCHD_CLI_RATE_STATE_4() {
		return CHD_CLI_RATE_STATE_4;
	}
	public void setCHD_CLI_RATE_STATE_4(String cHD_CLI_RATE_STATE_4) {
		CHD_CLI_RATE_STATE_4 = cHD_CLI_RATE_STATE_4;
	}
	public String getCHD_CLI_RATE_STATE_5() {
		return CHD_CLI_RATE_STATE_5;
	}
	public void setCHD_CLI_RATE_STATE_5(String cHD_CLI_RATE_STATE_5) {
		CHD_CLI_RATE_STATE_5 = cHD_CLI_RATE_STATE_5;
	}
	public String getCHD_CLI_RATE_STATE_6() {
		return CHD_CLI_RATE_STATE_6;
	}
	public void setCHD_CLI_RATE_STATE_6(String cHD_CLI_RATE_STATE_6) {
		CHD_CLI_RATE_STATE_6 = cHD_CLI_RATE_STATE_6;
	}
	public String getCHD_CLI_STATUS_CODE_1() {
		return CHD_CLI_STATUS_CODE_1;
	}
	public void setCHD_CLI_STATUS_CODE_1(String cHD_CLI_STATUS_CODE_1) {
		CHD_CLI_STATUS_CODE_1 = cHD_CLI_STATUS_CODE_1;
	}
	public String getCHD_CLI_STATUS_CODE_2() {
		return CHD_CLI_STATUS_CODE_2;
	}
	public void setCHD_CLI_STATUS_CODE_2(String cHD_CLI_STATUS_CODE_2) {
		CHD_CLI_STATUS_CODE_2 = cHD_CLI_STATUS_CODE_2;
	}
	public String getCHD_CLI_STATUS_CODE_3() {
		return CHD_CLI_STATUS_CODE_3;
	}
	public void setCHD_CLI_STATUS_CODE_3(String cHD_CLI_STATUS_CODE_3) {
		CHD_CLI_STATUS_CODE_3 = cHD_CLI_STATUS_CODE_3;
	}
	public String getCHD_CLI_STATUS_CODE_4() {
		return CHD_CLI_STATUS_CODE_4;
	}
	public void setCHD_CLI_STATUS_CODE_4(String cHD_CLI_STATUS_CODE_4) {
		CHD_CLI_STATUS_CODE_4 = cHD_CLI_STATUS_CODE_4;
	}
	public String getCHD_CLI_STATUS_CODE_5() {
		return CHD_CLI_STATUS_CODE_5;
	}
	public void setCHD_CLI_STATUS_CODE_5(String cHD_CLI_STATUS_CODE_5) {
		CHD_CLI_STATUS_CODE_5 = cHD_CLI_STATUS_CODE_5;
	}
	public String getCHD_CLI_STATUS_CODE_6() {
		return CHD_CLI_STATUS_CODE_6;
	}
	public void setCHD_CLI_STATUS_CODE_6(String cHD_CLI_STATUS_CODE_6) {
		CHD_CLI_STATUS_CODE_6 = cHD_CLI_STATUS_CODE_6;
	}
	public String getCHD_CMPN_ID() {
		return CHD_CMPN_ID;
	}
	public void setCHD_CMPN_ID(String cHD_CMPN_ID) {
		CHD_CMPN_ID = cHD_CMPN_ID;
	}
	public int getCHD_CNSM_ACCT_CLSD_DT() {
		return CHD_CNSM_ACCT_CLSD_DT;
	}
	public void setCHD_CNSM_ACCT_CLSD_DT(int cHD_CNSM_ACCT_CLSD_DT) {
		CHD_CNSM_ACCT_CLSD_DT = cHD_CNSM_ACCT_CLSD_DT;
	}
	public int getCHD_COLLECTION_CODE() {
		return CHD_COLLECTION_CODE;
	}
	public void setCHD_COLLECTION_CODE(int cHD_COLLECTION_CODE) {
		CHD_COLLECTION_CODE = cHD_COLLECTION_CODE;
	}
	public int getCHD_COLL_PROC_FLAG() {
		return CHD_COLL_PROC_FLAG;
	}
	public void setCHD_COLL_PROC_FLAG(int cHD_COLL_PROC_FLAG) {
		CHD_COLL_PROC_FLAG = cHD_COLL_PROC_FLAG;
	}
	public String getCHD_CORRESPOND_FLAG() {
		return CHD_CORRESPOND_FLAG;
	}
	public void setCHD_CORRESPOND_FLAG(String cHD_CORRESPOND_FLAG) {
		CHD_CORRESPOND_FLAG = cHD_CORRESPOND_FLAG;
	}
	public String getCHD_COV_STRATEGY_ID() {
		return CHD_COV_STRATEGY_ID;
	}
	public void setCHD_COV_STRATEGY_ID(String cHD_COV_STRATEGY_ID) {
		CHD_COV_STRATEGY_ID = cHD_COV_STRATEGY_ID;
	}
	public String getCHD_CRBR_CNSM_INFR_CD() {
		return CHD_CRBR_CNSM_INFR_CD;
	}
	public void setCHD_CRBR_CNSM_INFR_CD(String cHD_CRBR_CNSM_INFR_CD) {
		CHD_CRBR_CNSM_INFR_CD = cHD_CRBR_CNSM_INFR_CD;
	}
	public double getCHD_CRDINT_AMT() {
		return CHD_CRDINT_AMT;
	}
	public void setCHD_CRDINT_AMT(double cHD_CRDINT_AMT) {
		CHD_CRDINT_AMT = cHD_CRDINT_AMT;
	}
	public String getCHD_CRBR_LAST_RPRT_ID() {
		return CHD_CRBR_LAST_RPRT_ID;
	}
	public void setCHD_CRBR_LAST_RPRT_ID(String cHD_CRBR_LAST_RPRT_ID) {
		CHD_CRBR_LAST_RPRT_ID = cHD_CRBR_LAST_RPRT_ID;
	}
	public int getCHD_CRDT_LINE_CHNG_DT() {
		return CHD_CRDT_LINE_CHNG_DT;
	}
	public void setCHD_CRDT_LINE_CHNG_DT(int cHD_CRDT_LINE_CHNG_DT) {
		CHD_CRDT_LINE_CHNG_DT = cHD_CRDT_LINE_CHNG_DT;
	}
	public String getCHD_CRD_BUR_FLAG_2() {
		return CHD_CRD_BUR_FLAG_2;
	}
	public void setCHD_CRD_BUR_FLAG_2(String cHD_CRD_BUR_FLAG_2) {
		CHD_CRD_BUR_FLAG_2 = cHD_CRD_BUR_FLAG_2;
	}
	public int getCHD_CREDBAL_START_DATE() {
		return CHD_CREDBAL_START_DATE;
	}
	public void setCHD_CREDBAL_START_DATE(int cHD_CREDBAL_START_DATE) {
		CHD_CREDBAL_START_DATE = cHD_CREDBAL_START_DATE;
	}
	public String getCHD_CREDIT_BUREAU_FLAG() {
		return CHD_CREDIT_BUREAU_FLAG;
	}
	public void setCHD_CREDIT_BUREAU_FLAG(String cHD_CREDIT_BUREAU_FLAG) {
		CHD_CREDIT_BUREAU_FLAG = cHD_CREDIT_BUREAU_FLAG;
	}
	public int getCHD_CREDIT_LIFE_FLAG_N() {
		return CHD_CREDIT_LIFE_FLAG_N;
	}
	public void setCHD_CREDIT_LIFE_FLAG_N(int cHD_CREDIT_LIFE_FLAG_N) {
		CHD_CREDIT_LIFE_FLAG_N = cHD_CREDIT_LIFE_FLAG_N;
	}
	public int getCHD_CREDIT_LINE() {
		return CHD_CREDIT_LINE;
	}
	public void setCHD_CREDIT_LINE(int cHD_CREDIT_LINE) {
		CHD_CREDIT_LINE = cHD_CREDIT_LINE;
	}
	public String getCHD_CREDIT_SCORE() {
		return CHD_CREDIT_SCORE;
	}
	public void setCHD_CREDIT_SCORE(String cHD_CREDIT_SCORE) {
		CHD_CREDIT_SCORE = cHD_CREDIT_SCORE;
	}
	public String getCHD_CRLIFE_ORIG_STATE() {
		return CHD_CRLIFE_ORIG_STATE;
	}
	public void setCHD_CRLIFE_ORIG_STATE(String cHD_CRLIFE_ORIG_STATE) {
		CHD_CRLIFE_ORIG_STATE = cHD_CRLIFE_ORIG_STATE;
	}
	public int getCHD_CRLINE_CHANGE_AMT() {
		return CHD_CRLINE_CHANGE_AMT;
	}
	public void setCHD_CRLINE_CHANGE_AMT(int cHD_CRLINE_CHANGE_AMT) {
		CHD_CRLINE_CHANGE_AMT = cHD_CRLINE_CHANGE_AMT;
	}
	public int getCHD_CROSS_REFERENCE_ACCT_NO() {
		return CHD_CROSS_REFERENCE_ACCT_NO;
	}
	public void setCHD_CROSS_REFERENCE_ACCT_NO(int cHD_CROSS_REFERENCE_ACCT_NO) {
		CHD_CROSS_REFERENCE_ACCT_NO = cHD_CROSS_REFERENCE_ACCT_NO;
	}
	public double getCHD_CRRN_ANNL_CASH_RT() {
		return CHD_CRRN_ANNL_CASH_RT;
	}
	public void setCHD_CRRN_ANNL_CASH_RT(double cHD_CRRN_ANNL_CASH_RT) {
		CHD_CRRN_ANNL_CASH_RT = cHD_CRRN_ANNL_CASH_RT;
	}
	public double getCHD_CRRN_ANNL_MRCH_RT() {
		return CHD_CRRN_ANNL_MRCH_RT;
	}
	public void setCHD_CRRN_ANNL_MRCH_RT(double cHD_CRRN_ANNL_MRCH_RT) {
		CHD_CRRN_ANNL_MRCH_RT = cHD_CRRN_ANNL_MRCH_RT;
	}
	public String getCHD_CR_LIFE_STATUS() {
		return CHD_CR_LIFE_STATUS;
	}
	public void setCHD_CR_LIFE_STATUS(String cHD_CR_LIFE_STATUS) {
		CHD_CR_LIFE_STATUS = cHD_CR_LIFE_STATUS;
	}
	public int getCHD_CR_LINE_DATE() {
		return CHD_CR_LINE_DATE;
	}
	public void setCHD_CR_LINE_DATE(int cHD_CR_LINE_DATE) {
		CHD_CR_LINE_DATE = cHD_CR_LINE_DATE;
	}
	public int getCHD_CR_SCORE_DATE() {
		return CHD_CR_SCORE_DATE;
	}
	public void setCHD_CR_SCORE_DATE(int cHD_CR_SCORE_DATE) {
		CHD_CR_SCORE_DATE = cHD_CR_SCORE_DATE;
	}
	public double getCHD_CTD_AMT_CASH() {
		return CHD_CTD_AMT_CASH;
	}
	public void setCHD_CTD_AMT_CASH(double cHD_CTD_AMT_CASH) {
		CHD_CTD_AMT_CASH = cHD_CTD_AMT_CASH;
	}
	public double getCHD_CTD_AMT_DEBITS() {
		return CHD_CTD_AMT_DEBITS;
	}
	public void setCHD_CTD_AMT_DEBITS(double cHD_CTD_AMT_DEBITS) {
		CHD_CTD_AMT_DEBITS = cHD_CTD_AMT_DEBITS;
	}
	public double getCHD_CTD_AMT_ITEM_CHG() {
		return CHD_CTD_AMT_ITEM_CHG;
	}
	public void setCHD_CTD_AMT_ITEM_CHG(double cHD_CTD_AMT_ITEM_CHG) {
		CHD_CTD_AMT_ITEM_CHG = cHD_CTD_AMT_ITEM_CHG;
	}
	public double getCHD_CTD_AMT_LATE_CHG() {
		return CHD_CTD_AMT_LATE_CHG;
	}
	public void setCHD_CTD_AMT_LATE_CHG(double cHD_CTD_AMT_LATE_CHG) {
		CHD_CTD_AMT_LATE_CHG = cHD_CTD_AMT_LATE_CHG;
	}
	public double getCHD_CTD_AMT_MISC_CHGS() {
		return CHD_CTD_AMT_MISC_CHGS;
	}
	public void setCHD_CTD_AMT_MISC_CHGS(double cHD_CTD_AMT_MISC_CHGS) {
		CHD_CTD_AMT_MISC_CHGS = cHD_CTD_AMT_MISC_CHGS;
	}
	public double getCHD_CTD_AMT_PAYMENT() {
		return CHD_CTD_AMT_PAYMENT;
	}
	public void setCHD_CTD_AMT_PAYMENT(double cHD_CTD_AMT_PAYMENT) {
		CHD_CTD_AMT_PAYMENT = cHD_CTD_AMT_PAYMENT;
	}
	public double getCHD_CTD_AMT_RETURN() {
		return CHD_CTD_AMT_RETURN;
	}
	public void setCHD_CTD_AMT_RETURN(double cHD_CTD_AMT_RETURN) {
		CHD_CTD_AMT_RETURN = cHD_CTD_AMT_RETURN;
	}
	public double getCHD_CTD_AMT_SALE() {
		return CHD_CTD_AMT_SALE;
	}
	public void setCHD_CTD_AMT_SALE(double cHD_CTD_AMT_SALE) {
		CHD_CTD_AMT_SALE = cHD_CTD_AMT_SALE;
	}
	public double getCHD_CTD_ANNUAL_CHARGE() {
		return CHD_CTD_ANNUAL_CHARGE;
	}
	public void setCHD_CTD_ANNUAL_CHARGE(double cHD_CTD_ANNUAL_CHARGE) {
		CHD_CTD_ANNUAL_CHARGE = cHD_CTD_ANNUAL_CHARGE;
	}
	public double getCHD_CTD_DEF_INT() {
		return CHD_CTD_DEF_INT;
	}
	public void setCHD_CTD_DEF_INT(double cHD_CTD_DEF_INT) {
		CHD_CTD_DEF_INT = cHD_CTD_DEF_INT;
	}
	public int getCHD_CTD_NO_CASH() {
		return CHD_CTD_NO_CASH;
	}
	public void setCHD_CTD_NO_CASH(int cHD_CTD_NO_CASH) {
		CHD_CTD_NO_CASH = cHD_CTD_NO_CASH;
	}
	public int getCHD_CTD_NO_MOS_PAY_AHEAD() {
		return CHD_CTD_NO_MOS_PAY_AHEAD;
	}
	public void setCHD_CTD_NO_MOS_PAY_AHEAD(int cHD_CTD_NO_MOS_PAY_AHEAD) {
		CHD_CTD_NO_MOS_PAY_AHEAD = cHD_CTD_NO_MOS_PAY_AHEAD;
	}
	public int getCHD_CTD_NO_PAYMENT() {
		return CHD_CTD_NO_PAYMENT;
	}
	public void setCHD_CTD_NO_PAYMENT(int cHD_CTD_NO_PAYMENT) {
		CHD_CTD_NO_PAYMENT = cHD_CTD_NO_PAYMENT;
	}
	public int getCHD_CTD_NO_RETURN() {
		return CHD_CTD_NO_RETURN;
	}
	public void setCHD_CTD_NO_RETURN(int cHD_CTD_NO_RETURN) {
		CHD_CTD_NO_RETURN = cHD_CTD_NO_RETURN;
	}
	public int getCHD_CTD_NO_SALE() {
		return CHD_CTD_NO_SALE;
	}
	public void setCHD_CTD_NO_SALE(int cHD_CTD_NO_SALE) {
		CHD_CTD_NO_SALE = cHD_CTD_NO_SALE;
	}
	public double getCHD_CTD_OVERLIMIT_CHG() {
		return CHD_CTD_OVERLIMIT_CHG;
	}
	public void setCHD_CTD_OVERLIMIT_CHG(double cHD_CTD_OVERLIMIT_CHG) {
		CHD_CTD_OVERLIMIT_CHG = cHD_CTD_OVERLIMIT_CHG;
	}
	public double getCHD_CTD_PAY_AHEAD_AMT() {
		return CHD_CTD_PAY_AHEAD_AMT;
	}
	public void setCHD_CTD_PAY_AHEAD_AMT(double cHD_CTD_PAY_AHEAD_AMT) {
		CHD_CTD_PAY_AHEAD_AMT = cHD_CTD_PAY_AHEAD_AMT;
	}
	public int getCHD_CTD_REVERSALS_CT() {
		return CHD_CTD_REVERSALS_CT;
	}
	public void setCHD_CTD_REVERSALS_CT(int cHD_CTD_REVERSALS_CT) {
		CHD_CTD_REVERSALS_CT = cHD_CTD_REVERSALS_CT;
	}
	public double getCHD_CTD_SALE_ITEM_CHGS() {
		return CHD_CTD_SALE_ITEM_CHGS;
	}
	public void setCHD_CTD_SALE_ITEM_CHGS(double cHD_CTD_SALE_ITEM_CHGS) {
		CHD_CTD_SALE_ITEM_CHGS = cHD_CTD_SALE_ITEM_CHGS;
	}
	public double getCHD_CTD_SRCHG_AM_1() {
		return CHD_CTD_SRCHG_AM_1;
	}
	public void setCHD_CTD_SRCHG_AM_1(double cHD_CTD_SRCHG_AM_1) {
		CHD_CTD_SRCHG_AM_1 = cHD_CTD_SRCHG_AM_1;
	}
	public double getCHD_CTD_SRCHG_AM_2() {
		return CHD_CTD_SRCHG_AM_2;
	}
	public void setCHD_CTD_SRCHG_AM_2(double cHD_CTD_SRCHG_AM_2) {
		CHD_CTD_SRCHG_AM_2 = cHD_CTD_SRCHG_AM_2;
	}
	public double getCHD_CTD_SRCHG_AM_3() {
		return CHD_CTD_SRCHG_AM_3;
	}
	public void setCHD_CTD_SRCHG_AM_3(double cHD_CTD_SRCHG_AM_3) {
		CHD_CTD_SRCHG_AM_3 = cHD_CTD_SRCHG_AM_3;
	}
	public double getCHD_CTD_SRCHG_AM_4() {
		return CHD_CTD_SRCHG_AM_4;
	}
	public void setCHD_CTD_SRCHG_AM_4(double cHD_CTD_SRCHG_AM_4) {
		CHD_CTD_SRCHG_AM_4 = cHD_CTD_SRCHG_AM_4;
	}
	public double getCHD_CTD_SRCHG_AM_5() {
		return CHD_CTD_SRCHG_AM_5;
	}
	public void setCHD_CTD_SRCHG_AM_5(double cHD_CTD_SRCHG_AM_5) {
		CHD_CTD_SRCHG_AM_5 = cHD_CTD_SRCHG_AM_5;
	}
	public int getCHD_CTD_TERMS_FLAG() {
		return CHD_CTD_TERMS_FLAG;
	}
	public void setCHD_CTD_TERMS_FLAG(int cHD_CTD_TERMS_FLAG) {
		CHD_CTD_TERMS_FLAG = cHD_CTD_TERMS_FLAG;
	}
	public double getCHD_CTD_UNPAID_BPD() {
		return CHD_CTD_UNPAID_BPD;
	}
	public void setCHD_CTD_UNPAID_BPD(double cHD_CTD_UNPAID_BPD) {
		CHD_CTD_UNPAID_BPD = cHD_CTD_UNPAID_BPD;
	}
	public double getCHD_CURRENT_BALANCE() {
		return CHD_CURRENT_BALANCE;
	}
	public void setCHD_CURRENT_BALANCE(double cHD_CURRENT_BALANCE) {
		CHD_CURRENT_BALANCE = cHD_CURRENT_BALANCE;
	}
	public double getCHD_CURR_OTHER_CHARGES_BILLED() {
		return CHD_CURR_OTHER_CHARGES_BILLED;
	}
	public void setCHD_CURR_OTHER_CHARGES_BILLED(double cHD_CURR_OTHER_CHARGES_BILLED) {
		CHD_CURR_OTHER_CHARGES_BILLED = cHD_CURR_OTHER_CHARGES_BILLED;
	}
	public int getCHD_CURR_PRICE_STRATEGY_DATE() {
		return CHD_CURR_PRICE_STRATEGY_DATE;
	}
	public void setCHD_CURR_PRICE_STRATEGY_DATE(int cHD_CURR_PRICE_STRATEGY_DATE) {
		CHD_CURR_PRICE_STRATEGY_DATE = cHD_CURR_PRICE_STRATEGY_DATE;
	}
	public int getCHD_CURR_PRICING_PORTFOLIO() {
		return CHD_CURR_PRICING_PORTFOLIO;
	}
	public void setCHD_CURR_PRICING_PORTFOLIO(int cHD_CURR_PRICING_PORTFOLIO) {
		CHD_CURR_PRICING_PORTFOLIO = cHD_CURR_PRICING_PORTFOLIO;
	}
	public String getCHD_CURR_PRICING_STRATEGY() {
		return CHD_CURR_PRICING_STRATEGY;
	}
	public void setCHD_CURR_PRICING_STRATEGY(String cHD_CURR_PRICING_STRATEGY) {
		CHD_CURR_PRICING_STRATEGY = cHD_CURR_PRICING_STRATEGY;
	}
	public int getCHD_CURR_STRT_ALLC_DT() {
		return CHD_CURR_STRT_ALLC_DT;
	}
	public void setCHD_CURR_STRT_ALLC_DT(int cHD_CURR_STRT_ALLC_DT) {
		CHD_CURR_STRT_ALLC_DT = cHD_CURR_STRT_ALLC_DT;
	}
	public String getCHD_CURR_STRT_CIT_MTHD_ID() {
		return CHD_CURR_STRT_CIT_MTHD_ID;
	}
	public void setCHD_CURR_STRT_CIT_MTHD_ID(String cHD_CURR_STRT_CIT_MTHD_ID) {
		CHD_CURR_STRT_CIT_MTHD_ID = cHD_CURR_STRT_CIT_MTHD_ID;
	}
	public int getCHD_CURR_STRT_EVNT_DT() {
		return CHD_CURR_STRT_EVNT_DT;
	}
	public void setCHD_CURR_STRT_EVNT_DT(int cHD_CURR_STRT_EVNT_DT) {
		CHD_CURR_STRT_EVNT_DT = cHD_CURR_STRT_EVNT_DT;
	}
	public String getCHD_CURR_STRT_TMNG_CD() {
		return CHD_CURR_STRT_TMNG_CD;
	}
	public void setCHD_CURR_STRT_TMNG_CD(String cHD_CURR_STRT_TMNG_CD) {
		CHD_CURR_STRT_TMNG_CD = cHD_CURR_STRT_TMNG_CD;
	}
	public int getCHD_CUR_LATE_PYMT_DAYS() {
		return CHD_CUR_LATE_PYMT_DAYS;
	}
	public void setCHD_CUR_LATE_PYMT_DAYS(int cHD_CUR_LATE_PYMT_DAYS) {
		CHD_CUR_LATE_PYMT_DAYS = cHD_CUR_LATE_PYMT_DAYS;
	}
	public String getCHD_CUST_FLG_1() {
		return CHD_CUST_FLG_1;
	}
	public void setCHD_CUST_FLG_1(String cHD_CUST_FLG_1) {
		CHD_CUST_FLG_1 = cHD_CUST_FLG_1;
	}
	public String getCHD_CUST_FLG_2() {
		return CHD_CUST_FLG_2;
	}
	public void setCHD_CUST_FLG_2(String cHD_CUST_FLG_2) {
		CHD_CUST_FLG_2 = cHD_CUST_FLG_2;
	}
	public String getCHD_CUST_FLG_3() {
		return CHD_CUST_FLG_3;
	}
	public void setCHD_CUST_FLG_3(String cHD_CUST_FLG_3) {
		CHD_CUST_FLG_3 = cHD_CUST_FLG_3;
	}
	public String getCHD_CUST_FLG_4() {
		return CHD_CUST_FLG_4;
	}
	public void setCHD_CUST_FLG_4(String cHD_CUST_FLG_4) {
		CHD_CUST_FLG_4 = cHD_CUST_FLG_4;
	}
	public int getCHD_CUST_SRVC_REAG_DT() {
		return CHD_CUST_SRVC_REAG_DT;
	}
	public void setCHD_CUST_SRVC_REAG_DT(int cHD_CUST_SRVC_REAG_DT) {
		CHD_CUST_SRVC_REAG_DT = cHD_CUST_SRVC_REAG_DT;
	}
	public String getCHD_CUST_XREF_ID() {
		return CHD_CUST_XREF_ID;
	}
	public void setCHD_CUST_XREF_ID(String cHD_CUST_XREF_ID) {
		CHD_CUST_XREF_ID = cHD_CUST_XREF_ID;
	}
	public int getCHD_CYCLE_CODE() {
		return CHD_CYCLE_CODE;
	}
	public void setCHD_CYCLE_CODE(int cHD_CYCLE_CODE) {
		CHD_CYCLE_CODE = cHD_CYCLE_CODE;
	}
	public int getCHD_CYCL_PRCN_PORT_ID() {
		return CHD_CYCL_PRCN_PORT_ID;
	}
	public void setCHD_CYCL_PRCN_PORT_ID(int cHD_CYCL_PRCN_PORT_ID) {
		CHD_CYCL_PRCN_PORT_ID = cHD_CYCL_PRCN_PORT_ID;
	}
	public String getCHD_CYCL_PRCN_STRT_ID() {
		return CHD_CYCL_PRCN_STRT_ID;
	}
	public void setCHD_CYCL_PRCN_STRT_ID(String cHD_CYCL_PRCN_STRT_ID) {
		CHD_CYCL_PRCN_STRT_ID = cHD_CYCL_PRCN_STRT_ID;
	}
	public int getCHD_DATE_FIRST_ACT() {
		return CHD_DATE_FIRST_ACT;
	}
	public void setCHD_DATE_FIRST_ACT(int cHD_DATE_FIRST_ACT) {
		CHD_DATE_FIRST_ACT = cHD_DATE_FIRST_ACT;
	}
	public int getCHD_DATE_IN_COLLECTION() {
		return CHD_DATE_IN_COLLECTION;
	}
	public void setCHD_DATE_IN_COLLECTION(int cHD_DATE_IN_COLLECTION) {
		CHD_DATE_IN_COLLECTION = cHD_DATE_IN_COLLECTION;
	}
	public int getCHD_DATE_LAST_ADDR_CHANGE() {
		return CHD_DATE_LAST_ADDR_CHANGE;
	}
	public void setCHD_DATE_LAST_ADDR_CHANGE(int cHD_DATE_LAST_ADDR_CHANGE) {
		CHD_DATE_LAST_ADDR_CHANGE = cHD_DATE_LAST_ADDR_CHANGE;
	}
	public int getCHD_DATE_LAST_MON_TRAN() {
		return CHD_DATE_LAST_MON_TRAN;
	}
	public void setCHD_DATE_LAST_MON_TRAN(int cHD_DATE_LAST_MON_TRAN) {
		CHD_DATE_LAST_MON_TRAN = cHD_DATE_LAST_MON_TRAN;
	}
	public int getCHD_DATE_LAST_NONMON() {
		return CHD_DATE_LAST_NONMON;
	}
	public void setCHD_DATE_LAST_NONMON(int cHD_DATE_LAST_NONMON) {
		CHD_DATE_LAST_NONMON = cHD_DATE_LAST_NONMON;
	}
	public int getCHD_DATE_LAST_PAYMENT() {
		return CHD_DATE_LAST_PAYMENT;
	}
	public void setCHD_DATE_LAST_PAYMENT(int cHD_DATE_LAST_PAYMENT) {
		CHD_DATE_LAST_PAYMENT = cHD_DATE_LAST_PAYMENT;
	}
	public int getCHD_DATE_LAST_PIN_MAILER() {
		return CHD_DATE_LAST_PIN_MAILER;
	}
	public void setCHD_DATE_LAST_PIN_MAILER(int cHD_DATE_LAST_PIN_MAILER) {
		CHD_DATE_LAST_PIN_MAILER = cHD_DATE_LAST_PIN_MAILER;
	}
	public int getCHD_DATE_LAST_PLASTIC() {
		return CHD_DATE_LAST_PLASTIC;
	}
	public void setCHD_DATE_LAST_PLASTIC(int cHD_DATE_LAST_PLASTIC) {
		CHD_DATE_LAST_PLASTIC = cHD_DATE_LAST_PLASTIC;
	}
	public int getCHD_DATE_LAST_REVIEW() {
		return CHD_DATE_LAST_REVIEW;
	}
	public void setCHD_DATE_LAST_REVIEW(int cHD_DATE_LAST_REVIEW) {
		CHD_DATE_LAST_REVIEW = cHD_DATE_LAST_REVIEW;
	}
	public int getCHD_DATE_LAST_RSNCD_CHNG() {
		return CHD_DATE_LAST_RSNCD_CHNG;
	}
	public void setCHD_DATE_LAST_RSNCD_CHNG(int cHD_DATE_LAST_RSNCD_CHNG) {
		CHD_DATE_LAST_RSNCD_CHNG = cHD_DATE_LAST_RSNCD_CHNG;
	}
	public int getCHD_DATE_LAST_SALE() {
		return CHD_DATE_LAST_SALE;
	}
	public void setCHD_DATE_LAST_SALE(int cHD_DATE_LAST_SALE) {
		CHD_DATE_LAST_SALE = cHD_DATE_LAST_SALE;
	}
	public int getCHD_DATE_LAST_STMT() {
		return CHD_DATE_LAST_STMT;
	}
	public void setCHD_DATE_LAST_STMT(int cHD_DATE_LAST_STMT) {
		CHD_DATE_LAST_STMT = cHD_DATE_LAST_STMT;
	}
	public int getCHD_DATE_LOST_STOLEN() {
		return CHD_DATE_LOST_STOLEN;
	}
	public void setCHD_DATE_LOST_STOLEN(int cHD_DATE_LOST_STOLEN) {
		CHD_DATE_LOST_STOLEN = cHD_DATE_LOST_STOLEN;
	}
	public int getCHD_DATE_NEXT_REVIEW() {
		return CHD_DATE_NEXT_REVIEW;
	}
	public void setCHD_DATE_NEXT_REVIEW(int cHD_DATE_NEXT_REVIEW) {
		CHD_DATE_NEXT_REVIEW = cHD_DATE_NEXT_REVIEW;
	}
	public int getCHD_DATE_PREV_STMT() {
		return CHD_DATE_PREV_STMT;
	}
	public void setCHD_DATE_PREV_STMT(int cHD_DATE_PREV_STMT) {
		CHD_DATE_PREV_STMT = cHD_DATE_PREV_STMT;
	}
	public int getCHD_DATE_STATUS_CHG() {
		return CHD_DATE_STATUS_CHG;
	}
	public void setCHD_DATE_STATUS_CHG(int cHD_DATE_STATUS_CHG) {
		CHD_DATE_STATUS_CHG = cHD_DATE_STATUS_CHG;
	}
	public int getCHD_DAYS_LAST_STMT() {
		return CHD_DAYS_LAST_STMT;
	}
	public void setCHD_DAYS_LAST_STMT(int cHD_DAYS_LAST_STMT) {
		CHD_DAYS_LAST_STMT = cHD_DAYS_LAST_STMT;
	}
	public int getCHD_DAYS_PREV_STMT() {
		return CHD_DAYS_PREV_STMT;
	}
	public void setCHD_DAYS_PREV_STMT(int cHD_DAYS_PREV_STMT) {
		CHD_DAYS_PREV_STMT = cHD_DAYS_PREV_STMT;
	}
	public int getCHD_DBT_RTFC_GRAC_MNTH_CT() {
		return CHD_DBT_RTFC_GRAC_MNTH_CT;
	}
	public void setCHD_DBT_RTFC_GRAC_MNTH_CT(int cHD_DBT_RTFC_GRAC_MNTH_CT) {
		CHD_DBT_RTFC_GRAC_MNTH_CT = cHD_DBT_RTFC_GRAC_MNTH_CT;
	}
	public int getCHD_DBT_RTFC_LAST_NTFC_DT() {
		return CHD_DBT_RTFC_LAST_NTFC_DT;
	}
	public void setCHD_DBT_RTFC_LAST_NTFC_DT(int cHD_DBT_RTFC_LAST_NTFC_DT) {
		CHD_DBT_RTFC_LAST_NTFC_DT = cHD_DBT_RTFC_LAST_NTFC_DT;
	}
	public int getCHD_DBT_RTFC_NTFC_MNTH_CT() {
		return CHD_DBT_RTFC_NTFC_MNTH_CT;
	}
	public void setCHD_DBT_RTFC_NTFC_MNTH_CT(int cHD_DBT_RTFC_NTFC_MNTH_CT) {
		CHD_DBT_RTFC_NTFC_MNTH_CT = cHD_DBT_RTFC_NTFC_MNTH_CT;
	}
	public String getCHD_DEBIT_ACTIVE() {
		return CHD_DEBIT_ACTIVE;
	}
	public void setCHD_DEBIT_ACTIVE(String cHD_DEBIT_ACTIVE) {
		CHD_DEBIT_ACTIVE = cHD_DEBIT_ACTIVE;
	}
	public String getCHD_DECEASED_FLAG() {
		return CHD_DECEASED_FLAG;
	}
	public void setCHD_DECEASED_FLAG(String cHD_DECEASED_FLAG) {
		CHD_DECEASED_FLAG = cHD_DECEASED_FLAG;
	}
	public int getCHD_DEFER_PAY_FLAG() {
		return CHD_DEFER_PAY_FLAG;
	}
	public void setCHD_DEFER_PAY_FLAG(int cHD_DEFER_PAY_FLAG) {
		CHD_DEFER_PAY_FLAG = cHD_DEFER_PAY_FLAG;
	}
	public String getCHD_DELETE_FLAG() {
		return CHD_DELETE_FLAG;
	}
	public void setCHD_DELETE_FLAG(String cHD_DELETE_FLAG) {
		CHD_DELETE_FLAG = cHD_DELETE_FLAG;
	}
	public double getCHD_DEL_AMT_001() {
		return CHD_DEL_AMT_001;
	}
	public void setCHD_DEL_AMT_001(double cHD_DEL_AMT_001) {
		CHD_DEL_AMT_001 = cHD_DEL_AMT_001;
	}
	public double getCHD_DEL_AMT_002() {
		return CHD_DEL_AMT_002;
	}
	public void setCHD_DEL_AMT_002(double cHD_DEL_AMT_002) {
		CHD_DEL_AMT_002 = cHD_DEL_AMT_002;
	}
	public double getCHD_DEL_AMT_003() {
		return CHD_DEL_AMT_003;
	}
	public void setCHD_DEL_AMT_003(double cHD_DEL_AMT_003) {
		CHD_DEL_AMT_003 = cHD_DEL_AMT_003;
	}
	public double getCHD_DEL_AMT_004() {
		return CHD_DEL_AMT_004;
	}
	public void setCHD_DEL_AMT_004(double cHD_DEL_AMT_004) {
		CHD_DEL_AMT_004 = cHD_DEL_AMT_004;
	}
	public double getCHD_DEL_AMT_005() {
		return CHD_DEL_AMT_005;
	}
	public void setCHD_DEL_AMT_005(double cHD_DEL_AMT_005) {
		CHD_DEL_AMT_005 = cHD_DEL_AMT_005;
	}
	public double getCHD_DEL_AMT_006() {
		return CHD_DEL_AMT_006;
	}
	public void setCHD_DEL_AMT_006(double cHD_DEL_AMT_006) {
		CHD_DEL_AMT_006 = cHD_DEL_AMT_006;
	}
	public double getCHD_DEL_AMT_007() {
		return CHD_DEL_AMT_007;
	}
	public void setCHD_DEL_AMT_007(double cHD_DEL_AMT_007) {
		CHD_DEL_AMT_007 = cHD_DEL_AMT_007;
	}
	public double getCHD_DEL_AMT_008() {
		return CHD_DEL_AMT_008;
	}
	public void setCHD_DEL_AMT_008(double cHD_DEL_AMT_008) {
		CHD_DEL_AMT_008 = cHD_DEL_AMT_008;
	}
	public double getCHD_DEL_AMT_009() {
		return CHD_DEL_AMT_009;
	}
	public void setCHD_DEL_AMT_009(double cHD_DEL_AMT_009) {
		CHD_DEL_AMT_009 = cHD_DEL_AMT_009;
	}
	public double getCHD_DEL_AMT_010() {
		return CHD_DEL_AMT_010;
	}
	public void setCHD_DEL_AMT_010(double cHD_DEL_AMT_010) {
		CHD_DEL_AMT_010 = cHD_DEL_AMT_010;
	}
	public double getCHD_DEL_AMT_011() {
		return CHD_DEL_AMT_011;
	}
	public void setCHD_DEL_AMT_011(double cHD_DEL_AMT_011) {
		CHD_DEL_AMT_011 = cHD_DEL_AMT_011;
	}
	public double getCHD_DEL_AMT_012() {
		return CHD_DEL_AMT_012;
	}
	public void setCHD_DEL_AMT_012(double cHD_DEL_AMT_012) {
		CHD_DEL_AMT_012 = cHD_DEL_AMT_012;
	}
	public double getCHD_DEL_AMT_021() {
		return CHD_DEL_AMT_021;
	}
	public void setCHD_DEL_AMT_021(double cHD_DEL_AMT_021) {
		CHD_DEL_AMT_021 = cHD_DEL_AMT_021;
	}
	public double getCHD_DEL_AMT_041() {
		return CHD_DEL_AMT_041;
	}
	public void setCHD_DEL_AMT_041(double cHD_DEL_AMT_041) {
		CHD_DEL_AMT_041 = cHD_DEL_AMT_041;
	}
	public double getCHD_DEL_AMT_121() {
		return CHD_DEL_AMT_121;
	}
	public void setCHD_DEL_AMT_121(double cHD_DEL_AMT_121) {
		CHD_DEL_AMT_121 = cHD_DEL_AMT_121;
	}
	public double getCHD_DEL_AMT_141() {
		return CHD_DEL_AMT_141;
	}
	public void setCHD_DEL_AMT_141(double cHD_DEL_AMT_141) {
		CHD_DEL_AMT_141 = cHD_DEL_AMT_141;
	}
	public double getCHD_DEL_AMT_161() {
		return CHD_DEL_AMT_161;
	}
	public void setCHD_DEL_AMT_161(double cHD_DEL_AMT_161) {
		CHD_DEL_AMT_161 = cHD_DEL_AMT_161;
	}
	public String getCHD_DEL_DEFER_FLAG() {
		return CHD_DEL_DEFER_FLAG;
	}
	public void setCHD_DEL_DEFER_FLAG(String cHD_DEL_DEFER_FLAG) {
		CHD_DEL_DEFER_FLAG = cHD_DEL_DEFER_FLAG;
	}
	public int getCHD_DEL_LS_NO_CYCLES() {
		return CHD_DEL_LS_NO_CYCLES;
	}
	public void setCHD_DEL_LS_NO_CYCLES(int cHD_DEL_LS_NO_CYCLES) {
		CHD_DEL_LS_NO_CYCLES = cHD_DEL_LS_NO_CYCLES;
	}
	public int getCHD_DEL_NMO_CONT() {
		return CHD_DEL_NMO_CONT;
	}
	public void setCHD_DEL_NMO_CONT(int cHD_DEL_NMO_CONT) {
		CHD_DEL_NMO_CONT = cHD_DEL_NMO_CONT;
	}
	public int getCHD_DEL_NO_CYCLES() {
		return CHD_DEL_NO_CYCLES;
	}
	public void setCHD_DEL_NO_CYCLES(int cHD_DEL_NO_CYCLES) {
		CHD_DEL_NO_CYCLES = cHD_DEL_NO_CYCLES;
	}
	public int getCHD_DEL_NO_DAYS() {
		return CHD_DEL_NO_DAYS;
	}
	public void setCHD_DEL_NO_DAYS(int cHD_DEL_NO_DAYS) {
		CHD_DEL_NO_DAYS = cHD_DEL_NO_DAYS;
	}
	public int getCHD_DEL_PS_NO_CYCLES() {
		return CHD_DEL_PS_NO_CYCLES;
	}
	public void setCHD_DEL_PS_NO_CYCLES(int cHD_DEL_PS_NO_CYCLES) {
		CHD_DEL_PS_NO_CYCLES = cHD_DEL_PS_NO_CYCLES;
	}
	public String getCHD_DFLT_PLAN_ID() {
		return CHD_DFLT_PLAN_ID;
	}
	public void setCHD_DFLT_PLAN_ID(String cHD_DFLT_PLAN_ID) {
		CHD_DFLT_PLAN_ID = cHD_DFLT_PLAN_ID;
	}
	public double getCHD_DISPUTE_AMOUNT() {
		return CHD_DISPUTE_AMOUNT;
	}
	public void setCHD_DISPUTE_AMOUNT(double cHD_DISPUTE_AMOUNT) {
		CHD_DISPUTE_AMOUNT = cHD_DISPUTE_AMOUNT;
	}
	public int getCHD_DISPUTE_DATE() {
		return CHD_DISPUTE_DATE;
	}
	public void setCHD_DISPUTE_DATE(int cHD_DISPUTE_DATE) {
		CHD_DISPUTE_DATE = cHD_DISPUTE_DATE;
	}
	public int getCHD_DLNQ_STRT_OVRR_DT() {
		return CHD_DLNQ_STRT_OVRR_DT;
	}
	public void setCHD_DLNQ_STRT_OVRR_DT(int cHD_DLNQ_STRT_OVRR_DT) {
		CHD_DLNQ_STRT_OVRR_DT = cHD_DLNQ_STRT_OVRR_DT;
	}
	public String getCHD_EPMT_PART_IND_ID() {
		return CHD_EPMT_PART_IND_ID;
	}
	public void setCHD_EPMT_PART_IND_ID(String cHD_EPMT_PART_IND_ID) {
		CHD_EPMT_PART_IND_ID = cHD_EPMT_PART_IND_ID;
	}
	public String getCHD_EXTERNAL_STATUS() {
		return CHD_EXTERNAL_STATUS;
	}
	public void setCHD_EXTERNAL_STATUS(String cHD_EXTERNAL_STATUS) {
		CHD_EXTERNAL_STATUS = cHD_EXTERNAL_STATUS;
	}
	public String getCHD_FDR_USE_MISC_FIELD_1() {
		return CHD_FDR_USE_MISC_FIELD_1;
	}
	public void setCHD_FDR_USE_MISC_FIELD_1(String cHD_FDR_USE_MISC_FIELD_1) {
		CHD_FDR_USE_MISC_FIELD_1 = cHD_FDR_USE_MISC_FIELD_1;
	}
	public double getCHD_FIXD_MPD_OVRR_AM_1() {
		return CHD_FIXD_MPD_OVRR_AM_1;
	}
	public void setCHD_FIXD_MPD_OVRR_AM_1(double cHD_FIXD_MPD_OVRR_AM_1) {
		CHD_FIXD_MPD_OVRR_AM_1 = cHD_FIXD_MPD_OVRR_AM_1;
	}
	public double getCHD_FIXD_MPD_OVRR_AM_2() {
		return CHD_FIXD_MPD_OVRR_AM_2;
	}
	public void setCHD_FIXD_MPD_OVRR_AM_2(double cHD_FIXD_MPD_OVRR_AM_2) {
		CHD_FIXD_MPD_OVRR_AM_2 = cHD_FIXD_MPD_OVRR_AM_2;
	}
	public double getCHD_FIXD_MPD_OVRR_AM_3() {
		return CHD_FIXD_MPD_OVRR_AM_3;
	}
	public void setCHD_FIXD_MPD_OVRR_AM_3(double cHD_FIXD_MPD_OVRR_AM_3) {
		CHD_FIXD_MPD_OVRR_AM_3 = cHD_FIXD_MPD_OVRR_AM_3;
	}
	public double getCHD_FIXD_MPD_OVRR_AM_4() {
		return CHD_FIXD_MPD_OVRR_AM_4;
	}
	public void setCHD_FIXD_MPD_OVRR_AM_4(double cHD_FIXD_MPD_OVRR_AM_4) {
		CHD_FIXD_MPD_OVRR_AM_4 = cHD_FIXD_MPD_OVRR_AM_4;
	}
	public int getCHD_FIXD_MPD_OVRR_DT_1() {
		return CHD_FIXD_MPD_OVRR_DT_1;
	}
	public void setCHD_FIXD_MPD_OVRR_DT_1(int cHD_FIXD_MPD_OVRR_DT_1) {
		CHD_FIXD_MPD_OVRR_DT_1 = cHD_FIXD_MPD_OVRR_DT_1;
	}
	public int getCHD_FIXD_MPD_OVRR_DT_2() {
		return CHD_FIXD_MPD_OVRR_DT_2;
	}
	public void setCHD_FIXD_MPD_OVRR_DT_2(int cHD_FIXD_MPD_OVRR_DT_2) {
		CHD_FIXD_MPD_OVRR_DT_2 = cHD_FIXD_MPD_OVRR_DT_2;
	}
	public int getCHD_FIXD_MPD_OVRR_DT_3() {
		return CHD_FIXD_MPD_OVRR_DT_3;
	}
	public void setCHD_FIXD_MPD_OVRR_DT_3(int cHD_FIXD_MPD_OVRR_DT_3) {
		CHD_FIXD_MPD_OVRR_DT_3 = cHD_FIXD_MPD_OVRR_DT_3;
	}
	public int getCHD_FIXD_MPD_OVRR_DT_4() {
		return CHD_FIXD_MPD_OVRR_DT_4;
	}
	public void setCHD_FIXD_MPD_OVRR_DT_4(int cHD_FIXD_MPD_OVRR_DT_4) {
		CHD_FIXD_MPD_OVRR_DT_4 = cHD_FIXD_MPD_OVRR_DT_4;
	}
	public int getCHD_FIXD_MPD_USAG_CD() {
		return CHD_FIXD_MPD_USAG_CD;
	}
	public void setCHD_FIXD_MPD_USAG_CD(int cHD_FIXD_MPD_USAG_CD) {
		CHD_FIXD_MPD_USAG_CD = cHD_FIXD_MPD_USAG_CD;
	}
	public double getCHD_FIXED_PAYMENT_AMT() {
		return CHD_FIXED_PAYMENT_AMT;
	}
	public void setCHD_FIXED_PAYMENT_AMT(double cHD_FIXED_PAYMENT_AMT) {
		CHD_FIXED_PAYMENT_AMT = cHD_FIXED_PAYMENT_AMT;
	}
	public double getCHD_FPS_PAY_1() {
		return CHD_FPS_PAY_1;
	}
	public void setCHD_FPS_PAY_1(double cHD_FPS_PAY_1) {
		CHD_FPS_PAY_1 = cHD_FPS_PAY_1;
	}
	public String getCHD_FRAUD_ASSG_STRATEGY() {
		return CHD_FRAUD_ASSG_STRATEGY;
	}
	public void setCHD_FRAUD_ASSG_STRATEGY(String cHD_FRAUD_ASSG_STRATEGY) {
		CHD_FRAUD_ASSG_STRATEGY = cHD_FRAUD_ASSG_STRATEGY;
	}
	public String getCHD_FRAUD_PORT_ID() {
		return CHD_FRAUD_PORT_ID;
	}
	public void setCHD_FRAUD_PORT_ID(String cHD_FRAUD_PORT_ID) {
		CHD_FRAUD_PORT_ID = cHD_FRAUD_PORT_ID;
	}
	public String getCHD_FRAUD_SUSPEND_STRATEGY() {
		return CHD_FRAUD_SUSPEND_STRATEGY;
	}
	public void setCHD_FRAUD_SUSPEND_STRATEGY(String cHD_FRAUD_SUSPEND_STRATEGY) {
		CHD_FRAUD_SUSPEND_STRATEGY = cHD_FRAUD_SUSPEND_STRATEGY;
	}
	public int getCHD_FRAUD_SUSP_STRATEGY_DATE() {
		return CHD_FRAUD_SUSP_STRATEGY_DATE;
	}
	public void setCHD_FRAUD_SUSP_STRATEGY_DATE(int cHD_FRAUD_SUSP_STRATEGY_DATE) {
		CHD_FRAUD_SUSP_STRATEGY_DATE = cHD_FRAUD_SUSP_STRATEGY_DATE;
	}
	public double getCHD_FULL_BAL_DSPT_AM() {
		return CHD_FULL_BAL_DSPT_AM;
	}
	public void setCHD_FULL_BAL_DSPT_AM(double cHD_FULL_BAL_DSPT_AM) {
		CHD_FULL_BAL_DSPT_AM = cHD_FULL_BAL_DSPT_AM;
	}
	public int getCHD_FULL_BAL_DSPT_BEGN_DT() {
		return CHD_FULL_BAL_DSPT_BEGN_DT;
	}
	public void setCHD_FULL_BAL_DSPT_BEGN_DT(int cHD_FULL_BAL_DSPT_BEGN_DT) {
		CHD_FULL_BAL_DSPT_BEGN_DT = cHD_FULL_BAL_DSPT_BEGN_DT;
	}
	public String getCHD_GROSS_ACTIVE() {
		return CHD_GROSS_ACTIVE;
	}
	public void setCHD_GROSS_ACTIVE(String cHD_GROSS_ACTIVE) {
		CHD_GROSS_ACTIVE = cHD_GROSS_ACTIVE;
	}
	public double getCHD_HIGH_BAL_LIFE() {
		return CHD_HIGH_BAL_LIFE;
	}
	public void setCHD_HIGH_BAL_LIFE(double cHD_HIGH_BAL_LIFE) {
		CHD_HIGH_BAL_LIFE = cHD_HIGH_BAL_LIFE;
	}
	public double getCHD_HIST_LS_BAL() {
		return CHD_HIST_LS_BAL;
	}
	public void setCHD_HIST_LS_BAL(double cHD_HIST_LS_BAL) {
		CHD_HIST_LS_BAL = cHD_HIST_LS_BAL;
	}
	public double getCHD_HIST_PS_BAL() {
		return CHD_HIST_PS_BAL;
	}
	public void setCHD_HIST_PS_BAL(double cHD_HIST_PS_BAL) {
		CHD_HIST_PS_BAL = cHD_HIST_PS_BAL;
	}
	public String getCHD_INCT_CIT_PB_CD() {
		return CHD_INCT_CIT_PB_CD;
	}
	public void setCHD_INCT_CIT_PB_CD(String cHD_INCT_CIT_PB_CD) {
		CHD_INCT_CIT_PB_CD = cHD_INCT_CIT_PB_CD;
	}
	public String getCHD_INTEREST_SWITCH() {
		return CHD_INTEREST_SWITCH;
	}
	public void setCHD_INTEREST_SWITCH(String cHD_INTEREST_SWITCH) {
		CHD_INTEREST_SWITCH = cHD_INTEREST_SWITCH;
	}
	public String getCHD_INTERNAL_STATUS() {
		return CHD_INTERNAL_STATUS;
	}
	public void setCHD_INTERNAL_STATUS(String cHD_INTERNAL_STATUS) {
		CHD_INTERNAL_STATUS = cHD_INTERNAL_STATUS;
	}
	public double getCHD_IP_CASH_RATE_ANN() {
		return CHD_IP_CASH_RATE_ANN;
	}
	public void setCHD_IP_CASH_RATE_ANN(double cHD_IP_CASH_RATE_ANN) {
		CHD_IP_CASH_RATE_ANN = cHD_IP_CASH_RATE_ANN;
	}
	public int getCHD_IP_EFF_END_DATE() {
		return CHD_IP_EFF_END_DATE;
	}
	public void setCHD_IP_EFF_END_DATE(int cHD_IP_EFF_END_DATE) {
		CHD_IP_EFF_END_DATE = cHD_IP_EFF_END_DATE;
	}
	public double getCHD_IP_MRCH_RATE_ANN() {
		return CHD_IP_MRCH_RATE_ANN;
	}
	public void setCHD_IP_MRCH_RATE_ANN(double cHD_IP_MRCH_RATE_ANN) {
		CHD_IP_MRCH_RATE_ANN = cHD_IP_MRCH_RATE_ANN;
	}
	public int getCHD_IP_PLANNED_END_DATE() {
		return CHD_IP_PLANNED_END_DATE;
	}
	public void setCHD_IP_PLANNED_END_DATE(int cHD_IP_PLANNED_END_DATE) {
		CHD_IP_PLANNED_END_DATE = cHD_IP_PLANNED_END_DATE;
	}
	public int getCHD_IP_START_DATE() {
		return CHD_IP_START_DATE;
	}
	public void setCHD_IP_START_DATE(int cHD_IP_START_DATE) {
		CHD_IP_START_DATE = cHD_IP_START_DATE;
	}
	public int getCHD_LAST_CASH_ADVANCE_DATE() {
		return CHD_LAST_CASH_ADVANCE_DATE;
	}
	public void setCHD_LAST_CASH_ADVANCE_DATE(int cHD_LAST_CASH_ADVANCE_DATE) {
		CHD_LAST_CASH_ADVANCE_DATE = cHD_LAST_CASH_ADVANCE_DATE;
	}
	public String getCHD_LAST_CASH_ADVANCE_TYPE() {
		return CHD_LAST_CASH_ADVANCE_TYPE;
	}
	public void setCHD_LAST_CASH_ADVANCE_TYPE(String cHD_LAST_CASH_ADVANCE_TYPE) {
		CHD_LAST_CASH_ADVANCE_TYPE = cHD_LAST_CASH_ADVANCE_TYPE;
	}
	public int getCHD_LAST_CIT_CHNG_DT() {
		return CHD_LAST_CIT_CHNG_DT;
	}
	public void setCHD_LAST_CIT_CHNG_DT(int cHD_LAST_CIT_CHNG_DT) {
		CHD_LAST_CIT_CHNG_DT = cHD_LAST_CIT_CHNG_DT;
	}
	public String getCHD_LAST_CRDT_BURE_IN() {
		return CHD_LAST_CRDT_BURE_IN;
	}
	public void setCHD_LAST_CRDT_BURE_IN(String cHD_LAST_CRDT_BURE_IN) {
		CHD_LAST_CRDT_BURE_IN = cHD_LAST_CRDT_BURE_IN;
	}
	public String getCHD_LAST_DFFR_STRT_ID() {
		return CHD_LAST_DFFR_STRT_ID;
	}
	public void setCHD_LAST_DFFR_STRT_ID(String cHD_LAST_DFFR_STRT_ID) {
		CHD_LAST_DFFR_STRT_ID = cHD_LAST_DFFR_STRT_ID;
	}
	public int getCHD_LAST_DSCL_DT() {
		return CHD_LAST_DSCL_DT;
	}
	public void setCHD_LAST_DSCL_DT(int cHD_LAST_DSCL_DT) {
		CHD_LAST_DSCL_DT = cHD_LAST_DSCL_DT;
	}
	public int getCHD_LAST_LTTR_DT() {
		return CHD_LAST_LTTR_DT;
	}
	public void setCHD_LAST_LTTR_DT(int cHD_LAST_LTTR_DT) {
		CHD_LAST_LTTR_DT = cHD_LAST_LTTR_DT;
	}
	public String getCHD_LAST_LTTR_ID() {
		return CHD_LAST_LTTR_ID;
	}
	public void setCHD_LAST_LTTR_ID(String cHD_LAST_LTTR_ID) {
		CHD_LAST_LTTR_ID = cHD_LAST_LTTR_ID;
	}
	public String getCHD_LAST_PLASTIC_SOURCE() {
		return CHD_LAST_PLASTIC_SOURCE;
	}
	public void setCHD_LAST_PLASTIC_SOURCE(String cHD_LAST_PLASTIC_SOURCE) {
		CHD_LAST_PLASTIC_SOURCE = cHD_LAST_PLASTIC_SOURCE;
	}
	public int getCHD_LAST_PYMT_EFFECTIVE_DATE() {
		return CHD_LAST_PYMT_EFFECTIVE_DATE;
	}
	public void setCHD_LAST_PYMT_EFFECTIVE_DATE(int cHD_LAST_PYMT_EFFECTIVE_DATE) {
		CHD_LAST_PYMT_EFFECTIVE_DATE = cHD_LAST_PYMT_EFFECTIVE_DATE;
	}
	public double getCHD_LAST_STATEMENTED_BAL() {
		return CHD_LAST_STATEMENTED_BAL;
	}
	public void setCHD_LAST_STATEMENTED_BAL(double cHD_LAST_STATEMENTED_BAL) {
		CHD_LAST_STATEMENTED_BAL = cHD_LAST_STATEMENTED_BAL;
	}
	public int getCHD_LAST_STMT_RELJUL() {
		return CHD_LAST_STMT_RELJUL;
	}
	public void setCHD_LAST_STMT_RELJUL(int cHD_LAST_STMT_RELJUL) {
		CHD_LAST_STMT_RELJUL = cHD_LAST_STMT_RELJUL;
	}
	public int getCHD_LAST_STRATEGY_CHANGE_DATE() {
		return CHD_LAST_STRATEGY_CHANGE_DATE;
	}
	public void setCHD_LAST_STRATEGY_CHANGE_DATE(int cHD_LAST_STRATEGY_CHANGE_DATE) {
		CHD_LAST_STRATEGY_CHANGE_DATE = cHD_LAST_STRATEGY_CHANGE_DATE;
	}
	public int getCHD_LAST_TRMS_CHNG_NTFC_DT() {
		return CHD_LAST_TRMS_CHNG_NTFC_DT;
	}
	public void setCHD_LAST_TRMS_CHNG_NTFC_DT(int cHD_LAST_TRMS_CHNG_NTFC_DT) {
		CHD_LAST_TRMS_CHNG_NTFC_DT = cHD_LAST_TRMS_CHNG_NTFC_DT;
	}
	public int getCHD_LATE_CHRG_RLJL_DT() {
		return CHD_LATE_CHRG_RLJL_DT;
	}
	public void setCHD_LATE_CHRG_RLJL_DT(int cHD_LATE_CHRG_RLJL_DT) {
		CHD_LATE_CHRG_RLJL_DT = cHD_LATE_CHRG_RLJL_DT;
	}
	public int getCHD_LATE_FEE_WAIVER_CT() {
		return CHD_LATE_FEE_WAIVER_CT;
	}
	public void setCHD_LATE_FEE_WAIVER_CT(int cHD_LATE_FEE_WAIVER_CT) {
		CHD_LATE_FEE_WAIVER_CT = cHD_LATE_FEE_WAIVER_CT;
	}
	public int getCHD_LFTM_NET_PRCH_AM() {
		return CHD_LFTM_NET_PRCH_AM;
	}
	public void setCHD_LFTM_NET_PRCH_AM(int cHD_LFTM_NET_PRCH_AM) {
		CHD_LFTM_NET_PRCH_AM = cHD_LFTM_NET_PRCH_AM;
	}
	public int getCHD_LIFE_SALES_ACTIVITY_CT() {
		return CHD_LIFE_SALES_ACTIVITY_CT;
	}
	public void setCHD_LIFE_SALES_ACTIVITY_CT(int cHD_LIFE_SALES_ACTIVITY_CT) {
		CHD_LIFE_SALES_ACTIVITY_CT = cHD_LIFE_SALES_ACTIVITY_CT;
	}
	public int getCHD_LIFE_1_CYCLE_DELQ_CT() {
		return CHD_LIFE_1_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_1_CYCLE_DELQ_CT(int cHD_LIFE_1_CYCLE_DELQ_CT) {
		CHD_LIFE_1_CYCLE_DELQ_CT = cHD_LIFE_1_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_2_CYCLE_DELQ_CT() {
		return CHD_LIFE_2_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_2_CYCLE_DELQ_CT(int cHD_LIFE_2_CYCLE_DELQ_CT) {
		CHD_LIFE_2_CYCLE_DELQ_CT = cHD_LIFE_2_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_3_CYCLE_DELQ_CT() {
		return CHD_LIFE_3_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_3_CYCLE_DELQ_CT(int cHD_LIFE_3_CYCLE_DELQ_CT) {
		CHD_LIFE_3_CYCLE_DELQ_CT = cHD_LIFE_3_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_4_CYCLE_DELQ_CT() {
		return CHD_LIFE_4_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_4_CYCLE_DELQ_CT(int cHD_LIFE_4_CYCLE_DELQ_CT) {
		CHD_LIFE_4_CYCLE_DELQ_CT = cHD_LIFE_4_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_5_CYCLE_DELQ_CT() {
		return CHD_LIFE_5_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_5_CYCLE_DELQ_CT(int cHD_LIFE_5_CYCLE_DELQ_CT) {
		CHD_LIFE_5_CYCLE_DELQ_CT = cHD_LIFE_5_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_6_CYCLE_DELQ_CT() {
		return CHD_LIFE_6_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_6_CYCLE_DELQ_CT(int cHD_LIFE_6_CYCLE_DELQ_CT) {
		CHD_LIFE_6_CYCLE_DELQ_CT = cHD_LIFE_6_CYCLE_DELQ_CT;
	}
	public int getCHD_LIFE_7_CYCLE_DELQ_CT() {
		return CHD_LIFE_7_CYCLE_DELQ_CT;
	}
	public void setCHD_LIFE_7_CYCLE_DELQ_CT(int cHD_LIFE_7_CYCLE_DELQ_CT) {
		CHD_LIFE_7_CYCLE_DELQ_CT = cHD_LIFE_7_CYCLE_DELQ_CT;
	}
	public double getCHD_LS_AMT_CASH_AM() {
		return CHD_LS_AMT_CASH_AM;
	}
	public void setCHD_LS_AMT_CASH_AM(double cHD_LS_AMT_CASH_AM) {
		CHD_LS_AMT_CASH_AM = cHD_LS_AMT_CASH_AM;
	}
	public double getCHD_LS_AMT_PAYMENT() {
		return CHD_LS_AMT_PAYMENT;
	}
	public void setCHD_LS_AMT_PAYMENT(double cHD_LS_AMT_PAYMENT) {
		CHD_LS_AMT_PAYMENT = cHD_LS_AMT_PAYMENT;
	}
	public double getCHD_LS_AMT_RETURN() {
		return CHD_LS_AMT_RETURN;
	}
	public void setCHD_LS_AMT_RETURN(double cHD_LS_AMT_RETURN) {
		CHD_LS_AMT_RETURN = cHD_LS_AMT_RETURN;
	}
	public double getCHD_LS_AMT_SALE_AM() {
		return CHD_LS_AMT_SALE_AM;
	}
	public void setCHD_LS_AMT_SALE_AM(double cHD_LS_AMT_SALE_AM) {
		CHD_LS_AMT_SALE_AM = cHD_LS_AMT_SALE_AM;
	}
	public double getCHD_LS_CASH_APR() {
		return CHD_LS_CASH_APR;
	}
	public void setCHD_LS_CASH_APR(double cHD_LS_CASH_APR) {
		CHD_LS_CASH_APR = cHD_LS_CASH_APR;
	}
	public double getCHD_LS_FRST_PERD_CASH_ADB_AM() {
		return CHD_LS_FRST_PERD_CASH_ADB_AM;
	}
	public void setCHD_LS_FRST_PERD_CASH_ADB_AM(double cHD_LS_FRST_PERD_CASH_ADB_AM) {
		CHD_LS_FRST_PERD_CASH_ADB_AM = cHD_LS_FRST_PERD_CASH_ADB_AM;
	}
	public double getCHD_LS_FRST_PERD_CASH_ANNL_RT() {
		return CHD_LS_FRST_PERD_CASH_ANNL_RT;
	}
	public void setCHD_LS_FRST_PERD_CASH_ANNL_RT(double cHD_LS_FRST_PERD_CASH_ANNL_RT) {
		CHD_LS_FRST_PERD_CASH_ANNL_RT = cHD_LS_FRST_PERD_CASH_ANNL_RT;
	}
	public int getCHD_LS_FRST_PERD_DAYS_CT() {
		return CHD_LS_FRST_PERD_DAYS_CT;
	}
	public void setCHD_LS_FRST_PERD_DAYS_CT(int cHD_LS_FRST_PERD_DAYS_CT) {
		CHD_LS_FRST_PERD_DAYS_CT = cHD_LS_FRST_PERD_DAYS_CT;
	}
	public double getCHD_LS_FRST_PERD_MRCH_ADB_AM() {
		return CHD_LS_FRST_PERD_MRCH_ADB_AM;
	}
	public void setCHD_LS_FRST_PERD_MRCH_ADB_AM(double cHD_LS_FRST_PERD_MRCH_ADB_AM) {
		CHD_LS_FRST_PERD_MRCH_ADB_AM = cHD_LS_FRST_PERD_MRCH_ADB_AM;
	}
	public double getCHD_LS_FRST_PERD_MRCH_ANNL_RT() {
		return CHD_LS_FRST_PERD_MRCH_ANNL_RT;
	}
	public void setCHD_LS_FRST_PERD_MRCH_ANNL_RT(double cHD_LS_FRST_PERD_MRCH_ANNL_RT) {
		CHD_LS_FRST_PERD_MRCH_ANNL_RT = cHD_LS_FRST_PERD_MRCH_ANNL_RT;
	}
	public double getCHD_LS_MRCH_APR() {
		return CHD_LS_MRCH_APR;
	}
	public void setCHD_LS_MRCH_APR(double cHD_LS_MRCH_APR) {
		CHD_LS_MRCH_APR = cHD_LS_MRCH_APR;
	}
	public int getCHD_LS_NO_CASH() {
		return CHD_LS_NO_CASH;
	}
	public void setCHD_LS_NO_CASH(int cHD_LS_NO_CASH) {
		CHD_LS_NO_CASH = cHD_LS_NO_CASH;
	}
	public int getCHD_LS_NO_PAYMENT() {
		return CHD_LS_NO_PAYMENT;
	}
	public void setCHD_LS_NO_PAYMENT(int cHD_LS_NO_PAYMENT) {
		CHD_LS_NO_PAYMENT = cHD_LS_NO_PAYMENT;
	}
	public int getCHD_LS_NO_RETURN() {
		return CHD_LS_NO_RETURN;
	}
	public void setCHD_LS_NO_RETURN(int cHD_LS_NO_RETURN) {
		CHD_LS_NO_RETURN = cHD_LS_NO_RETURN;
	}
	public int getCHD_LS_NO_SALE() {
		return CHD_LS_NO_SALE;
	}
	public void setCHD_LS_NO_SALE(int cHD_LS_NO_SALE) {
		CHD_LS_NO_SALE = cHD_LS_NO_SALE;
	}
	public String getCHD_LS_PRICING_STRATEGY() {
		return CHD_LS_PRICING_STRATEGY;
	}
	public void setCHD_LS_PRICING_STRATEGY(String cHD_LS_PRICING_STRATEGY) {
		CHD_LS_PRICING_STRATEGY = cHD_LS_PRICING_STRATEGY;
	}
	public String getCHD_LS_PYFF_EXCP_BINT_CD() {
		return CHD_LS_PYFF_EXCP_BINT_CD;
	}
	public void setCHD_LS_PYFF_EXCP_BINT_CD(String cHD_LS_PYFF_EXCP_BINT_CD) {
		CHD_LS_PYFF_EXCP_BINT_CD = cHD_LS_PYFF_EXCP_BINT_CD;
	}
	public String getCHD_LS_PYFF_EXCP_CTD_CASH_CD() {
		return CHD_LS_PYFF_EXCP_CTD_CASH_CD;
	}
	public void setCHD_LS_PYFF_EXCP_CTD_CASH_CD(String cHD_LS_PYFF_EXCP_CTD_CASH_CD) {
		CHD_LS_PYFF_EXCP_CTD_CASH_CD = cHD_LS_PYFF_EXCP_CTD_CASH_CD;
	}
	public String getCHD_LS_PYFF_EXCP_CTD_MRCH_CD() {
		return CHD_LS_PYFF_EXCP_CTD_MRCH_CD;
	}
	public void setCHD_LS_PYFF_EXCP_CTD_MRCH_CD(String cHD_LS_PYFF_EXCP_CTD_MRCH_CD) {
		CHD_LS_PYFF_EXCP_CTD_MRCH_CD = cHD_LS_PYFF_EXCP_CTD_MRCH_CD;
	}
	public String getCHD_LS_PYFF_EXCP_NBINT_CD() {
		return CHD_LS_PYFF_EXCP_NBINT_CD;
	}
	public void setCHD_LS_PYFF_EXCP_NBINT_CD(String cHD_LS_PYFF_EXCP_NBINT_CD) {
		CHD_LS_PYFF_EXCP_NBINT_CD = cHD_LS_PYFF_EXCP_NBINT_CD;
	}
	public String getCHD_LS_PYFF_EXCP_OLD_CASH_CD() {
		return CHD_LS_PYFF_EXCP_OLD_CASH_CD;
	}
	public void setCHD_LS_PYFF_EXCP_OLD_CASH_CD(String cHD_LS_PYFF_EXCP_OLD_CASH_CD) {
		CHD_LS_PYFF_EXCP_OLD_CASH_CD = cHD_LS_PYFF_EXCP_OLD_CASH_CD;
	}
	public String getCHD_LS_PYFF_EXCP_RVLV_CD_1() {
		return CHD_LS_PYFF_EXCP_RVLV_CD_1;
	}
	public void setCHD_LS_PYFF_EXCP_RVLV_CD_1(String cHD_LS_PYFF_EXCP_RVLV_CD_1) {
		CHD_LS_PYFF_EXCP_RVLV_CD_1 = cHD_LS_PYFF_EXCP_RVLV_CD_1;
	}
	public String getCHD_LS_PYFF_EXCP_RVLV_CD_2() {
		return CHD_LS_PYFF_EXCP_RVLV_CD_2;
	}
	public void setCHD_LS_PYFF_EXCP_RVLV_CD_2(String cHD_LS_PYFF_EXCP_RVLV_CD_2) {
		CHD_LS_PYFF_EXCP_RVLV_CD_2 = cHD_LS_PYFF_EXCP_RVLV_CD_2;
	}
	public String getCHD_LS_PYFF_EXCP_RVLV_CD_3() {
		return CHD_LS_PYFF_EXCP_RVLV_CD_3;
	}
	public void setCHD_LS_PYFF_EXCP_RVLV_CD_3(String cHD_LS_PYFF_EXCP_RVLV_CD_3) {
		CHD_LS_PYFF_EXCP_RVLV_CD_3 = cHD_LS_PYFF_EXCP_RVLV_CD_3;
	}
	public String getCHD_LS_PYFF_EXCP_RVLV_CD_4() {
		return CHD_LS_PYFF_EXCP_RVLV_CD_4;
	}
	public void setCHD_LS_PYFF_EXCP_RVLV_CD_4(String cHD_LS_PYFF_EXCP_RVLV_CD_4) {
		CHD_LS_PYFF_EXCP_RVLV_CD_4 = cHD_LS_PYFF_EXCP_RVLV_CD_4;
	}
	public String getCHD_LS_PYFF_EXCP_RVLV_CD_5() {
		return CHD_LS_PYFF_EXCP_RVLV_CD_5;
	}
	public void setCHD_LS_PYFF_EXCP_RVLV_CD_5(String cHD_LS_PYFF_EXCP_RVLV_CD_5) {
		CHD_LS_PYFF_EXCP_RVLV_CD_5 = cHD_LS_PYFF_EXCP_RVLV_CD_5;
	}
	public int getCHD_LS_REVERSALS_CT() {
		return CHD_LS_REVERSALS_CT;
	}
	public void setCHD_LS_REVERSALS_CT(int cHD_LS_REVERSALS_CT) {
		CHD_LS_REVERSALS_CT = cHD_LS_REVERSALS_CT;
	}
	public int getCHD_MEMBER_SINCE_DATE() {
		return CHD_MEMBER_SINCE_DATE;
	}
	public void setCHD_MEMBER_SINCE_DATE(int cHD_MEMBER_SINCE_DATE) {
		CHD_MEMBER_SINCE_DATE = cHD_MEMBER_SINCE_DATE;
	}
	public int getCHD_MID_CYC_STRT_DT() {
		return CHD_MID_CYC_STRT_DT;
	}
	public void setCHD_MID_CYC_STRT_DT(int cHD_MID_CYC_STRT_DT) {
		CHD_MID_CYC_STRT_DT = cHD_MID_CYC_STRT_DT;
	}
	public String getCHD_MID_CYC_STRT_ID() {
		return CHD_MID_CYC_STRT_ID;
	}
	public void setCHD_MID_CYC_STRT_ID(String cHD_MID_CYC_STRT_ID) {
		CHD_MID_CYC_STRT_ID = cHD_MID_CYC_STRT_ID;
	}
	public int getCHD_MIN_PMNT_DUE_END_DT() {
		return CHD_MIN_PMNT_DUE_END_DT;
	}
	public void setCHD_MIN_PMNT_DUE_END_DT(int cHD_MIN_PMNT_DUE_END_DT) {
		CHD_MIN_PMNT_DUE_END_DT = cHD_MIN_PMNT_DUE_END_DT;
	}
	public double getCHD_MIN_PMNT_DUE_RT() {
		return CHD_MIN_PMNT_DUE_RT;
	}
	public void setCHD_MIN_PMNT_DUE_RT(double cHD_MIN_PMNT_DUE_RT) {
		CHD_MIN_PMNT_DUE_RT = cHD_MIN_PMNT_DUE_RT;
	}
	public int getCHD_MIN_PMNT_DUE_STRT_DT() {
		return CHD_MIN_PMNT_DUE_STRT_DT;
	}
	public void setCHD_MIN_PMNT_DUE_STRT_DT(int cHD_MIN_PMNT_DUE_STRT_DT) {
		CHD_MIN_PMNT_DUE_STRT_DT = cHD_MIN_PMNT_DUE_STRT_DT;
	}
	public String getCHD_MISCELLANEOUS_FIELD_1() {
		return CHD_MISCELLANEOUS_FIELD_1;
	}
	public void setCHD_MISCELLANEOUS_FIELD_1(String cHD_MISCELLANEOUS_FIELD_1) {
		CHD_MISCELLANEOUS_FIELD_1 = cHD_MISCELLANEOUS_FIELD_1;
	}
	public String getCHD_MISCELLANEOUS_FIELD_2() {
		return CHD_MISCELLANEOUS_FIELD_2;
	}
	public void setCHD_MISCELLANEOUS_FIELD_2(String cHD_MISCELLANEOUS_FIELD_2) {
		CHD_MISCELLANEOUS_FIELD_2 = cHD_MISCELLANEOUS_FIELD_2;
	}
	public String getCHD_MISCELLANEOUS_FIELD_3() {
		return CHD_MISCELLANEOUS_FIELD_3;
	}
	public void setCHD_MISCELLANEOUS_FIELD_3(String cHD_MISCELLANEOUS_FIELD_3) {
		CHD_MISCELLANEOUS_FIELD_3 = cHD_MISCELLANEOUS_FIELD_3;
	}
	public String getCHD_MISCELLANEOUS_FIELD_4() {
		return CHD_MISCELLANEOUS_FIELD_4;
	}
	public void setCHD_MISCELLANEOUS_FIELD_4(String cHD_MISCELLANEOUS_FIELD_4) {
		CHD_MISCELLANEOUS_FIELD_4 = cHD_MISCELLANEOUS_FIELD_4;
	}
	public String getCHD_MISCELLANEOUS_FIELD_5() {
		return CHD_MISCELLANEOUS_FIELD_5;
	}
	public void setCHD_MISCELLANEOUS_FIELD_5(String cHD_MISCELLANEOUS_FIELD_5) {
		CHD_MISCELLANEOUS_FIELD_5 = cHD_MISCELLANEOUS_FIELD_5;
	}
	public String getCHD_MISCELLANEOUS_FIELD_6() {
		return CHD_MISCELLANEOUS_FIELD_6;
	}
	public void setCHD_MISCELLANEOUS_FIELD_6(String cHD_MISCELLANEOUS_FIELD_6) {
		CHD_MISCELLANEOUS_FIELD_6 = cHD_MISCELLANEOUS_FIELD_6;
	}
	public String getCHD_MISCELLANEOUS_FIELD_7() {
		return CHD_MISCELLANEOUS_FIELD_7;
	}
	public void setCHD_MISCELLANEOUS_FIELD_7(String cHD_MISCELLANEOUS_FIELD_7) {
		CHD_MISCELLANEOUS_FIELD_7 = cHD_MISCELLANEOUS_FIELD_7;
	}
	public String getCHD_MISCELLANEOUS_FIELD_8() {
		return CHD_MISCELLANEOUS_FIELD_8;
	}
	public void setCHD_MISCELLANEOUS_FIELD_8(String cHD_MISCELLANEOUS_FIELD_8) {
		CHD_MISCELLANEOUS_FIELD_8 = cHD_MISCELLANEOUS_FIELD_8;
	}
	public double getCHD_MISCELLANEOUS_FIELD_9() {
		return CHD_MISCELLANEOUS_FIELD_9;
	}
	public void setCHD_MISCELLANEOUS_FIELD_9(double cHD_MISCELLANEOUS_FIELD_9) {
		CHD_MISCELLANEOUS_FIELD_9 = cHD_MISCELLANEOUS_FIELD_9;
	}
	public String getCHD_MISC_FIELD_9() {
		return CHD_MISC_FIELD_9;
	}
	public void setCHD_MISC_FIELD_9(String cHD_MISC_FIELD_9) {
		CHD_MISC_FIELD_9 = cHD_MISC_FIELD_9;
	}
	public String getCHD_MISC_FIELD_10() {
		return CHD_MISC_FIELD_10;
	}
	public void setCHD_MISC_FIELD_10(String cHD_MISC_FIELD_10) {
		CHD_MISC_FIELD_10 = cHD_MISC_FIELD_10;
	}
	public String getCHD_MISC_FIELD_11_TX() {
		return CHD_MISC_FIELD_11_TX;
	}
	public void setCHD_MISC_FIELD_11_TX(String cHD_MISC_FIELD_11_TX) {
		CHD_MISC_FIELD_11_TX = cHD_MISC_FIELD_11_TX;
	}
	public String getCHD_MISC_FIELD_12_TX() {
		return CHD_MISC_FIELD_12_TX;
	}
	public void setCHD_MISC_FIELD_12_TX(String cHD_MISC_FIELD_12_TX) {
		CHD_MISC_FIELD_12_TX = cHD_MISC_FIELD_12_TX;
	}
	public String getCHD_MISC_FIELD_13_TX() {
		return CHD_MISC_FIELD_13_TX;
	}
	public void setCHD_MISC_FIELD_13_TX(String cHD_MISC_FIELD_13_TX) {
		CHD_MISC_FIELD_13_TX = cHD_MISC_FIELD_13_TX;
	}
	public String getCHD_MPD_STBL_CD() {
		return CHD_MPD_STBL_CD;
	}
	public void setCHD_MPD_STBL_CD(String cHD_MPD_STBL_CD) {
		CHD_MPD_STBL_CD = cHD_MPD_STBL_CD;
	}
	public int getCHD_MPW_APR_OVRR_USAG_CD() {
		return CHD_MPW_APR_OVRR_USAG_CD;
	}
	public void setCHD_MPW_APR_OVRR_USAG_CD(int cHD_MPW_APR_OVRR_USAG_CD) {
		CHD_MPW_APR_OVRR_USAG_CD = cHD_MPW_APR_OVRR_USAG_CD;
	}
	public int getCHD_MPW_APR_OVRR_USAG_DT() {
		return CHD_MPW_APR_OVRR_USAG_DT;
	}
	public void setCHD_MPW_APR_OVRR_USAG_DT(int cHD_MPW_APR_OVRR_USAG_DT) {
		CHD_MPW_APR_OVRR_USAG_DT = cHD_MPW_APR_OVRR_USAG_DT;
	}
	public double getCHD_MRCHINT_AMT() {
		return CHD_MRCHINT_AMT;
	}
	public void setCHD_MRCHINT_AMT(double cHD_MRCHINT_AMT) {
		CHD_MRCHINT_AMT = cHD_MRCHINT_AMT;
	}
	public double getCHD_MUF_CTD_ANNL_CHRG_AM() {
		return CHD_MUF_CTD_ANNL_CHRG_AM;
	}
	public void setCHD_MUF_CTD_ANNL_CHRG_AM(double cHD_MUF_CTD_ANNL_CHRG_AM) {
		CHD_MUF_CTD_ANNL_CHRG_AM = cHD_MUF_CTD_ANNL_CHRG_AM;
	}
	public double getCHD_MUF_CTD_ITEM_CHRG_AM() {
		return CHD_MUF_CTD_ITEM_CHRG_AM;
	}
	public void setCHD_MUF_CTD_ITEM_CHRG_AM(double cHD_MUF_CTD_ITEM_CHRG_AM) {
		CHD_MUF_CTD_ITEM_CHRG_AM = cHD_MUF_CTD_ITEM_CHRG_AM;
	}
	public double getCHD_MUF_CTD_LATE_CHRG_AM() {
		return CHD_MUF_CTD_LATE_CHRG_AM;
	}
	public void setCHD_MUF_CTD_LATE_CHRG_AM(double cHD_MUF_CTD_LATE_CHRG_AM) {
		CHD_MUF_CTD_LATE_CHRG_AM = cHD_MUF_CTD_LATE_CHRG_AM;
	}
	public double getCHD_MUF_CTD_MSCL_CHRG_AM() {
		return CHD_MUF_CTD_MSCL_CHRG_AM;
	}
	public void setCHD_MUF_CTD_MSCL_CHRG_AM(double cHD_MUF_CTD_MSCL_CHRG_AM) {
		CHD_MUF_CTD_MSCL_CHRG_AM = cHD_MUF_CTD_MSCL_CHRG_AM;
	}
	public double getCHD_MUF_CTD_OVRL_CHRG_AM() {
		return CHD_MUF_CTD_OVRL_CHRG_AM;
	}
	public void setCHD_MUF_CTD_OVRL_CHRG_AM(double cHD_MUF_CTD_OVRL_CHRG_AM) {
		CHD_MUF_CTD_OVRL_CHRG_AM = cHD_MUF_CTD_OVRL_CHRG_AM;
	}
	public double getCHD_MUF_CTD_SRCH_AM() {
		return CHD_MUF_CTD_SRCH_AM;
	}
	public void setCHD_MUF_CTD_SRCH_AM(double cHD_MUF_CTD_SRCH_AM) {
		CHD_MUF_CTD_SRCH_AM = cHD_MUF_CTD_SRCH_AM;
	}
	public String getCHD_MULTRAN_FLAG() {
		return CHD_MULTRAN_FLAG;
	}
	public void setCHD_MULTRAN_FLAG(String cHD_MULTRAN_FLAG) {
		CHD_MULTRAN_FLAG = cHD_MULTRAN_FLAG;
	}
	public String getCHD_NEWCARD_FLAG() {
		return CHD_NEWCARD_FLAG;
	}
	public void setCHD_NEWCARD_FLAG(String cHD_NEWCARD_FLAG) {
		CHD_NEWCARD_FLAG = cHD_NEWCARD_FLAG;
	}
	public int getCHD_NEW_XREF_NO_1() {
		return CHD_NEW_XREF_NO_1;
	}
	public void setCHD_NEW_XREF_NO_1(int cHD_NEW_XREF_NO_1) {
		CHD_NEW_XREF_NO_1 = cHD_NEW_XREF_NO_1;
	}
	public int getCHD_NEW_XREF_NO_2() {
		return CHD_NEW_XREF_NO_2;
	}
	public void setCHD_NEW_XREF_NO_2(int cHD_NEW_XREF_NO_2) {
		CHD_NEW_XREF_NO_2 = cHD_NEW_XREF_NO_2;
	}
	public int getCHD_NEXT_CYCL_DT() {
		return CHD_NEXT_CYCL_DT;
	}
	public void setCHD_NEXT_CYCL_DT(int cHD_NEXT_CYCL_DT) {
		CHD_NEXT_CYCL_DT = cHD_NEXT_CYCL_DT;
	}
	public int getCHD_NEXT_PRICE_STRATEGY_DATE() {
		return CHD_NEXT_PRICE_STRATEGY_DATE;
	}
	public void setCHD_NEXT_PRICE_STRATEGY_DATE(int cHD_NEXT_PRICE_STRATEGY_DATE) {
		CHD_NEXT_PRICE_STRATEGY_DATE = cHD_NEXT_PRICE_STRATEGY_DATE;
	}
	public String getCHD_NEXT_PRICING_STRATEGY() {
		return CHD_NEXT_PRICING_STRATEGY;
	}
	public void setCHD_NEXT_PRICING_STRATEGY(String cHD_NEXT_PRICING_STRATEGY) {
		CHD_NEXT_PRICING_STRATEGY = cHD_NEXT_PRICING_STRATEGY;
	}
	public String getCHD_NEXT_STRAT_CYCLE_FLAG() {
		return CHD_NEXT_STRAT_CYCLE_FLAG;
	}
	public void setCHD_NEXT_STRAT_CYCLE_FLAG(String cHD_NEXT_STRAT_CYCLE_FLAG) {
		CHD_NEXT_STRAT_CYCLE_FLAG = cHD_NEXT_STRAT_CYCLE_FLAG;
	}
	public String getCHD_NEXT_STRT_CIT_MTHD_ID() {
		return CHD_NEXT_STRT_CIT_MTHD_ID;
	}
	public void setCHD_NEXT_STRT_CIT_MTHD_ID(String cHD_NEXT_STRT_CIT_MTHD_ID) {
		CHD_NEXT_STRT_CIT_MTHD_ID = cHD_NEXT_STRT_CIT_MTHD_ID;
	}
	public int getCHD_NEXT_STRT_DT() {
		return CHD_NEXT_STRT_DT;
	}
	public void setCHD_NEXT_STRT_DT(int cHD_NEXT_STRT_DT) {
		CHD_NEXT_STRT_DT = cHD_NEXT_STRT_DT;
	}
	public int getCHD_NEXT_STRT_EVNT_DT() {
		return CHD_NEXT_STRT_EVNT_DT;
	}
	public void setCHD_NEXT_STRT_EVNT_DT(int cHD_NEXT_STRT_EVNT_DT) {
		CHD_NEXT_STRT_EVNT_DT = cHD_NEXT_STRT_EVNT_DT;
	}
	public String getCHD_NEXT_STRT_HONR_ID() {
		return CHD_NEXT_STRT_HONR_ID;
	}
	public void setCHD_NEXT_STRT_HONR_ID(String cHD_NEXT_STRT_HONR_ID) {
		CHD_NEXT_STRT_HONR_ID = cHD_NEXT_STRT_HONR_ID;
	}
	public String getCHD_NEXT_STRT_REVW_IN() {
		return CHD_NEXT_STRT_REVW_IN;
	}
	public void setCHD_NEXT_STRT_REVW_IN(String cHD_NEXT_STRT_REVW_IN) {
		CHD_NEXT_STRT_REVW_IN = cHD_NEXT_STRT_REVW_IN;
	}
	public String getCHD_NEXT_STRT_TMNG_CD() {
		return CHD_NEXT_STRT_TMNG_CD;
	}
	public void setCHD_NEXT_STRT_TMNG_CD(String cHD_NEXT_STRT_TMNG_CD) {
		CHD_NEXT_STRT_TMNG_CD = cHD_NEXT_STRT_TMNG_CD;
	}
	public int getCHD_NO_ALP_STAG_SEGS() {
		return CHD_NO_ALP_STAG_SEGS;
	}
	public void setCHD_NO_ALP_STAG_SEGS(int cHD_NO_ALP_STAG_SEGS) {
		CHD_NO_ALP_STAG_SEGS = cHD_NO_ALP_STAG_SEGS;
	}
	public int getCHD_NO_DEL_ITEMS() {
		return CHD_NO_DEL_ITEMS;
	}
	public void setCHD_NO_DEL_ITEMS(int cHD_NO_DEL_ITEMS) {
		CHD_NO_DEL_ITEMS = cHD_NO_DEL_ITEMS;
	}
	public int getCHD_NO_FLAP_SEGS() {
		return CHD_NO_FLAP_SEGS;
	}
	public void setCHD_NO_FLAP_SEGS(int cHD_NO_FLAP_SEGS) {
		CHD_NO_FLAP_SEGS = cHD_NO_FLAP_SEGS;
	}
	public int getCHD_NO_MAIL_FLAG() {
		return CHD_NO_MAIL_FLAG;
	}
	public void setCHD_NO_MAIL_FLAG(int cHD_NO_MAIL_FLAG) {
		CHD_NO_MAIL_FLAG = cHD_NO_MAIL_FLAG;
	}
	public int getCHD_NO_PLASTICS() {
		return CHD_NO_PLASTICS;
	}
	public void setCHD_NO_PLASTICS(int cHD_NO_PLASTICS) {
		CHD_NO_PLASTICS = cHD_NO_PLASTICS;
	}
	public int getCHD_NO_SLS_SYD_SEGS() {
		return CHD_NO_SLS_SYD_SEGS;
	}
	public void setCHD_NO_SLS_SYD_SEGS(int cHD_NO_SLS_SYD_SEGS) {
		CHD_NO_SLS_SYD_SEGS = cHD_NO_SLS_SYD_SEGS;
	}
	public String getCHD_NXT2_STRT_BA_CD() {
		return CHD_NXT2_STRT_BA_CD;
	}
	public void setCHD_NXT2_STRT_BA_CD(String cHD_NXT2_STRT_BA_CD) {
		CHD_NXT2_STRT_BA_CD = cHD_NXT2_STRT_BA_CD;
	}
	public String getCHD_NXT2_STRT_CIT_MTHD_ID() {
		return CHD_NXT2_STRT_CIT_MTHD_ID;
	}
	public void setCHD_NXT2_STRT_CIT_MTHD_ID(String cHD_NXT2_STRT_CIT_MTHD_ID) {
		CHD_NXT2_STRT_CIT_MTHD_ID = cHD_NXT2_STRT_CIT_MTHD_ID;
	}
	public int getCHD_NXT2_STRT_DT() {
		return CHD_NXT2_STRT_DT;
	}
	public void setCHD_NXT2_STRT_DT(int cHD_NXT2_STRT_DT) {
		CHD_NXT2_STRT_DT = cHD_NXT2_STRT_DT;
	}
	public int getCHD_NXT2_STRT_EVNT_DT() {
		return CHD_NXT2_STRT_EVNT_DT;
	}
	public void setCHD_NXT2_STRT_EVNT_DT(int cHD_NXT2_STRT_EVNT_DT) {
		CHD_NXT2_STRT_EVNT_DT = cHD_NXT2_STRT_EVNT_DT;
	}
	public String getCHD_NXT2_STRT_HONR_ID() {
		return CHD_NXT2_STRT_HONR_ID;
	}
	public void setCHD_NXT2_STRT_HONR_ID(String cHD_NXT2_STRT_HONR_ID) {
		CHD_NXT2_STRT_HONR_ID = cHD_NXT2_STRT_HONR_ID;
	}
	public String getCHD_NXT2_STRT_ID() {
		return CHD_NXT2_STRT_ID;
	}
	public void setCHD_NXT2_STRT_ID(String cHD_NXT2_STRT_ID) {
		CHD_NXT2_STRT_ID = cHD_NXT2_STRT_ID;
	}
	public String getCHD_NXT2_STRT_REVW_IN() {
		return CHD_NXT2_STRT_REVW_IN;
	}
	public void setCHD_NXT2_STRT_REVW_IN(String cHD_NXT2_STRT_REVW_IN) {
		CHD_NXT2_STRT_REVW_IN = cHD_NXT2_STRT_REVW_IN;
	}
	public String getCHD_NXT2_STRT_TMNG_CD() {
		return CHD_NXT2_STRT_TMNG_CD;
	}
	public void setCHD_NXT2_STRT_TMNG_CD(String cHD_NXT2_STRT_TMNG_CD) {
		CHD_NXT2_STRT_TMNG_CD = cHD_NXT2_STRT_TMNG_CD;
	}
	public String getCHD_OLD_NEXT_STRAT_CYCLE_FLAG() {
		return CHD_OLD_NEXT_STRAT_CYCLE_FLAG;
	}
	public void setCHD_OLD_NEXT_STRAT_CYCLE_FLAG(String cHD_OLD_NEXT_STRAT_CYCLE_FLAG) {
		CHD_OLD_NEXT_STRAT_CYCLE_FLAG = cHD_OLD_NEXT_STRAT_CYCLE_FLAG;
	}
	public String getCHD_OLD_NEXT_STRT_STAGE_REASON() {
		return CHD_OLD_NEXT_STRT_STAGE_REASON;
	}
	public void setCHD_OLD_NEXT_STRT_STAGE_REASON(String cHD_OLD_NEXT_STRT_STAGE_REASON) {
		CHD_OLD_NEXT_STRT_STAGE_REASON = cHD_OLD_NEXT_STRT_STAGE_REASON;
	}
	public int getCHD_OPEN_DATE() {
		return CHD_OPEN_DATE;
	}
	public void setCHD_OPEN_DATE(int cHD_OPEN_DATE) {
		CHD_OPEN_DATE = cHD_OPEN_DATE;
	}
	public double getCHD_OTST_AUTH_BAL_AM() {
		return CHD_OTST_AUTH_BAL_AM;
	}
	public void setCHD_OTST_AUTH_BAL_AM(double cHD_OTST_AUTH_BAL_AM) {
		CHD_OTST_AUTH_BAL_AM = cHD_OTST_AUTH_BAL_AM;
	}
	public int getCHD_OTST_PLST_CT() {
		return CHD_OTST_PLST_CT;
	}
	public void setCHD_OTST_PLST_CT(int cHD_OTST_PLST_CT) {
		CHD_OTST_PLST_CT = cHD_OTST_PLST_CT;
	}
	public double getCHD_OVERPAYMENT_AMT() {
		return CHD_OVERPAYMENT_AMT;
	}
	public void setCHD_OVERPAYMENT_AMT(double cHD_OVERPAYMENT_AMT) {
		CHD_OVERPAYMENT_AMT = cHD_OVERPAYMENT_AMT;
	}
	public int getCHD_PAY_AHEAD_FLAG() {
		return CHD_PAY_AHEAD_FLAG;
	}
	public void setCHD_PAY_AHEAD_FLAG(int cHD_PAY_AHEAD_FLAG) {
		CHD_PAY_AHEAD_FLAG = cHD_PAY_AHEAD_FLAG;
	}
	public int getCHD_PLAN_LOCK_BEGN_DT() {
		return CHD_PLAN_LOCK_BEGN_DT;
	}
	public void setCHD_PLAN_LOCK_BEGN_DT(int cHD_PLAN_LOCK_BEGN_DT) {
		CHD_PLAN_LOCK_BEGN_DT = cHD_PLAN_LOCK_BEGN_DT;
	}
	public int getCHD_PLAN_LOCK_END_DT() {
		return CHD_PLAN_LOCK_END_DT;
	}
	public void setCHD_PLAN_LOCK_END_DT(int cHD_PLAN_LOCK_END_DT) {
		CHD_PLAN_LOCK_END_DT = cHD_PLAN_LOCK_END_DT;
	}
	public double getCHD_POB_AMOUNT() {
		return CHD_POB_AMOUNT;
	}
	public void setCHD_POB_AMOUNT(double cHD_POB_AMOUNT) {
		CHD_POB_AMOUNT = cHD_POB_AMOUNT;
	}
	public double getCHD_POB_RATE() {
		return CHD_POB_RATE;
	}
	public void setCHD_POB_RATE(double cHD_POB_RATE) {
		CHD_POB_RATE = cHD_POB_RATE;
	}
	public int getCHD_PORTFOLIO_NO() {
		return CHD_PORTFOLIO_NO;
	}
	public void setCHD_PORTFOLIO_NO(int cHD_PORTFOLIO_NO) {
		CHD_PORTFOLIO_NO = cHD_PORTFOLIO_NO;
	}
	public int getCHD_PP_2CYC_DELQ_DATE() {
		return CHD_PP_2CYC_DELQ_DATE;
	}
	public void setCHD_PP_2CYC_DELQ_DATE(int cHD_PP_2CYC_DELQ_DATE) {
		CHD_PP_2CYC_DELQ_DATE = cHD_PP_2CYC_DELQ_DATE;
	}
	public int getCHD_PP_ADD_ON_DELY_DT() {
		return CHD_PP_ADD_ON_DELY_DT;
	}
	public void setCHD_PP_ADD_ON_DELY_DT(int cHD_PP_ADD_ON_DELY_DT) {
		CHD_PP_ADD_ON_DELY_DT = cHD_PP_ADD_ON_DELY_DT;
	}
	public int getCHD_PP_DELINQ_LEVEL() {
		return CHD_PP_DELINQ_LEVEL;
	}
	public void setCHD_PP_DELINQ_LEVEL(int cHD_PP_DELINQ_LEVEL) {
		CHD_PP_DELINQ_LEVEL = cHD_PP_DELINQ_LEVEL;
	}
	public int getCHD_PP_EXCL_ADD_ON_FLAG() {
		return CHD_PP_EXCL_ADD_ON_FLAG;
	}
	public void setCHD_PP_EXCL_ADD_ON_FLAG(int cHD_PP_EXCL_ADD_ON_FLAG) {
		CHD_PP_EXCL_ADD_ON_FLAG = cHD_PP_EXCL_ADD_ON_FLAG;
	}
	public int getCHD_PP_EXCL_MPD_FLAG() {
		return CHD_PP_EXCL_MPD_FLAG;
	}
	public void setCHD_PP_EXCL_MPD_FLAG(int cHD_PP_EXCL_MPD_FLAG) {
		CHD_PP_EXCL_MPD_FLAG = cHD_PP_EXCL_MPD_FLAG;
	}
	public int getCHD_PRCN_STRT_CT() {
		return CHD_PRCN_STRT_CT;
	}
	public void setCHD_PRCN_STRT_CT(int cHD_PRCN_STRT_CT) {
		CHD_PRCN_STRT_CT = cHD_PRCN_STRT_CT;
	}
	public int getCHD_PREVIOUS_CYCLE_CODE() {
		return CHD_PREVIOUS_CYCLE_CODE;
	}
	public void setCHD_PREVIOUS_CYCLE_CODE(int cHD_PREVIOUS_CYCLE_CODE) {
		CHD_PREVIOUS_CYCLE_CODE = cHD_PREVIOUS_CYCLE_CODE;
	}
	public int getCHD_PREV_BHVR_SCORE() {
		return CHD_PREV_BHVR_SCORE;
	}
	public void setCHD_PREV_BHVR_SCORE(int cHD_PREV_BHVR_SCORE) {
		CHD_PREV_BHVR_SCORE = cHD_PREV_BHVR_SCORE;
	}
	public int getCHD_PREV_CRDT_LINE_CHNG_DT() {
		return CHD_PREV_CRDT_LINE_CHNG_DT;
	}
	public void setCHD_PREV_CRDT_LINE_CHNG_DT(int cHD_PREV_CRDT_LINE_CHNG_DT) {
		CHD_PREV_CRDT_LINE_CHNG_DT = cHD_PREV_CRDT_LINE_CHNG_DT;
	}
	public int getCHD_PREV_CRLINE_CHANGE_DATE() {
		return CHD_PREV_CRLINE_CHANGE_DATE;
	}
	public void setCHD_PREV_CRLINE_CHANGE_DATE(int cHD_PREV_CRLINE_CHANGE_DATE) {
		CHD_PREV_CRLINE_CHANGE_DATE = cHD_PREV_CRLINE_CHANGE_DATE;
	}
	public String getCHD_PREV_EXT_STATUS() {
		return CHD_PREV_EXT_STATUS;
	}
	public void setCHD_PREV_EXT_STATUS(String cHD_PREV_EXT_STATUS) {
		CHD_PREV_EXT_STATUS = cHD_PREV_EXT_STATUS;
	}
	public String getCHD_PREV_INTERNAL_STATUS() {
		return CHD_PREV_INTERNAL_STATUS;
	}
	public void setCHD_PREV_INTERNAL_STATUS(String cHD_PREV_INTERNAL_STATUS) {
		CHD_PREV_INTERNAL_STATUS = cHD_PREV_INTERNAL_STATUS;
	}
	public int getCHD_PREV_TRMS_CHNG_NTFC_DT() {
		return CHD_PREV_TRMS_CHNG_NTFC_DT;
	}
	public void setCHD_PREV_TRMS_CHNG_NTFC_DT(int cHD_PREV_TRMS_CHNG_NTFC_DT) {
		CHD_PREV_TRMS_CHNG_NTFC_DT = cHD_PREV_TRMS_CHNG_NTFC_DT;
	}
	public String getCHD_PRICING_STRATEGY_STATUS() {
		return CHD_PRICING_STRATEGY_STATUS;
	}
	public void setCHD_PRICING_STRATEGY_STATUS(String cHD_PRICING_STRATEGY_STATUS) {
		CHD_PRICING_STRATEGY_STATUS = cHD_PRICING_STRATEGY_STATUS;
	}
	public int getCHD_PRIN_BANK() {
		return CHD_PRIN_BANK;
	}
	public void setCHD_PRIN_BANK(int cHD_PRIN_BANK) {
		CHD_PRIN_BANK = cHD_PRIN_BANK;
	}
	public String getCHD_PRMR_ACCT_CD() {
		return CHD_PRMR_ACCT_CD;
	}
	public void setCHD_PRMR_ACCT_CD(String cHD_PRMR_ACCT_CD) {
		CHD_PRMR_ACCT_CD = cHD_PRMR_ACCT_CD;
	}
	public int getCHD_PRMR_ACCT_CHNG_DT() {
		return CHD_PRMR_ACCT_CHNG_DT;
	}
	public void setCHD_PRMR_ACCT_CHNG_DT(int cHD_PRMR_ACCT_CHNG_DT) {
		CHD_PRMR_ACCT_CHNG_DT = cHD_PRMR_ACCT_CHNG_DT;
	}
	public String getCHD_PRTN_ID() {
		return CHD_PRTN_ID;
	}
	public void setCHD_PRTN_ID(String cHD_PRTN_ID) {
		CHD_PRTN_ID = cHD_PRTN_ID;
	}
	public double getCHD_PS_FRST_PERD_CASH_ADB_AM() {
		return CHD_PS_FRST_PERD_CASH_ADB_AM;
	}
	public void setCHD_PS_FRST_PERD_CASH_ADB_AM(double cHD_PS_FRST_PERD_CASH_ADB_AM) {
		CHD_PS_FRST_PERD_CASH_ADB_AM = cHD_PS_FRST_PERD_CASH_ADB_AM;
	}
	public int getCHD_PS_FRST_PERD_CASH_ANNL_RT() {
		return CHD_PS_FRST_PERD_CASH_ANNL_RT;
	}
	public void setCHD_PS_FRST_PERD_CASH_ANNL_RT(int cHD_PS_FRST_PERD_CASH_ANNL_RT) {
		CHD_PS_FRST_PERD_CASH_ANNL_RT = cHD_PS_FRST_PERD_CASH_ANNL_RT;
	}
	public int getCHD_PS_FRST_PERD_DAYS_CT() {
		return CHD_PS_FRST_PERD_DAYS_CT;
	}
	public void setCHD_PS_FRST_PERD_DAYS_CT(int cHD_PS_FRST_PERD_DAYS_CT) {
		CHD_PS_FRST_PERD_DAYS_CT = cHD_PS_FRST_PERD_DAYS_CT;
	}
	
	public double getCHD_PS_FRST_PERD_MRCH_ADB_AM() {
		return CHD_PS_FRST_PERD_MRCH_ADB_AM;
	}
	public void setCHD_PS_FRST_PERD_MRCH_ADB_AM(double cHD_PS_FRST_PERD_MRCH_ADB_AM) {
		CHD_PS_FRST_PERD_MRCH_ADB_AM = cHD_PS_FRST_PERD_MRCH_ADB_AM;
	}
	public int getCHD_PS_FRST_PERD_MRCH_ANNL_RT() {
		return CHD_PS_FRST_PERD_MRCH_ANNL_RT;
	}
	public void setCHD_PS_FRST_PERD_MRCH_ANNL_RT(int cHD_PS_FRST_PERD_MRCH_ANNL_RT) {
		CHD_PS_FRST_PERD_MRCH_ANNL_RT = cHD_PS_FRST_PERD_MRCH_ANNL_RT;
	}
	public String getCHD_PS_PYFF_EXCP_BINT_CD() {
		return CHD_PS_PYFF_EXCP_BINT_CD;
	}
	public void setCHD_PS_PYFF_EXCP_BINT_CD(String cHD_PS_PYFF_EXCP_BINT_CD) {
		CHD_PS_PYFF_EXCP_BINT_CD = cHD_PS_PYFF_EXCP_BINT_CD;
	}
	public String getCHD_PS_PYFF_EXCP_CTD_CASH_CD() {
		return CHD_PS_PYFF_EXCP_CTD_CASH_CD;
	}
	public void setCHD_PS_PYFF_EXCP_CTD_CASH_CD(String cHD_PS_PYFF_EXCP_CTD_CASH_CD) {
		CHD_PS_PYFF_EXCP_CTD_CASH_CD = cHD_PS_PYFF_EXCP_CTD_CASH_CD;
	}
	public String getCHD_PS_PYFF_EXCP_CTD_MRCH_CD() {
		return CHD_PS_PYFF_EXCP_CTD_MRCH_CD;
	}
	public void setCHD_PS_PYFF_EXCP_CTD_MRCH_CD(String cHD_PS_PYFF_EXCP_CTD_MRCH_CD) {
		CHD_PS_PYFF_EXCP_CTD_MRCH_CD = cHD_PS_PYFF_EXCP_CTD_MRCH_CD;
	}
	public String getCHD_PS_PYFF_EXCP_NBINT_CD() {
		return CHD_PS_PYFF_EXCP_NBINT_CD;
	}
	public void setCHD_PS_PYFF_EXCP_NBINT_CD(String cHD_PS_PYFF_EXCP_NBINT_CD) {
		CHD_PS_PYFF_EXCP_NBINT_CD = cHD_PS_PYFF_EXCP_NBINT_CD;
	}
	public String getCHD_PS_PYFF_EXCP_OLD_CASH_CD() {
		return CHD_PS_PYFF_EXCP_OLD_CASH_CD;
	}
	public void setCHD_PS_PYFF_EXCP_OLD_CASH_CD(String cHD_PS_PYFF_EXCP_OLD_CASH_CD) {
		CHD_PS_PYFF_EXCP_OLD_CASH_CD = cHD_PS_PYFF_EXCP_OLD_CASH_CD;
	}
	public String getCHD_PS_PYFF_EXCP_RVLV_CD_1() {
		return CHD_PS_PYFF_EXCP_RVLV_CD_1;
	}
	public void setCHD_PS_PYFF_EXCP_RVLV_CD_1(String cHD_PS_PYFF_EXCP_RVLV_CD_1) {
		CHD_PS_PYFF_EXCP_RVLV_CD_1 = cHD_PS_PYFF_EXCP_RVLV_CD_1;
	}
	public String getCHD_PS_PYFF_EXCP_RVLV_CD_2() {
		return CHD_PS_PYFF_EXCP_RVLV_CD_2;
	}
	public void setCHD_PS_PYFF_EXCP_RVLV_CD_2(String cHD_PS_PYFF_EXCP_RVLV_CD_2) {
		CHD_PS_PYFF_EXCP_RVLV_CD_2 = cHD_PS_PYFF_EXCP_RVLV_CD_2;
	}
	public String getCHD_PS_PYFF_EXCP_RVLV_CD_3() {
		return CHD_PS_PYFF_EXCP_RVLV_CD_3;
	}
	public void setCHD_PS_PYFF_EXCP_RVLV_CD_3(String cHD_PS_PYFF_EXCP_RVLV_CD_3) {
		CHD_PS_PYFF_EXCP_RVLV_CD_3 = cHD_PS_PYFF_EXCP_RVLV_CD_3;
	}
	public String getCHD_PS_PYFF_EXCP_RVLV_CD_4() {
		return CHD_PS_PYFF_EXCP_RVLV_CD_4;
	}
	public void setCHD_PS_PYFF_EXCP_RVLV_CD_4(String cHD_PS_PYFF_EXCP_RVLV_CD_4) {
		CHD_PS_PYFF_EXCP_RVLV_CD_4 = cHD_PS_PYFF_EXCP_RVLV_CD_4;
	}
	public String getCHD_PS_PYFF_EXCP_RVLV_CD_5() {
		return CHD_PS_PYFF_EXCP_RVLV_CD_5;
	}
	public void setCHD_PS_PYFF_EXCP_RVLV_CD_5(String cHD_PS_PYFF_EXCP_RVLV_CD_5) {
		CHD_PS_PYFF_EXCP_RVLV_CD_5 = cHD_PS_PYFF_EXCP_RVLV_CD_5;
	}
	public int getCHD_PYMN_DUE_DT() {
		return CHD_PYMN_DUE_DT;
	}
	public void setCHD_PYMN_DUE_DT(int cHD_PYMN_DUE_DT) {
		CHD_PYMN_DUE_DT = cHD_PYMN_DUE_DT;
	}
	public String getCHD_RANDOM_DIGITS() {
		return CHD_RANDOM_DIGITS;
	}
	public void setCHD_RANDOM_DIGITS(String cHD_RANDOM_DIGITS) {
		CHD_RANDOM_DIGITS = cHD_RANDOM_DIGITS;
	}
	public int getCHD_RECORD_FORMAT() {
		return CHD_RECORD_FORMAT;
	}
	public void setCHD_RECORD_FORMAT(int cHD_RECORD_FORMAT) {
		CHD_RECORD_FORMAT = cHD_RECORD_FORMAT;
	}
	public String getCHD_RECOURSE_FLAG() {
		return CHD_RECOURSE_FLAG;
	}
	public void setCHD_RECOURSE_FLAG(String cHD_RECOURSE_FLAG) {
		CHD_RECOURSE_FLAG = cHD_RECOURSE_FLAG;
	}
	public String getCHD_RECOVERY_IND() {
		return CHD_RECOVERY_IND;
	}
	public void setCHD_RECOVERY_IND(String cHD_RECOVERY_IND) {
		CHD_RECOVERY_IND = cHD_RECOVERY_IND;
	}
	public double getCHD_RECOVER_DOLLARS_FACTOR() {
		return CHD_RECOVER_DOLLARS_FACTOR;
	}
	public void setCHD_RECOVER_DOLLARS_FACTOR(double cHD_RECOVER_DOLLARS_FACTOR) {
		CHD_RECOVER_DOLLARS_FACTOR = cHD_RECOVER_DOLLARS_FACTOR;
	}
	public int getCHD_REISSUE_CONTROL() {
		return CHD_REISSUE_CONTROL;
	}
	public void setCHD_REISSUE_CONTROL(int cHD_REISSUE_CONTROL) {
		CHD_REISSUE_CONTROL = cHD_REISSUE_CONTROL;
	}
	public int getCHD_RENEWAL_CODE() {
		return CHD_RENEWAL_CODE;
	}
	public void setCHD_RENEWAL_CODE(int cHD_RENEWAL_CODE) {
		CHD_RENEWAL_CODE = cHD_RENEWAL_CODE;
	}
	public int getCHD_REQ_CLOSED_DATE() {
		return CHD_REQ_CLOSED_DATE;
	}
	public void setCHD_REQ_CLOSED_DATE(int cHD_REQ_CLOSED_DATE) {
		CHD_REQ_CLOSED_DATE = cHD_REQ_CLOSED_DATE;
	}
	public String getCHD_RISK_PREDICTOR_BUREAU() {
		return CHD_RISK_PREDICTOR_BUREAU;
	}
	public void setCHD_RISK_PREDICTOR_BUREAU(String cHD_RISK_PREDICTOR_BUREAU) {
		CHD_RISK_PREDICTOR_BUREAU = cHD_RISK_PREDICTOR_BUREAU;
	}
	public String getCHD_RISK_PREDICTOR_MODEL() {
		return CHD_RISK_PREDICTOR_MODEL;
	}
	public void setCHD_RISK_PREDICTOR_MODEL(String cHD_RISK_PREDICTOR_MODEL) {
		CHD_RISK_PREDICTOR_MODEL = cHD_RISK_PREDICTOR_MODEL;
	}
	public int getCHD_RISK_PREDICTOR_SCORE() {
		return CHD_RISK_PREDICTOR_SCORE;
	}
	public void setCHD_RISK_PREDICTOR_SCORE(int cHD_RISK_PREDICTOR_SCORE) {
		CHD_RISK_PREDICTOR_SCORE = cHD_RISK_PREDICTOR_SCORE;
	}
	public double getCHD_RSRV_CRDT_LINE_AVLB_AM() {
		return CHD_RSRV_CRDT_LINE_AVLB_AM;
	}
	public void setCHD_RSRV_CRDT_LINE_AVLB_AM(double cHD_RSRV_CRDT_LINE_AVLB_AM) {
		CHD_RSRV_CRDT_LINE_AVLB_AM = cHD_RSRV_CRDT_LINE_AVLB_AM;
	}
	public int getCHD_RSRV_CRDT_LINE_PRCN_RT() {
		return CHD_RSRV_CRDT_LINE_PRCN_RT;
	}
	public void setCHD_RSRV_CRDT_LINE_PRCN_RT(int cHD_RSRV_CRDT_LINE_PRCN_RT) {
		CHD_RSRV_CRDT_LINE_PRCN_RT = cHD_RSRV_CRDT_LINE_PRCN_RT;
	}
	public int getCHD_RTRN_CHECK_DT() {
		return CHD_RTRN_CHECK_DT;
	}
	public void setCHD_RTRN_CHECK_DT(int cHD_RTRN_CHECK_DT) {
		CHD_RTRN_CHECK_DT = cHD_RTRN_CHECK_DT;
	}
	public int getCHD_SCOR_EGHT_DT() {
		return CHD_SCOR_EGHT_DT;
	}
	public void setCHD_SCOR_EGHT_DT(int cHD_SCOR_EGHT_DT) {
		CHD_SCOR_EGHT_DT = cHD_SCOR_EGHT_DT;
	}
	public int getCHD_SCOR_EGHT_NR() {
		return CHD_SCOR_EGHT_NR;
	}
	public void setCHD_SCOR_EGHT_NR(int cHD_SCOR_EGHT_NR) {
		CHD_SCOR_EGHT_NR = cHD_SCOR_EGHT_NR;
	}
	public int getCHD_SCOR_EGHT_RESN_FOUR_NR() {
		return CHD_SCOR_EGHT_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_EGHT_RESN_FOUR_NR(int cHD_SCOR_EGHT_RESN_FOUR_NR) {
		CHD_SCOR_EGHT_RESN_FOUR_NR = cHD_SCOR_EGHT_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_EGHT_RESN_ONE_NR() {
		return CHD_SCOR_EGHT_RESN_ONE_NR;
	}
	public void setCHD_SCOR_EGHT_RESN_ONE_NR(int cHD_SCOR_EGHT_RESN_ONE_NR) {
		CHD_SCOR_EGHT_RESN_ONE_NR = cHD_SCOR_EGHT_RESN_ONE_NR;
	}
	public int getCHD_SCOR_EGHT_RESN_THRE_NR() {
		return CHD_SCOR_EGHT_RESN_THRE_NR;
	}
	public void setCHD_SCOR_EGHT_RESN_THRE_NR(int cHD_SCOR_EGHT_RESN_THRE_NR) {
		CHD_SCOR_EGHT_RESN_THRE_NR = cHD_SCOR_EGHT_RESN_THRE_NR;
	}
	public int getCHD_SCOR_EGHT_RESN_TWO_NR() {
		return CHD_SCOR_EGHT_RESN_TWO_NR;
	}
	public void setCHD_SCOR_EGHT_RESN_TWO_NR(int cHD_SCOR_EGHT_RESN_TWO_NR) {
		CHD_SCOR_EGHT_RESN_TWO_NR = cHD_SCOR_EGHT_RESN_TWO_NR;
	}
	public int getCHD_SCOR_FIVE_DT() {
		return CHD_SCOR_FIVE_DT;
	}
	public void setCHD_SCOR_FIVE_DT(int cHD_SCOR_FIVE_DT) {
		CHD_SCOR_FIVE_DT = cHD_SCOR_FIVE_DT;
	}
	public int getCHD_SCOR_FIVE_NR() {
		return CHD_SCOR_FIVE_NR;
	}
	public void setCHD_SCOR_FIVE_NR(int cHD_SCOR_FIVE_NR) {
		CHD_SCOR_FIVE_NR = cHD_SCOR_FIVE_NR;
	}
	public int getCHD_SCOR_FIVE_RESN_FOUR_NR() {
		return CHD_SCOR_FIVE_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_FIVE_RESN_FOUR_NR(int cHD_SCOR_FIVE_RESN_FOUR_NR) {
		CHD_SCOR_FIVE_RESN_FOUR_NR = cHD_SCOR_FIVE_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_FIVE_RESN_ONE_NR() {
		return CHD_SCOR_FIVE_RESN_ONE_NR;
	}
	public void setCHD_SCOR_FIVE_RESN_ONE_NR(int cHD_SCOR_FIVE_RESN_ONE_NR) {
		CHD_SCOR_FIVE_RESN_ONE_NR = cHD_SCOR_FIVE_RESN_ONE_NR;
	}
	public int getCHD_SCOR_FIVE_RESN_THRE_NR() {
		return CHD_SCOR_FIVE_RESN_THRE_NR;
	}
	public void setCHD_SCOR_FIVE_RESN_THRE_NR(int cHD_SCOR_FIVE_RESN_THRE_NR) {
		CHD_SCOR_FIVE_RESN_THRE_NR = cHD_SCOR_FIVE_RESN_THRE_NR;
	}
	public int getCHD_SCOR_FIVE_RESN_TWO_NR() {
		return CHD_SCOR_FIVE_RESN_TWO_NR;
	}
	public void setCHD_SCOR_FIVE_RESN_TWO_NR(int cHD_SCOR_FIVE_RESN_TWO_NR) {
		CHD_SCOR_FIVE_RESN_TWO_NR = cHD_SCOR_FIVE_RESN_TWO_NR;
	}
	public int getCHD_SCOR_FOUR_DT() {
		return CHD_SCOR_FOUR_DT;
	}
	public void setCHD_SCOR_FOUR_DT(int cHD_SCOR_FOUR_DT) {
		CHD_SCOR_FOUR_DT = cHD_SCOR_FOUR_DT;
	}
	public int getCHD_SCOR_FOUR_NR() {
		return CHD_SCOR_FOUR_NR;
	}
	public void setCHD_SCOR_FOUR_NR(int cHD_SCOR_FOUR_NR) {
		CHD_SCOR_FOUR_NR = cHD_SCOR_FOUR_NR;
	}
	public int getCHD_SCOR_FOUR_RESN_FOUR_NR() {
		return CHD_SCOR_FOUR_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_FOUR_RESN_FOUR_NR(int cHD_SCOR_FOUR_RESN_FOUR_NR) {
		CHD_SCOR_FOUR_RESN_FOUR_NR = cHD_SCOR_FOUR_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_FOUR_RESN_ONE_NR() {
		return CHD_SCOR_FOUR_RESN_ONE_NR;
	}
	public void setCHD_SCOR_FOUR_RESN_ONE_NR(int cHD_SCOR_FOUR_RESN_ONE_NR) {
		CHD_SCOR_FOUR_RESN_ONE_NR = cHD_SCOR_FOUR_RESN_ONE_NR;
	}
	public int getCHD_SCOR_FOUR_RESN_THRE_NR() {
		return CHD_SCOR_FOUR_RESN_THRE_NR;
	}
	public void setCHD_SCOR_FOUR_RESN_THRE_NR(int cHD_SCOR_FOUR_RESN_THRE_NR) {
		CHD_SCOR_FOUR_RESN_THRE_NR = cHD_SCOR_FOUR_RESN_THRE_NR;
	}
	public int getCHD_SCOR_FOUR_RESN_TWO_NR() {
		return CHD_SCOR_FOUR_RESN_TWO_NR;
	}
	public void setCHD_SCOR_FOUR_RESN_TWO_NR(int cHD_SCOR_FOUR_RESN_TWO_NR) {
		CHD_SCOR_FOUR_RESN_TWO_NR = cHD_SCOR_FOUR_RESN_TWO_NR;
	}
	public int getCHD_SCOR_NINE_DT() {
		return CHD_SCOR_NINE_DT;
	}
	public void setCHD_SCOR_NINE_DT(int cHD_SCOR_NINE_DT) {
		CHD_SCOR_NINE_DT = cHD_SCOR_NINE_DT;
	}
	public int getCHD_SCOR_NINE_NR() {
		return CHD_SCOR_NINE_NR;
	}
	public void setCHD_SCOR_NINE_NR(int cHD_SCOR_NINE_NR) {
		CHD_SCOR_NINE_NR = cHD_SCOR_NINE_NR;
	}
	public int getCHD_SCOR_NINE_RESN_FOUR_NR() {
		return CHD_SCOR_NINE_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_NINE_RESN_FOUR_NR(int cHD_SCOR_NINE_RESN_FOUR_NR) {
		CHD_SCOR_NINE_RESN_FOUR_NR = cHD_SCOR_NINE_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_NINE_RESN_ONE_NR() {
		return CHD_SCOR_NINE_RESN_ONE_NR;
	}
	public void setCHD_SCOR_NINE_RESN_ONE_NR(int cHD_SCOR_NINE_RESN_ONE_NR) {
		CHD_SCOR_NINE_RESN_ONE_NR = cHD_SCOR_NINE_RESN_ONE_NR;
	}
	public int getCHD_SCOR_NINE_RESN_THRE_NR() {
		return CHD_SCOR_NINE_RESN_THRE_NR;
	}
	public void setCHD_SCOR_NINE_RESN_THRE_NR(int cHD_SCOR_NINE_RESN_THRE_NR) {
		CHD_SCOR_NINE_RESN_THRE_NR = cHD_SCOR_NINE_RESN_THRE_NR;
	}
	public int getCHD_SCOR_NINE_RESN_TWO_NR() {
		return CHD_SCOR_NINE_RESN_TWO_NR;
	}
	public void setCHD_SCOR_NINE_RESN_TWO_NR(int cHD_SCOR_NINE_RESN_TWO_NR) {
		CHD_SCOR_NINE_RESN_TWO_NR = cHD_SCOR_NINE_RESN_TWO_NR;
	}
	public int getCHD_SCOR_ONE_DT() {
		return CHD_SCOR_ONE_DT;
	}
	public void setCHD_SCOR_ONE_DT(int cHD_SCOR_ONE_DT) {
		CHD_SCOR_ONE_DT = cHD_SCOR_ONE_DT;
	}
	public int getCHD_SCOR_ONE_NR() {
		return CHD_SCOR_ONE_NR;
	}
	public void setCHD_SCOR_ONE_NR(int cHD_SCOR_ONE_NR) {
		CHD_SCOR_ONE_NR = cHD_SCOR_ONE_NR;
	}
	public int getCHD_SCOR_ONE_RESN_FOUR_NR() {
		return CHD_SCOR_ONE_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_ONE_RESN_FOUR_NR(int cHD_SCOR_ONE_RESN_FOUR_NR) {
		CHD_SCOR_ONE_RESN_FOUR_NR = cHD_SCOR_ONE_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_ONE_RESN_ONE_NR() {
		return CHD_SCOR_ONE_RESN_ONE_NR;
	}
	public void setCHD_SCOR_ONE_RESN_ONE_NR(int cHD_SCOR_ONE_RESN_ONE_NR) {
		CHD_SCOR_ONE_RESN_ONE_NR = cHD_SCOR_ONE_RESN_ONE_NR;
	}
	public int getCHD_SCOR_ONE_RESN_THRE_NR() {
		return CHD_SCOR_ONE_RESN_THRE_NR;
	}
	public void setCHD_SCOR_ONE_RESN_THRE_NR(int cHD_SCOR_ONE_RESN_THRE_NR) {
		CHD_SCOR_ONE_RESN_THRE_NR = cHD_SCOR_ONE_RESN_THRE_NR;
	}
	public int getCHD_SCOR_ONE_RESN_TWO_NR() {
		return CHD_SCOR_ONE_RESN_TWO_NR;
	}
	public void setCHD_SCOR_ONE_RESN_TWO_NR(int cHD_SCOR_ONE_RESN_TWO_NR) {
		CHD_SCOR_ONE_RESN_TWO_NR = cHD_SCOR_ONE_RESN_TWO_NR;
	}
	public int getCHD_SCOR_SEVN_DT() {
		return CHD_SCOR_SEVN_DT;
	}
	public void setCHD_SCOR_SEVN_DT(int cHD_SCOR_SEVN_DT) {
		CHD_SCOR_SEVN_DT = cHD_SCOR_SEVN_DT;
	}
	public int getCHD_SCOR_SEVN_NR() {
		return CHD_SCOR_SEVN_NR;
	}
	public void setCHD_SCOR_SEVN_NR(int cHD_SCOR_SEVN_NR) {
		CHD_SCOR_SEVN_NR = cHD_SCOR_SEVN_NR;
	}
	public int getCHD_SCOR_SEVN_RESN_FOUR_NR() {
		return CHD_SCOR_SEVN_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_SEVN_RESN_FOUR_NR(int cHD_SCOR_SEVN_RESN_FOUR_NR) {
		CHD_SCOR_SEVN_RESN_FOUR_NR = cHD_SCOR_SEVN_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_SEVN_RESN_ONE_NR() {
		return CHD_SCOR_SEVN_RESN_ONE_NR;
	}
	public void setCHD_SCOR_SEVN_RESN_ONE_NR(int cHD_SCOR_SEVN_RESN_ONE_NR) {
		CHD_SCOR_SEVN_RESN_ONE_NR = cHD_SCOR_SEVN_RESN_ONE_NR;
	}
	public int getCHD_SCOR_SEVN_RESN_THRE_NR() {
		return CHD_SCOR_SEVN_RESN_THRE_NR;
	}
	public void setCHD_SCOR_SEVN_RESN_THRE_NR(int cHD_SCOR_SEVN_RESN_THRE_NR) {
		CHD_SCOR_SEVN_RESN_THRE_NR = cHD_SCOR_SEVN_RESN_THRE_NR;
	}
	public int getCHD_SCOR_SEVN_RESN_TWO_NR() {
		return CHD_SCOR_SEVN_RESN_TWO_NR;
	}
	public void setCHD_SCOR_SEVN_RESN_TWO_NR(int cHD_SCOR_SEVN_RESN_TWO_NR) {
		CHD_SCOR_SEVN_RESN_TWO_NR = cHD_SCOR_SEVN_RESN_TWO_NR;
	}
	public int getCHD_SCOR_SIX_DT() {
		return CHD_SCOR_SIX_DT;
	}
	public void setCHD_SCOR_SIX_DT(int cHD_SCOR_SIX_DT) {
		CHD_SCOR_SIX_DT = cHD_SCOR_SIX_DT;
	}
	public int getCHD_SCOR_SIX_NR() {
		return CHD_SCOR_SIX_NR;
	}
	public void setCHD_SCOR_SIX_NR(int cHD_SCOR_SIX_NR) {
		CHD_SCOR_SIX_NR = cHD_SCOR_SIX_NR;
	}
	public int getCHD_SCOR_SIX_RESN_FOUR_NR() {
		return CHD_SCOR_SIX_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_SIX_RESN_FOUR_NR(int cHD_SCOR_SIX_RESN_FOUR_NR) {
		CHD_SCOR_SIX_RESN_FOUR_NR = cHD_SCOR_SIX_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_SIX_RESN_ONE_NR() {
		return CHD_SCOR_SIX_RESN_ONE_NR;
	}
	public void setCHD_SCOR_SIX_RESN_ONE_NR(int cHD_SCOR_SIX_RESN_ONE_NR) {
		CHD_SCOR_SIX_RESN_ONE_NR = cHD_SCOR_SIX_RESN_ONE_NR;
	}
	public int getCHD_SCOR_SIX_RESN_THRE_NR() {
		return CHD_SCOR_SIX_RESN_THRE_NR;
	}
	public void setCHD_SCOR_SIX_RESN_THRE_NR(int cHD_SCOR_SIX_RESN_THRE_NR) {
		CHD_SCOR_SIX_RESN_THRE_NR = cHD_SCOR_SIX_RESN_THRE_NR;
	}
	public int getCHD_SCOR_SIX_RESN_TWO_NR() {
		return CHD_SCOR_SIX_RESN_TWO_NR;
	}
	public void setCHD_SCOR_SIX_RESN_TWO_NR(int cHD_SCOR_SIX_RESN_TWO_NR) {
		CHD_SCOR_SIX_RESN_TWO_NR = cHD_SCOR_SIX_RESN_TWO_NR;
	}
	public int getCHD_SCOR_TEN_DT() {
		return CHD_SCOR_TEN_DT;
	}
	public void setCHD_SCOR_TEN_DT(int cHD_SCOR_TEN_DT) {
		CHD_SCOR_TEN_DT = cHD_SCOR_TEN_DT;
	}
	public int getCHD_SCOR_TEN_NR() {
		return CHD_SCOR_TEN_NR;
	}
	public void setCHD_SCOR_TEN_NR(int cHD_SCOR_TEN_NR) {
		CHD_SCOR_TEN_NR = cHD_SCOR_TEN_NR;
	}
	public int getCHD_SCOR_TEN_RESN_FOUR_NR() {
		return CHD_SCOR_TEN_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_TEN_RESN_FOUR_NR(int cHD_SCOR_TEN_RESN_FOUR_NR) {
		CHD_SCOR_TEN_RESN_FOUR_NR = cHD_SCOR_TEN_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_TEN_RESN_ONE_NR() {
		return CHD_SCOR_TEN_RESN_ONE_NR;
	}
	public void setCHD_SCOR_TEN_RESN_ONE_NR(int cHD_SCOR_TEN_RESN_ONE_NR) {
		CHD_SCOR_TEN_RESN_ONE_NR = cHD_SCOR_TEN_RESN_ONE_NR;
	}
	public int getCHD_SCOR_TEN_RESN_THRE_NR() {
		return CHD_SCOR_TEN_RESN_THRE_NR;
	}
	public void setCHD_SCOR_TEN_RESN_THRE_NR(int cHD_SCOR_TEN_RESN_THRE_NR) {
		CHD_SCOR_TEN_RESN_THRE_NR = cHD_SCOR_TEN_RESN_THRE_NR;
	}
	public int getCHD_SCOR_TEN_RESN_TWO_NR() {
		return CHD_SCOR_TEN_RESN_TWO_NR;
	}
	public void setCHD_SCOR_TEN_RESN_TWO_NR(int cHD_SCOR_TEN_RESN_TWO_NR) {
		CHD_SCOR_TEN_RESN_TWO_NR = cHD_SCOR_TEN_RESN_TWO_NR;
	}
	public int getCHD_SCOR_THRE_DT() {
		return CHD_SCOR_THRE_DT;
	}
	public void setCHD_SCOR_THRE_DT(int cHD_SCOR_THRE_DT) {
		CHD_SCOR_THRE_DT = cHD_SCOR_THRE_DT;
	}
	public int getCHD_SCOR_THRE_NR() {
		return CHD_SCOR_THRE_NR;
	}
	public void setCHD_SCOR_THRE_NR(int cHD_SCOR_THRE_NR) {
		CHD_SCOR_THRE_NR = cHD_SCOR_THRE_NR;
	}
	public int getCHD_SCOR_THRE_RESN_FOUR_NR() {
		return CHD_SCOR_THRE_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_THRE_RESN_FOUR_NR(int cHD_SCOR_THRE_RESN_FOUR_NR) {
		CHD_SCOR_THRE_RESN_FOUR_NR = cHD_SCOR_THRE_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_THRE_RESN_ONE_NR() {
		return CHD_SCOR_THRE_RESN_ONE_NR;
	}
	public void setCHD_SCOR_THRE_RESN_ONE_NR(int cHD_SCOR_THRE_RESN_ONE_NR) {
		CHD_SCOR_THRE_RESN_ONE_NR = cHD_SCOR_THRE_RESN_ONE_NR;
	}
	public int getCHD_SCOR_THRE_RESN_THRE_NR() {
		return CHD_SCOR_THRE_RESN_THRE_NR;
	}
	public void setCHD_SCOR_THRE_RESN_THRE_NR(int cHD_SCOR_THRE_RESN_THRE_NR) {
		CHD_SCOR_THRE_RESN_THRE_NR = cHD_SCOR_THRE_RESN_THRE_NR;
	}
	public int getCHD_SCOR_THRE_RESN_TWO_NR() {
		return CHD_SCOR_THRE_RESN_TWO_NR;
	}
	public void setCHD_SCOR_THRE_RESN_TWO_NR(int cHD_SCOR_THRE_RESN_TWO_NR) {
		CHD_SCOR_THRE_RESN_TWO_NR = cHD_SCOR_THRE_RESN_TWO_NR;
	}
	public int getCHD_SCOR_TWO_DT() {
		return CHD_SCOR_TWO_DT;
	}
	public void setCHD_SCOR_TWO_DT(int cHD_SCOR_TWO_DT) {
		CHD_SCOR_TWO_DT = cHD_SCOR_TWO_DT;
	}
	public int getCHD_SCOR_TWO_NR() {
		return CHD_SCOR_TWO_NR;
	}
	public void setCHD_SCOR_TWO_NR(int cHD_SCOR_TWO_NR) {
		CHD_SCOR_TWO_NR = cHD_SCOR_TWO_NR;
	}
	public int getCHD_SCOR_TWO_RESN_FOUR_NR() {
		return CHD_SCOR_TWO_RESN_FOUR_NR;
	}
	public void setCHD_SCOR_TWO_RESN_FOUR_NR(int cHD_SCOR_TWO_RESN_FOUR_NR) {
		CHD_SCOR_TWO_RESN_FOUR_NR = cHD_SCOR_TWO_RESN_FOUR_NR;
	}
	public int getCHD_SCOR_TWO_RESN_ONE_NR() {
		return CHD_SCOR_TWO_RESN_ONE_NR;
	}
	public void setCHD_SCOR_TWO_RESN_ONE_NR(int cHD_SCOR_TWO_RESN_ONE_NR) {
		CHD_SCOR_TWO_RESN_ONE_NR = cHD_SCOR_TWO_RESN_ONE_NR;
	}
	public int getCHD_SCOR_TWO_RESN_THRE_NR() {
		return CHD_SCOR_TWO_RESN_THRE_NR;
	}
	public void setCHD_SCOR_TWO_RESN_THRE_NR(int cHD_SCOR_TWO_RESN_THRE_NR) {
		CHD_SCOR_TWO_RESN_THRE_NR = cHD_SCOR_TWO_RESN_THRE_NR;
	}
	public int getCHD_SCOR_TWO_RESN_TWO_NR() {
		return CHD_SCOR_TWO_RESN_TWO_NR;
	}
	public void setCHD_SCOR_TWO_RESN_TWO_NR(int cHD_SCOR_TWO_RESN_TWO_NR) {
		CHD_SCOR_TWO_RESN_TWO_NR = cHD_SCOR_TWO_RESN_TWO_NR;
	}
	public String getCHD_SC_1() {
		return CHD_SC_1;
	}
	public void setCHD_SC_1(String cHD_SC_1) {
		CHD_SC_1 = cHD_SC_1;
	}
	public String getCHD_SC_2() {
		return CHD_SC_2;
	}
	public void setCHD_SC_2(String cHD_SC_2) {
		CHD_SC_2 = cHD_SC_2;
	}
	public String getCHD_SC_3() {
		return CHD_SC_3;
	}
	public void setCHD_SC_3(String cHD_SC_3) {
		CHD_SC_3 = cHD_SC_3;
	}
	public String getCHD_SC_4() {
		return CHD_SC_4;
	}
	public void setCHD_SC_4(String cHD_SC_4) {
		CHD_SC_4 = cHD_SC_4;
	}
	public String getCHD_SC_5() {
		return CHD_SC_5;
	}
	public void setCHD_SC_5(String cHD_SC_5) {
		CHD_SC_5 = cHD_SC_5;
	}
	public String getCHD_SC_6() {
		return CHD_SC_6;
	}
	public void setCHD_SC_6(String cHD_SC_6) {
		CHD_SC_6 = cHD_SC_6;
	}
	public String getCHD_SC_7() {
		return CHD_SC_7;
	}
	public void setCHD_SC_7(String cHD_SC_7) {
		CHD_SC_7 = cHD_SC_7;
	}
	public String getCHD_SC_8() {
		return CHD_SC_8;
	}
	public void setCHD_SC_8(String cHD_SC_8) {
		CHD_SC_8 = cHD_SC_8;
	}
	public double getCHD_SHDW_LINE_AM() {
		return CHD_SHDW_LINE_AM;
	}
	public void setCHD_SHDW_LINE_AM(double cHD_SHDW_LINE_AM) {
		CHD_SHDW_LINE_AM = cHD_SHDW_LINE_AM;
	}
	public int getCHD_SHDW_LINE_CHNG_DT() {
		return CHD_SHDW_LINE_CHNG_DT;
	}
	public void setCHD_SHDW_LINE_CHNG_DT(int cHD_SHDW_LINE_CHNG_DT) {
		CHD_SHDW_LINE_CHNG_DT = cHD_SHDW_LINE_CHNG_DT;
	}
	public int getCHD_SHDW_LINE_EXPR_DT() {
		return CHD_SHDW_LINE_EXPR_DT;
	}
	public void setCHD_SHDW_LINE_EXPR_DT(int cHD_SHDW_LINE_EXPR_DT) {
		CHD_SHDW_LINE_EXPR_DT = cHD_SHDW_LINE_EXPR_DT;
	}
	public int getCHD_SHDW_LINE_REVW_DT() {
		return CHD_SHDW_LINE_REVW_DT;
	}
	public void setCHD_SHDW_LINE_REVW_DT(int cHD_SHDW_LINE_REVW_DT) {
		CHD_SHDW_LINE_REVW_DT = cHD_SHDW_LINE_REVW_DT;
	}
	public String getCHD_SKIP_ELGB_IN() {
		return CHD_SKIP_ELGB_IN;
	}
	public void setCHD_SKIP_ELGB_IN(String cHD_SKIP_ELGB_IN) {
		CHD_SKIP_ELGB_IN = cHD_SKIP_ELGB_IN;
	}
	public double getCHD_SLS_ANNL_CHRG() {
		return CHD_SLS_ANNL_CHRG;
	}
	public void setCHD_SLS_ANNL_CHRG(double cHD_SLS_ANNL_CHRG) {
		CHD_SLS_ANNL_CHRG = cHD_SLS_ANNL_CHRG;
	}
	public double getCHD_SLS_CASH_INTR_CHRG() {
		return CHD_SLS_CASH_INTR_CHRG;
	}
	public void setCHD_SLS_CASH_INTR_CHRG(double cHD_SLS_CASH_INTR_CHRG) {
		CHD_SLS_CASH_INTR_CHRG = cHD_SLS_CASH_INTR_CHRG;
	}
	public double getCHD_SLS_CASH_ITEM_CHRG() {
		return CHD_SLS_CASH_ITEM_CHRG;
	}
	public void setCHD_SLS_CASH_ITEM_CHRG(double cHD_SLS_CASH_ITEM_CHRG) {
		CHD_SLS_CASH_ITEM_CHRG = cHD_SLS_CASH_ITEM_CHRG;
	}
	public double getCHD_SLS_CRDT_LIFE_FEES() {
		return CHD_SLS_CRDT_LIFE_FEES;
	}
	public void setCHD_SLS_CRDT_LIFE_FEES(double cHD_SLS_CRDT_LIFE_FEES) {
		CHD_SLS_CRDT_LIFE_FEES = cHD_SLS_CRDT_LIFE_FEES;
	}
	public double getCHD_SLS_CRDT_LIFE_INTR() {
		return CHD_SLS_CRDT_LIFE_INTR;
	}
	public void setCHD_SLS_CRDT_LIFE_INTR(double cHD_SLS_CRDT_LIFE_INTR) {
		CHD_SLS_CRDT_LIFE_INTR = cHD_SLS_CRDT_LIFE_INTR;
	}
	public double getCHD_SLS_CSTM_FEES() {
		return CHD_SLS_CSTM_FEES;
	}
	public void setCHD_SLS_CSTM_FEES(double cHD_SLS_CSTM_FEES) {
		CHD_SLS_CSTM_FEES = cHD_SLS_CSTM_FEES;
	}
	public double getCHD_SLS_CSTM_INTR() {
		return CHD_SLS_CSTM_INTR;
	}
	public void setCHD_SLS_CSTM_INTR(double cHD_SLS_CSTM_INTR) {
		CHD_SLS_CSTM_INTR = cHD_SLS_CSTM_INTR;
	}
	public double getCHD_SLS_DCLN_AUTH_CHRG() {
		return CHD_SLS_DCLN_AUTH_CHRG;
	}
	public void setCHD_SLS_DCLN_AUTH_CHRG(double cHD_SLS_DCLN_AUTH_CHRG) {
		CHD_SLS_DCLN_AUTH_CHRG = cHD_SLS_DCLN_AUTH_CHRG;
	}
	public double getCHD_SLS_LATE_CHRG() {
		return CHD_SLS_LATE_CHRG;
	}
	public void setCHD_SLS_LATE_CHRG(double cHD_SLS_LATE_CHRG) {
		CHD_SLS_LATE_CHRG = cHD_SLS_LATE_CHRG;
	}
	public double getCHD_SLS_MIN_FIN_CHRG() {
		return CHD_SLS_MIN_FIN_CHRG;
	}
	public void setCHD_SLS_MIN_FIN_CHRG(double cHD_SLS_MIN_FIN_CHRG) {
		CHD_SLS_MIN_FIN_CHRG = cHD_SLS_MIN_FIN_CHRG;
	}
	public double getCHD_SLS_MISC_FEES() {
		return CHD_SLS_MISC_FEES;
	}
	public void setCHD_SLS_MISC_FEES(double cHD_SLS_MISC_FEES) {
		CHD_SLS_MISC_FEES = cHD_SLS_MISC_FEES;
	}
	public double getCHD_SLS_MISC_INTR() {
		return CHD_SLS_MISC_INTR;
	}
	public void setCHD_SLS_MISC_INTR(double cHD_SLS_MISC_INTR) {
		CHD_SLS_MISC_INTR = cHD_SLS_MISC_INTR;
	}
	public double getCHD_SLS_MMB_FEES() {
		return CHD_SLS_MMB_FEES;
	}
	public void setCHD_SLS_MMB_FEES(double cHD_SLS_MMB_FEES) {
		CHD_SLS_MMB_FEES = cHD_SLS_MMB_FEES;
	}
	public double getCHD_SLS_MMB_INTR() {
		return CHD_SLS_MMB_INTR;
	}
	public void setCHD_SLS_MMB_INTR(double cHD_SLS_MMB_INTR) {
		CHD_SLS_MMB_INTR = cHD_SLS_MMB_INTR;
	}
	public double getCHD_SLS_MRCH_INTR_CHRG() {
		return CHD_SLS_MRCH_INTR_CHRG;
	}
	public void setCHD_SLS_MRCH_INTR_CHRG(double cHD_SLS_MRCH_INTR_CHRG) {
		CHD_SLS_MRCH_INTR_CHRG = cHD_SLS_MRCH_INTR_CHRG;
	}
	public double getCHD_SLS_MRCH_ITEM_CHRG() {
		return CHD_SLS_MRCH_ITEM_CHRG;
	}
	public void setCHD_SLS_MRCH_ITEM_CHRG(double cHD_SLS_MRCH_ITEM_CHRG) {
		CHD_SLS_MRCH_ITEM_CHRG = cHD_SLS_MRCH_ITEM_CHRG;
	}
	public double getCHD_SLS_NSF_CHRG() {
		return CHD_SLS_NSF_CHRG;
	}
	public void setCHD_SLS_NSF_CHRG(double cHD_SLS_NSF_CHRG) {
		CHD_SLS_NSF_CHRG = cHD_SLS_NSF_CHRG;
	}
	public double getCHD_SLS_OIF_CHRG() {
		return CHD_SLS_OIF_CHRG;
	}
	public void setCHD_SLS_OIF_CHRG(double cHD_SLS_OIF_CHRG) {
		CHD_SLS_OIF_CHRG = cHD_SLS_OIF_CHRG;
	}
	public double getCHD_SLS_OVRL_CHRG() {
		return CHD_SLS_OVRL_CHRG;
	}
	public void setCHD_SLS_OVRL_CHRG(double cHD_SLS_OVRL_CHRG) {
		CHD_SLS_OVRL_CHRG = cHD_SLS_OVRL_CHRG;
	}
	public double getCHD_SLS_STMT_CHRG() {
		return CHD_SLS_STMT_CHRG;
	}
	public void setCHD_SLS_STMT_CHRG(double cHD_SLS_STMT_CHRG) {
		CHD_SLS_STMT_CHRG = cHD_SLS_STMT_CHRG;
	}
	public String getCHD_SPA() {
		return CHD_SPA;
	}
	public void setCHD_SPA(String cHD_SPA) {
		CHD_SPA = cHD_SPA;
	}
	public int getCHD_START_DATE_OF_DELQ() {
		return CHD_START_DATE_OF_DELQ;
	}
	public void setCHD_START_DATE_OF_DELQ(int cHD_START_DATE_OF_DELQ) {
		CHD_START_DATE_OF_DELQ = cHD_START_DATE_OF_DELQ;
	}
	public int getCHD_STATUS_REASON_CODE() {
		return CHD_STATUS_REASON_CODE;
	}
	public void setCHD_STATUS_REASON_CODE(int cHD_STATUS_REASON_CODE) {
		CHD_STATUS_REASON_CODE = cHD_STATUS_REASON_CODE;
	}
	public String getCHD_STMT_HOLD_FLAG() {
		return CHD_STMT_HOLD_FLAG;
	}
	public void setCHD_STMT_HOLD_FLAG(String cHD_STMT_HOLD_FLAG) {
		CHD_STMT_HOLD_FLAG = cHD_STMT_HOLD_FLAG;
	}
	public String getCHD_STOP_CYCL_CODE_CHNG_CD() {
		return CHD_STOP_CYCL_CODE_CHNG_CD;
	}
	public void setCHD_STOP_CYCL_CODE_CHNG_CD(String cHD_STOP_CYCL_CODE_CHNG_CD) {
		CHD_STOP_CYCL_CODE_CHNG_CD = cHD_STOP_CYCL_CODE_CHNG_CD;
	}
	public String getCHD_SUB_ACCT_CD() {
		return CHD_SUB_ACCT_CD;
	}
	public void setCHD_SUB_ACCT_CD(String cHD_SUB_ACCT_CD) {
		CHD_SUB_ACCT_CD = cHD_SUB_ACCT_CD;
	}
	public double getCHD_SYD_ANNL_CHRG() {
		return CHD_SYD_ANNL_CHRG;
	}
	public void setCHD_SYD_ANNL_CHRG(double cHD_SYD_ANNL_CHRG) {
		CHD_SYD_ANNL_CHRG = cHD_SYD_ANNL_CHRG;
	}
	public double getCHD_SYD_CASH_INTR_CHRG() {
		return CHD_SYD_CASH_INTR_CHRG;
	}
	public void setCHD_SYD_CASH_INTR_CHRG(double cHD_SYD_CASH_INTR_CHRG) {
		CHD_SYD_CASH_INTR_CHRG = cHD_SYD_CASH_INTR_CHRG;
	}
	public double getCHD_SYD_CASH_ITEM_CHRG() {
		return CHD_SYD_CASH_ITEM_CHRG;
	}
	public void setCHD_SYD_CASH_ITEM_CHRG(double cHD_SYD_CASH_ITEM_CHRG) {
		CHD_SYD_CASH_ITEM_CHRG = cHD_SYD_CASH_ITEM_CHRG;
	}
	public double getCHD_SYD_CRDT_LIFE_FEES() {
		return CHD_SYD_CRDT_LIFE_FEES;
	}
	public void setCHD_SYD_CRDT_LIFE_FEES(double cHD_SYD_CRDT_LIFE_FEES) {
		CHD_SYD_CRDT_LIFE_FEES = cHD_SYD_CRDT_LIFE_FEES;
	}
	public double getCHD_SYD_CRDT_LIFE_INTR() {
		return CHD_SYD_CRDT_LIFE_INTR;
	}
	public void setCHD_SYD_CRDT_LIFE_INTR(double cHD_SYD_CRDT_LIFE_INTR) {
		CHD_SYD_CRDT_LIFE_INTR = cHD_SYD_CRDT_LIFE_INTR;
	}
	public double getCHD_SYD_CSTM_FEES() {
		return CHD_SYD_CSTM_FEES;
	}
	public void setCHD_SYD_CSTM_FEES(double cHD_SYD_CSTM_FEES) {
		CHD_SYD_CSTM_FEES = cHD_SYD_CSTM_FEES;
	}
	public double getCHD_SYD_CSTM_INTR() {
		return CHD_SYD_CSTM_INTR;
	}
	public void setCHD_SYD_CSTM_INTR(double cHD_SYD_CSTM_INTR) {
		CHD_SYD_CSTM_INTR = cHD_SYD_CSTM_INTR;
	}
	public double getCHD_SYD_DCLN_AUTH_CHRG() {
		return CHD_SYD_DCLN_AUTH_CHRG;
	}
	public void setCHD_SYD_DCLN_AUTH_CHRG(double cHD_SYD_DCLN_AUTH_CHRG) {
		CHD_SYD_DCLN_AUTH_CHRG = cHD_SYD_DCLN_AUTH_CHRG;
	}
	public double getCHD_SYD_HOLD_LS_STMT_CHRG() {
		return CHD_SYD_HOLD_LS_STMT_CHRG;
	}
	public void setCHD_SYD_HOLD_LS_STMT_CHRG(double cHD_SYD_HOLD_LS_STMT_CHRG) {
		CHD_SYD_HOLD_LS_STMT_CHRG = cHD_SYD_HOLD_LS_STMT_CHRG;
	}
	public double getCHD_SYD_LATE_CHRG() {
		return CHD_SYD_LATE_CHRG;
	}
	public void setCHD_SYD_LATE_CHRG(double cHD_SYD_LATE_CHRG) {
		CHD_SYD_LATE_CHRG = cHD_SYD_LATE_CHRG;
	}
	public double getCHD_SYD_MIN_FIN_CHRG() {
		return CHD_SYD_MIN_FIN_CHRG;
	}
	public void setCHD_SYD_MIN_FIN_CHRG(double cHD_SYD_MIN_FIN_CHRG) {
		CHD_SYD_MIN_FIN_CHRG = cHD_SYD_MIN_FIN_CHRG;
	}
	public double getCHD_SYD_MISC_FEES() {
		return CHD_SYD_MISC_FEES;
	}
	public void setCHD_SYD_MISC_FEES(double cHD_SYD_MISC_FEES) {
		CHD_SYD_MISC_FEES = cHD_SYD_MISC_FEES;
	}
	public double getCHD_SYD_MISC_INTR() {
		return CHD_SYD_MISC_INTR;
	}
	public void setCHD_SYD_MISC_INTR(double cHD_SYD_MISC_INTR) {
		CHD_SYD_MISC_INTR = cHD_SYD_MISC_INTR;
	}
	public double getCHD_SYD_MMB_FEES() {
		return CHD_SYD_MMB_FEES;
	}
	public void setCHD_SYD_MMB_FEES(double cHD_SYD_MMB_FEES) {
		CHD_SYD_MMB_FEES = cHD_SYD_MMB_FEES;
	}
	public double getCHD_SYD_MMB_INTR() {
		return CHD_SYD_MMB_INTR;
	}
	public void setCHD_SYD_MMB_INTR(double cHD_SYD_MMB_INTR) {
		CHD_SYD_MMB_INTR = cHD_SYD_MMB_INTR;
	}
	public double getCHD_SYD_MRCH_INTR_CHRG() {
		return CHD_SYD_MRCH_INTR_CHRG;
	}
	public void setCHD_SYD_MRCH_INTR_CHRG(double cHD_SYD_MRCH_INTR_CHRG) {
		CHD_SYD_MRCH_INTR_CHRG = cHD_SYD_MRCH_INTR_CHRG;
	}
	public double getCHD_SYD_MRCH_ITEM_CHRG() {
		return CHD_SYD_MRCH_ITEM_CHRG;
	}
	public void setCHD_SYD_MRCH_ITEM_CHRG(double cHD_SYD_MRCH_ITEM_CHRG) {
		CHD_SYD_MRCH_ITEM_CHRG = cHD_SYD_MRCH_ITEM_CHRG;
	}
	public double getCHD_SYD_NSF_CHRG() {
		return CHD_SYD_NSF_CHRG;
	}
	public void setCHD_SYD_NSF_CHRG(double cHD_SYD_NSF_CHRG) {
		CHD_SYD_NSF_CHRG = cHD_SYD_NSF_CHRG;
	}
	public double getCHD_SYD_OIF_CHRG() {
		return CHD_SYD_OIF_CHRG;
	}
	public void setCHD_SYD_OIF_CHRG(double cHD_SYD_OIF_CHRG) {
		CHD_SYD_OIF_CHRG = cHD_SYD_OIF_CHRG;
	}
	public double getCHD_SYD_OVRL_CHRG() {
		return CHD_SYD_OVRL_CHRG;
	}
	public void setCHD_SYD_OVRL_CHRG(double cHD_SYD_OVRL_CHRG) {
		CHD_SYD_OVRL_CHRG = cHD_SYD_OVRL_CHRG;
	}
	public double getCHD_SYD_STMT_CHRG() {
		return CHD_SYD_STMT_CHRG;
	}
	public void setCHD_SYD_STMT_CHRG(double cHD_SYD_STMT_CHRG) {
		CHD_SYD_STMT_CHRG = cHD_SYD_STMT_CHRG;
	}
	public int getCHD_SYSTEM_NO() {
		return CHD_SYSTEM_NO;
	}
	public void setCHD_SYSTEM_NO(int cHD_SYSTEM_NO) {
		CHD_SYSTEM_NO = cHD_SYSTEM_NO;
	}
	public int getCHD_TERMS_DATE() {
		return CHD_TERMS_DATE;
	}
	public void setCHD_TERMS_DATE(int cHD_TERMS_DATE) {
		CHD_TERMS_DATE = cHD_TERMS_DATE;
	}
	public int getCHD_TMPR_CRDT_LINE_AM() {
		return CHD_TMPR_CRDT_LINE_AM;
	}
	public void setCHD_TMPR_CRDT_LINE_AM(int cHD_TMPR_CRDT_LINE_AM) {
		CHD_TMPR_CRDT_LINE_AM = cHD_TMPR_CRDT_LINE_AM;
	}
	public int getCHD_TMPR_CRDT_LINE_END_DT() {
		return CHD_TMPR_CRDT_LINE_END_DT;
	}
	public void setCHD_TMPR_CRDT_LINE_END_DT(int cHD_TMPR_CRDT_LINE_END_DT) {
		CHD_TMPR_CRDT_LINE_END_DT = cHD_TMPR_CRDT_LINE_END_DT;
	}
	public int getCHD_TMPR_CRDT_LINE_STRT_DT() {
		return CHD_TMPR_CRDT_LINE_STRT_DT;
	}
	public void setCHD_TMPR_CRDT_LINE_STRT_DT(int cHD_TMPR_CRDT_LINE_STRT_DT) {
		CHD_TMPR_CRDT_LINE_STRT_DT = cHD_TMPR_CRDT_LINE_STRT_DT;
	}
	public double getCHD_TOTL_CASH_ADVN_LFTM_AM() {
		return CHD_TOTL_CASH_ADVN_LFTM_AM;
	}
	public void setCHD_TOTL_CASH_ADVN_LFTM_AM(double cHD_TOTL_CASH_ADVN_LFTM_AM) {
		CHD_TOTL_CASH_ADVN_LFTM_AM = cHD_TOTL_CASH_ADVN_LFTM_AM;
	}
	public int getCHD_TRANSFER_FLAG() {
		return CHD_TRANSFER_FLAG;
	}
	public void setCHD_TRANSFER_FLAG(int cHD_TRANSFER_FLAG) {
		CHD_TRANSFER_FLAG = cHD_TRANSFER_FLAG;
	}
	public String getCHD_TYPE_CRED_LINE_CHG() {
		return CHD_TYPE_CRED_LINE_CHG;
	}
	public void setCHD_TYPE_CRED_LINE_CHG(String cHD_TYPE_CRED_LINE_CHG) {
		CHD_TYPE_CRED_LINE_CHG = cHD_TYPE_CRED_LINE_CHG;
	}
	public String getCHD_TYPE_LAST_MON_TRAN() {
		return CHD_TYPE_LAST_MON_TRAN;
	}
	public void setCHD_TYPE_LAST_MON_TRAN(String cHD_TYPE_LAST_MON_TRAN) {
		CHD_TYPE_LAST_MON_TRAN = cHD_TYPE_LAST_MON_TRAN;
	}
	public String getCHD_TYPE_PLASTIC() {
		return CHD_TYPE_PLASTIC;
	}
	public void setCHD_TYPE_PLASTIC(String cHD_TYPE_PLASTIC) {
		CHD_TYPE_PLASTIC = cHD_TYPE_PLASTIC;
	}
	public int getCHD_UD_AD_MESSAGE_FLAG() {
		return CHD_UD_AD_MESSAGE_FLAG;
	}
	public void setCHD_UD_AD_MESSAGE_FLAG(int cHD_UD_AD_MESSAGE_FLAG) {
		CHD_UD_AD_MESSAGE_FLAG = cHD_UD_AD_MESSAGE_FLAG;
	}
	public int getCHD_UD_APPROVAL_OFFICER_CODE() {
		return CHD_UD_APPROVAL_OFFICER_CODE;
	}
	public void setCHD_UD_APPROVAL_OFFICER_CODE(int cHD_UD_APPROVAL_OFFICER_CODE) {
		CHD_UD_APPROVAL_OFFICER_CODE = cHD_UD_APPROVAL_OFFICER_CODE;
	}
	public int getCHD_UD_FINANCIAL_INSTITUTION() {
		return CHD_UD_FINANCIAL_INSTITUTION;
	}
	public void setCHD_UD_FINANCIAL_INSTITUTION(int cHD_UD_FINANCIAL_INSTITUTION) {
		CHD_UD_FINANCIAL_INSTITUTION = cHD_UD_FINANCIAL_INSTITUTION;
	}
	public int getCHD_UD_LIFESTYLE_IND() {
		return CHD_UD_LIFESTYLE_IND;
	}
	public void setCHD_UD_LIFESTYLE_IND(int cHD_UD_LIFESTYLE_IND) {
		CHD_UD_LIFESTYLE_IND = cHD_UD_LIFESTYLE_IND;
	}
	public int getCHD_UD_PRODUCT_TYPE() {
		return CHD_UD_PRODUCT_TYPE;
	}
	public void setCHD_UD_PRODUCT_TYPE(int cHD_UD_PRODUCT_TYPE) {
		CHD_UD_PRODUCT_TYPE = cHD_UD_PRODUCT_TYPE;
	}
	public int getCHD_UD_PROFITABILITY_INDEX() {
		return CHD_UD_PROFITABILITY_INDEX;
	}
	public void setCHD_UD_PROFITABILITY_INDEX(int cHD_UD_PROFITABILITY_INDEX) {
		CHD_UD_PROFITABILITY_INDEX = cHD_UD_PROFITABILITY_INDEX;
	}
	public int getCHD_UD_RISK_SCORE() {
		return CHD_UD_RISK_SCORE;
	}
	public void setCHD_UD_RISK_SCORE(int cHD_UD_RISK_SCORE) {
		CHD_UD_RISK_SCORE = cHD_UD_RISK_SCORE;
	}
	public String getCHD_UD_RPT1() {
		return CHD_UD_RPT1;
	}
	public void setCHD_UD_RPT1(String cHD_UD_RPT1) {
		CHD_UD_RPT1 = cHD_UD_RPT1;
	}
	
	public String getCHD_UD_RPT2() {
		return CHD_UD_RPT2;
	}
	public void setCHD_UD_RPT2(String cHD_UD_RPT2) {
		CHD_UD_RPT2 = cHD_UD_RPT2;
	}
	public String getCHD_UD_RPT4() {
		return CHD_UD_RPT4;
	}
	public void setCHD_UD_RPT4(String cHD_UD_RPT4) {
		CHD_UD_RPT4 = cHD_UD_RPT4;
	}
	public String getCHD_UD_SOURCE_CODE() {
		return CHD_UD_SOURCE_CODE;
	}
	public void setCHD_UD_SOURCE_CODE(String cHD_UD_SOURCE_CODE) {
		CHD_UD_SOURCE_CODE = cHD_UD_SOURCE_CODE;
	}
	public String getCHD_UPC_1() {
		return CHD_UPC_1;
	}
	public void setCHD_UPC_1(String cHD_UPC_1) {
		CHD_UPC_1 = cHD_UPC_1;
	}
	public String getCHD_UPC_2() {
		return CHD_UPC_2;
	}
	public void setCHD_UPC_2(String cHD_UPC_2) {
		CHD_UPC_2 = cHD_UPC_2;
	}
	public String getCHD_UPC_3() {
		return CHD_UPC_3;
	}
	public void setCHD_UPC_3(String cHD_UPC_3) {
		CHD_UPC_3 = cHD_UPC_3;
	}
	public String getCHD_UPC_4() {
		return CHD_UPC_4;
	}
	public void setCHD_UPC_4(String cHD_UPC_4) {
		CHD_UPC_4 = cHD_UPC_4;
	}
	public String getCHD_UPC_5() {
		return CHD_UPC_5;
	}
	public void setCHD_UPC_5(String cHD_UPC_5) {
		CHD_UPC_5 = cHD_UPC_5;
	}
	public String getCHD_UPC_6() {
		return CHD_UPC_6;
	}
	public void setCHD_UPC_6(String cHD_UPC_6) {
		CHD_UPC_6 = cHD_UPC_6;
	}
	public String getCHD_UPC_7() {
		return CHD_UPC_7;
	}
	public void setCHD_UPC_7(String cHD_UPC_7) {
		CHD_UPC_7 = cHD_UPC_7;
	}
	public String getCHD_UPC_8() {
		return CHD_UPC_8;
	}
	public void setCHD_UPC_8(String cHD_UPC_8) {
		CHD_UPC_8 = cHD_UPC_8;
	}
	public String getCHD_UPC_9() {
		return CHD_UPC_9;
	}
	public void setCHD_UPC_9(String cHD_UPC_9) {
		CHD_UPC_9 = cHD_UPC_9;
	}
	public String getCHD_UPC_10() {
		return CHD_UPC_10;
	}
	public void setCHD_UPC_10(String cHD_UPC_10) {
		CHD_UPC_10 = cHD_UPC_10;
	}
	public String getCHD_UPC_11() {
		return CHD_UPC_11;
	}
	public void setCHD_UPC_11(String cHD_UPC_11) {
		CHD_UPC_11 = cHD_UPC_11;
	}
	public String getCHD_UPC_12() {
		return CHD_UPC_12;
	}
	public void setCHD_UPC_12(String cHD_UPC_12) {
		CHD_UPC_12 = cHD_UPC_12;
	}
	public String getCHD_UPC_13() {
		return CHD_UPC_13;
	}
	public void setCHD_UPC_13(String cHD_UPC_13) {
		CHD_UPC_13 = cHD_UPC_13;
	}
	public String getCHD_UPC_14() {
		return CHD_UPC_14;
	}
	public void setCHD_UPC_14(String cHD_UPC_14) {
		CHD_UPC_14 = cHD_UPC_14;
	}
	public String getCHD_UPC_15() {
		return CHD_UPC_15;
	}
	public void setCHD_UPC_15(String cHD_UPC_15) {
		CHD_UPC_15 = cHD_UPC_15;
	}
	public String getCHD_UPC_16() {
		return CHD_UPC_16;
	}
	public void setCHD_UPC_16(String cHD_UPC_16) {
		CHD_UPC_16 = cHD_UPC_16;
	}
	public String getCHD_UPC_17() {
		return CHD_UPC_17;
	}
	public void setCHD_UPC_17(String cHD_UPC_17) {
		CHD_UPC_17 = cHD_UPC_17;
	}
	public int getCHD_UPC_19_NR() {
		return CHD_UPC_19_NR;
	}
	public void setCHD_UPC_19_NR(int cHD_UPC_19_NR) {
		CHD_UPC_19_NR = cHD_UPC_19_NR;
	}
	public int getCHD_UPC_20_NR() {
		return CHD_UPC_20_NR;
	}
	public void setCHD_UPC_20_NR(int cHD_UPC_20_NR) {
		CHD_UPC_20_NR = cHD_UPC_20_NR;
	}
	public double getCHD_UPC_21_AM() {
		return CHD_UPC_21_AM;
	}
	public void setCHD_UPC_21_AM(double cHD_UPC_21_AM) {
		CHD_UPC_21_AM = cHD_UPC_21_AM;
	}
	public int getCHD_UPC_22_NR() {
		return CHD_UPC_22_NR;
	}
	public void setCHD_UPC_22_NR(int cHD_UPC_22_NR) {
		CHD_UPC_22_NR = cHD_UPC_22_NR;
	}
	public String getCHD_USER_TX() {
		return CHD_USER_TX;
	}
	public void setCHD_USER_TX(String cHD_USER_TX) {
		CHD_USER_TX = cHD_USER_TX;
	}
	public String getCHD_WAIV_OVERLATE_FEES() {
		return CHD_WAIV_OVERLATE_FEES;
	}
	public void setCHD_WAIV_OVERLATE_FEES(String cHD_WAIV_OVERLATE_FEES) {
		CHD_WAIV_OVERLATE_FEES = cHD_WAIV_OVERLATE_FEES;
	}
	public String getCHD_XCEPT_CHARGE_OFF_FLAG() {
		return CHD_XCEPT_CHARGE_OFF_FLAG;
	}
	public void setCHD_XCEPT_CHARGE_OFF_FLAG(String cHD_XCEPT_CHARGE_OFF_FLAG) {
		CHD_XCEPT_CHARGE_OFF_FLAG = cHD_XCEPT_CHARGE_OFF_FLAG;
	}
	public int getDTCLOSE() {
		return DTCLOSE;
	}
	public void setDTCLOSE(int dTCLOSE) {
		DTCLOSE = dTCLOSE;
	}
	public int getDTCO() {
		return DTCO;
	}
	public void setDTCO(int dTCO) {
		DTCO = dTCO;
	}
	public int getDTCURSCR() {
		return DTCURSCR;
	}
	public void setDTCURSCR(int dTCURSCR) {
		DTCURSCR = dTCURSCR;
	}
	public int getDTHIBAL() {
		return DTHIBAL;
	}
	public void setDTHIBAL(int dTHIBAL) {
		DTHIBAL = dTHIBAL;
	}
	public int getDTLSTACT() {
		return DTLSTACT;
	}
	public void setDTLSTACT(int dTLSTACT) {
		DTLSTACT = dTLSTACT;
	}
	public int getDTLSTCRD() {
		return DTLSTCRD;
	}
	public void setDTLSTCRD(int dTLSTCRD) {
		DTLSTCRD = dTLSTCRD;
	}
	public int getDTLSTDEL() {
		return DTLSTDEL;
	}
	public void setDTLSTDEL(int dTLSTDEL) {
		DTLSTDEL = dTLSTDEL;
	}
	public int getDTLSTDR() {
		return DTLSTDR;
	}
	public void setDTLSTDR(int dTLSTDR) {
		DTLSTDR = dTLSTDR;
	}
	public int getDTLSTPAY() {
		return DTLSTPAY;
	}
	public void setDTLSTPAY(int dTLSTPAY) {
		DTLSTPAY = dTLSTPAY;
	}
	public int getDTLSTPUR() {
		return DTLSTPUR;
	}
	public void setDTLSTPUR(int dTLSTPUR) {
		DTLSTPUR = dTLSTPUR;
	}
	public int getDTLSTSTM() {
		return DTLSTSTM;
	}
	public void setDTLSTSTM(int dTLSTSTM) {
		DTLSTSTM = dTLSTSTM;
	}
	public int getDTOPEN() {
		return DTOPEN;
	}
	public void setDTOPEN(int dTOPEN) {
		DTOPEN = dTOPEN;
	}
	public int getDTPAYDUE() {
		return DTPAYDUE;
	}
	public void setDTPAYDUE(int dTPAYDUE) {
		DTPAYDUE = dTPAYDUE;
	}
	public int getDTPRVSTM() {
		return DTPRVSTM;
	}
	public void setDTPRVSTM(int dTPRVSTM) {
		DTPRVSTM = dTPRVSTM;
	}
	public int getDTXFER() {
		return DTXFER;
	}
	public void setDTXFER(int dTXFER) {
		DTXFER = dTXFER;
	}
	public int getDT_ACTIVE() {
		return DT_ACTIVE;
	}
	public void setDT_ACTIVE(int dT_ACTIVE) {
		DT_ACTIVE = dT_ACTIVE;
	}
	public int getDT_LOST_STOLEN() {
		return DT_LOST_STOLEN;
	}
	public void setDT_LOST_STOLEN(int dT_LOST_STOLEN) {
		DT_LOST_STOLEN = dT_LOST_STOLEN;
	}
	public int getDT_LST_NONMON() {
		return DT_LST_NONMON;
	}
	public void setDT_LST_NONMON(int dT_LST_NONMON) {
		DT_LST_NONMON = dT_LST_NONMON;
	}
	public int getFRD_SUSP_DT() {
		return FRD_SUSP_DT;
	}
	public void setFRD_SUSP_DT(int fRD_SUSP_DT) {
		FRD_SUSP_DT = fRD_SUSP_DT;
	}
	public String getHDEL1() {
		return HDEL1;
	}
	public void setHDEL1(String hDEL1) {
		HDEL1 = hDEL1;
	}
	public String getHDEL2() {
		return HDEL2;
	}
	public void setHDEL2(String hDEL2) {
		HDEL2 = hDEL2;
	}
	public String getHDEL3() {
		return HDEL3;
	}
	public void setHDEL3(String hDEL3) {
		HDEL3 = hDEL3;
	}
	public String getHDEL4() {
		return HDEL4;
	}
	public void setHDEL4(String hDEL4) {
		HDEL4 = hDEL4;
	}
	public String getHDEL5() {
		return HDEL5;
	}
	public void setHDEL5(String hDEL5) {
		HDEL5 = hDEL5;
	}
	public String getHDEL6() {
		return HDEL6;
	}
	public void setHDEL6(String hDEL6) {
		HDEL6 = hDEL6;
	}
	public double getINPUT_VERSION() {
		return INPUT_VERSION;
	}
	public void setINPUT_VERSION(double iNPUT_VERSION) {
		INPUT_VERSION = iNPUT_VERSION;
	}
	public int getMONTHEND() {
		return MONTHEND;
	}
	public void setMONTHEND(int mONTHEND) {
		MONTHEND = mONTHEND;
	}
	public double getNETBAL() {
		return NETBAL;
	}
	public void setNETBAL(double nETBAL) {
		NETBAL = nETBAL;
	}
	public double getNETCSHBAL() {
		return NETCSHBAL;
	}
	public void setNETCSHBAL(double nETCSHBAL) {
		NETCSHBAL = nETCSHBAL;
	}
	public double getNETPURBAL() {
		return NETPURBAL;
	}
	public void setNETPURBAL(double nETPURBAL) {
		NETPURBAL = nETPURBAL;
	}
	public int getNOTIFYDT() {
		return NOTIFYDT;
	}
	public void setNOTIFYDT(int nOTIFYDT) {
		NOTIFYDT = nOTIFYDT;
	}
	public int getORG() {
		return ORG;
	}
	public void setORG(int oRG) {
		ORG = oRG;
	}
	public String getPRIN() {
		return PRIN;
	}
	public void setPRIN(String pRIN) {
		PRIN = pRIN;
	}
	public int getSTATUS_CHG_DT() {
		return STATUS_CHG_DT;
	}
	public void setSTATUS_CHG_DT(int sTATUS_CHG_DT) {
		STATUS_CHG_DT = sTATUS_CHG_DT;
	}
	public String getSYS() {
		return SYS;
	}
	public void setSYS(String sYS) {
		SYS = sYS;
	}
	public int getURSCR1() {
		return URSCR1;
	}
	public void setURSCR1(int uRSCR1) {
		URSCR1 = uRSCR1;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}
	public int getPRIORITY() {
		return PRIORITY;
	}
	public void setPRIORITY(int pRIORITY) {
		PRIORITY = pRIORITY;
	}
	public String getCLIENT_PRODUCT_CODE() {
		return CLIENT_PRODUCT_CODE;
	}
	public void setCLIENT_PRODUCT_CODE(String cLIENT_PRODUCT_CODE) {
		CLIENT_PRODUCT_CODE = cLIENT_PRODUCT_CODE;
	}
	public String getCYCLE_IND() {
		return CYCLE_IND;
	}
	public void setCYCLE_IND(String cYCLE_IND) {
		CYCLE_IND = cYCLE_IND;
	}
	public String getPRE_CYCLE_IND() {
		return PRE_CYCLE_IND;
	}
	public void setPRE_CYCLE_IND(String pRE_CYCLE_IND) {
		PRE_CYCLE_IND = pRE_CYCLE_IND;
	}
	public String getPORTFOLIO() {
		return PORTFOLIO;
	}
	public void setPORTFOLIO(String pORTFOLIO) {
		PORTFOLIO = pORTFOLIO;
	}
	public String getPARTITION() {
		return PARTITION;
	}
	public void setPARTITION(String pARTITION) {
		PARTITION = pARTITION;
	}
	public String getCHD_CMMR_BKCY_CHPT_CD() {
		return CHD_CMMR_BKCY_CHPT_CD;
	}
	public void setCHD_CMMR_BKCY_CHPT_CD(String cHD_CMMR_BKCY_CHPT_CD) {
		CHD_CMMR_BKCY_CHPT_CD = cHD_CMMR_BKCY_CHPT_CD;
	}
	public int getCHD_CMMR_BKCY_CHPT_DT() {
		return CHD_CMMR_BKCY_CHPT_DT;
	}
	public void setCHD_CMMR_BKCY_CHPT_DT(int cHD_CMMR_BKCY_CHPT_DT) {
		CHD_CMMR_BKCY_CHPT_DT = cHD_CMMR_BKCY_CHPT_DT;
	}
	public int getCHD_CRDT_BUR_BKCY_DT() {
		return CHD_CRDT_BUR_BKCY_DT;
	}
	public void setCHD_CRDT_BUR_BKCY_DT(int cHD_CRDT_BUR_BKCY_DT) {
		CHD_CRDT_BUR_BKCY_DT = cHD_CRDT_BUR_BKCY_DT;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public double[] getPay() {
		
		double[] payment = new double[13];
		payment[0] = getCHD_LS_AMT_PAYMENT();
		payment[1] = getCHDBS_PS_PAYMENTS();
		payment[2] = getCHDBS_BPS_PAYMENTS_1();
		payment[3] = getCHDBS_BPS_PAYMENTS_2();
		payment[4] = getCHDBS_BPS_PAYMENTS_3();
		payment[5] = getCHDBS_BPS_PAYMENTS_4();
		payment[6] = getCHDBS_BPS_PAYMENTS_5();
		payment[7] = getCHDBS_BPS_PAYMENTS_6();
		payment[8] = getCHDBS_BPS_PAYMENTS_7();
		payment[9] = getCHDBS_BPS_PAYMENTS_8();
		payment[10] = getCHDBS_BPS_PAYMENTS_9();
		payment[11] = getCHDBS_BPS_PAYMENTS_10();
		payment[12] = getCHDBS_BPS_PAYMENTS_11();

		this.pay = payment;
		return pay;
	}
	public void setPay(double[] pay) {
		this.pay = pay;
	}
	public double[] getDue() {
		
		double[] paydue = new double[13];
		
		paydue[0] = getCHDLS_BILLED_PAY_DUE();
		paydue[1] = getCHDLS_BILLED_PAY_DUE();
		paydue[2] = getCHDBS_BPS_MIN_PAY_DUE_1();
		paydue[3] = getCHDBS_BPS_MIN_PAY_DUE_2();
		paydue[4] = getCHDBS_BPS_MIN_PAY_DUE_3();
		paydue[5] = getCHDBS_BPS_MIN_PAY_DUE_4();
		paydue[6] = getCHDBS_BPS_MIN_PAY_DUE_5();
		paydue[7] = getCHDBS_BPS_MIN_PAY_DUE_6();
		paydue[8] = getCHDBS_BPS_MIN_PAY_DUE_7();
		paydue[9] = getCHDBS_BPS_MIN_PAY_DUE_8();
		paydue[10] = getCHDBS_BPS_MIN_PAY_DUE_9();
		paydue[11] = getCHDBS_BPS_MIN_PAY_DUE_10();
		paydue[12] = getCHDBS_BPS_MIN_PAY_DUE_11();

		
		this.due =paydue;
				
		return due;
	}
	public void setDue(double[] due) {
		this.due = due;
	}
	public double[] getBal() {
		
		double[] bal = new double[13];
		
		
		
		bal[0] = getCHDBS_BPS_STMT_BAL_1();
		bal[1] = getCHDPS_BALANCE();
		bal[2] = getCHDBS_BPS_STMT_BAL_1();
		bal[3] = getCHDBS_BPS_STMT_BAL_2();
		bal[4] = getCHDBS_BPS_STMT_BAL_3();
		bal[5] = getCHDBS_BPS_STMT_BAL_4();
		bal[6] = getCHDBS_BPS_STMT_BAL_5();
		bal[7] = getCHDBS_BPS_STMT_BAL_6();
		bal[8] = getCHDBS_BPS_STMT_BAL_7();
		bal[9] = getCHDBS_BPS_STMT_BAL_8();
		bal[10] = getCHDBS_BPS_STMT_BAL_9();
		bal[11] = getCHDBS_BPS_STMT_BAL_10();
		bal[12] = getCHDBS_BPS_STMT_BAL_11();
		this.bal = bal;
		return this.bal;
	}
	public void setBal(double[] bal) {
		this.bal = bal;
	}
	public List<Integer> getStmtData() {
		
		 Integer[] stmtdt = new Integer[13];
		 
		 stmtdt[0] = getCHD_DATE_LAST_STMT();
		 stmtdt[1] = getCHD_DATE_PREV_STMT();
		 
		 stmtdt[2] = getCHDBS_BPS_STMT_DATE_1();
		 stmtdt[3] = getCHDBS_BPS_STMT_DATE_2();
		 stmtdt[4] = getCHDBS_BPS_STMT_DATE_3();
		 stmtdt[5] = getCHDBS_BPS_STMT_DATE_4();
		 stmtdt[6] = getCHDBS_BPS_STMT_DATE_5();
		 stmtdt[7] = getCHDBS_BPS_STMT_DATE_6();
		 stmtdt[8] = getCHDBS_BPS_STMT_DATE_7();
		 stmtdt[9] = getCHDBS_BPS_STMT_DATE_8();
		 stmtdt[10] = getCHDBS_BPS_STMT_DATE_9();
		 stmtdt[11] = getCHDBS_BPS_STMT_DATE_10();
		 stmtdt[12] = getCHDBS_BPS_STMT_DATE_11();
		 this.stmtData =  new ArrayList<Integer>(Arrays.asList(stmtdt));
		return this.stmtData;
	}
	public void setStmtData(List<Integer> stmtData) {
		this.stmtData = stmtData;
	}
	public int[] getStmtDate() {
		
		int[] stmtdt = new int[13];
		 
		 stmtdt[0] = getCHD_DATE_LAST_STMT();
		 stmtdt[1] = getCHD_DATE_PREV_STMT();
		 
		 stmtdt[2] = getCHDBS_BPS_STMT_DATE_1();
		 stmtdt[3] = getCHDBS_BPS_STMT_DATE_2();
		 stmtdt[4] = getCHDBS_BPS_STMT_DATE_3();
		 stmtdt[5] = getCHDBS_BPS_STMT_DATE_4();
		 stmtdt[6] = getCHDBS_BPS_STMT_DATE_5();
		 stmtdt[7] = getCHDBS_BPS_STMT_DATE_6();
		 stmtdt[8] = getCHDBS_BPS_STMT_DATE_7();
		 stmtdt[9] = getCHDBS_BPS_STMT_DATE_8();
		 stmtdt[10] = getCHDBS_BPS_STMT_DATE_9();
		 stmtdt[11] = getCHDBS_BPS_STMT_DATE_10();
		 stmtdt[12] = getCHDBS_BPS_STMT_DATE_11();
		 this.stmtDate = stmtdt;
		return stmtDate;
	}
	public void setStmtDate(int[] stmtDate) {
		this.stmtDate = stmtDate;
	}
	
	
	
	
	}
