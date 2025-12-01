
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // FileReader fw = new FileReader("rpgsave.dat");
        // System.out.println("全てのデータを読んで表示します");
        // int i = fw.read();
        // while (i != -1) { 
        //     char c = (char)i;
        //     System.out.println(c);
        //     i = fw.read();
        // }
        // System.out.println("ファイルの末尾に到達しました");
        // fw.close();

        BufferedReader br = new BufferedReader(new FileReader("rpgsave.dat"));
        System.out.println("全てのデータを一行ずつ読んで表示します");
        String line = br.readLine();
        while (line != null) { 
            System.out.println(line);
            line = br.readLine();
        }
        System.out.println("ファイルの末尾に到達しました");
        br.close();

    }
}
