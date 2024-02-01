package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class DiagonalTraversal {

    public static void diagonalTraversal(TreeNode root) {
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        diagonalTraversalUtil(root, 0, diagonalMap);

        System.out.println("Diagonal Traversal:");
        for (List<Integer> diagonal : diagonalMap.values()) {
            for (int val : diagonal) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void diagonalTraversalUtil(TreeNode node, int diagonalLevel, Map<Integer, List<Integer>> diagonalMap) {
        if (node == null) {
            return;
        }

        diagonalMap.putIfAbsent(diagonalLevel, new ArrayList<>());
        diagonalMap.get(diagonalLevel).add(node.val);

        diagonalTraversalUtil(node.left, diagonalLevel + 1, diagonalMap);
        diagonalTraversalUtil(node.right, diagonalLevel, diagonalMap);
    }

    public static void main(String[] args) {
        /*
            Constructed binary tree:
                 8
                / \
               3   10
              /      /  \
             1     6    14
                   / \    /
                  4   7  13
        */
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.left.left = new TreeNode(4);
        root.right.left.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);

        diagonalTraversal(root);
    }
}

