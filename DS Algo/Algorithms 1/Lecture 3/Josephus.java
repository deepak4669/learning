public class Josephus
{
  public static void main(String[] args)
  {
    int m=Integer.parseInt(args[0]);
    int n=Integer.parseInt(args[1]);
    
    Queue<Integer> queue=new Queue<Integer>();
    for(int i=0;i<n;i++)
      queue.enqueue(i);
    while(!queue.isEmpty()){
      for(int i=1;i<=m;i++)
        queue.enqueue(queue.dequeue());
      System.out.println(queue.dequeue()+" ");
    }
    System.out.println();
  }
}
/* N people (0-N-1) are arranged in circle, eliminating 
 * every mth person until one person is left. The num
 * ber corresponding to the left person is to be find.*/
