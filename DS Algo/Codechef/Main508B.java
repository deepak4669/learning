import java.util.Scanner;
public class Main508B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int k=0;
    int[] index=new int[s.length()];
    for(int i=0;i<s.length();i++)
    {
      if(Integer.parseInt(s.substring(i,i+1))%2==0)
      {
        index[k++]=i;
      }
    }
    if(k==0)
      System.out.println(-1);
    else
    {
      char[] ch=s.toCharArray();
      //String ans="";
      boolean flag=true;
      for(int i=0;i<k;i++)
      {
        if(Integer.parseInt(ch[s.length()-1]+"")>=Integer.parseInt(s.substring(index[i],index[i]+1)))
        {
          char temp=ch[s.length()-1];
          ch[s.length()-1]=ch[index[i]];
          ch[index[i]]=temp;
          flag=false;
          break;
        }
      }
      if(flag)
      {
        char temp=ch[s.length()-1];
        ch[s.length()-1]=ch[index[k-1]];
        ch[index[k-1]]=temp;
      }
      String ans=new String(ch);
      System.out.println(ans);
    }
  }
}

        
      
        
