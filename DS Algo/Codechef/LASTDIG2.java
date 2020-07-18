import java.util.*;
public class LASTDIG2
{
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      String a=sc.next();
      long b=sc.nextLong();
      if(b==0){ System.out.println(1);t-=1;continue;}   
      int aa=a.charAt(a.length()-1)-'0';
      long bb=b%4;
      if(bb==0) bb=4;
      double ans=((Math.pow(aa,bb))%10);
      System.out.println((int)ans);
      t-=1;}}}
      
      