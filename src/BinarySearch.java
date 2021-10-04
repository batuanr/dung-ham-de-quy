public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 9, 22, 33, 44, 66};
        int length = num.length - 1;
        System.out.println(binarySearch(num, 0, length, 66));
    }
    public static int  binarySearch(int[] arr, int left, int right, int value) {
        if (right < left){
            return -1;
        }
        else {
            int mid = (left + right) / 2;
            if(arr[mid] > value) right = mid - 1;
            else if (arr[mid] < value) left = mid + 1;
            else if (arr[mid] == value ) return mid;
        }
        return binarySearch(arr, left, right, value);
    }
}
