package recursionlevel1.src;

public class palindrome {
   
    static int rev2(int n){
          // sometimes you might need some additional variables in the argument
         // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == 0){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10 , digits-1);
    }

    public static void main(String[] args) {
        
        System.out.println(palin(126563421)); 

    }

    private static boolean palin(int i) {
        return i == rev2(i);
    }
}
