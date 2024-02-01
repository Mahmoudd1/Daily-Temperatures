import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int []res=new int[n];
        Stack<int[]> stack=new Stack<>();
        int []temp=new int[2];
        for (int i=n-1;i>=0;i--)
        {
            //System.out.println(Arrays.toString(stack.toArray())+ " " + i);
            if (stack.isEmpty())
            {
                stack.push(new int[]{temperatures[i],i});
                res[i]=0;
                continue;
            }
            temp=stack.peek();
            if (temp[0]>temperatures[i])
            {
                stack.push(new int[]{temperatures[i],i});
                res[i]=temp[1]-i;
            }
            else
            {
                while (stack.size()>0)
                {
                    temp=stack.peek();
                    if (temperatures[i]<temp[0])
                    {
                        res[i]=temp[1]-i;
                        break;
                    }
                    else
                        stack.pop();
                }
                stack.push(new int[]{temperatures[i],i});
            }
        }
        return res;
    }
}