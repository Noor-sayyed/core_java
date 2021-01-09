package day6.ArrayList;
import java.util.*;
import day6.bean.HospitalBean;

//Implement code with ArrayList with HospitalBean bean and normal for loop
public class Ex1 {

	public static void main(String[] args) {
		HospitalBean hospBean1=new HospitalBean(414, "Dr.Agrawal(MBBS)", 300);
		HospitalBean hospBean2=new HospitalBean(5012, "Dr.A.M. Bhandari(MD)", 700);
		HospitalBean hospBean3=new HospitalBean(9001, "Dr.Vaswani(Surgeon)", 2000);
		HospitalBean hospBean4=new HospitalBean(7701, "Dr.Raja(Ortho)", 500);
		
		ArrayList<HospitalBean> arrayList=new ArrayList<HospitalBean>();
		arrayList.add(hospBean1);
		arrayList.add(hospBean2);
		arrayList.add(hospBean3);
		arrayList.add(hospBean4);
		
		for(int i=0;i<arrayList.size();i++) {
			HospitalBean x=arrayList.get(i);
			System.out.println(x);
		
	}
}
}
