// https://leetcode.com/problems/trapping-rain-water/
public class trappingRainWater {
    public static void main(String[] args) {

    }
    public int trap(int[] arr) {
        int left = 0, right = arr.length-1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while(left<right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftMax){
                    leftMax = arr[left];
                }
                else{
                    ans+=leftMax -arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=rightMax){
                    rightMax = arr[right];
                }
                else{
                    ans+=rightMax-arr[right];
                }
                right--;
            }
        }
        return ans;
    }

}
/* FIRST OWN SOLUTION
public int trap(int[] height) {
            int i = 0, j = 0;
            int answer = 0;
            int end = 0;
            while(i+2 < height.length){
                if(height[i+1]>height[i]){
                    i++;
                }
                else{
                    j = i+2;
                    end = j;
                    while(j+1 < height.length){
                        if(height[j]>height[j+1] && height[j]<height[i]){
                            if(height[end]<=height[j]){
                                end = j;
                            }
                            j++;
                        }
                        else if(height[j]>height[j+1]){
                            end = j;
                            break;
                        }
                        else{
                            j++;
                        }
                    }
                    if(j==height.length-1){
                        if(height[end]<=height[j]){
                            end = j;
                        }
                    }
                    int min = Math.min(height[i], height[end]);
                    for(int k = i+1; k<end;k++){
                        if(min-height[k]>0){
                            answer += min - height[k];
                        }

                    }
                    i = end;
                }

            }
            return answer;
        }

 */
