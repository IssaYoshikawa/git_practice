import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class JvmMemoryDemo {
    public static void main(String[] args) throws InterruptedException {

        // JVMのメモリ管理情報を取得するオブジェクト
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        System.out.println("=== JVM Memory Information ===");
        printMemoryUsage(memoryBean);

        System.out.println("\n=== Allocate Objects (simulate heap growth) ===");
        // ヒープにオブジェクトを追加してメモリ消費を観察
        byte[][] data = new byte[10][];
        for (int i = 0; i < data.length; i++) {
            data[i] = new byte[5_000_000]; // 約5MBずつ確保
            printMemoryUsage(memoryBean);
            Thread.sleep(500); // 少し待って変化を確認
        }

        System.out.println("\n=== Trigger Garbage Collection ===");
        data = null; // 参照を切る
        System.gc(); // ガーベジコレクションを手動で要求
        Thread.sleep(1000);
        printMemoryUsage(memoryBean);

        System.out.println("\n=== Done ===");
    }

    private static void printMemoryUsage(MemoryMXBean memoryBean) {
        MemoryUsage heap = memoryBean.getHeapMemoryUsage();
        MemoryUsage nonHeap = memoryBean.getNonHeapMemoryUsage();

        System.out.printf("Heap: used=%.2fMB, committed=%.2fMB, max=%.2fMB%n",
                heap.getUsed() / 1_048_576.0,
                heap.getCommitted() / 1_048_576.0,
                heap.getMax() / 1_048_576.0);
        System.out.printf("Non-Heap: used=%.2fMB, committed=%.2fMB%n%n",
                nonHeap.getUsed() / 1_048_576.0,
                nonHeap.getCommitted() / 1_048_576.0);
    }
}
