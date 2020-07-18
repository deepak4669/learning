import java.util.Scanner;
public class Main1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t= sc.nextInt();
    String[] res = new String[t];
    for(int i=0;i<t;i++)
    {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] num = new int[n];
      
      for(int j=0;j<n;j++)
      {
        num[j]=sc.nextInt();
      }
      
      res[i]=isItPos(num,k);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
    }
  }
  public static String isItPos(int[] num, int k)
  {
    int m=0,t=0;
    for(int i=0;i<num.length;i++)
    {
      if(i%2==0) m+=num[i];
      else t+=num[i];
    }
    
    if(t>m) return "YES";
   
    else
    {
      m=0;
      t=0;
      int motulength;
      int tomulength;
      if(num.length%2==0){ motulength=num.length/2; tomulength=motulength;}
      else{ motulength=(num.length/2)+1; tomulength=num.length/2;}
         
      int[] motu=new int[motulength];
      int[] tomu=new int[tomulength];
      int p=0,q=0;
      for(int i=0;i<num.length;i++)
      {
        if(i%2==0) motu[p++]=num[i];
        else tomu[q++]=num[i];
      }
      for(int j=0;j<k;j++)
      {
        int bigIndex = big(motu);
        int smallIndex= small(tomu);
        int biggest = motu[bigIndex];
        int smallest = tomu[smallIndex];
        motu[bigIndex]=smallest;
        tomu[smallIndex]=biggest;
        m=0;
        t=0;
        for(int r=0;r<motu.length;r++)
        {
          
          m+=motu[r];
        }
        for(int r=0;r<tomu.length;r++)
        {
          
          t+=tomu[r];
        }
        
        if(t>m) return "YES";
      }
      return "NO";
    }
  }
  public static int big(int[] num)
  {
    int i=0;
    int max=num[i];
    
    for(int j=0;j<num.length;j++)
    {
      if(num[j]>max)
      {
        i=j;
        max=num[j];
      }
    }
  
    return i;
  }
  
  public static int small(int[] num)
  {
    int i=0;
    int min=num[i];
   
    
    for(int j=0;j<num.length;j++)
    {
      if(num[j]<min)
      {
        i=j;
        min=num[j];
      }
    }
    
    
    return i;
  }
}
          
        
      