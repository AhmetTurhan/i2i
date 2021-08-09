import java.util.logging.Logger;

public class RepeatingArrayNumbers {

    static final Logger logger = Logger.getLogger(String.valueOf(RepeatingArrayNumbers.class));

    public static void isRepeat(int arr[]){
        logger.info("Function has started");

        String output = "";

        for (int i = 0; i<arr.length; i++){

            for (int j = arr.length-1; j>i ;j--){
                if (arr[i] == arr[j]){
                    output = output + arr[i] + " ";
                }
            }
        }

        if (output == ""){
            logger.info("There is no repeating numbers.");
            System.out.println("Nothing is repeating.");
        }
        else {
            logger.info("Repeating number/numbers is/are " + output);
            System.out.println(output);
        }

        logger.info("Function has ended");

    }

    public static void main(String[] args) {

        int arr1[] = {1,2,4,8,3};
        int arr2[] = {4,6,12,5,5,89};
        int arr3[] = {4,3,8,8,35,35,12};
        int arr4[] = {5,6,78,5};

        logger.info("Checking for arrays.");

        isRepeat(arr1);
        isRepeat(arr2);
        isRepeat(arr3);
        isRepeat(arr4);


    }
}
