package recursionlevel1.src;

public class sorted {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        System.out.println(issorted(a , 0));
    }

    private static boolean issorted(int[] a , int index) {
        if(index == a.length-1){
            return true;
        }
        return a[index] < a[index+1] && issorted(a, index+1);
    }
}
