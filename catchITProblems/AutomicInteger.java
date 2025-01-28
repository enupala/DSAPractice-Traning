package catchITProblems;
import java.util.concurrent.atomic.AtomicInteger;

public class AutomicInteger {

        public static void main(String[] args) {
            AtomicInteger atomicInt = new AtomicInteger(0);

            // Atomic increment
            System.out.println("Before increment: " + atomicInt.get());
            atomicInt.incrementAndGet();  // atomically increments by 1
            System.out.println("After increment: " + atomicInt.get());

            // Compare and set
            boolean updated = atomicInt.compareAndSet(1, 5);  // If current value is 1, set to 5
            System.out.println("Updated: " + updated + ", Current Value: " + atomicInt.get());
        }
    }


