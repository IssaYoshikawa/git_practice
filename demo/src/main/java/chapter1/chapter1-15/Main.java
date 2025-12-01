

public class Main {
    public static void main(String[] args) {
        LoginHistory h = new LoginHistory("a", -1, false);
        System.out.println("ログインを試みたユーザー名は" + h.user());
    }
}
