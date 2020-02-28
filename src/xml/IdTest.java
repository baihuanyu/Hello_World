package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class IdTest {
    public static void main(String[] args) throws Exception {
        File file = new File("src/xml/contacts.xml");
        // 获取document对象
        SAXReader reader = new SAXReader();
        Document dom = reader.read(file);
        Element root = dom.getRootElement();
        List<Element> list = root.elements("linkman");
        for (Element element : list) {
            Attribute id = element.attribute("id");
            if (id.getValue().equals("1")){
                System.out.println(id.getValue());
            }

        }



    }
}
