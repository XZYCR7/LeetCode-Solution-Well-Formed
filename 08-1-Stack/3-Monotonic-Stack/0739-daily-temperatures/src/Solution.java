public class Solution {

    // 暴力解法

    public int[] dailyTemperatures(int[] T) {
        int len = T.length;
        if (len < 2) {
            return new int[len];
        }

        int[] res = new int[len];
        res[len - 1] = 0;
        for (int i = 0; i < len - 1; i++) {
            int curVal = T[i];
            for (int j = i + 1; j < len; j++) {
                if (T[j] > curVal) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}