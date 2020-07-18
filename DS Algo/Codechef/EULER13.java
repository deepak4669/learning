import java.util.Scanner;
public class EULER13
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    int carry=0;
    String ans="";
    for(int i=49;i>=0;i--)
    {
      int sum=0;
      for(int j=0;j<n;j++)
      {
        sum+=Integer.parseInt(s[j].substring(i,i+1));
      }
      sum+=carry;
      ans+=sum%10;
      carry=(sum/10);
    }
    ans+=carry;
    String final_ans="";
    for(int i=ans.length()-1;i>=0;i--)
    {
      final_ans+=ans.substring(i,i+1);
    }
    System.out.println(final_ans.substring(0,10));
  }
}
               
        
        
      
      