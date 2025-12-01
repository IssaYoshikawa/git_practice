
public record LoginHistory(String user, int retry, boolean result) {
    public LoginHistory{
        //this("unknown", 0, false);
        if(retry < 0){
            throw new IllegalArgumentException();
        }
    }
    
}
