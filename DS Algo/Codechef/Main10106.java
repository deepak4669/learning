import java.util.*;
public class Main10106
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
    {
      String x=sc.next();
      String y=sc.next();
      String min="";
      String mul="";
      if(x.equals("0")||y.equals("0"))
      {
        System.out.println(0);
        //break;
      }
      else{ 
      if(x.length()<y.length())
      {
        min=x;
        mul=y;
      }
      else
      {
        min=y;
        mul=x;
      }
      
        
      
      
      int mx=Math.max(x.length(),y.length());
      int mn=Math.min(x.length(),y.length());
      
      int[][] sol=new int[mn][2*mx];
      for(int i=0;i<mn;i++)
      {
        int k=i;
        int p=Integer.parseInt(min.substring(min.length()-i-1,min.length()-i));
        int carry=0;
        
        for(int j=0;j<mx;j++)
        {
          int q=Integer.parseInt(mul.substring(mul.length()-j-1,mul.length()-j));
          int r=p*q+carry;
          sol[i][j+i]=r%10;
          carry=r/10;
        }
        sol[i][i+mx]=carry;
      }
      /*
      for(int i=0;i<mn;i++)
      {
        for(int j=0;j<2*mx;j++)
        {
          System.out.print(sol[i][j]+" ");
        }
        System.out.println();
      }
      */
      
      
      
      int[] ans=new int[2*mx];
      int carry=0;
      for(int i=0;i<2*mx;i++)
      {
        int r=carry;
        for(int j=0;j<mn;j++)
        {
          r+=sol[j][i];         
          
        }
        ans[i]=r%10;
        carry=r/10;
      }
      String final_ans="";
      for(int i=ans.length-1;i>=0;i--)
      {
        final_ans+=ans[i]+"";
      }
      for(int i=0;i<final_ans.length();i++)
      {
        if(Integer.parseInt(final_ans.substring(i,i+1))!=0)
        {
          final_ans=final_ans.substring(i,final_ans.length());
          break;
        }
      }
      System.out.println(final_ans);
      
      //System.out.println();
    }
    }
  }
}
          
          
          
          
          
          
      
      
      
  