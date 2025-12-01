
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier{
    public static void main(String[] args) throws IOException {
        //1. 起動パラメータからファイル名を取得
        String sourceFile = args[0];
        String destFile = args[1];

        //2. ファイル入力・出力ストリームを開く
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        System.out.println("ファイルをコピーします：" + sourceFile + "->" + destFile);

        //3. 1バイトずつ読み込み，書き込むループ
        int i;
        while ((i = fis.read()) != -1) { 
            fos.write(i);
        }

        //4. ストリームを閉じる
        fos.close();
        fis.close();

        System.out.println("コピーが完了しました");

    }
}