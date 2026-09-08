public class BinarySearchFirstLastOccurrence {
    static int first(int[] arr, int target) {
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){int m=l+(r-l)/2;
            if(arr[m]>=target){if(arr[m]==target) ans=m;r=m-1;}
            else l=m+1;}
        return ans;
    }
    static int last(int[] arr, int target) {
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){int m=l+(r-l)/2;
            if(arr[m]<=target){if(arr[m]==target) ans=m;l=m+1;}
            else r=m-1;}
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        System.out.println("First: "+first(arr,target));
        System.out.println("Last: "+last(arr,target));
    }
}