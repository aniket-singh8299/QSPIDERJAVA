
class IFELSE {
    public static void main(String[] args) {
        char c='Z';

        if (c >= 'A' && c <= 'Z') {
            System.out.println("Character is Uppercase");
        } else {
            System.out.println("Character is Lowercase");
        }

        if (c >= 'A' && c <= 'Z') {
            System.out.println("Character is Lowercase");
        } else {
            System.out.println("Character is UPPERCASE ");
        }

        int num = 80;
        if (num % 2 == 0) {
            System.out.println("Hi");
        } else {
            System.out.println("Hello");
        }

        if (num > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }

        char ss = 't';
        if (ss > 'p' && ss < 'x') {
            System.out.println("Character is in between p to x");
        } else {
            System.out.println("Not in between p to x");
        }
    }
}
