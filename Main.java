/* 
* File: Main.java
* Author: Doktor Kristóf Márk
* Copyright: 2026,Doktor Kristóf Márk
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/Dokkristof/
* Licenc: MIT
*/


public class Main {
    public static void main(String[] args) {
        Writable writer = new Writer("Output.txt");
        writer.writeContent("Ez egy random szöveg,hogy müködik a fájlba írás");
    }
}