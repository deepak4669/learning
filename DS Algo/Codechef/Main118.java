import java.util.Scanner;
public class Main118
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(sc.hasNextLine())
    {
      
      int x=sc.nextInt();
      int y=sc.nextInt();
      String dir=sc.next();
      String ins=sc.next();
      char prevdir=dir.charAt(0);
      
      int lostx=x;
      int losty=y;
      for(int i=0;i<ins.length();i++)
      {
        char ch=ins.charAt(i);
        //System.out.println(prevdir);
        //System.out.println(x+" "+y);
        if(ch=='L')
        {
          if(prevdir=='E')prevdir='N';
          else if(prevdir=='N') prevdir='W';
          else if(prevdir=='W') prevdir='S';
          else prevdir='E';
        }
        else if(ch=='R')
        {
          if(prevdir=='E') prevdir='S';
          else if(prevdir=='S') prevdir='W';
          else if(prevdir=='W') prevdir='N';
          else prevdir='E';
        }
        else{
          if(prevdir=='W'){
            if(x-1<0&&x>=0){
              lostx=x;
              losty=y;
              x-=1;
              y=y;
            }
            else
            {
              x-=1;
              y=y;
            }
          }
          else if(prevdir=='E')
          {
            if(x+1>a&&x<=a)
            {
              lostx=x;
              losty=y;
              x+=1;
              y=y;
            }
            else
            {
              x+=1;
              y=y;
            }
          }
          else if(prevdir=='N')
          {
            if(y+1>b&&y<=b)
            {
              lostx=x;
              losty=y;
              y+=1;
              x=x;
            }
            else
            {
              y+=1;
              x=x;
            }
          }
          else{
            if(y-1<0&&y>=0)
            {
              lostx=x;
              losty=y;
              y-=1;
              x=x;
            }
            else
            {
              y-=1;
              x=x;
            }
          }
        }
      }
      if(x<0||x>a||y<0||y>b)
      {
        System.out.println(lostx+" "+losty+" "+prevdir+" LOST");
      }
      else
        System.out.println(x+" "+y+" "+prevdir);
    }
  }
}
        
            