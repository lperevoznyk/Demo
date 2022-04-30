public class Calculator {

    int sum(int... values) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        return sum;
    }
}
