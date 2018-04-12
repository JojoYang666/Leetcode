import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root ==null) return res;

        int size =1, layer = 0;
        queue.offer(root);

        while(queue.size()!=0)
        {
            // int sum = 0;
            List<Integer> list = new LinkedList<Integer>();
            for(int i=0; i<size; i++)
            {
                TreeNode temp = queue.poll();
                list.add(temp.val);

                // sum+=temp.val;
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
            }
            // list.add(sum);
            size = queue.size();
            layer+=1;
            res.add(list);
        }
        return res;
    }
}
