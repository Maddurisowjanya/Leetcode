class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int asteroid:asteroids)
        {
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && asteroid<0)
            {
                if(st.peek()==-asteroid)
                {
                    st.pop();
                    destroyed=true;
                    break;
                }
                if(st.peek()<-asteroid)
                {
                    st.pop();
                }
                else
                {
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed)
            {
                st.push(asteroid);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=0;i<st.size();i++)
        {
            ans[i]=st.get(i);
        }
        return ans;
    }
}