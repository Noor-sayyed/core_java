package day4.InnerClass;

import day4.InnerClass.OuterClass.InnerClass;

public class TestOuterClass {
	
	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		System.out.println(outerClass.x);
		InnerClass myInner = outerClass.new InnerClass();
		System.out.println(myInner.y);
	    //System.out.println(myInner.y + outerClass.x);
	}

}
