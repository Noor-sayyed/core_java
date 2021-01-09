package Student;

import java.util.Scanner;

public class Student {
private int rollno;
private String name;
private int total;
private int marks[];
private float percentage;
public Student()
{
	super();
	this.rollno = 1;
	this.name ="sam";
	this.total = 3;
	this.percentage =80.0f;
	 marks=new int[total];
}
public Student(int rollno, String name,int total) {
	this.rollno = rollno;
	this.name = name;
	this.total = total;
	 marks=new int[total];
	 
}
public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Roll Number:");
	rollno=sc.nextInt();
	System.out.println("Enter Name:");
	name=sc.next();
	System.out.println("Enter Total Number of Subjects:");
	total=sc.nextInt();
	 marks=new int[total];
	System.out.println("Enter "+total+" Subject Marks:");
	for(int i=0;i<total;i++)
	{
		marks[i]=sc.nextInt();
	}
	totalmarks(marks);
}
public boolean equals(Student s)
{
	if(this.percentage==s.percentage)
		return true;
	else
		return false;
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", percentage="
			+ percentage + "]";
}
public void totalmarks(int...n)
{
	int i,res=0;
	for(i=0;i<n.length;i++)
		res+=n[i];
	System.out.println("Total:"+res);
	percentage=(res/total);
	System.out.println("Percentage scored is:"+percentage);
}
public void calGrade()
{
	if(percentage<40)
		System.out.println("You are Fail!");
	else if(percentage>=40&&percentage<60)
		System.out.println("You have scored C Grade!");
	else if(percentage>=60&&percentage<70)
		System.out.println("You have scored B Grade");
	else if(percentage>=70&&percentage<850)
			System.out.println("You have scored A Grade");
	else
		System.out.println("You have scored O Grade!");
}
}
