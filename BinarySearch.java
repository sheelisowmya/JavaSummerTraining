

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={20,30,40,50,60};
        int num=50;
        int size=10;
       int low=0;
       int high=size-1;
        int mid=(low+high)/2;
        while(low<high)
        {
            if(num==arr[mid])
            break;
            else if(num<arr[mid])
            high=mid-1;
            else low=mid+1;
            mid=(low+high)/2;
        }
        if(arr[mid]==num)
        System.out.println(  "found");
        System.out.println( "not found");

    }
}
