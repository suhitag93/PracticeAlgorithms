
public class LevelOrderTraversal {

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
	
	public static void main(String args[]){
		LevelOrderTraversal X = new LevelOrderTraversal();
		node N = X.new node(1);
		System.out.print(N.data);
		
		
	}
}
