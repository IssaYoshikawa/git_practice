public class Account implements Comparable<Account> {
    public int number;    // 口座番号
    public int zandaka;   // 残高

    // コンストラクタ
    public Account(int number, int zandaka){
        this.number = number;
        this.zandaka = zandaka;
    }

    @Override
    public int compareTo(Account obj) {
        return Integer.compare(this.number, obj.number);
    }

    @Override
    public String toString(){
        return "Account[number=" + number + ", zandaka=" + zandaka + "]";
    }
}

