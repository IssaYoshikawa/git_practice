public class Main {
    public static void main(String[] args) {
        // PADLOCKタイプのStrongBox
        StrongBox<String> padlockBox = new StrongBox<>(KeyType.PADLOCK);
        padlockBox.put("秘密の書類");

        System.out.println("PADLOCK Boxの取り出しテスト:");
        for(int i = 1; i <= 1025; i++) {
            String result = padlockBox.get();
            if(result != null) {
                System.out.println("取得成功: " + result + " (試行回数: " + i + ")");
                break;
            }
        }

        // BUTTONタイプのStrongBox
        StrongBox<String> buttonBox = new StrongBox<>(KeyType.BUTTON);
        buttonBox.put("重要メモ");

        System.out.println("\nBUTTON Boxの取り出しテスト:");
        for(int i = 1; i <= 10005; i++) {
            String result = buttonBox.get();
            if(result != null) {
                System.out.println("取得成功: " + result + " (試行回数: " + i + ")");
                break;
            }
        }
    }
}
