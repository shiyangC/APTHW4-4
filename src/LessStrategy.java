public class LessStrategy extends Strategy<Integer>{
    @Override
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}
