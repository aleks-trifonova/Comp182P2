//I honestly havent touched this class at all therefore it has the least amount of code
public class BSTree {
	BSTNode root;
	
	public BSTree()
	{
		root = null;
	}
	
	public void insert(int n) {
		root.insert(n);
	}
	
	public void delete(int n) {
		root.delete(n);
	}

}
