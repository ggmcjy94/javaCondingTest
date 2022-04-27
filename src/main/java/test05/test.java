package test05;

public class test {

    public static void main(String[] args) {
        String stack = "안녕하세여";
        test3 test = new test3(new test1() {
            @Override
            public void test2() {
                System.out.println("stack = " + stack);
            }
        });
        test.run();
    }
}



class test3 {

    private test1 test;

    public test3(test1 test) {
        this.test = test;
    }

    public void run() {
        test.test2();
    }

}


interface test1 {
    void test2();
}
