
public class MainProgram {

    public static void main(String[] args) {
        // Test 1: Creating and displaying Money objects
        Money a = new Money(10, 50);
        Money b = new Money(3, 75);
        System.out.println(a); // Output: 10.50e
        System.out.println(b); // Output: 3.75e

        // Test 2: Adding two Money objects
        Money c = a.plus(b);
        System.out.println(c); // Output: 14.25e

        // Test 3: Comparing Money objects
        System.out.println(a.lessThan(b)); // Output: false
        System.out.println(b.lessThan(a)); // Output: true

        // Test 4: Subtracting Money objects
        Money d = a.minus(b);
        System.out.println(d); // Output: 6.75e

        Money e = b.minus(a);
        System.out.println(e); // Output: 0.00e (because b < a)
    }
}
