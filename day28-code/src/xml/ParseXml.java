package xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ParseXml {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        // 1.关联要解析的xml文件，获取document对象
        Document document = reader.read("day28-code/src/xml/mstus.xml");
        // 2.获取根标签
        Element rootElement = document.getRootElement();
        // 3.通过根标签，获取子标签
        List<Element> elements = rootElement.elements();
        // 4.遍历集合获取每一个子标签（student）
        for (Element studentElement : elements) {
            // 5.获取id属性
            String id = studentElement.attributeValue("id");
            // 6.单独获取name、age标签
            Element nameElement = studentElement.element("name");
            Element ageElement = studentElement.element("age");
            // 7.获取标签内部的文本
            String name = nameElement.getText();
            String age = ageElement.getText();
            System.out.println(id + " " + name + " " + age);
        }
    }
}
