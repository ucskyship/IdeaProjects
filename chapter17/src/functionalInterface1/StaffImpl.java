package functionalInterface1;

public class StaffImpl implements Staff {

    @Override
    public void work(int hours) {
        System.out.println("Working");
    }
    public void work2(int hours) {
        System.out.println("Working daily");
    }
}
