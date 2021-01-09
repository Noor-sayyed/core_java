package day5.hashmap;

import java.util.*;

public class PracticeEx1 {

	public static void main(String[] args) {
		Map<Long,String> db=new HashMap<Long,String>();
		db.put(558796412355L,"Credit Card");//using L for long int
		db.put(685000123155L,"Debit Card");
		db.put(302501400177L,"Aadhar Card");
		db.put(550000023155L,"Ration Card");
		
		System.out.println(db);
	}
}
