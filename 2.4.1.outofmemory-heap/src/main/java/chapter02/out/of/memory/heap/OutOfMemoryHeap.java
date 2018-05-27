package chapter02.out.of.memory.heap;

import java.util.ArrayList;

public class OutOfMemoryHeap {

    static class OOMObject {

    }

    public static void main(String[] args) {
        var list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
