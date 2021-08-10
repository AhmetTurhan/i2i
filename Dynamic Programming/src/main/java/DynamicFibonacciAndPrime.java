public class DynamicFibonacciAndPrime {

    //ADVANTAGES OF DYNAMIC PROGRAMMING
    //It's well suited for multi-stage or multi-point or sequential
    // decision preocess.
    //It's suitable for linear or non-linear problems, discrete or
    //continuos variables and deterministic problems

    //DISADVANTAGES OF DYNAMIC PROGRAMMING
    //No general formation of Dynamic Programming is available.
    //Every program has to be solving in its own way.
    //Dividing problem in sum problem and storing inter mediate resuls
    //consumes memory.

    static boolean isPrime(int number){

        int num = 0;

        for (int i = 1;i<=number;i++){
            if (number % i == 0 ){
                num++;
            }
        }

        if (num == 2)
            return true;
        else
            return false;
    }

    static int fibo(int number){
        if (number<=1)
            return number;
        return fibo(number-1)+fibo(number-2);

    }

    public static void main(String[] args) {

        for (int i = 1; i<=15;i++){

            if (isPrime(fibo(i))){
                System.out.println(fibo(i));
            }
        }

    }

}
