import java.util.ArrayList;
import java.util.List;

public class pathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<Integer>();
        pathSumHelper(root, sum, res, curr);
        return res;
    }

    public void pathSumHelper(TreeNode root, int sum, List<List<Integer>> res, List<Integer> curr)
    {
        if(root == null) return;

        curr.add(root.val);
        if(root.left==null && root.right==null && sum-root.val == 0)
        {
            res.add(new ArrayList<Integer>(curr));
            curr.remove(curr.size()-1);
            return;
        }else{
            pathSumHelper(root.left, sum-root.val, res, curr);
            pathSumHelper(root.right, sum-root.val, res, curr);
        }
        curr.remove(curr.size()-1);
    }
}
