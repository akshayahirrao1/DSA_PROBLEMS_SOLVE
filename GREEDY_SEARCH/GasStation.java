class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        if (total < 0) {
            return -1;
        }
        return start;
    }
    public static void main(String[] args) {
        GasStation gs = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = gs.canCompleteCircuit(gas, cost);
        System.out.println("Starting gas station index: " + result);
    }
}