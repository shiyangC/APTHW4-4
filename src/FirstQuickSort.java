import java.util.List;

public class FirstQuickSort extends QuickSort<Integer>{
    public FirstQuickSort(Strategy s) {
        super(s);
    }

    @Override
    protected int getPivot(List<Integer> list, int l, int r) {
        return l;
    }
}
