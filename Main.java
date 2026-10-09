/* 
* File: Main.java
* Author: Doktor Kristóf Márk
* Copyright: 2026,Doktor Kristof Márk
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/Dokkristof/
* Licenc: MIT
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Writable writer = new Writer("Output.txt");

        System.out.print("Kérem írja be a fájlba mentendő szöveget: ");
        String userInput = scanner.nextLine();

        writer.writeContent(userInput);

        scanner.close();
    }
}