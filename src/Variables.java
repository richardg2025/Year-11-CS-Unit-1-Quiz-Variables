public class Variables {

    public static void main(String[] args) {

        // 1.
        int age = 33;

        // 2.
        System.out.println(age);

        // 3.
        double balance = 18.89;

        // 4.
        int dollars =  (int) balance;

        // 5.
        int dollarsRounded = (int) balance + 1;

        // 6.
        char letter = 'A';

        // 7.
        System.out.println(letter);

        // 8.
        System.out.println((int) letter);

        // 9.
        letter += 1;

        // 10.
        System.out.println(letter);

        // 11.
        System.out.println((int) letter);

        // 12.
        /**
         * [In questions 6 - 11, we are taking a character data type and narrow casting it to an integer.
         * The resulted integer is equivalent to the ASCII value of the character. When we incremented the
         * character type, Java is actually incrementing the ASCII value, and then returning the corresponding
         * character to this new value. So, character 'A' has the ASCII value of 65, and ASCII value 66 refers to character 'B'.]
         */

    }
}
