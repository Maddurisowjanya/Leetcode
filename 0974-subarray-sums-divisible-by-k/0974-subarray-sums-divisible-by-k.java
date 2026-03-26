import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1); // important

        int prefix = 0;
        int ans = 0;

        for (int num : nums) {
            prefix += num;

            int remainder = prefix % k;

            // handle negative remainder
            if (remainder < 0) {
                remainder += k;
            }

            ans += count.getOrDefault(remainder, 0);

            count.put(remainder, count.getOrDefault(remainder, 0) + 1);
        }

        return ans;
    }
}