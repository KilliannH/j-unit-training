package example;

public class MyClass {

    /**
     * Calculate the factorial of a number
     * @param n number which is used to calculate the factorial
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n* factorial (n-1);
        }
    }

    /**
     * Compute the percent change between two figures
     * Rounding to two decimals
     * @param a new value
     * @param b original value
     * @return The evolution and an indication: decrease; increase; no change
     */
    public static String percentage(double a, double b) {
        String answer;
        double result = Math. round ((a/b-1)*1e5)*1e-3;
        if(result < 0) {
            answer = "Decrease of ";
        }
        else {
            answer = "Increase of ";
        }
        answer += Double. toString (result)+"%";
        return answer;
    }

    /**
     * Convert in uppercase all characters of a string which are in even-numbered position
     * Example: exercise => eXeRcIsE
     * @param s original string
     * @return converted string
     */
    public static String uppercase(String s) {
        String newString = "";
        for(int i=0;i<s.length();i++) {
            if(i%2 != 0) {
                newString += Character. toUpperCase (s.charAt(i));
            }
            else {
                newString += s.charAt(i);
            }
        }
        return newString;
    }
}
