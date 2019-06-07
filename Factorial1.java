import java.util.*;
import java.lang.*;
public class Factorial1
{
public static void main(String[] args)
{
int num,i;
long factorial=1;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;++i)
{
factorial=factorial*i;
}
System.out.println(factorial);
}
}
