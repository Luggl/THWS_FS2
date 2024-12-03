package First_Round.Lec14;

public abstract class Test {

    public abstract void insert();

    int age = 10;


    public void test() {
        System.out.println("hello");
    }

}

class TestTwo{
    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void insert() {
                System.out.println("insert");
            }
        };
        test.test();
    }
}

