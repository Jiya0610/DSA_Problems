class Solution {
    public boolean isMatch(String s, String p) {
        Boolean[][] dp = new Boolean[s.length() + 1][p.length() + 1];

        return solve(s, p, 0, 0, dp);
    }

    private boolean solve(String s, String p, int i, int j, Boolean[][] word) {

      
        if (word[i][j] != null) {
            return word[i][j];
        }


        if (j == p.length()) {
            return i == s.length();
        }

    
        boolean firstMatch = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        boolean result;


        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

          
            result = solve(s, p, i, j + 2, word) ||
                    (firstMatch && solve(s, p, i + 1, j, word));

        } 
        else {
           
            result = firstMatch && solve(s, p, i + 1, j + 1, word);
        }

        word[i][j] = result;

        return result;
    }
}