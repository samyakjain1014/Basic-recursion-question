package recursionlevel1.src;

import java.util.ArrayList;

public class target {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,4};
        int target = 4;
        findallindex(a,target,0);
        // boolean ans = findtarget(a,target,0);
        // int ans2 = findindex(a,target,0); 
        // System.out.println(ans);
        // System.out.println(ans2);  
        System.out.println(list);  
    }

    private static boolean findtarget(int[] a, int target, int index) {
        if(index == a.length){
            return false;
        }
        return a[index] == target || findtarget(a,target,index+1);
    }

    static int findindex(int [] a, int target, int index){
        if(index == a.length){
            return -1;
        }
        if(a[index] == target){
            return index;
        }
        else{
            return findindex(a, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] a,int target,int index){
        if(index == a.length){
            return;
        }
        if(a[index] == target){
            list.add(index);
        }
        findallindex(a, target, index+1);
    }
}
