package day6.HashMap;
import java.util.*;
import day6.bean.SmartPhone;
//vii) Implement code with HashMap with 7th bean and Iterator 
//SmartPhone  Bean
public class Ex1 {

	public static void main(String[] args) {
		SmartPhone phone1=new SmartPhone("Samsung", 22000);
		SmartPhone phone2=new SmartPhone("ViVo", 12000);
		SmartPhone phone3=new SmartPhone("One+", 35000);
		SmartPhone phone4=new SmartPhone("Oppo", 20000);
	
		Map<String,SmartPhone> hashSmartPhone=new HashMap<String,SmartPhone>();
		hashSmartPhone.put("BixBy", phone1);
		hashSmartPhone.put("Ios", phone2);
		hashSmartPhone.put("IoS", phone3);
		hashSmartPhone.put("Android", phone4);
		
		Set<String> setOfPhones=hashSmartPhone.keySet();
	    Iterator<String> itr=setOfPhones.iterator()	;
	    System.out.println("Displaying using Iterator!!\n");
	    
	    while(itr.hasNext()) {
	    	String key=itr.next();
	        SmartPhone s=hashSmartPhone.get(key);
	        
	        System.out.println(key+" "+s);
	        
	    }
	}
	
}
//check for Simran code Saturday1 on OneDrive