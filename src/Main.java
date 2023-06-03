public class Main {
    public static void main(String[] args) {
        Person mikail = new Person("Микаил", 18);
        Person genri = new Person("Генри", 12);
        Person rasul = new Person("Расул", 19);
        Person linda = new Person("Линда", 39);
        Person sasha = new Person("Саша", 40);
        Person vania = new Person("Ваня", 43);
        Person vadim = new Person("Вадим", 39);
        Person karina = new Person("Карина", 47);
        Person gadshi = new Person("Гаджимурад", 45);

        Family fam = new Family();
        fam.appendPerentChild(karina, mikail);
        fam.appendPerentChild(vania, genri);
        fam.appendPerentChild(vadim, rasul);
        fam.appendPerentChild(sasha, genri);
        fam.appendPerentChild(linda, rasul);
        fam.appendPerentChild(gadshi, mikail);
        fam.appendVifeHusbent(karina, gadshi);
        fam.appendVifeHusbent(vania, sasha);
        fam.appendVifeHusbent(vadim, linda);

        System.out.println("Дети Карины: ");
        System.out.println(new Poisk(fam).spend(karina, Subjects.parent));

        System.out.println("Дети Гаджимурада: ");
        System.out.println(new Poisk(fam).spend(gadshi, Subjects.parent));

        System.out.println("Муж Карины: ");
        System.out.println(new Poisk(fam).spend(karina, Subjects.vife));

        System.out.println(new Poisk(fam).searchAge());
    }
}