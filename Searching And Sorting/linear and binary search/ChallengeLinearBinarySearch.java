import java.util.*;
public class ChallengeLinearBinarySearch {
    static int firstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:arr) if(n>0) set.add(n);
        int i=1;
        while(set.contains(i)) i++;
        return i;
    }
    static int binarySearch(int[] arr, int target) {
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target) return m;
            if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,-1,1,7};
        System.out.println("First missing positive: "+firstMissingPositive(arr));
        Arrays.sort(arr);
        int target=4;
        System.out.println("Target index after sorting: "+binarySearch(arr,target));
    }
}