package org.example.dsa.trees;

public class TreeProblems {

    // Traversals → preOrder/ postOrder/ inOrder
    public void preOrder(Node node){
        preOrderHelper(node);
    }
    public void postOrder(Node node){
        postOrderHelper(node);
    }
    public void inOrder(Node node){
        inOrderHelper(node);
    }
    public void preOrderHelper(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrderHelper(node.left);
        preOrderHelper(node.right);

    }
    public void postOrderHelper(Node node){
        if(node == null){
            return;
        }
        preOrderHelper(node.left);
        preOrderHelper(node.right);
        System.out.println(node.data);

    }
    public void inOrderHelper(Node node){
        if(node == null){
            return;
        }
        inOrderHelper(node.left);
        System.out.println(node.data);
        inOrderHelper(node.right);

    }

    //Height of a Binary Tree
    public void treeHeight(Node node){
        helper(node);
    }
    public int helper(Node node){
        if(node == null){
            return 0;
        }
        int lh = helper(node.left);
        int rh = helper(node.right);    /* while returning answer we are storing answer for left
                                            and right that's how we are getting the left height and right right */
        int ans = Math.max(lh,rh)+1;
        return ans;
    }

    //Identical Trees
    public void isIdentical(Node node, Node node2){
        idHelper(node, node2);
    }
    public boolean idHelper(Node node, Node node2){
        if(node == null && node2 == null){
            return true;
        }
        if (node == null || node2 == null){
            return  false;
        }
        if(node.data != node2.data) {
            return false;
        }
        boolean left = idHelper(node.left, node2.left);
        boolean right = idHelper(node.right, node2.right);
        return left && right;
    }

}
