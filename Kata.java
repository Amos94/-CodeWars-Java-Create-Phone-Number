public class Kata {
	
  //rookie version
  public static String createPhoneNumber(int[] numbers) {
    String no = "(";
    
    for(int i=0; i<numbers.length; ++i) {
    	if(i<2) {
    		no += "" + i;
    	}else if(i==2) {
    		no += "" + i + ") ";
    	}else if(i>2 && i<5) {
    		no += ""+i;
    	}else if(i == 5){
    		no += ""+i+"-";
    	}else {
    		no += ""+i;
    	}
    	
    }
    
    return no;
  }
  
  //cleverVersion
  public static String createPhoneNumberClever(int[] numbers) {
	  return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
  }
  
}