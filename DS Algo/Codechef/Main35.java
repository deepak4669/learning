import java.util.Scanner;
import java.util.Stack;
public class Main35
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    String[] res=new String[1000];
    int t=0;
    while(true)
    {
      int n=sc.nextInt();
      if(n==0) break;
      int[] array=new int[n];
      for(int j=0;j<n;j++)
        array[j]=sc.nextInt();
      Stack<Integer> s=new Stack<Integer>();
      int[] array2=new int[n];
      int k=0;
      for(int i=0;i<n;i++)
      { 
        
        int st=s.pop();
        if(k+1==array[i]) array2[k++]=array[i];
        else
        {
          st=s.pop();
          while(st==k+1)
          {
            array2[k++]=st;
            st=st.pop();
          }
        }
        
        
        else {
          s.push(st);
          s.push(array[i]);
        }
      }
      //System.out.println(k);
      int count=k;
      if(count!=n)
      {
        for(int i=0;i<(n-count);i++)
          array2[k++]=s.pop();
      }
      //System.out.println(k);
      int i=0;
      for(i=0;i<n;i++)
      {
        if(array2[i]!=i+1) 
        {
          res[t++]="no";
          break;
        }
      }
      if(i==n) res[t++]="yes";
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
}
      
      
        
      
  