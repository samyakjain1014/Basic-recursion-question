package recursionlevel1.src;

public class numberofzeroes {
    public static void main(String[] args) {
        System.out.println(count(10110002));
    }

    private static int count(int n) {
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }

        int rem = n % 10 ;
        if(rem == 1){
            return helper(n/10 , c+1);
        }
        return helper(n/10 ,c);
    }
}
