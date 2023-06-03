public class Otnoshenie {
    public Otnoshenie(Person p1, Subjects re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Subjects re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
    // Кстати из за того что делал по примеру, узнал о полезном string.format и public enum.
}
