//https://leetcode.com/problems/container-with-most-water/
public class containsMostWater {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int counter = 0;
        while(i<j && i<height.length-1 && j>=0){
            int area = (j-i) * Math.min(height[i], height[j]);
            counter = Math.max(counter,area);
            if(height[j]>=height[i]){
                i++;
            }
            else{
                j--;
            }

        }
        return counter;
    }
}
