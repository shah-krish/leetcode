public class secondLargestWithoutSorting {
    public static void main(String[] args) {
//        int[] arr = {10,5,10};
//        System.out.println(secondLargest(arr));
   }
    public static int secondLargest(int[] arr){
        int largest = -1;
        int secondLargest = -1;
        for(int i : arr){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            }
            else if(i>secondLargest && i!=largest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
