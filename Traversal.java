//2.qn
class Tree{
int value;
Tree left,right;
Tree (int value){
    this.value=value;
    left=right=null;
}
}
    public class Traversal{
        public void preorder(Tree node){
            if(node==null)
            return;
            System.out.print(node.value +" ");
            preorder (node.left);
            preorder (node.right);
        }
        public void postorder(Tree node){
            if(node==null)
            return;
            postorder (node.left);
            postorder (node.right);
            System.out.print(node.value +" ");
            
        }
        public void inorder(Tree node){
            if(node==null)
            return;
            inorder (node.left);
            System.out.print(node.value +" ");
            inorder (node.right);
        }


        public static void main (String[] args){
            Tree root=new Tree(4);
            root.left =new Tree(2);
            root.right=new Tree(5);
            root.left.left=new Tree(3);
            root.right.left=new Tree(7);
            root.right.right=new Tree(6);
            root.left.left.right=new Tree(9);
            root.right.right.left=new Tree(8);
            root.left.left.right.left=new Tree(1);

            Traversal tree=new Traversal();
            System.out.print("Preorder traversal:");
            tree.preorder(root);
            System.out.println();
            System.out.print("postorder traversal:");
            tree.postorder(root);
            System.out.println();
            System.out.print("Inorder traversal:");
            tree.inorder(root);
        }
    }
    

    
