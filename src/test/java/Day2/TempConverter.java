package Day2;

public class TempConverter {
	private TempConversionService Tconversion;

	public void setTconversion(TempConversionService tconversion) {
		Tconversion = tconversion;
	}
	
	public double FtoC(double dtemp) {
		return Tconversion.FtoC(dtemp);
	}
	public double CtoF(double dtemp) {
		return Tconversion.CtoF(dtemp);
	}
	
}
