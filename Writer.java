/* 
* File: Writer.java
* Author: Doktor Kristóf Márk
* Copyright: 2026,Doktor Kristof Márk
* Group: Szoft II/N
* Date: 2026-10-09
* Github: https://github.com/Dokkristof/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Writable {

    private final String filePath;

    public Writer(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void writeContent(String content) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(content + "\n");
            System.out.println("A szöveg kiírva a fájlba.");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írása során: " + e.getMessage());
        }
    }
}