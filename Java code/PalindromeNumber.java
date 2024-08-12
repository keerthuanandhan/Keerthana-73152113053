import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        for(int i=0;i<num;i++) {
        	int d=num%10;
        	sum=(sum*10)+d;
        	num/=10;
        }
        if(sum==n)
        	System.out.println("Palindrome");
        else
        	System.out.println("Not a Palindrome");
        sc.close();    
	}

}
