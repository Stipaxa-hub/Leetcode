class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
        int greatestAmountCandy = 0;

        for(int i = 0; i < candies.length; i++) {
            if(greatestAmountCandy < candies[i]) {
                greatestAmountCandy = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++) {
            int candyAmountWithExtra = candies[i] + extraCandies;
            if (candyAmountWithExtra >= greatestAmountCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}