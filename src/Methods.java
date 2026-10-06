public class Methods {
//    decalartion/definations
    static  void print2Table() {
        for (int i = 1; i <= 10; i++){
            System.out.println(2 * i);
        }
    }

    static  void printSum(int x, int y) {
        System.out.println("SUM: " + (x+y));
    }

    static  void printMultiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Result: " + (a + b));
    }

    static  int add(int p, int q) {
        int sum = p+q;
        return sum;
    }

    static  int add (int p, int q, int r) {
        int ans = p+q+r;
        return ans;
    }

    static  void solve (int num) {
        System.out.println("inside solve: " + num);
        num = num * 10;
        System.out.println("inside solve: " + num);
    }

    static  void printMultiples() {
        int value = 20;
        for (int i = 1; i <= 10; i++) {
            System.out.println(20*i);
        }
    }

    static  void main () {
        int num = 5;
        System.out.println("inside main: " + num);
        solve(num);
        System.out.println("inside main: " + num);
//        System.out.println("hi");
//        print2Table();
//        System.out.println("bye");
//        printSum(2, 4);
//        printMultiplication(2, 5);
//        int result = add(1 ,4);
//        System.out.println("Result: " + result);
//        int result2 = add(5,5,5);
//        System.out.println(result2);
    }
}