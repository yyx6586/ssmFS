package com.aloogn.junit;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

import java.util.Iterator;

public class Dom4jXMl {

    @Test
    public void test(){
        String str = "<message id=\"1\" from=\"111@aloogn\" to=\"2222@aloogn\" type=\"chat\" >" +
                "<type>text</type>" +
                "<body>hello world</body>" +
                "<time>19-12-12 12:12:12</time>" +
                "</message>";
        Document doc = null;

        try {
            //将字符串转为xml
            doc = DocumentHelper.parseText(str);
            //获取根节点
            Element rootElt = doc.getRootElement();

            //获取节点名称
            System.out.println("---->"+rootElt.getName());

            //获取节点属性
            String toId = rootElt.attributeValue("to");
            System.out.println("toId---->"+toId);

            //获取根节点下的子节点type
            Iterator iter = rootElt.elementIterator("type");
//            while (iter.hasNext()){
//
//            }

        }catch (DocumentException e){
            System.out.println("11----->"+e.getCause().getMessage());
        }catch (Exception e){
            System.out.println("22----->"+e.getCause().getMessage());
        }
    }
}
