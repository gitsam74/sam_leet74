import java.util.*;

class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] S = stamp.toCharArray();
        char[] T = target.toCharArray();

        boolean[] visited = new boolean[T.length];
        int stars = 0;

        List<Integer> res = new ArrayList<>();

        while (stars < T.length) {
            boolean replaced = false;

            for (int i = 0; i <= T.length - S.length; i++) {
                if (!visited[i] && canReplace(T, i, S)) {
                    stars = replace(T, i, S.length, stars);
                    visited[i] = true;
                    replaced = true;
                    res.add(i);

                    if (stars == T.length) break;
                }
            }

            if (!replaced) return new int[0];
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            ans[i] = res.get(res.size() - 1 - i);

        return ans;
    }

    private boolean canReplace(char[] T, int p, char[] S) {
        for (int i = 0; i < S.length; i++) {
            if (T[p + i] != '*' && T[p + i] != S[i])
                return false;
        }
        return true;
    }

    private int replace(char[] T, int p, int len, int count) {
        for (int i = 0; i < len; i++) {
            if (T[p + i] != '*') {
                T[p + i] = '*';
                count++;
            }
        }
        return count;
    }
}