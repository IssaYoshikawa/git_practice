public class Main{
    public static void main(String[] args){
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");
        System.out.println("RPG: すっきり魔王征伐 ver" + ver);
        System.out.println("Developed by " + author);
    }
}