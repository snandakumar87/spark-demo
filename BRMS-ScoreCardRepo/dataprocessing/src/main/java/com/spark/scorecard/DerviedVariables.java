package com.spark.scorecard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DerviedVariables implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CBVariables cbVariables = new CBVariables();
	private List<ScoreFormula> scoreFrmulaVariable = new  ArrayList<ScoreFormula>();
	private double ATTR001_MISS0; /* used for divisions.  if ATTR001 is 0, set to missing */
	private int ACCOUNT_ID; 
	private int CB0_ATTR001 ;
    private int CB0_ATTR002 ;
    private int CB0_ATTR003 ;
    private int CB0_ATTR008 ;
    private int CB0_ATTR011 ;
    private int CB0_ATTR012 ;
    private int CB0_ATTR013 ;
    private int CB0_ATTR017 ;
    private int CB0_ATTR020 ;
    private int CB0_ATTR021 ;
    private int CB0_ATTR023 ;
    private int CB0_ATTR024 ;
    private int CB0_ATTR025 ;
    private int CB0_ATTR061 ;
    private int CB0_ATTR065 ;
    private int CB0_ATTR066 ;
    private int CB0_ATTR106 ;
    private int CB0_ATTR107 ;
    private int CB0_ATTR110 ;
    private int CB0_ATTR111 ;
    private int CB0_ATTR116 ;
    private int CB0_ATTR183 ;
    private int CB0_ATTR260 ;
    private int CB0_ATTR306 ;
    private int CB0_ATTR307 ;
    private int CB0_ATTR380 ;
	private int[] cb_ts = new int[6];;
	private int bureauhit ;
	private double ADV013;
	private double ADV027;
	private double ADV029;
	private double ADV124;
	private double ADV221;
	private double ADV902;
	private double pctdec_ATTR013;
	private double dec1;
	private double dec2;
	private double dec3;
	private double dec4;
	private double dec5;
	private double dec;
	private double rat_1_ATTR107_ATTR001;
	private double rat_1_ATTR116_ATTR001;
	private double ts0_ATTR001;
	private double ts0_ATTR107;
	private double ts0_ATTR116;

	private double CHDAP_CURR_CTD_CASH_PRIN;
	private double CHDAP_OPEN_CYC_CASH_INTSC;
	private double CHDAP_OPEN_CYC_CASH_PRIN;
	private double CHDAP_UNPD_CASH_ITEM_AM;
	private double CHD_CTD_AMT_ITEM_CHG; 

	private double ACCTCASH;
	private int CASHUSER;
	private int  buckets;
	private int BALDEC2;
	private int[] months_del = new int[14];;
	private String PAYMENT_PATTERN;
	private String stick;
	private int DELMAX3;
	private double MEANPAY;
	private double[] varrt = new double[7];//(7);
	private int pay_cnt;
	private double totl_pay_rate;
	private int mode6;
	private int numvar;
	private double ACCTBAL;
	private double Balsqrt;
	private int segment_no;
	private double Pct100Def;
	private double def_bal_to_hist_purch;
	private double total_def_bal ;
	private int DELQDAYS;
	private String[] reason_codes;//(4);
	private double alpha;
	private double sum;
	private double probc;
	private int SCR_new;
	private double tmp_balance;
	private double x;
	private double cmpATTR107;
	private double [] bals;//(14);
	private double[] due;//(14);
	private double[] pay;//(14);
	private int [] stmt_dates; //(14);
	private int SKIPPED_DUE_TO_NO_CB;

	private int FLAP_WITHPAY_PLANS ;
    private double FLAP_TOTAL_DEF_BAL ;
    private double FLAP_TOTAL_HIST_PURCH ;
    private double FLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH; 
	private int flap_unexpired_plans;
	private String CHD_EXTERNAL_STATUS;
	
	public int[] getCb_ts() {
		return cb_ts;
	}

	public void setCb_ts(int[] cb_ts) {
		this.cb_ts = cb_ts;
	}

	public CBVariables getCbVariables() {
		return cbVariables;
	}

	public void setCbVariables(CBVariables cbVariables) {
		this.cbVariables = cbVariables;
	}

	public double getATTR001_MISS0() {
		return ATTR001_MISS0;
	}

	public void setATTR001_MISS0(double aTTR001_MISS0) {
		ATTR001_MISS0 = aTTR001_MISS0;
	}

	public double getADV013() {
		return ADV013;
	}

	public void setADV013(double aDV013) {
		ADV013 = aDV013;
	}

	public double getADV027() {
		return ADV027;
	}

	public void setADV027(double aDV027) {
		ADV027 = aDV027;
	}

	public double getADV029() {
		return ADV029;
	}

	public void setADV029(double aDV029) {
		ADV029 = aDV029;
	}

	public double getADV124() {
		return ADV124;
	}

	public void setADV124(double aDV124) {
		ADV124 = aDV124;
	}

	public double getADV221() {
		return ADV221;
	}

	public void setADV221(double aDV221) {
		ADV221 = aDV221;
	}

	public double getADV902() {
		return ADV902;
	}
	public void setADV902(double aDV902) {

		ADV902 = aDV902;
	}

	public double getPctdec_ATTR013() {
		return pctdec_ATTR013;
	}

	public void setPctdec_ATTR013(double pctdec_ATTR013) {
		this.pctdec_ATTR013 = pctdec_ATTR013;
	}

	public double getDec1() {
		return dec1;
	}

	public void setDec1(double dec1) {
		this.dec1 = dec1;
	}

	public double getDec2() {
		return dec2;
	}

	public void setDec2(double dec2) {
		this.dec2 = dec2;
	}

	public double getDec3() {
		return dec3;
	}

	public void setDec3(double dec3) {
		this.dec3 = dec3;
	}

	public double getDec4() {
		return dec4;
	}

	public void setDec4(double dec4) {
		this.dec4 = dec4;
	}

	public double getDec5() {
		return dec5;
	}

	public void setDec5(double dec5) {
		this.dec5 = dec5;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

	public double getRat_1_ATTR107_ATTR001() {
		return rat_1_ATTR107_ATTR001;
	}

	public void setRat_1_ATTR107_ATTR001(double rat_1_ATTR107_ATTR001) {
		this.rat_1_ATTR107_ATTR001 = rat_1_ATTR107_ATTR001;
	}

	public double getRat_1_ATTR116_ATTR001() {
		return rat_1_ATTR116_ATTR001;
	}

	public void setRat_1_ATTR116_ATTR001(double rat_1_ATTR116_ATTR001) {
		this.rat_1_ATTR116_ATTR001 = rat_1_ATTR116_ATTR001;
	}

	public double getTs0_ATTR001() {
		return ts0_ATTR001;
	}

	public void setTs0_ATTR001(double ts0_ATTR001) {
		this.ts0_ATTR001 = ts0_ATTR001;
	}
	public double getTs0_ATTR107() {
		return ts0_ATTR107;
	}

	public void setTs0_ATTR107(double ts0_ATTR107) {
		this.ts0_ATTR107 = ts0_ATTR107;
	}

	public double getTs0_ATTR116() {
		return ts0_ATTR116;
	}

	public void setTs0_ATTR116(double ts0_ATTR116) {
		this.ts0_ATTR116 = ts0_ATTR116;
	}

	public double getCHDAP_CURR_CTD_CASH_PRIN() {
		return CHDAP_CURR_CTD_CASH_PRIN;
	}

	public void setCHDAP_CURR_CTD_CASH_PRIN(double cHDAP_CURR_CTD_CASH_PRIN) {
		CHDAP_CURR_CTD_CASH_PRIN = cHDAP_CURR_CTD_CASH_PRIN;
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

	public double getCHDAP_UNPD_CASH_ITEM_AM() {
		return CHDAP_UNPD_CASH_ITEM_AM;
	}

	public void setCHDAP_UNPD_CASH_ITEM_AM(double cHDAP_UNPD_CASH_ITEM_AM) {
		CHDAP_UNPD_CASH_ITEM_AM = cHDAP_UNPD_CASH_ITEM_AM;
	}

	public double getCHD_CTD_AMT_ITEM_CHG() {
		return CHD_CTD_AMT_ITEM_CHG;
	}

	public void setCHD_CTD_AMT_ITEM_CHG(double cHD_CTD_AMT_ITEM_CHG) {
		CHD_CTD_AMT_ITEM_CHG = cHD_CTD_AMT_ITEM_CHG;
	}

	public double getACCTCASH() {
		return ACCTCASH;
	}

	public void setACCTCASH(double aCCTCASH) {
		ACCTCASH = aCCTCASH;
	}

	public int getCASHUSER() {
		return CASHUSER;
	}

	public void setCASHUSER(int cASHUSER) {
		CASHUSER = cASHUSER;
	}

	public int getBuckets() {
		return buckets;
	}

	public void setBuckets(int buckets) {
		this.buckets = buckets;
	}

	public int getBALDEC2() {
		return BALDEC2;
	}

	public void setBALDEC2(int bALDEC2) {
		BALDEC2 = bALDEC2;
	}

	

	public int[] getMonths_del() {
		return months_del;
	}

	public void setMonths_del(int[] months_del) {
		this.months_del = months_del;
	}

	public String getPAYMENT_PATTERN() {
		return PAYMENT_PATTERN;
	}

	public void setPAYMENT_PATTERN(String pAYMENT_PATTERN) {
		PAYMENT_PATTERN = pAYMENT_PATTERN;
	}

	public String getStick() {
		return stick;
	}

	public void setStick(String stick) {
		this.stick = stick;
	}

	public int getDELMAX3() {
		return DELMAX3;
	}

	public void setDELMAX3(int dELMAX3) {
		DELMAX3 = dELMAX3;
	}

	public double getMEANPAY() {
		return MEANPAY;
	}

	public void setMEANPAY(double mEANPAY) {
		MEANPAY = mEANPAY;
	}

	public double[] getVarrt() {
		return varrt;
	}

	public void setVarrt(double[] varrt) {
		this.varrt = varrt;
	}

	public int getPay_cnt() {
		return pay_cnt;
	}

	public void setPay_cnt(int pay_cnt) {
		this.pay_cnt = pay_cnt;
	}

	public double getTotl_pay_rate() {
		return totl_pay_rate;
	}

	public void setTotl_pay_rate(double totl_pay_rate) {
		this.totl_pay_rate = totl_pay_rate;
	}

	

	public int getMode6() {
		return mode6;
	}

	public void setMode6(int mode6) {
		this.mode6 = mode6;
	}

	public int getNumvar() {
		return numvar;
	}

	public void setNumvar(int numvar) {
		this.numvar = numvar;
	}

	public double getACCTBAL() {
		return ACCTBAL;
	}

	public void setACCTBAL(double aCCTBAL) {
		ACCTBAL = aCCTBAL;
	}

	public double getBalsqrt() {
		return Balsqrt;
	}

	public void setBalsqrt(double balsqrt) {
		Balsqrt = balsqrt;
	}

	public int getSegment_no() {
		return segment_no;
	}

	public void setSegment_no(int segment_no) {
		this.segment_no = segment_no;
	}

	public double getPct100Def() {
		return Pct100Def;
	}

	public void setPct100Def(double pct100Def) {
		Pct100Def = pct100Def;
	}

	public double getDef_bal_to_hist_purch() {
		return def_bal_to_hist_purch;
	}

	public void setDef_bal_to_hist_purch(double def_bal_to_hist_purch) {
		this.def_bal_to_hist_purch = def_bal_to_hist_purch;
	}

	public double getTotal_def_bal() {
		return total_def_bal;
	}

	public void setTotal_def_bal(double total_def_bal) {
		this.total_def_bal = total_def_bal;
	}

	public int getBureauhit() {
		return bureauhit;
	}

	public void setBureauhit(int bureauhit) {
		this.bureauhit = bureauhit;
	}

	public int getDELQDAYS() {
		return DELQDAYS;
	}

	public void setDELQDAYS(int dELQDAYS) {
		DELQDAYS = dELQDAYS;
	}

	public String[] getReason_codes() {
		return reason_codes;
	}

	public void setReason_codes(String[] reason_codes) {
		this.reason_codes = reason_codes;
	}

	public double getAlpha() {
		return alpha;
	}

	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getProbc() {
		return probc;
	}

	public void setProbc(double probc) {
		this.probc = probc;
	}

	public int getSCR_new() {
		return SCR_new;
	}

	public void setSCR_new(int sCR_new) {
		SCR_new = sCR_new;
	}

	public double getTmp_balance() {
		return tmp_balance;
	}

	public void setTmp_balance(double tmp_balance) {
		this.tmp_balance = tmp_balance;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double[] getBals() {
		return bals;
	}

	public void setBals(double[] bals) {
		this.bals = bals;
	}

	public double[] getDue() {
		return due;
	}

	public void setDue(double[] due) {
		this.due = due;
	}

	public double[] getPay() {
		return pay;
	}

	public void setPay(double[] pay) {
		this.pay = pay;
	}

	public int[] getStmt_dates() {
		return stmt_dates;
	}

	public void setStmt_dates(int[] stmt_dates) {
		this.stmt_dates = stmt_dates;
	}

	public int getSKIPPED_DUE_TO_NO_CB() {
		return SKIPPED_DUE_TO_NO_CB;
	}

	public void setSKIPPED_DUE_TO_NO_CB(int sKIPPED_DUE_TO_NO_CB) {
		SKIPPED_DUE_TO_NO_CB = sKIPPED_DUE_TO_NO_CB;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getFLAP_WITHPAY_PLANS() {
		return FLAP_WITHPAY_PLANS;
	}

	public void setFLAP_WITHPAY_PLANS(int fLAP_WITHPAY_PLANS) {
		FLAP_WITHPAY_PLANS = fLAP_WITHPAY_PLANS;
	}

	public double getFLAP_TOTAL_DEF_BAL() {
		return FLAP_TOTAL_DEF_BAL;
	}

	public void setFLAP_TOTAL_DEF_BAL(double fLAP_TOTAL_DEF_BAL) {
		FLAP_TOTAL_DEF_BAL = fLAP_TOTAL_DEF_BAL;
	}

	public double getFLAP_TOTAL_HIST_PURCH() {
		return FLAP_TOTAL_HIST_PURCH;
	}

	public void setFLAP_TOTAL_HIST_PURCH(double fLAP_TOTAL_HIST_PURCH) {
		FLAP_TOTAL_HIST_PURCH = fLAP_TOTAL_HIST_PURCH;
	}

	public double getFLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH() {
		return FLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH;
	}

	public void setFLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH(double fLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH) {
		FLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH = fLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH;
	}

	public int getFlap_unexpired_plans() {
		return flap_unexpired_plans;
	}

	public void setFlap_unexpired_plans(int flap_unexpired_plans) {
		this.flap_unexpired_plans = flap_unexpired_plans;
	}

	public int getCB0_ATTR001() {
		return CB0_ATTR001;
	}

	public void setCB0_ATTR001(int cB0_ATTR001) {
		CB0_ATTR001 = cB0_ATTR001;
	}

	public int getCB0_ATTR002() {
		return CB0_ATTR002;
	}

	public void setCB0_ATTR002(int cB0_ATTR002) {
		CB0_ATTR002 = cB0_ATTR002;
	}

	public int getCB0_ATTR003() {
		return CB0_ATTR003;
	}

	public void setCB0_ATTR003(int cB0_ATTR003) {
		CB0_ATTR003 = cB0_ATTR003;
	}

	public int getCB0_ATTR008() {
		return CB0_ATTR008;
	}

	public void setCB0_ATTR008(int cB0_ATTR008) {
		CB0_ATTR008 = cB0_ATTR008;
	}

	public int getCB0_ATTR011() {
		return CB0_ATTR011;
	}

	public void setCB0_ATTR011(int cB0_ATTR011) {
		CB0_ATTR011 = cB0_ATTR011;
	}

	public int getCB0_ATTR012() {
		return CB0_ATTR012;
	}

	public void setCB0_ATTR012(int cB0_ATTR012) {
		CB0_ATTR012 = cB0_ATTR012;
	}

	public int getCB0_ATTR013() {
		return CB0_ATTR013;
	}

	public void setCB0_ATTR013(int cB0_ATTR013) {
		CB0_ATTR013 = cB0_ATTR013;
	}

	public int getCB0_ATTR017() {
		return CB0_ATTR017;
	}

	public void setCB0_ATTR017(int cB0_ATTR017) {
		CB0_ATTR017 = cB0_ATTR017;
	}

	public int getCB0_ATTR020() {
		return CB0_ATTR020;
	}

	public void setCB0_ATTR020(int cB0_ATTR020) {
		CB0_ATTR020 = cB0_ATTR020;
	}

	public int getCB0_ATTR021() {
		return CB0_ATTR021;
	}

	public void setCB0_ATTR021(int cB0_ATTR021) {
		CB0_ATTR021 = cB0_ATTR021;
	}

	public int getCB0_ATTR023() {
		return CB0_ATTR023;
	}

	public void setCB0_ATTR023(int cB0_ATTR023) {
		CB0_ATTR023 = cB0_ATTR023;
	}

	public int getCB0_ATTR024() {
		return CB0_ATTR024;
	}

	public void setCB0_ATTR024(int cB0_ATTR024) {
		CB0_ATTR024 = cB0_ATTR024;
	}

	public int getCB0_ATTR025() {
		return CB0_ATTR025;
	}

	public void setCB0_ATTR025(int cB0_ATTR025) {
		CB0_ATTR025 = cB0_ATTR025;
	}

	public int getCB0_ATTR061() {
		return CB0_ATTR061;
	}

	public void setCB0_ATTR061(int cB0_ATTR061) {
		CB0_ATTR061 = cB0_ATTR061;
	}

	public int getCB0_ATTR065() {
		return CB0_ATTR065;
	}

	public void setCB0_ATTR065(int cB0_ATTR065) {
		CB0_ATTR065 = cB0_ATTR065;
	}

	public int getCB0_ATTR066() {
		return CB0_ATTR066;
	}

	public void setCB0_ATTR066(int cB0_ATTR066) {
		CB0_ATTR066 = cB0_ATTR066;
	}

	public int getCB0_ATTR106() {
		return CB0_ATTR106;
	}

	public void setCB0_ATTR106(int cB0_ATTR106) {
		CB0_ATTR106 = cB0_ATTR106;
	}

	public int getCB0_ATTR107() {
		return CB0_ATTR107;
	}

	public void setCB0_ATTR107(int cB0_ATTR107) {
		CB0_ATTR107 = cB0_ATTR107;
	}

	public int getCB0_ATTR110() {
		return CB0_ATTR110;
	}

	public void setCB0_ATTR110(int cB0_ATTR110) {
		CB0_ATTR110 = cB0_ATTR110;
	}

	public int getCB0_ATTR111() {
		return CB0_ATTR111;
	}

	public void setCB0_ATTR111(int cB0_ATTR111) {
		CB0_ATTR111 = cB0_ATTR111;
	}

	public int getCB0_ATTR116() {
		return CB0_ATTR116;
	}

	public void setCB0_ATTR116(int cB0_ATTR116) {
		CB0_ATTR116 = cB0_ATTR116;
	}

	public int getCB0_ATTR183() {
		return CB0_ATTR183;
	}

	public void setCB0_ATTR183(int cB0_ATTR183) {
		CB0_ATTR183 = cB0_ATTR183;
	}

	public int getCB0_ATTR260() {
		return CB0_ATTR260;
	}

	public void setCB0_ATTR260(int cB0_ATTR260) {
		CB0_ATTR260 = cB0_ATTR260;
	}

	public int getCB0_ATTR306() {
		return CB0_ATTR306;
	}

	public void setCB0_ATTR306(int cB0_ATTR306) {
		CB0_ATTR306 = cB0_ATTR306;
	}

	public int getCB0_ATTR307() {
		return CB0_ATTR307;
	}

	public void setCB0_ATTR307(int cB0_ATTR307) {
		CB0_ATTR307 = cB0_ATTR307;
	}

	public int getCB0_ATTR380() {
		return CB0_ATTR380;
	}

	public void setCB0_ATTR380(int cB0_ATTR380) {
		CB0_ATTR380 = cB0_ATTR380;
	}

	public List<ScoreFormula> getScoreFrmulaVariable() {
		return scoreFrmulaVariable;
	}

	public void setScoreFrmulaVariable(List<ScoreFormula> scoreFrmulaVariable) {
		this.scoreFrmulaVariable = scoreFrmulaVariable;
	}

	public double getCmpATTR107() {
		return cmpATTR107;
	}

	public void setCmpATTR107(double cmpATTR107) {
		this.cmpATTR107 = cmpATTR107;
	}

	public String getCHD_EXTERNAL_STATUS() {
		return CHD_EXTERNAL_STATUS;
	}

	public void setCHD_EXTERNAL_STATUS(String cHD_EXTERNAL_STATUS) {
		CHD_EXTERNAL_STATUS = cHD_EXTERNAL_STATUS;
	}

	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}

	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}

	@Override
	public String toString() {
		return "DerviedVariables [cbVariables=" + cbVariables + ", scoreFrmulaVariable=" + scoreFrmulaVariable
				+ ", ATTR001_MISS0=" + ATTR001_MISS0 + ", ACCOUNT_ID=" + ACCOUNT_ID + ", CB0_ATTR001=" + CB0_ATTR001
				+ ", CB0_ATTR002=" + CB0_ATTR002 + ", CB0_ATTR003=" + CB0_ATTR003 + ", CB0_ATTR008=" + CB0_ATTR008
				+ ", CB0_ATTR011=" + CB0_ATTR011 + ", CB0_ATTR012=" + CB0_ATTR012 + ", CB0_ATTR013=" + CB0_ATTR013
				+ ", CB0_ATTR017=" + CB0_ATTR017 + ", CB0_ATTR020=" + CB0_ATTR020 + ", CB0_ATTR021=" + CB0_ATTR021
				+ ", CB0_ATTR023=" + CB0_ATTR023 + ", CB0_ATTR024=" + CB0_ATTR024 + ", CB0_ATTR025=" + CB0_ATTR025
				+ ", CB0_ATTR061=" + CB0_ATTR061 + ", CB0_ATTR065=" + CB0_ATTR065 + ", CB0_ATTR066=" + CB0_ATTR066
				+ ", CB0_ATTR106=" + CB0_ATTR106 + ", CB0_ATTR107=" + CB0_ATTR107 + ", CB0_ATTR110=" + CB0_ATTR110
				+ ", CB0_ATTR111=" + CB0_ATTR111 + ", CB0_ATTR116=" + CB0_ATTR116 + ", CB0_ATTR183=" + CB0_ATTR183
				+ ", CB0_ATTR260=" + CB0_ATTR260 + ", CB0_ATTR306=" + CB0_ATTR306 + ", CB0_ATTR307=" + CB0_ATTR307
				+ ", CB0_ATTR380=" + CB0_ATTR380 + ", cb_ts=" + Arrays.toString(cb_ts) + ", bureauhit=" + bureauhit
				+ ", ADV013=" + ADV013 + ", ADV027=" + ADV027 + ", ADV029=" + ADV029 + ", ADV124=" + ADV124
				+ ", ADV221=" + ADV221 + ", ADV902=" + ADV902 + ", pctdec_ATTR013=" + pctdec_ATTR013 + ", dec1=" + dec1
				+ ", dec2=" + dec2 + ", dec3=" + dec3 + ", dec4=" + dec4 + ", dec5=" + dec5 + ", dec=" + dec
				+ ", rat_1_ATTR107_ATTR001=" + rat_1_ATTR107_ATTR001 + ", rat_1_ATTR116_ATTR001="
				+ rat_1_ATTR116_ATTR001 + ", ts0_ATTR001=" + ts0_ATTR001 + ", ts0_ATTR107=" + ts0_ATTR107
				+ ", ts0_ATTR116=" + ts0_ATTR116 + ", CHDAP_CURR_CTD_CASH_PRIN=" + CHDAP_CURR_CTD_CASH_PRIN
				+ ", CHDAP_OPEN_CYC_CASH_INTSC=" + CHDAP_OPEN_CYC_CASH_INTSC + ", CHDAP_OPEN_CYC_CASH_PRIN="
				+ CHDAP_OPEN_CYC_CASH_PRIN + ", CHDAP_UNPD_CASH_ITEM_AM=" + CHDAP_UNPD_CASH_ITEM_AM
				+ ", CHD_CTD_AMT_ITEM_CHG=" + CHD_CTD_AMT_ITEM_CHG + ", ACCTCASH=" + ACCTCASH + ", CASHUSER=" + CASHUSER
				+ ", buckets=" + buckets + ", BALDEC2=" + BALDEC2 + ", months_del=" + Arrays.toString(months_del)
				+ ", PAYMENT_PATTERN=" + PAYMENT_PATTERN + ", stick=" + stick + ", DELMAX3=" + DELMAX3 + ", MEANPAY="
				+ MEANPAY + ", varrt=" + Arrays.toString(varrt) + ", pay_cnt=" + pay_cnt + ", totl_pay_rate="
				+ totl_pay_rate + ", mode6=" + mode6 + ", numvar=" + numvar + ", ACCTBAL=" + ACCTBAL + ", Balsqrt="
				+ Balsqrt + ", segment_no=" + segment_no + ", Pct100Def=" + Pct100Def + ", def_bal_to_hist_purch="
				+ def_bal_to_hist_purch + ", total_def_bal=" + total_def_bal + ", DELQDAYS=" + DELQDAYS
				+ ", reason_codes=" + Arrays.toString(reason_codes) + ", alpha=" + alpha + ", sum=" + sum + ", probc="
				+ probc + ", SCR_new=" + SCR_new + ", tmp_balance=" + tmp_balance + ", x=" + x + ", cmpATTR107="
				+ cmpATTR107 + ", bals=" + Arrays.toString(bals) + ", due=" + Arrays.toString(due) + ", pay="
				+ Arrays.toString(pay) + ", stmt_dates=" + Arrays.toString(stmt_dates) + ", SKIPPED_DUE_TO_NO_CB="
				+ SKIPPED_DUE_TO_NO_CB + ", FLAP_WITHPAY_PLANS=" + FLAP_WITHPAY_PLANS + ", FLAP_TOTAL_DEF_BAL="
				+ FLAP_TOTAL_DEF_BAL + ", FLAP_TOTAL_HIST_PURCH=" + FLAP_TOTAL_HIST_PURCH
				+ ", FLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH=" + FLAP_TOT_DEF_BAL_TO_TOT_HIST_PURCH
				+ ", flap_unexpired_plans=" + flap_unexpired_plans + ", CHD_EXTERNAL_STATUS=" + CHD_EXTERNAL_STATUS
				+ "]";
	}

	

}
