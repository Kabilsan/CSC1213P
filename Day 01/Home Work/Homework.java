class Operators{
	public static void main(String[] args)
	{
		//Unary Operators
		int a=25;
		int b=-a;
		System.out.println("Unary Operator: "+b);
		
		//Logical Operators
		boolean N=true;
		boolean M=false;
		System.out.println("Logical 'AND' : "+(N&&M));
		System.out.println("Logical 'OR' : "+(N||M));
		System.out.println("Logical 'NOT' : "+(!M));
		
		//Relational Operators
		int X=7,Y=20;
		System.out.println("Relational Greater than : "+(X>Y));
		System.out.println("Relational Less than : "+(X<Y));
		System.out.println("Relational Equals : "+(X==Y));
		System.out.println("Relational Not Equals : "+(X!=Y));
		
		//Assignment Operators
		int K=10;
		K+=4;
		System.out.println("Assignment Operator : "+K);
		
		//Terrory Operators
		int i=10,j=36;
		int MaxVal=(i>j)?i:j;
		System.out.println("Terrory Operator : "+MaxVal);
		
	}
}