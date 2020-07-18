import java.util.Scanner;
public class Main342A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ones=0;
    int twos=0;
    int threes=0;
    int fours=0;
    int six=0;
    boolean flag=false;
    for(int i=0;i<n;i++)
    {
      int val=sc.nextInt();
      if(val==1)
        ones++;
      else if(val==2)
        twos++;
      else if(val==3)
        threes++;
      else if(val==4)
        fours++;
      else if(val==6)
        six++;
      else
        flag=true;
    }
    if(flag)
      System.out.println(-1);
    else
    {
      if(threes>six)
      {
        System.out.println(-1);
      }
      else
      {
        if((six-threes)+fours!=twos)
        {
          System.out.println(-1);
        }
        else{
          if(twos+threes!=ones||ones!=n/3)
            System.out.println(-1);
          else
          {
            for(int i=0;i<fours;i++)
            {
              System.out.println("1 2 4");
            }
            for(int i=0;i<(six-threes);i++)
            {
              System.out.println("1 2 6");
            }
            for(int i=0;i<threes;i++)
            {
              System.out.println("1 3 6");
            }
          }
        }
      }
    }
  }
}
            
          
        
        
    
                         