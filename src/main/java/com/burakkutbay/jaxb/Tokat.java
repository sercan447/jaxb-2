
package com.burakkutbay.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Tokat {
    
    public static void main(String[] args)throws JAXBException{
        
        Viras2 viras = new Viras2();
              viras.setATA(5);
              viras.setBLA("hak");
              viras.setCEFA("coko");
              viras.setDEVA("tok");
        
        
        JAXBContext con = JAXBContext.newInstance(Viras2.class);
        Marshaller mar = con.createMarshaller();
        
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        mar.marshal(viras, System.out);
        
    }
    
}
