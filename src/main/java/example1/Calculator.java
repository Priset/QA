package example1;

public class Calculator {

    public int add (int a, int b){
        return a+b;
    }

    public int mult (int a, int b){
        return a*b;
    }

    public int subs (int a, int b) throws InterruptedException {
        Thread.sleep(5000);
        return a-b;
    }
    public int div (int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("division entre 0 no es aceptada");
        return a/b;
    }
}
