import java.util.Queue;


import java.util.LinkedList;

class node{
		int data;
		node left;
		node right;
		
		public node(int d){
			data = d;
			left = null;
			right = null;
		}
		
}
	
class BinaryTree{
	node Root;
		
	BinaryTree(){
		Root = null;
	}
	
	
	void printPostOrder(node N){
		if (N == null)
			return;
		
			printPostOrder(N.left);
			
			printPostOrder(N.right);
			
			System.out.print(N.data+" ");
		}
		
		void printPostorder()  
		{     
			printPostOrder(Root);  
		}
	
		void printPreOrder(node N){
			if (N == null)
				return;
			System.out.print(N.data+" ");
			
				printPreOrder(N.left);
				
				printPreOrder(N.right);
			
			}
		void printPreOrder()  
		{     
			printPreOrder(Root);  
		}
	
		void printInOrder(node N){
			if (N == null)
				return;
				printPreOrder(N.left);
			
				System.out.print(N.data+" ");
				
				printPreOrder(N.right);
			
			}
		void printInOrder()  
		{     
			printPreOrder(Root);  
		}
		
		
		
		int height(node Root){
			if (Root== null){
				return 0;
			}
			else {
				int lheight = height(Root.left);
				int rheight = height(Root.right);
			
				if(lheight <rheight){
					return (rheight +1);
				}
				else return(lheight +1);
			}
		}
		
		void printLevelOrder(node Root){
			for (int d =1; d<= height(Root);d++){
				printGivenLevel(Root, d);
			}
		}
		void printGivenLevel(node tree, int level ){
			if (tree == null){
				return;
			}
			if (level ==1){
				System.out.print(tree.data+" ");
			}
			else{
				printGivenLevel(tree.left,level-1);
				printGivenLevel(tree.right, level-1);
			}
		}
		
		void printLevelOrder(){
			printLevelOrder(Root);
		}
		
		void Q_LevelOrder(node Root){
			Queue<node> q = new LinkedList<node>();
			q.add(Root);
			
			while(true)
			{	int nodecount = q.size();
				if(nodecount == 0 )
					break;
				
				while(nodecount >0){
				node temp = q.poll();
				System.out.print(temp.data+" ");
				
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right !=null){
					q.add(temp.right);
				}
				nodecount --;
				
			}
			System.out.print("\n");
		}
	}
		void Q_LevelOrder(){
			Q_LevelOrder(Root);
		}
	
		node mirror(node N){
			if (N == null){
				return N;
			}
			
			node l = mirror(N.left);
			node r  = mirror(N.right);
			N.right = l;
			N.left = r;
			return N;
		}
		
		node mirror2(node N){
			if(N ==null){
				return N;
			}
			node temp = N.left;
			N.left = N.right;
			N.right = temp;
			mirror(N.left);
			mirror(N.right);
			
			return N;
		}
		
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		tree.Root = new node(1);
		tree.Root.left = new node(2);
		tree.Root.right = new node(3);
		
		tree.Root.left.left = new node(4);
		tree.Root.left.right = new node(5);
		tree.Root.left.left.right = new node(8); 
		System.out.println("PostOrder Traversal:");
		tree.printPostorder();
		System.out.println("\nLevel Order Traversal using recursion:");
		tree.printLevelOrder();
		//level order traversal:
		System.out.println("\nLevel Order Traversal using Queue");
		tree.Q_LevelOrder();
		tree.mirror2(tree.Root);
		System.out.println("\nLevel Order Traversal after mirror:\n");
		tree.Q_LevelOrder();
		
		
		
	}
}

