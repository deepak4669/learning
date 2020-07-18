import java.util.Scanner;
import java.util.HashMap;
public class Main499B
{
  public static HashMap<String,String> map=new HashMap<String,String>();
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   for(int i=0;i<m;i++)
   {
     String a=sc.next();
     String b=sc.next();
     map.put(a,b);
   }
   String[] ans=new String[n];
   for(int i=0;i<n;i++)
   {
     String a=sc.next();
     if(a.length()>map.get(a).length())
       ans[i]=map.get(a);
     else
       ans[i]=a;
     
   }
   for(int i=0;i<n;i++)
   {
     System.out.print(ans[i]+" ");
   }
   System.out.println();
  }
}