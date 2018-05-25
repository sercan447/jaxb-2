
package com.burakkutbay.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Suc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Viras {
    
    @XmlAttribute(name="kerbela")
    private int a;
    @XmlElement(name="bem")
    private String b;
    @XmlElement(name="cem")
    private String c;
    @XmlElement(name="dem")
    private String d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    
    
    
    
    
    
}
