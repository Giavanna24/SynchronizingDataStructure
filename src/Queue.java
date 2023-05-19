import java.util.Objects;
import java.util.concurrent.SynchronousQueue;

public class Queue implements DataStructure {
    public Object[] objects = new Object[100];
    public int Count = 0;
    public int NextGet = 0;
    public int NextPut = 0;


    // Methods
    synchronized public boolean put(Object obj) {
        if (Count < 100) {
            objects[NextPut] = obj;
            if (NextPut < 99) {
                NextPut = NextPut + 1;
            } else {
                NextPut = 0;
            }
            Count = Count + 1;
            return true;
        } else {

            return false;
        }

    }

    synchronized public Object get() {

        if (Count > 0) {
            Object newObj = objects[NextGet];
            if (NextGet < 99) {
                NextGet = NextGet + 1;
            } else {
                NextGet = 0;
            }
            Count = Count - 1;
            return newObj;
        } else {
            return null;
        }

    }
    public String toString() {
        String description = "Count:" + Count + " nextPut:" + NextPut + " nextGet:" + NextGet + "[";
        for (int i = 0; i < 100; i = i + 1) {
            description = description + objects[i] + ", ";
        }
        return description;
    }
}



