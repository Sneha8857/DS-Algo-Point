import java.util.*;

class primeNo
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number);
        int num= sc.nextInt();
        int c=0;
        for(int i=1;i<=num; i++)
        {
           if(num%i==0)
           c++;
        }
        if (c == 2)
          System.out.println(num +" is a prime number");
        else
          System.out.println(num +" is not a prime number");
      }
 }
