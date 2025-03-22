import java.util.Scanner;
class userinput{
	public static void main (String[] args){
		String fname;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your first name:");
		fname=sc.nextLine();
		
		System.out.println("enter the last name:");
		
		String lname =sc.next();
		
		System.out.println("enter your age :");
		int age=sc.nextInt();
		
		System.out.println("enter your reg no :");
		String reg_no=sc.next();
		
		System.out.println("enter your sex :");
		String sex=sc.next();
		
		System.out.println("enter your mobile number :");
		long mo_no=sc.nextLong();
		
		System.out.println("enter your gpa :");
		double gpa=sc.nextDouble();
		
		
		System.out.println("fullname :"+fname+" "+lname+" "+"\n"+"age :"+age+"\n"+"registration number :"+reg_no+"\n"+"sex :"+sex+"\n"+"mobile number :"+mo_no);
		
	}
}