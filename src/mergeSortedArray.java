import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int [] arr2= {2,5,6};
        merge(arr,3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = 0;
        while(i>=0 && j<n){
            if(nums1[i]>nums2[j]){
                swap(nums1, nums2, i ,j);
                i++;
                j--;
            }
            else{
                break;
            }
        }
        for(int p=m,k=0; p<nums1.length; p++,k++){
            nums1[p] = nums2[k];
        }
        System.out.println(Arrays.toString(nums1));
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
