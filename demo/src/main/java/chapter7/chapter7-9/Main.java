
import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class Main {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("rpgsave.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
        Element hero = doc.getDocumentElement();
        System.out.println("勇者の名前：" + getTextContent(hero, "name"));

        NodeList weapons = hero.getElementsByTagName("weapon");
        for(int i=0; i<weapons.getLength(); i++){
            Element weapon = (Element) weapons.item(i);
            String weaponName = getTextContent(weapon, "name");
            String power = getTextContent(weapon, "power");
            System.out.println("武器：" + weaponName + "/ パワー：" + power);
        }
    }

    static String getTextContent(Element parent, String tagName){
        NodeList nodes = parent.getElementsByTagName(tagName);
        if(nodes.getLength() > 0){
            return nodes.item(0).getTextContent();
        }
        return "";
    }
}
