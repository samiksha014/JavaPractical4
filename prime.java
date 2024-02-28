import java.util.Random;

class PrimeNumberChecker {

    public static void main(String[] args) {

     
        long startTime = System.nanoTime();
        int number = generateRandomNumber();
        boolean isPrime = checkPrime(number);
        long endTime = System.nanoTime();


        System.out.println("Random number generated: " + number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        long executionTimeNano = endTime - startTime;
        double executionTimeMs = executionTimeNano / 1_000_000.0;
        System.out.println("Execution time: " + executionTimeMs + " milliseconds");
    }

 
   static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10_000_000) + 1;
    }

    static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

