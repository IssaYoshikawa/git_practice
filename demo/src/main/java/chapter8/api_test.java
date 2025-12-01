package chapter8;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class api_test {
    public static void main(String[] args) throws Exception {
        //1．接続先にURL
        URL url = new URL("https://catfact.ninja/fact");

        //2. 接続の準備（ブラウザを開くイメージ）
        HttpURLConnection conn = (HttpsURLConnection) url.openConnection();

        //3. リクエストの設定
        conn.setRequestMethod("GET");//データをくださいというリクエスト
        conn.connect();//実際に接続

        //4. ステータスコードの確認(200なら成功)
        int responseCode = conn.getResponseCode();
        System.out.println("ステータスコード：" + responseCode);

        if(responseCode == 200){
            //5．データの読み込み
            InputStream is = conn.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);

            StringBuilder sb = new StringBuilder();
            int i;
            while((i = isr.read()) != -1){
                sb.append((char) i);
            }

            System.out.println("===受信したデータ（JSON）");
            System.out.println(sb.toString());
        } else {
            System.out.println("接続に失敗しました");
        }

        //後片づけ（切断）
        conn.disconnect();


    }
}
