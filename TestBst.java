import javax.lang.model.util.ElementScanner14;

class Node
{
  int data;
  Node left,right; 
Node(int data)
{
    this.data=data;
     left=right=null;
}
}
class BinarySearchTree
{
    Node root,temp,temp2;
    Node CreateNewNode(int data)
    {
        Node nn=new Node(data);
        nn.left=nn.right=null;
        return nn;
        
    }
    void inOrder(Node root){
    if(root==null)
    return;
        
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    
}
    Node insert(Node root,int data)
    {
         temp=CreateNewNode(data);
        if(root==null){
            root=temp;
        return root;
        }
       else  if(data<root.data){
        root.left=insert(root.left,data);
    }
    else
{
    root.right=insert(root.right,data);
}
return root;
    }
    boolean search(Node root,int data)
    {
        if(root==null)
        return false;
        else if(root.data==data)
        return true;
        else if(data<root.data)
        return search(root.left,data);
        else{
            return search(root.right,data);
        }
    }
}
class TestBst{
    public static void main(String[] args) {
        BinarySearchTree Bs=new BinarySearchTree();
        Bs.root=Bs.insert(Bs.root,10);
        Bs.root=Bs.insert(Bs.root,11);
        Bs.root=Bs.insert(Bs.root,1);
        Bs.inOrder(Bs.root);
        
        System.out.println(Bs.search(Bs.root,10));
    }
    
    }


