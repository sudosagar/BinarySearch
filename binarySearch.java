public class binarySearch{
public static int BinarySearch(int arr[],int value){
    int low=0;
    int high=arr.length-1;
    
    while(low<=high){
        int mid =(low+high)/2;
        
        if(arr[mid]==value){
            return mid;
        }
        if(value>arr[mid]){
            low=mid+1;
        }
        else{
        
            high=mid-1;
        }

    }
    return -1;
}



public static void main(String args[]){
    int arr[]={5,7,9,13,32,33,42,54,56,88};

    System.out.println(BinarySearch(arr,33));
    

}
}