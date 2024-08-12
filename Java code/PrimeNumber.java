import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++) {
        	if(n%i==0) {
        		count++;
        	}
        }
        if(count==0 && n>1) {
        	System.out.println(n+" is Prime");
        }
        else {
        	System.out.println(n+ " is not Prime");
        }
        sc.close();
	}
}
