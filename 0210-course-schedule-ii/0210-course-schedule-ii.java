class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int [numCourses];
        for(int i =0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            int v = pre[0];
            int u = pre[1];
            inDegree[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> topo = new ArrayList<>();
        for(int i =0;i<numCourses;i++){
           if(inDegree[i] == 0)
            {
                q.add(i);
            } 
        }
         while(!q.isEmpty())
        {
            int node = q.poll();
            topo.add(node);
            for(int nei: adj.get(node))
            {
                inDegree[nei]--;
                if(inDegree[nei]  == 0)
                {
                    q.add(nei);
                }
            }
        }

        if(topo.size() != numCourses)
            return new int[] {};
        int[] ans = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            ans[i] = topo.get(i);
        }
        topo = null;
        q = null;
        adj = null;
        return ans;
    }
}