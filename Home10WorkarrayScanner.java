package Homeworks2month;

public class Home10WorkarrayScanner {

	public static void main(String[] args) {
		
		
		String [] country = {"TURKEY","USA","ITALY","JAPAN"};	
		
		
		
		String capital = null;
		
		for(int a=0;a<country.length;a++) {
			
			switch (country[a]) {
			
			case "TURKEY":
				capital="ANKARA";
				break;
				
			case "USA":
				capital="DC";
				break;
				
			case "ITALY":
				capital="ROME";
				break;
			case "JAPAN":
				capital="TOKYO";
				break;
				default:
					capital="unknown";
			break;
			
			}
			
			
			System.out.println("the capital of "+country[a]+ " is "+ capital);
					
		}
		
		System.out.println("  =============================== ");
		
		
		
		for (String a:country) {
			
			
			if(a.equals("TURKEY")) {
				capital = "ANKARA";
				
			}else if (a.equals("USA")) {
				
				capital="DC";
				
			}else if (a.equals("ITALY")) {
				
				capital="ROME";
				
			}else if (a.equals("JAPAN")) {
				
				capital="TOKYO";
			}
			
			
		
			
			
			
			System.out.print(" the capital of " + a+" is "+ capital);
			System.out.println("==");
			
			
		
		}
		
		
	}

}
