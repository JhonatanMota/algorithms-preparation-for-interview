package algorithms;

import java.util.Arrays;

class Twin {

    public static void main(String[] args) {
        System.out.println("isTwin: " + isTwin("Silent", "listen"));
    }

    public static boolean isTwin(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] a1 = a.toLowerCase().toCharArray();
        char[] a2 = b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);

    }

}