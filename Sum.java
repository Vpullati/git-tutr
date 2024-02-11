import java.util.Scanner;
class ReverseNumber{
    public static void main(String[]args){
        int n,r,sum=0;
    System.out.println("Enter a new Number:");
    Scanner sc =new Scanner;
    n=sc.nextInt;
    while(n>0)
    {
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    System.out.println(sum of digits is:");
    }
}