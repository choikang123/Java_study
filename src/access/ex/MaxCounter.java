package access.ex;

public class MaxCounter {
    private int count=0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    void increment() {
        if (count < max) {
            count += 1;
        } else {
            System.out.println("최대값 넘음");
        }
    }

    public int gerCount() {
        return count;
    }
}
