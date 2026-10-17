package JavaCollectionFramework;

import java.util.Comparator;

public class WeightComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
