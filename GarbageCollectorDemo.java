class Test {
    int id;
    Test(int id) {
        this.id = id;
    }
    @Override
    protected void finalize() {
        System.out.println("Object with id " + id + " is destroyed");
    }
}

public class GarbageCollectorDemo {
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);

        t1 = null;   // now object {id=1} is eligible for GC
        t2 = null;   // object {id=2} also eligible

        System.gc(); // suggest GC to run (not guaranteed immediately)

        System.out.println("Main ends");
    }
}
