public class Main {

    public static void main(String[] args) {

//        First 10 Square Numbers: 1 4 9 16 25 36 49 64 81 100
//        Calculate the numbers using while or do...while loops to create the numbers
        System.out.print("\nThe First 10 Square Numbers: ");
        int n = 0;
        while (n < 10) {
            int sqr = n * n;
            n++;
            System.out.printf("%d ", sqr);
        }

//        First 10 Cube Numbers: 1 8 27 64 125 216 343 512 729 1000
//        Calculate the numbers using while or do...while loops to create the numbers
        System.out.print("\nThe First 10 Cube Numbers: ");
        n = 0;
        while (n < 10) {
            int cube = n * n * n;
            System.out.printf("%d ", cube);
            n++;
        }

//        First 10 Fibonacci Numbers from 1: 1 2 3 5 8 13 21 34 55 89
//        Calculate the numbers using while or do...while loops to create the numbers
        System.out.print("\nThe First 10 Fibonacci Numbers from 1: ");
        int[]fib = new int[10];
        fib[0] = 1;
        fib[1] = 2;
        for(int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for(int i = 0; i < fib.length; i++) {
            System.out.printf("%d ", fib[i]);
            n = 1;
        }

//        First 10 Prime Numbers: 2 3 5 7 11 13 17 19 23 29
//        Calculate the numbers using while or do...while loops to create the numbers
        System.out.print("\nThe First 10 Prime Numbers: ");
        for (int pri = 2; pri < 30; pri++) {
            boolean prime = false;
            for (int i = 2; i <= pri / 2; ++i) {
                if (pri % i == 0) {
                    prime = true;
                    break;
                }
            }
            if (!prime)
                System.out.printf("%d ", pri);
        }

//        First 10 Triangle Numbers: 1 3 6 10 15 21 28 36 45 55
//        Calculate the numbers using while or do...while loops to create the numbers
        System.out.print("\nThe First 10 Triangle Numbers: ");
        int[]tri = new int[10];
        tri[0] = 1;
        for(int i = 1; i < tri.length; i++) {
            tri[i] = tri[i - 1] + i + 1;
        }
        for(int i = 0; i < tri.length; i++) {
            System.out.printf("%d ", tri[i]);
        }

    }
}
