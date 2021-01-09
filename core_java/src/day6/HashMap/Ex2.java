package day6.HashMap;

//vi) Implement code with HashMap with 6th bean and foreach loop 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import day6.bean.SmartPhone;

public class Ex2 {

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
	    
	    System.out.println("Displaying using for each!!\n");
	    
	    for(String s:setOfPhones) {
	    	SmartPhone smartPhone=hashSmartPhone.get(s);
	    	System.out.println(s+" "+smartPhone);
	    }
	
	}
}
