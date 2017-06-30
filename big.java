import java.io.*;
import java.util.*;
class big
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.next();
int b=sc.next();
int c=sc.next();
if(a<b)
{
if(a<c)
{
System.out.println(a);
}
else{
System.out.println(c);
}
}
else
{
System.out.println(b);
}
}
}
