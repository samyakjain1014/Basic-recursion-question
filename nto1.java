package recursionlevel1.src;

public class nto1 {
        public static void main(String[] args) {
        //     fun(5);
        //     fun1(5);
            fun2(5);
        }

       

        // private static void fun(int n) {
        //         if(n==0){
        //                 return;
        //         }
        //         System.out.println(n);
        //         fun(n-1);
        // }

        // private static void fun1(int n) {
        //         if(n==0){
        //                 return;
        //         }
        //         fun1(n-1);
        //         System.out.println(n);
        // }

        private static void fun2(int n) {
                if(n==0){
                        return;
                }
                System.out.println(n);
                fun2(n-1);
                System.out.println(n);
        }
}
