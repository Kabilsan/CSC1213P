class deatils{
	public static void main(String args[]){
		
		String name,address,dob,sex;
		int age;
		name=args[0];
		address=args[1];
		dob=args[2];
		sex=args[3];
		age=Integer.parseInt(args[4]);
		
		System.out.print("name: "+name+"\n"+"address :"+address+"\n"+"Date of birth :"+dob+"\n"+"sex :"+sex+"\n"+"age :"+age+"\n");
		
		int a=10;
		int c=a+age;
		
		System.out.println("age is :"+c);
	}
	}