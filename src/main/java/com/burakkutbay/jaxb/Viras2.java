
package com.burakkutbay.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
//@XmlType(propOrder = {"a","b","c","d"})
public class Viras2 {
    
    private int a;
    private String b;
    private String c;
    private String d;

    @XmlAttribute
    public int getATA() {
        return a;
    }

    public void setATA(int a) {
        this.a = a;
    }

    @XmlElement
    public String getBLA() {
        return b;
    }

    public void setBLA(String b) {
        this.b = b;
    }

    @XmlElement
    public String getCEFA() {
        return c;
    }

    public void setCEFA(String c) {
        this.c = c;
    }

    @XmlElement
    public String getDEVA() {
        return d;
    }

    public void setDEVA(String d) {
        this.d = d;
    }
}
