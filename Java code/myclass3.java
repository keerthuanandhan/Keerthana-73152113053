import java.util.*;
public class myclass3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++){
sum=sum+arr[i];
}
System.out.println(sum);
sc.close();
}
}
