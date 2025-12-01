import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("計算を開始します");
        int x=3;
        int a = x * x;

        //ファイルに結果を書きだす
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("calcreport.txt"))){
            bw.write("x=" + x + "\n");
            bw.write("xの2乗=" + a + "\n");
        }

        System.out.println("計算完了．結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
            "c:\\windows\\system32\\notepad.exe",
            "calcreport.txt"
        );
        pb.start();
    }
}
