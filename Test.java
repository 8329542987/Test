//Adding library// 
import java.util.*;
class Test
{
	public static void main(String[] arg)
	{
		//declaration of choice//
		int choice;	
		char ans;	
		Scanner sc=new Scanner(System.in);		//Taking a scanner collection to get the an input//
		System.out.println("Enter choice\n");
		System.out.println("----------------------------------------------------- Enter choice : --------------------------------------------------------");
		System.out.println("1.Check prime or not");
		System.out.println("2.Sum of Digit");
		System.out.println("3.Fibonacci series");
		System.out.println("4. Check amstrong or not ");
		System.out.println("5.Find out the greatest ");
		System.out.println("6.Calculator");
		
		System.out.println("----------------------------------------------------- select --------------------------------------------------------");

		choice=sc.nextInt();
		
		System.out.println("-----------------------------------------------------After selection --------------------------------------------------------");
		do
		{
		//Using Switch case concept ....//
		switch(choice)
		{
			case 1:
				//declaration of variable//
				int num;
				int i=2,count=0;
				Scanner f=new Scanner(System.in);
				System.out.println("Enter the num");
				num=f.nextInt();	
				while(i<num)							//Looping //
				{
					if(num%i==0)
					{
						count++;
					}
					i++;
				}
				
				System.out.print("Result :");	
				if(count>=1)							//condition//
				{
					System.out.println("It is not a prime numebr");
				}				
				else
				{
					System.out.println("It is a prime numeber");
				}
				break;
			
			case 2 :
				//Declaration of variable//
				int num1;
				int rem,sum1=0;
				Scanner se=new Scanner(System.in);
				System.out.println("Enter the num");
				num1=se.nextInt();
				while(num1>0)						//looping //
				{
					rem=num1%10;
					sum1=sum1+rem;
					num1=num1/10;
				
				}
				System.out.println("Sum of digit is "+ sum1);
				
				break;
			
			case 3 :
				//Declaration of variable //
				int num2;
				int first=0,second=1,sum2,j=1;
				Scanner t=new Scanner(System.in);
				System.out.println("Enter the number");
				num2=t.nextInt();
				while(j<=num2)						//looping
				{
					sum2=first+second;
					System.out.println(sum2);
					first=second;
					second=sum2;
					j++;
				}
				break;

			case 4 :
				//declaration of variable//
				int num3;
				int r,sum3=0;
				
				Scanner input=new Scanner(System.in);
				System.out.println("Enter the number");	
				num3=input.nextInt();
				int y=num3;
				while(num3>0)
				{
					r=num3%10;
					sum3=sum3+(r*r*r);
					num3=num3/10;
				}
				System.out.println(sum3);
				if(y==sum3)
				{
					System.out.println("It is amstrong number");
				}
				else
				{
					System.out.println("It is not a amstring numeber");
				}
				break;
			case 5 :
				int numb1,numb2,numb3;
				
				Scanner scn =new Scanner(System.in);
				System.out.println("Enter the value of numb1 is :");
				numb1=scn.nextInt();
				System.out.println("Enter the value of numb2 is :");
				numb2=scn.nextInt();
				System.out.println("Enter the value of numb3 is :");
				numb3=scn.nextInt();
				
				if(numb1>numb2 && numb1>numb3)						//condition//
				{
					System.out.println("Value of numb1 is greater");

				}
				else if(numb2>numb1 && numb2>numb3)
				{
					System.out.println("Value of numb2 is greater");
				}				
				else if(numb3>numb1 && numb3>numb2)
				{
					System.out.println("Value of numb3 is greater");
				}
				break;
		
			case 6 :
				//declaration //
				int op;
				Scanner scnt=new Scanner(System.in);
				
				System.out.println("Operation :");	
				System.out.println("1.Addition");
				System.out.println("2.Substraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				op=scnt.nextInt();
				
				
				//using the switch case concept//
				switch(op)
				{
					case 1 :
						//declaration//
						int add;
						int number1,number2;
						System.out.println("Enter the first number");			
						number1=scnt.nextInt();
			
						System.out.println("Enter the second number");
						number2=scnt.nextInt();
						
						//operation //
						add = number1+number2;
						System.out.println("The addition of  two number is  :"+add);
						break;
				
					case 2 :
						//declaration//
						int sub;
						int number3,number4;
						System.out.println("Enter the first number");			
						number3=scnt.nextInt();
			
						System.out.println("Enter the second number");
						number4=scnt.nextInt();
						
						//operation//
						sub=number3-number4;
						System.out.println("Substraction of two number is :"+sub);
						break;
			
					case 3 :
						int mul;
						int number5,number6;
						System.out.println("Enter the first number");			
						number5=scnt.nextInt();
			
						System.out.println("Enter the second number");
						number6=scnt.nextInt();
						
						//operation//
						mul=number5*number6;
						System.out.println("Multiplication of two number :"+mul);
						break;
		
					case 4 :
						//declaration//
						int div;
						int number7,number8;
						System.out.println("Enter the first number");			
						number7=scnt.nextInt();
			
						System.out.println("Enter the second number");
						number8=scnt.nextInt();
						
						//operation//
						div=number7/number8;
						System.out.println("Division of two numeber :"+div);
						break;
					default :
						System.out.println("Invalid choice");
	
				}
				break;
			default : 
				System.out.println("Invalid choice");

				
		}
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("-----------------------------------------------------Do you want to perform any other Program Y/N--------------------------------------------------------");

			System.out.println("\n");
			ans=sc.next().charAt(0);
		}while(ans=='Y' || ans=='y');
		
		
		
	}
}