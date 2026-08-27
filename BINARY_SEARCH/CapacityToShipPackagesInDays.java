class CapacityToShipPackagesInDays {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int num : weights) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int currentload = 0;
            int day = 1;
            int capacity = left + (right - left) / 2;
            for (int num : weights) {
                if (currentload + num > capacity) {
                    day++;
                    currentload = num;
                } else {
                    currentload += num;
                }
            }
            if (day <= days) {
                right = capacity;
            } else {
                left = capacity + 1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        CapacityToShipPackagesInDays obj = new CapacityToShipPackagesInDays();
        int result = obj.shipWithinDays(weights,days);
        System.out.println(result);
    }
}