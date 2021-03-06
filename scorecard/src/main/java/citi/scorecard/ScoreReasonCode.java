package citi.scorecard;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ScoreReasonCode implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String formula;
   private int reasonCode;
   private double calcualedValue;

   public ScoreReasonCode()
   {
   }

   public java.lang.String getFormula()
   {
      return this.formula;
   }

   public void setFormula(java.lang.String formula)
   {
      this.formula = formula;
   }

   public int getReasonCode()
   {
      return this.reasonCode;
   }

   public void setReasonCode(int reasonCode)
   {
      this.reasonCode = reasonCode;
   }

   public double getCalcualedValue()
   {
      return this.calcualedValue;
   }

   public void setCalcualedValue(double calcualedValue)
   {
      this.calcualedValue = calcualedValue;
   }

   public ScoreReasonCode(java.lang.String formula, int reasonCode,
         double calcualedValue)
   {
      this.formula = formula;
      this.reasonCode = reasonCode;
      this.calcualedValue = calcualedValue;
   }
@Override
	public String toString() {
		return "ScoreReasonCode [formula=" + formula + ", reasonCode=" + reasonCode + ", calcualedValue="
				+ calcualedValue + "]";
	}
}