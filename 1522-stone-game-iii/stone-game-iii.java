class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] player = new int[n + 1];

        
        for (int i = n - 1; i >= 0; i--) {
            player[i] = Integer.MIN_VALUE;
            int sum = 0;

           
            for (int k = 0; k < 3 && i + k < n; k++) {
                sum += stoneValue[i + k];
                player[i] = Math.max(player[i], sum - player[i + k + 1]);
            }
        }

        if (player[0] > 0) return "Alice";
        if (player[0] < 0) return "Bob";
        return "Tie";
    }
}