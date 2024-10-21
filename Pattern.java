public class Pattern {

    // *****
    // *****
    // *****
    // *****

    // public static void main(String[] args) {
    // for(int i = 0; i<4; i++){
    // for(int j = 0; j<5; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // //////////////////////////////////////////////////////////////////////////////

    // *****
    // * *
    // * *
    // * *
    // *****

    // public static void main(String[] args) {

    // int m = 4;
    // int n = 5;

    // for(int i=1; i<=m; i++){
    // for(int j = 1; j<=n; j++){
    // if (i == 1 || j == 1 || i == m || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // ////////////////////////////////////////////////////////////////////////////////////

    // *
    // * *
    // * * *
    // * * * *

    // public static void main(String[] args) {

    // int m = 5;
    // for(int i = 1; i<=m; i++){
    // for(int j = 1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // ///////////////////////////////////////////////////////////////////////////////////

    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    // public static void main(String[] args){

    // int m = 5;

    // for(int i=m; i>=0; i--){
    // for(int j = 0; j <= i; j++){
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // //////////////////////////////////////////////////////////////////////////////

    //       *
    //     * *
    //   * * *
    // * * * *

    // public static void main(String[] args) {

    //     int m = 10;

    //     for (int i = 1; i <= m; i++) {
    //         for (int j = 1; j <= m; j++) {
    //             int sum = i + j;
    //             if (sum > m) {
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


    // ////////////////////////////////////////////////////////////////////////////////
    
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    
    // public static void main(String[] args){
        //     int n = 4;
        //     for(int i=1; i<=n; i++){
            //         for(int j=1; j<=i; j++){
                //             System.out.print(j + " " );
                //         }
                //         System.out.println();
                //     }
                // }
                
    // ////////////////////////////////////////////////////////////////////////////////
    
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    
    // public static void main(String[] args) {
        //     int n = 4;
        
        //     for(int i = n; i>=1; i--){
            //         for(int j = 1; j<=i; j++){
                //             System.out.print(j+" ");
                //         }
                //         System.out.println();
                //     }
                // }
         
    // ////////////////////////////////////////////////////////////////////////////////

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10

    // public static void main(String[] args) {
    //     int n = 5;
    //     int num = 1;
    //     for (int i = 1; i <= n; i++) {
    //         for(int j=1; j<=i; j++){
    //             System.out.print(num+" ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // ////////////////////////////////////////////////////////////////////////////////

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1

    public static void main(String[] args) {
        int n = 5;
    
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if (sum%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
            