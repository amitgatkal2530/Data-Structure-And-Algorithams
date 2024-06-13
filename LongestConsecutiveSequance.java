import java.util.*; 

class LongestConsecutiveSequance{

    public static int longestSequance(int arr[]){
         Arrays.sort(arr);
         int count=0;
         int length=1;
         int lastsmaller=Integer.MAX_VALUE;
         int n=arr.length;
         for(int i=0;i<n;i++){
            if((arr[i])-1==lastsmaller){
                count++;
                lastsmaller=arr[i];
            }
            else if ((arr[i])!=lastsmaller){
                count=1;
                lastsmaller=arr[i];
            }
          length=Math.max(length,count); 
         }
       return length; 
    } 
    public static void main (String args[]){
        int []arr={102,4,100,1,101,3,2,1,1};
       int length=longestSequance(arr);
       System.out.print(length);  
    }
}