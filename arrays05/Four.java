package arrays05;

public class Four {
    public static void main(String[] args) {
//        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            int currentWealth = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                currentWealth += accounts[row][col];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }

    // Previously Tried
//    public static int maximumWealth(int[][] accounts) {
//        int n = accounts.length;
//        int wealth = 0;
//
//        for (int row = 0; row < n; row++) {
//            int max = 0;
//            for (int col = 0; col < accounts[row].length; col++) {
//                max += accounts[row][col];
//            }
//            if (max > wealth) wealth = max;
//        }
//        return wealth;
//    }
}
