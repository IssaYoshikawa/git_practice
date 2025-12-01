
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;




public class CompressedFileCopier {
     public static void main(String[] args) {
         if(args.length < 2){
            System.out.println("使用法：java CompressedFileCopier <コピー元> > <コピー先>");
            
         }

         String sourceFile = args[0];
         String destFile = args[1];

         System.out.println("ファイルを圧縮コピーします：" + sourceFile + "->" + destFile );

         try(
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));

            GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(destFile));
         ) {
            //効率化のため，バイト配列を使ってまとめて読み書きする
            byte[] buffer = new byte[8192];
            int len;
            while((len = bis.read(buffer)) != -1){
                gzos.write(buffer, 0, len);
            }

            System.out.println("圧縮コピーが完了しました");
         } catch(IOException e){
            System.err.println("エラーが発生しました");
            e.printStackTrace();
         }
     }
}
