/**
 * Financial
 * CS-160 Summer 2024
 * @author Patty Kraft
 * @date 10-Jun-2024
 */
public class Finances {
	double PE;
	double EPS;
	boolean hasDiv;
	
	public Finances() {
		PE = 0.0;
		EPS = 0.0;
		hasDiv = false;
	}
	
	public Finances(double PE, double EPS, boolean hasDiv) {
		this.PE = PE;
		this.EPS = EPS;
		this.hasDiv = hasDiv;
	}

	public double getPE() {
		return PE;
	}

	public void setPE(double pE) {
		PE = pE;
	}

	public double getEPS() {
		return EPS;
	}

	public void setEPS(double ePS) {
		EPS = ePS;
	}

	public boolean hasDividends() {
		return this.hasDiv;
	}
	
	@Override
	public String toString() {
		return "Price/Earnings: " + PE + "; Earnings/Share: "  + EPS + "; Dividends: " + hasDiv;
	}
	
	
}
