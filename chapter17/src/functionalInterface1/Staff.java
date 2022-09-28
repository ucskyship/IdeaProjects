package functionalInterface1;

@FunctionalInterface
public interface Staff {
    void work(int hours);

    static void assist(){
        System.out.println(":");
    }

    default int getAge(){
        return 5;
    }
}
