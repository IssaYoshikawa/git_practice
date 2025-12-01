package chapter8.practice8_3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        //1. HttpClientの作成
        HttpClient client = HttpClient.newHttpClient();

        //2. リクエストの作成
        String url = "https://api.github.com/users/miyabilink";
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        //3. リクエスト送信とレスポンス取得
        HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());

        //4. Jacksonを使ってJSONを解析
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(res.body());

        //5. "blog"というキーを取り出す
        //String blogUrl = root.get("blog").asText();

        //ツリー構造を見やすい形（インデント付き）で文字列に戻して表示
        String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);

        //6. 結果の表示
        System.out.println(prettyJson);
    }
}
