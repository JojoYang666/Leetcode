//problem description:
//      In a binary tree, if can found a subpath, which the sum of the value is equal to target

import java.util.List;

public class PathSumIII {
    public boolean ifEqualToTarget(TreeNode p, int target, List<Integer> paths)
    {
        if(p==null) return false;
        if(p.val==target) return true;

        for (int i:paths) {
            i+=p.val;
            if(i==target) return true;
        }
        paths.add(p.val);

        return ifEqualToTarget(p.left, target, paths) ||ifEqualToTarget(p.right,target,paths);
    }
}
