package lr12;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Матвей!");
        Tester tester = new Tester("Матвей", "Головин", 0, "B1", 112.0);
        tester.printText("Я живой!");
        Tester.hiNewTester("Артём", "Смолян", 0.0);
    }
}