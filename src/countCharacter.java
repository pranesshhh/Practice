
public class countCharacter {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("How are you man?");
        System.out.println(a);
        int upper = 0, lower = 0, number = 0, space = 0, vovel = 0;
        for (int i = 0; i <= a.length(); i++) {
            if (a.charAt(i) >= 65 && a.charAt(i) <= 90) {
                upper++;
            }
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                lower++;
            }
            if (a.charAt(i) == 32) {
                space++;
            }
            if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                number++;
            }
            if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U'
                    || a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                vovel++;
            }
        }
        System.out.println("upper " + upper);
        System.out.println("lower " + lower);
        System.out.println("space " + space);
        System.out.println("number " + number);
        System.out.println("vovel " + vovel);
        System.out.println("upper" + (a.length() - (upper + lower + space + vovel)));
    }
}