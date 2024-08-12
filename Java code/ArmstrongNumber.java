import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        while(num!=0) {
        	int d=num%10;
        	sum=sum+(d*d*d);
        	num/=10;
        }
        if(sum==n) {
        	System.out.println(n+" is armstrong number");
        }
        else {
        	System.out.println(n+ " is not armstrong number");
        }
        sc.close();
	}

}
