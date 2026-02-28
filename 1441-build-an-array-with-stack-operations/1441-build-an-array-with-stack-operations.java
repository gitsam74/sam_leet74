import java.util.*;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int curr = 1;

        for (int i = 0; i < target.length; i++) {
            while (curr < target[i] && curr <= n) {
                ans.add("Push");
                ans.add("Pop");
                curr++;
            }
            ans.add("Push");
            curr++;
        }

        return ans;
    }
}