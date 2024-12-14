import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class bucket {
  static void printArray(float[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+ " ");
    }
  }

  static void bucketSort(float[] arr){
    int n = arr.length;
    ArrayList<Float>[] buckets = new ArrayList[n];

    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new ArrayList<Float>();
    }

    for (int i = 0; i < arr.length; i++) {
      int index = (int)(arr[i]*n);
      buckets[index].add(arr[i]);
    }

    for (int i = 0; i < buckets.length; i++) {
      Collections.sort(buckets[i]);
    }

    int index = 0;
    for (int i = 0; i < buckets.length; i++) {
      for (int j = 0; j < buckets[i].size(); j++) {
        arr[index] = buckets[i].get(j);
        index++;
      }
    }
    printArray(arr);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int n = sc.nextInt();
    System.out.println("Enter the Elements ");
    float[] arr = new float[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextFloat();
    }
    bucketSort(arr);
    sc.close();
  }
}
