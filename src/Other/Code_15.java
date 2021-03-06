package Other;

/**
 * 请实现一个函数，输入一个整数（以二进制串形式），
 * 输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，
 * 有 2 位是 1。因此，如果输入 9，则该函数输出 2。
 */
//要求用位运算，可以直接这样转了做。
public class Code_15 {
    public static int hammingWeight(int n) {
        String str = String.valueOf(Integer.toBinaryString(n));
        char[] array = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '1') counter+=1;
        }
        return counter;
    }
    public static void main(String[] args){
        int n  = 00000000000000000000000000001011;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(hammingWeight(n));
    }

}
