package xxedom4j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

class DemoDom4j{
	public void parse(String filename){
		File inputXml = new File(filename);
		SAXReader saxReader = new SAXReader();
		try {
			System.out.println("start.....");
            Document document = saxReader.read(inputXml);
            Element rootElement = document.getRootElement();
         // 第二种方法遍历  
            List<Element> elements = rootElement.elements();  
            for (Element child : elements) {  
                // 未知属性名情况下  
                 
               /*   List<Attribute> attributeList = child.attributes(); 
                  for(Attribute attr : attributeList) { 
                	  System.out.println(attr.getName() + ": " + attr.getValue()); 
                  } */
                   
                // 已知属性名情况下  
              /*Element child2 = child.element("name");  
                Attribute attribute = child2.attribute("sex");  
                System.out.println("sex: " + attribute.getText());  */
  
                // 未知子元素名情况下  
                 
                 List<Element> elementList = child.elements(); for (Element 
                 ele : elementList) { System.out.println(ele.getName() + ": " 
                 + ele.getText()); } System.out.println(); 
                   
  
                // 已知子元素名的情况下  
              /*System.out.println("name: " + child.elementText("name"));  
                System.out.println("age: " + child.elementText("age"));  
                System.out.println("address: " + child.elementText("address"));  
                System.out.println("nickName: " + child.elementText("nickName"));  */
                // 这行是为了格式化美观而存在  
                System.out.println();  
            }  
            
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }


		System.out.println("Parse xml document");
		
	}
	
}
public class DemoDom4jxxe {
	public static void main(String args[]){
		DemoDom4j d= new DemoDom4j();
		d.parse("D:\\Workspace\\xxe\\src\\xxedom4j\\xxe.xml");
	}
}
