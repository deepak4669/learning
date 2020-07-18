import java.util.Scanner;
public class Main15
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=0;
    int[] res=new int[1000];
    int k=0;
    while(true)
    {
      n=sc.nextInt();
      if(n==-1) break;
      int[] array=new int[n];
      for(int i=0;i<n;i++)
      {
        array[i]=sc.nextInt();
      }
      if(n!=-1)
        res[k++]=ans(array);
    }
    
    for(int i=0;i<k;i++)
      System.out.println(res[i]);
  }
  
  public static int ans(int[] array)
  {
    int total=0;
    for(int i=0;i<array.length;i++)
    {
      total+=array[i];
    }
    if(total%array.length!=0) return -1;
    else
    {
      int each = total/array.length;
      int ans=0;
      for(int i=0;i<array.length;i++)
      {
        if(each>array[i]) ans+=(each-array[i]);
      }
      return ans;
    }
  }
}
      
            
                  
  