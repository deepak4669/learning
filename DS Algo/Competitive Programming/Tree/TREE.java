public class TREE
{
  public class BST
  {
    private Node root;
    private class Node
    {
      private int key;
      private value val;
      private Node left,right;
      public Node(int key,int val)
      {
        this.key;
        this.val=val;
      }
    }
    
    public Integer get(int key)
    {
      Node x=root;
      while(x!=null)
      {
        if(x.key>key) x=x.left;
        else if(x.key<key) x=x.right;
        else return x.val;
      }
      return null;
    }
    public void put(int key,int val)
    {
      root=put(root,key,val);
    }
    private Node put(Node x,int key, int val)
    {
      if(x==null) return new Node(key,val);
      else if(x.key<key)
        return put(x.right,key,val);
      else if(x.key>key)
        return put(x.left,key,val);
      else
        x.val=val;
      return x;
    }
    
    