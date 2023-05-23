import java.util.*;
public class bubblesort {
    void sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {

                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }

    }


}
class Democlass{
    public static void main(String[] args) {

      int arx[]={1,3,4,2,6,9,8};
      bubblesort bs=new bubblesort();
      bs.sort(arx);
        System.out.println(Arrays.toString(arx));
        
    }
}
