package simple;

import java.util.Arrays;

public class solution {

    /**
     * 整数反转
     */
    public static int reverse(int x) {
        int res = 0;
        while(x != 0) {
            int tmp = x % 10;
            if((res > Integer.MAX_VALUE/10) || (res == Integer.MAX_VALUE/10 && tmp > 7)) {
                return 0;
            }
            if((res < Integer.MIN_VALUE/10) || (res == Integer.MIN_VALUE/10 && tmp < -8)) {
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }


    /**
     * 两数求和
     */
    /*public static int[] find(int[] nums,int target) {
        for(int i = 0; i < nums.length-1;i++) {
            for(int j = i+1;j < nums.length;j++) {
                if(target == nums[i] + nums[j]) {
                    int[] a = {i,j};
                    return a;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int ret[] = find(nums,target);
        System.out.println(Arrays.toString(ret));
    }*/

}
