class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        
        if (root == null) {
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            int levelnum = q.size();
            List<Integer> sublist = new ArrayList<>();
            
            for (int i = 0; i < levelnum; i++) {
                TreeNode current = q.poll();
                sublist.add(current.val);
                
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            
            list.add(sublist);
        }
        
        return list;
    }
}
