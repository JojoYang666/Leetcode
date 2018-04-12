//problem description:
//        Write a function to detect if two trees are isomorphic. Two trees are called isomorphic if one of them can be obtained from other by a series of flips,
//        i.e. by swapping left and right children of a number of nodes. Any number of nodes at any level can have their children swapped.
//        Two empty trees are isomorphic.

public class similarTree {
    public boolean isIsomorphic(TreeNode p, TreeNode q)
    {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(q.val != q.val) return false;

        return (isIsomorphic(p.left, q.left) && isIsomorphic(p.right, q.right))
                ||(isIsomorphic(p.right, q.left) && isIsomorphic(p.left, q.right));
    }
}
