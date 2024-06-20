package First_Round.Lec17_1;

public class NullPoint {

    int value = 5;
    NullPoint next;

    public static void main(String[] args) {
        NullPoint x = new NullPoint();
        System.out.println(x.next.value);
    }
}
