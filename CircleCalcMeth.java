import java.math.BigDecimal;

public class CircleCalcMeth {
	public double circle;
	public double circumference;
	public double area;
	public String FormattedArea;
	public String FormattedCircumference;
	
	
	
	public CircleCalcMeth (double r) {
		circle = r;
		circumference = Math.PI*r*2;
		area = Math.PI*r*r;
		
		BigDecimal F_Area = new BigDecimal(area).setScale(2, BigDecimal.ROUND_HALF_UP);
		String F_AreaString = String.valueOf(F_Area.doubleValue());
		FormattedArea = F_AreaString;
		
		BigDecimal F_Circumference = new BigDecimal(circumference).setScale(2, BigDecimal.ROUND_HALF_UP);
		String F_CircumferenceString = String.valueOf(F_Area.doubleValue());
		FormattedCircumference = F_CircumferenceString;
		
				
	}
	
	
	public double getCircumference() {
				
		return circumference;
	}
	public String getFormattedCircumference() {
			
			return FormattedCircumference; 
			}	
	
	
	public double getArea() {
			return area; 
		
	}
	public String getFormattedArea() {
		
		return FormattedArea; 
		}
		
}

