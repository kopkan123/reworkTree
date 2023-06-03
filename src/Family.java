import java.util.ArrayList;

public class Family {
    private ArrayList<Otnoshenie> tree = new ArrayList<>();

    public ArrayList<Otnoshenie> getTree() {
        return tree;
    }
    public void appendPerentChild(Person parent, Person children) {
        tree.add(new Otnoshenie(parent, Subjects.parent, children));
        tree.add(new Otnoshenie(children, Subjects.children, parent));
    }
    public void appendVifeHusbent(Person vife, Person husbent) {
        tree.add(new Otnoshenie(vife, Subjects.vife, husbent));
        tree.add(new Otnoshenie(husbent, Subjects.husbent, vife));
    }
}
