class Solution {
    public int[] printNumbers(int n) {
        int[] sum = new int[(int)(Math.pow(10,n) - 1)];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = i + 1;
        }
        return sum;
    }
}