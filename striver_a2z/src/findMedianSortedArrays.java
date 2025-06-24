public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        int total = nums1.length + nums2.length;
        int limit = total / 2;

        int i = 0, j = 0;
        int counter = 0;
        int prev = 0;
        int curr = 0;

        while (i < nums1.length && j < nums2.length) {
            prev = curr;
            if (nums1[i] >= nums2[j]) {
                curr = nums2[j];
                j++;
            } else {
                curr = nums1[i];
                i++;
            }
            if (counter == limit) {
                if (total % 2 == 0) {
                    return (curr + prev) / 2.0;
                } else {
                    return curr;
                }
            }
            counter++;
        }

        while (i < nums1.length) {
            prev = curr;
            curr = nums1[i];
            i++;
            if (counter == limit) {
                if (total % 2 == 0) {
                    return (curr + prev) / 2.0;
                } else {
                    return curr;
                }
            }
            counter++;
        }

        while (j < nums2.length) {
            prev = curr;
            curr = nums2[j];
            j++;
            if (counter == limit) {
                if (total % 2 == 0) {
                    return (curr + prev) / 2.0;
                } else {
                    return curr;
                }
            }
            counter++;
        }

        return 0;
    }
}
