package chapter.out.of.memory.stack;

public class JavaVMStackSOF {

    private int stackLength = 1;

    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    private void dontStop() {
        while (true) {
        }
    }

    private void stackOverLeakByThread() {
        while (true) {
            var thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    public static void main(String[] args) {
        var javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + javaVMStackSOF.stackLength);
            throw e;
        }
    }
}
