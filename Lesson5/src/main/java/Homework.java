public class Homework {
    public static void main(String[] args) {
        User vera = new User("Vera", "Stolyarova",21,"female");
        vera.increaseAge();
        vera.getFullName();
        vera.outInfo();

        User stas = new User("Stanislav", "Bakinovsky");
        stas.outInfo();
    }
}
