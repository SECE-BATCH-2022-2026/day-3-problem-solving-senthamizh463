import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum=UserMainCode.calculateSum(a,b,c);
		System.out.println(sum);
		sc.close();
		}
	}
	
class UserMainCode{
	public static int calculateSum(int a,int b,int c){
		if(a==13){
			if(c==13){
				return 0;
			}else{
			return c;
			}
		}
		else if(b==13){
			return a;
		}
		else if(c==13){
			return a+b;
		}
		else{
			return a+b+c;
		}
	}
}

