package de.thws;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Umschalt+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Strg+F8.
            System.out.println("i = " + i);


        }
        String s = "46 61 72 20 6f 75 74 20 69 6e 20 74 68 65 20 75 6e 63 68 61 72 74 65 64 20 62 61 63 6b 77 61 74 65 72 73 20 6f 66 20 74 68 65 20 75 6e 66 61 73 68 69 6f 6e 61 62 6c 65 20 65 6e 64 20 6f 66 20 74 68 65 20 57 65 73 74 65 72 6e 20 53 70 69 72 61 6c 20 41 72 6d 20 6f 66 20 74 68 65 20 47 61 6c 61 78 79 20 6c 69 65 73 20 61 20 73 6d 61 6c 6c 20 75 6e 72 65 67 61 72 64 65 64 20 79 65 6c 6c 6f 77 20 73 75 6e 2e 0a 4f 72 62 69 74 69 6e 67 20 74 68 69 73 20 61 74 20 61 20 64 69 73 74 61 6e 63 65 20 6f 66 20 72 6f 75 67 68 6c 79 20 6e 69 6e 65 74 79 2d 74 77 6f 20 6d 69 6c 6c 69 6f 6e 20 6d 69 6c 65 73 20 69 73 20 61 6e 20 75 74 74 65 72 6c 79 20 69 6e 73 69 67 6e 69 66 69 63 61 6e 74 20 6c 69 74 74 6c 65 20 62 6c 75 65 2d 67 72 65 65 6e 20 70 6c 61 6e 65 74 20 77 68 6f 73 65 20 61 70 65 2d 64 65 73 65 6e 64 65 64 20 6c 69 66 65 20 66 6f 72 6d 73 20 61 72 65 20 73 6f 20 61 6d 61 7a 69 6e 67 6c 79 20 70 72 69 6d 69 74 69 76 65 20 74 68 61 74 20 74 68 65 79 20 73 74 69 6c 6c 20 74 68 69 6e 6b 20 64 69 67 69 74 61 6c 20 77 61 74 63 68 65 73 20 61 72 65 20 61 20 70 72 65 74 74 79 20 6e 65 61 74 20 69 64 65 61 2e";
        char[] c = s.toCharArray();
        for(int i = 0; i<s.length(); i++){
            if(c[i] == ' '){
                c[i] = ',';
            }
            System.out.print(c[i]);
        }



    }
}