public class BSTNode {
    int value;
    BSTNode left;
    BSTNode right;
    BSTNode parent;

    public int getValue() {
        return value;
    }
    //}

    public void setValue(int value) {
        this.value = value;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getParent() {
        return parent;

    }

    public void setParent(BSTNode parent) {
        this.parent = parent;
    }
}

