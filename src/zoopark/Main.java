package zoopark;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Стив", 5, "Млекопитающий");

        Giraffe giraffe = new Giraffe("Гена", 7, "Млекопитающий");

        Crocodile crocodile = new Crocodile("Борис", 4, "Пресмыкающийся");

        Ostrich ostrich = new Ostrich("Марк", 10, "Птица");

        System.out.println(lion + "\n" + giraffe + "\n" + ostrich + "\n" + crocodile);
    }
}
