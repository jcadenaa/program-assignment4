public class assignment4 {
    public static final int MAX_NUMS = 40;
    public static final int ADD = 10;

    public static void main(String args[]) {
        int[] nums = new int[MAX_NUMS];
        int i;

        for (i = 0; i < MAX_NUMS; i++) {
            int real_num = i + 1;

            nums[i] = real_num + ADD;
        }

        for (i = 0; i < MAX_NUMS; i++) {
            System.out.println(nums[i] + "\n");
        }
    }
}