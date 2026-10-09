public class Main {
    public static void main(String[] args) {
        Writable writer = new Writer("Outpot.txt");
        writer.writeContent("Ez egy random szöveg,hogy müködik a fájlba írás");
    }
}