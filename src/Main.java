import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Vacation> treeSet = new TreeSet<Vacation>(new VacationComparator());
        Vacation vacation4 = new Vacation(4, "Thailand");
        Vacation vacation1 = new Vacation(1, "Bali");
        Vacation vacation5 = new Vacation(5, "Antalya");
        Vacation vacation3 = new Vacation(3, "Maldivy");
        Vacation vacation2 = new Vacation(2, "Egipet");
        treeSet.add(vacation5);
        treeSet.add(vacation1);
        treeSet.add(vacation4);
        treeSet.add(vacation3);
        treeSet.add(vacation2);

        Iterator<Vacation> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNum());
        }
    }
}
