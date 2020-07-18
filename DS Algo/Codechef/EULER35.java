import java.util.Scanner;
import java.util.Arrays;
public class EULER35
{
  static boolean[] prime=new boolean[1000001];
  static void preprocess()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(1000000);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=1000000;j+=i)
        {
          prime[j]=false;
        }
      }
    }
  }
        
      
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int ans=0;
    preprocess();
    for(int i=2;i<=1000000;i++)
    {
      //System.out.println(i);
      boolean flag=true;
      if(prime[i])
      {
        String s=i+"";
        char[] ch=s.toCharArray();
        for(int j=0;j<s.length()-1;j++)
        {
          //System.out.println(i);
          char c=ch[0];
          for(int k=0;k<s.length()-1;k++)
          {
            ch[k]=ch[k+1];
          }
          ch[s.length()-1]=c;
          String t=new String(ch);
          int n=Integer.parseInt(t);
          if(!prime[n]) {
            flag=false;
            break;
          }
        }
        if(flag) ans++;
      }
      //System.out.println(i);
    }
    System.out.println(ans);
  }
}
          
    