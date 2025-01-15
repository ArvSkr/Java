
public class MainProgram {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Counter1 value: " + counter1.value());
        counter1.increase();
        System.out.println("Counter1 after increase: " + counter1.value());
        counter1.decrease();
        System.out.println("Counter1 after decrease: " + counter1.value());
        Counter counter2 = new Counter(10);
        System.out.println("Counter2 value: " + counter2.value());
        counter2.increase(5);
        System.out.println("Counter2 after increase by 5: " + counter2.value());
        counter2.decrease(3);
        System.out.println("Counter2 after decrease by 3: " + counter2.value());

    }
}
