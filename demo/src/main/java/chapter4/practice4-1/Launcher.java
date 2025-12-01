import java.lang.reflect.Method;

public class Launcher {
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("使用法： java Launcher <FQCN> <E|I>");
            System.exit(1);
        }

        String fqcn = args[0];
        String mode = args[1];

        try {
            showMemoryUsage("起動前");

            Class<?> clazz = Class.forName(fqcn);

            System.out.println("メソッド一覧");
            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println(m.getName());
            }

            if(mode.equalsIgnoreCase("E")){
                System.out.println("[Eモード] ProcessBuilderで別プロセス起動");
                ProcessBuilder pb = new ProcessBuilder("java", fqcn);
                pb.inheritIO();
                Process p = pb.start();
                int exit = p.waitFor();
                System.out.println("サブプロセス終了コード：" + exit);

            } else if(mode.equalsIgnoreCase("I")){
                System.out.println("[Iモード] リフレクションでmain() 呼び出し");
                Method mainMethod = clazz.getMethod("main", String[].class);
                String[] params = new String[0];
                mainMethod.invoke(null, (Object) params);

            } else {
                System.out.println("第二引数は E または I を指定してください");
                System.exit(1);
            }

            showMemoryUsage("終了時");

            System.exit(0);

        } catch (Exception e) {
            System.err.println("エラー: " + e);
            e.printStackTrace();
            System.exit(1);
        }
    }
    private static void showMemoryUsage(String label){
        Runtime rt = Runtime.getRuntime();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        long used = total - free;
        System.out.printf("[%s] 使用中メモリ: %d MB%n", label, used / 1024 / 1024);
    }
}
