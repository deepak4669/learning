import java.util.Scanner;
public class Main2
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    
    for(int i=0;i<t;i++)
    {
      int m=sc.nextInt();
      int n=sc.nextInt();
      
      int[] seqA=new int[m];
      int[] seqB=new int[n];
      
      for(int j=0;j<m;j++)
        seqA[j]=sc.nextInt();
      for(int j=0;j<n;j++)
        seqB[j]=sc.nextInt();
      
      res[i]= result(seqA,seqB);
    }
    
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  
  public static int result(int[] num1,int[] num2)
  {
    int result=0;
    
    for(int i=0;i<num1.length;i++)
    {
      for(int j=0;j<num1.length;j++)
      {
        int[] fib=new int[max(2,num2.length)];
        fib[0]=num1[i];
        fib[1]=num2[j];
        
        for(int k=2;k<num2.length;k++)
          fib[k]=fib[k-1]+fib[k-2];
        result=result+fib[num2.length-1];
      }
    }
    result=result%(1000000000+7);
    return result;
  }
  
  public static int max(int i,int j)
  {
    if(i>j) return i;
    else return j;
  }
}