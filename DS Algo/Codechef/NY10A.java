import java.util.Scanner;
import java.util.Arrays;
public class NY10A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {      
      int n=sc.nextInt();
      sc.nextLine();
      String s=sc.nextLine();
      int[] res=new int[8];
      Arrays.fill(res,0);
      //System.out.println(s);
      //char[] ch=s.toCharArray();
      for(int i=0;i<(s.length()-2);i++)
      {
        String w=s.substring(i,i+3);
        //System.out.println(w);
        if(w.equals("TTT"))
          res[0]++;
        else if(w.equals("TTH"))
          res[1]++;
        else if(w.equals("THT"))
          res[2]++;
        else if(w.equals("THH"))
          res[3]++;
        else if(w.equals("HTT"))
          res[4]++;
        else if(w.equals("HTH"))
          res[5]++;
        else if(w.equals("HHT"))
          res[6]++;
        else if(w.equals("HHH"))
          res[7]++;
      }
      System.out.print((k+1)+" ");
      for(int i=0;i<8;i++)
        System.out.print(res[i]+" ");
      System.out.println();
    }
  }
}
          
      
            