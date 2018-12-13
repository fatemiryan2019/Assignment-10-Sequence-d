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
        int y = 0;
        int z = 0;
        int fibonacci = 1;
        do {
            y = z;
            z = fibonacci;
            fibonacci = y + z;
            System.out.printf("%d ", fibonacci);
        } while (fibonacci <= 55);
        System.out.println();

//        First 10 Prime Numbers: 2 3 5 7 11 13 17 19 23 29
//        Calculate the numbers using while or do...while loops to create the numbers

        System.out.print("The First 10 Prime Numbers are: ");
        while(n<=10){
            int num = 1;
            while (num<=29) {
                num++;
                boolean xprime = false;
                int x = 1;
                while (x<=num/3) {
                    x++;
                    if (num%x==0) {
                        xprime = true;
                        break;
                    }
                }
                if (!xprime) {
                    System.out.print(num + " ");
                }
            }
            n++;
        }
        System.out.println();


//        First 10 Triangle Numbers: 1 3 6 10 15 21 28 36 45 55
//        Calculate the numbers using while or do...while loops to create the numbers

        System.out.print("The First 10 Triangle Numbers: ");
        n = 1;
        while (n <= 10) {
            int triangle = (n * (n + 1) / 2);
            System.out.printf("%d ", triangle);
            n++; }

    }
}
