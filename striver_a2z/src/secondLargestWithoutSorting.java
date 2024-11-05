public class secondLargestWithoutSorting {
    public static void main(String[] args) {
//        int[] arr = {2,1,4,5,7,12,4,300,432,4,6,600};
//        System.out.println(secondLargest(arr));
   }
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
            //System.out.println(largest + " "+ secondLargest);
        }
        return secondLargest;
    }
}
