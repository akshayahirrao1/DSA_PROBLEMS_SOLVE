class KokoEatingBannana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int num : piles) {
            if (num > right) {
                right = num;
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            long hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }
            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        KokoEatingBannana obj = new KokoEatingBannana();
        int result = obj.minEatingSpeed(piles,h);
        System.out.println(result);
    }
}