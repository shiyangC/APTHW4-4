import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(5);

        QuickSort fqs = new FirstQuickSort(new LessStrategy());
        fqs.quickSort(list, 0, list.size() - 1);
        print(list);

        QuickSort rqs = new RandomQuickSort(new GreaterStrategy());
        rqs.quickSort(list, 0, list.size() - 1);
        print(list);


    }
    public static void print(List<Integer> list) {
        for (int i : list)
            System.out.print(i + " ");
        System.out.println();
    }
}
