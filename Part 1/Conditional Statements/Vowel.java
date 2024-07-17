class Vowel {
    public static void main(String[] args) {
        char c = 'a';

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Character is Vowel");
        } else if ((c >= 'a' && c <= 'z') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
            System.out.println("Character is Consonant");
        } else {
            System.out.println("Character is invalid");
        }
    }
}
