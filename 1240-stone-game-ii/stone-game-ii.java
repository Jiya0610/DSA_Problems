class Solution {
    int[][] player;
    int[] total;
    int n;
    public int stoneGameII(int[] piles) {
        n = piles.length;
        player = new int[n][n+1];
        total = new int[n+1];

        for(int i=n-1 ; i>=0;i--){
            total[i] = total[i+1]+piles[i];
        }
        return update(0,1);
    }

    private int update(int i,int m){
        if(i>=n)
        return 0;

        if(2*m >=n-i)
        return total[i];

        if(player[i][m] !=0)
        return player[i][m];

    
    int best = 0;

    for(int x =1;x<=2*m;x++){
        best = Math.max(best,
        total[i] - update(i+x,Math.max(m,x)));
    }

    player[i][m] = best;
    return best;
    }
}