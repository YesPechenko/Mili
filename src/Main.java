public class Main {

    public static void main(String[] args) {
        int mili = 1;
        int ticket = 100;
        int sum = ticket / 20;

        int limit = 20;

        if (sum >= limit) {
            mili = mili * sum;
        } else {
            mili = sum;
        }
        System.out.println(mili);
    }
}
