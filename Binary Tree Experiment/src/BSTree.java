
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
