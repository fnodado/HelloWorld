public class ChallengeOne {

    public static void main(String[] args) {
        boolean res = isPerfectNumber(6);
        System.out.println("res:" + res);
    }


    public static boolean isLeapYear(int year){
        boolean isCorrect = false;

        if(year <= 0 || year > 9999){
            isCorrect = false;
        } else if((year % 4 == 0)){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isCorrect = true;
                }
            }
        }

        return isCorrect;
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        boolean res = false;
        String reverse = "";

        while(number > 9){
            reverse += number % 10;
            number /= 10;
        }

        reverse += number;
        int reverseInt = Integer.valueOf(reverse);

        if(originalNumber == reverseInt){
            res = true;
        }

        return res;
    }

    // write code here
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        int lastNumber = 0;
        int firstNumber = 0;
        if(number < 0){
            return -1;
        }

        if(number < 9){
            return number * 2;
        }

        lastNumber = number % 10;
        while(number > 9){
            number /= 10;
        }
        firstNumber = number;
        sum = firstNumber + lastNumber;
        return sum;

    }


    public static int getEvenDigitSum(int number){
        int sum = 0;

        while(number > 9){
            int current = number % 10;
            if(isEven(current)){
                sum += current;
            }
            number /= 10;
        }

        if(isEven(number)){
            sum += number;
        }

        return sum;
    }

    public static boolean isEven(int number){
        boolean res = false;
        if(number % 2==0){
            res = true;
        }
        return res;
    }

    public static boolean hasSharedDigit(int a, int b){
        boolean shared = false;
        int originalB = b;
        if(a < 10 || a > 99){
            return false;
        }

        if(b < 10 || b > 99){
            return false;
        }

        while(a > 0){
            int currentA = a % 10;
            while(b > 0){
                int currentB = b % 10;
                if(currentA == currentB){
                    shared = true;
                    break;
                }
                b/=10;
            }
            a /= 10;
            b = originalB;
        }
        return shared;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd = 0;
        if(first < 10 || second < 10){
            return -1;
        }

        for(int i = 1; i <= first; i++){
            for(int j = 1; j <= second; j++){
                if(first % i == 0){
                    if(second % j == 0){
                        if(i == j){
                            gcd = i;
                            break;
                        }
                    }
                }
            }
        }
        return gcd;
    }

    public static boolean isPerfectNumber(int number){
        boolean res = false;
        int sum = 0;

        if(number < 1){
            return false;
        }

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if(sum == number){
            res = true;
        }

        return res;
    }


}
