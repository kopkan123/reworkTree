import java.util.ArrayList;
import java.util.Scanner;

public class Poisk {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Otnoshenie> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Poisk(Family geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Subjects re) {
        for (Otnoshenie t : tree) {
            if (t.p1.name == p.name && t.re == re) {
                result.add(t.p2.name);
            }
        }
        return result;
    }
    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (Otnoshenie t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.name)) {
                resultAge.add(t.p1.name);
            }
        }
        return resultAge;
    }
}
