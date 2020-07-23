
package com.amazonaws.mws.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.</p>
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * {@code <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HasNext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ReportInfoList" type="{http://mws.amazonaws.com/doc/2009-01-01/}ReportInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>}
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nextToken",
    "hasNext",
    "reportInfo"
})
@XmlRootElement(name = "GetReportListResult")
public class GetReportListResult {

    @XmlElement(name = "NextToken", required = true)
    protected String nextToken;
    @XmlElement(name = "HasNext")
    protected boolean hasNext;
    @XmlElement(name = "ReportInfo", required = true)
    protected List<ReportInfo> reportInfo;

    /**
     * Default constructor
     * 
     */
    public GetReportListResult() {
        super();
    }

    /**
     * Value constructor
     *
     * @param nextToken {@link String}
     * @param hasNext {@link boolean}
     * @param reportInfoList {@code List<ReportInfo>}
     */
    public GetReportListResult(final String nextToken, final boolean hasNext, final List<ReportInfo> reportInfoList) {
        this.nextToken = nextToken;
        this.hasNext = hasNext;
        this.reportInfo = reportInfoList;
    }

    /**
     * Gets the value of the nextToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of the nextToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextToken(String value) {
        this.nextToken = value;
    }

    public boolean isSetNextToken() {
        return (this.nextToken!= null);
    }

    /**
     * Gets the value of the hasNext property.
     *
     * @return {@link boolean}
     */
    public boolean isHasNext() {
        return hasNext;
    }

    /**
     * Sets the value of the hasNext property.
     *
     * @param value {@link boolean}
     */
    public void setHasNext(boolean value) {
        this.hasNext = value;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetHasNext() {
        return true;
    }

    /**
     * Gets the value of the reportInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     *
     * @return Objects of the following type(s) are allowed in the list
     * {@link ReportInfo }
     */
    public List<ReportInfo> getReportInfoList() {
        if (reportInfo == null) {
            reportInfo = new ArrayList<ReportInfo>();
        }
        return this.reportInfo;
    }

    public boolean isSetReportInfoList() {
        return ((this.reportInfo!= null)&&(!this.reportInfo.isEmpty()));
    }

    public void unsetReportInfoList() {
        this.reportInfo = null;
    }

    /**
     * Sets the value of the NextToken property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetReportListResult withNextToken(String value) {
        setNextToken(value);
        return this;
    }

    /**
     * Sets the value of the HasNext property.
     * 
     * @param value {@link boolean}
     * @return
     *     this instance
     */
    public GetReportListResult withHasNext(boolean value) {
        setHasNext(value);
        return this;
    }

    /**
     * Sets the value of the ReportInfoList property.
     * 
     * @param values {@link ReportInfo} array
     * @return
     *     this instance
     */
    public GetReportListResult withReportInfoList(ReportInfo... values) {
        for (ReportInfo value: values) {
            getReportInfoList().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the reportInfoList property.
     * 
     * @param reportInfoList
     *     allowed object is
     *     {@link ReportInfo }
     *     
     */
    public void setReportInfoList(List<ReportInfo> reportInfoList) {
        this.reportInfo = reportInfoList;
    }
    

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetNextToken()) {
            xml.append("<NextToken>");
            xml.append(escapeXML(getNextToken()));
            xml.append("</NextToken>");
        }
        if (isSetHasNext()) {
            xml.append("<HasNext>");
            xml.append(isHasNext() + "");
            xml.append("</HasNext>");
        }
        java.util.List<ReportInfo> reportInfoListList = getReportInfoList();
        for (ReportInfo reportInfoList : reportInfoListList) {
            xml.append("<ReportInfoList>");
            xml.append(reportInfoList.toXMLFragment());
            xml.append("</ReportInfoList>");
        }
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("<");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }



    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetNextToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("NextToken"));
            json.append(" : ");
            json.append(quoteJSON(getNextToken()));
            first = false;
        }
        if (isSetHasNext()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("HasNext"));
            json.append(" : ");
            json.append(quoteJSON(isHasNext() + ""));
            first = false;
        }
        if (isSetReportInfoList()) {
            if (!first) json.append(", ");
            json.append("\"ReportInfoList\" : [");
            java.util.List<ReportInfo> reportInfoListList = getReportInfoList();
            for (ReportInfo reportInfoList : reportInfoListList) {
                if (reportInfoListList.indexOf(reportInfoList) > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(reportInfoList.toJSONFragment());
                json.append("}");
                first = false;
            }
            json.append("]");
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
