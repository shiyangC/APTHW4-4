import java.util.List;
import java.util.Random;

public class RandomQuickSort extends QuickSort<Integer>{
    public RandomQuickSort(Strategy s) {
        super(s);
    }

    @Override
    protected int getPivot(List<Integer> list, int l, int r) {
        if (l == r)
            return l;
        Random random = new Random();
        return random.nextInt(r - l) + l;
    }
}
