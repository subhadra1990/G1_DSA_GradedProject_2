package grp_ass_2;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
}


public class SkewedBST {
            
	static TreeNode root;

    // Function to convert BST to a skewed tree
    static TreeNode convertToSkewed(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Convert the left subtree
        convertToSkewed(root.left);

        // Rotate the current node to the right
        TreeNode rightNode = root.right;
        root.right = rightNode != null ? rightNode.right : null;
        root.left = rightNode;
        
        // Recur for the right subtree
        convertToSkewed(root.right);

        return root;
    }

    // Function to print nodes of the skewed tree in ascending order
    static void printInOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

        public static void main(String[] args) {
        // Sample BST creation
        root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(60);
       // root.left.right = new TreeNode(10);
        root.left.left = new TreeNode(10);
        root.right.left = new TreeNode(55);

        // Convert BST to skewed tree
        root = convertToSkewed(root);

        // Display the node values in ascending order
        System.out.println("Node values in ascending order:");
        printInOrder(root);
    }
}
