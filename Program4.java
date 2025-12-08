import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println(UserMainCode.repeatFront(s,n));
		
	}
	}
	
class UserMainCode{
	public static String repeatFront(String s,int n){
		int len=s.length();
		String ans="";
		if(len==0){
			return s;
		}
		else if(len<3){
			for(int i=0;i<n;i++){
				ans+=s;
			}
			}
			else{
				String s1=s.substring(0,3);
				for(int i=0;i<n;i++){
					ans+=s1;
				}
			}
		return ans;
	} 
}