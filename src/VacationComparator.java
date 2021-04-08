import java.util.Comparator;

public class VacationComparator implements Comparator<Vacation> {
    @Override
    public int compare(Vacation o1, Vacation o2) {
        if (o1.getName().compareTo(o2.getName()) > 0)
            return -1;
        else if (o1.getName().compareTo(o2.getName()) < 0)
            return 1;
        else
            return 0;
    }
}
