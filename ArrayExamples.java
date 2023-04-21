import java.io.LineNumberInputStream;

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    int head = 0;
    int end = arr.length - 1;
    while(head < end){
      int temp = arr[head];
      arr[head] = arr[end];
      arr[end] = temp;
      head ++;
      end --;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] b = new int[arr.length];
    int j = arr.length;
    for (int i = 0; i < arr.length; i++) {
        b[j - 1] = arr[i];
        j = j - 1;
    }
    return b;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
   if(arr.length == 0 || arr.length == 1){
    return 0;
   }
    double min = Double.MAX_VALUE;
    int idx = -1;
    double sum = 0.0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] < min){
        min = arr[i];
        idx = i;
      }
      sum += arr[i];
   }
   return (sum - arr[idx])/(arr.length - 1);
  }


}

