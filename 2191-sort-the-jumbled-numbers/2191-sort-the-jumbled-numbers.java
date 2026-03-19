class Solution {
    public int[] sortJumbled(int[] rules, int[] nums) {
        int m = rules.length;
        int n = nums.length;

        int mapped[][] = new int[n][2];

        for(int i =0;i<n;i++){
            int num = nums[i];

            String str = Integer.toString(num);
            String result = new String();
            int len = str.length();
            for(int c = 0;c<len;c++){
                char ch = str.charAt(c);
                result = result.concat(Integer.toString(rules[ch - '0']));
                int ans = Integer.parseInt(result);
                mapped[i][0] = ans;
                mapped[i][1] = i;
            }
        }

        //sorting of mapped;
        Arrays.sort(mapped,(a,b)-> a[0] - b[0]);
        int results[] = new int[n];

        for(int i =0;i<n;i++){
            results[i] = nums[mapped[i][1]];
        }
        return results;
    }
}

//mapping nums + indexing
//sorting mapped array
// remapping the array to original one