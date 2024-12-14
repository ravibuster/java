import java.util.Scanner;
public class checkElement {
 static int[] makeFrequecyArray(int[] arr){
    int[] ans = new int[100000];
    for (int i = 0; i < arr.length; i++) {
      ans[arr[i]]=1;
    } 
    return ans;
 }
  public static void main(String[] args) {
    System.out.print("Enter the size of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n]; 
    System.out.println("Enter the "+n+ " elements of array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the element to be check");
    int element =sc.nextInt();
    int [] frequencyArray = makeFrequecyArray(arr);
    if (frequencyArray[element]==1) {
      System.out.println("element is present");
    }else{
      System.out.println("element is not present");
    }
    sc.close();
  }
}

