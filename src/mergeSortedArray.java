import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[nums1.length];
        int i=0,j=0,k=0; // 3 pointers to traverse each array
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] >= nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
            }
            else{
                ans[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            ans[k] = nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            ans[k] = nums2[j];
            k++;
            j++;
        }
        for(int p=0;p<nums1.length;p++){
            nums1[p] = ans[p];
        }
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if(nums1.length<=1){
//            return;
//        }
//        int i =0, j=0;
//        while(i<nums1.length&&j<nums2.length){
////            System.out.println(nums1[i]);
//            if(nums1[i]==0){
//                nums1[i]=nums2[j];
//                j++;
//                i++;
//            }
//            else if(nums1[i]<=nums2[j]){
//                i++;
//            }
//            else{
//                swap(nums1,nums2,i,j);
//                i++;
//
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//        //System.out.println(Arrays.toString(nums1));
//    }
    public static void swap(int[] nums1, int[] nums2, int i, int j){
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
        //System.out.println(Arrays.toString(nums1));
        //System.out.println(Arrays.toString(nums2));
    }
}
