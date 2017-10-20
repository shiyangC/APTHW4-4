import java.util.List;

public abstract class QuickSort <T>{

    private Strategy s;

    public QuickSort(Strategy s) {
        this.s = s;
    }

    public void quickSort(List<T> list, int l, int r) {
        if (l >= r) return;
        int idx = partition(list, l, r);
        quickSort(list, l, idx);
        quickSort(list,idx + 1, r);
    }

    protected int partition(List<T> list, int l, int r) {
        int pivot = getPivot(list, l, r);
        swap(list, r, pivot);
        int j = l - 1;
        int i = 0;
        for (i = l; i < r; i++) {
            if (s.compare(list.get(r),list.get(i)) > 0) {
                j++;
                swap(list, j, i);
            }
        }
        swap(list, r, j + 1);
        return j+1;
    }

    private void swap(List<T> list, int l, int pivot) {
        T tmp = list.get(l);
        list.set(l, list.get(pivot));
        list.set(pivot, tmp);
    }

    protected abstract int getPivot(List<T> list, int l, int r);
}
