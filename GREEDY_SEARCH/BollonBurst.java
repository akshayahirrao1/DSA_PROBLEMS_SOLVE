import java.util.Arrays;
class BollonBurst {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int arrowPosition = points[0][1];
        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > arrowPosition) {
                arrows++;
                arrowPosition = points[i][1];
            }
        }
        return arrows;
    }
    public static void main(String[] args){
        BollonBurst bb = new BollonBurst();
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(bb.findMinArrowShots(points));
    }
}