import java.lang.Integer;

public class GreaterStrategy extends Strategy<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
