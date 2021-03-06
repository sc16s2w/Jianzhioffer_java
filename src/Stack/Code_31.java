package Stack;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，
 * 序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 *
 */
//并不是一直跟着顺序压栈，也有先pop再出来，所以跟着这个顺序操作/
public class Code_31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> store = new Stack<Integer>();
        int[] right = new int[pushed.length];
        int j =0;
        for(int i = 0;i<pushed.length;i++){
            store.push(pushed[i]);
            while(!store.isEmpty()&&popped[j]==store.peek()){
                store.pop();
                j++;
            }
        }
        return store.isEmpty();
    }
}
