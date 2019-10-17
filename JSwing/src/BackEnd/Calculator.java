package BackEnd;

public class Calculator {

	public static String add(String arg1, String arg2) {
		return Integer.parseInt(arg1)+Integer.parseInt(arg2)+"";
	}
	
	public static String sub(String arg1, String arg2) {
		return Integer.parseInt(arg1)-Integer.parseInt(arg2)+"";
	}
	
	public static String multiply(String arg1, String arg2) {
		return Integer.parseInt(arg1)*Integer.parseInt(arg2)+"";
	}
	
	public static String divide(String arg1, String arg2) {
		float ans =0.0f;
		try {
		ans=(float) Integer.parseInt(arg1)/Integer.parseInt(arg2);
		}
		catch (Exception e){
			System.out.println("divide by 0 "+e);
		}
		return ans+"";
	}
	
	
}
