
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
 * {@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="HasNext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="FeedSubmissionInfo" type="{http://mws.amazonaws.com/doc/2009-01-01/}FeedSubmissionInfo" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nextToken",
    "hasNext",
    "feedSubmissionInfo"
})
@XmlRootElement(name = "GetFeedSubmissionListResult")
public class GetFeedSubmissionListResult {

    @XmlElement(name = "NextToken", required = true)
    protected String nextToken;
    @XmlElement(name = "HasNext")
    protected boolean hasNext;
    @XmlElement(name = "FeedSubmissionInfo", required = true)
    protected List<FeedSubmissionInfo> feedSubmissionInfo;

    /**
     * Default constructor
     * 
     */
    public GetFeedSubmissionListResult() {
        super();
    }

    /**
     * Value constructor
     *
     * @param nextToken {@link String}
     * @param hasNext {@link boolean}
     * @param feedSubmissionInfo {@code List<FeedSubmissionInfo>}
     */
    public GetFeedSubmissionListResult(final String nextToken, final boolean hasNext, final List<FeedSubmissionInfo> feedSubmissionInfo) {
        this.nextToken = nextToken;
        this.hasNext = hasNext;
        this.feedSubmissionInfo = feedSubmissionInfo;
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

    /**
     *
     * @return {@link boolean}
     */
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
     * Gets the value of the feedSubmissionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedSubmissionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedSubmissionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     *
     * @return Objects of the following type(s) are allowed in the list
     * {@link FeedSubmissionInfo }
     */
    public List<FeedSubmissionInfo> getFeedSubmissionInfoList() {
        if (feedSubmissionInfo == null) {
            feedSubmissionInfo = new ArrayList<FeedSubmissionInfo>();
        }
        return this.feedSubmissionInfo;
    }

    /**
     *
     * @return {@link boolean}
     */
    public boolean isSetFeedSubmissionInfoList() {
        return ((this.feedSubmissionInfo!= null)&&(!this.feedSubmissionInfo.isEmpty()));
    }

    public void unsetFeedSubmissionInfoList() {
        this.feedSubmissionInfo = null;
    }

    /**
     * Sets the value of the NextToken property.
     * 
     * @param value {@link String}
     * @return
     *     this instance
     */
    public GetFeedSubmissionListResult withNextToken(String value) {
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
    public GetFeedSubmissionListResult withHasNext(boolean value) {
        setHasNext(value);
        return this;
    }

    /**
     * Sets the value of the FeedSubmissionInfo property.
     * 
     * @param values {@link FeedSubmissionInfo} array
     * @return
     *     this instance
     */
    public GetFeedSubmissionListResult withFeedSubmissionInfoList(FeedSubmissionInfo... values) {
        for (FeedSubmissionInfo value: values) {
            getFeedSubmissionInfoList().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the feedSubmissionInfo property.
     * 
     * @param feedSubmissionInfoList
     *     allowed object is
     *     {@link FeedSubmissionInfo}
     *     
     */
    public void setFeedSubmissionInfoList(List<FeedSubmissionInfo> feedSubmissionInfoList) {
        this.feedSubmissionInfo = feedSubmissionInfoList;
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
        java.util.List<FeedSubmissionInfo> feedSubmissionInfoList = getFeedSubmissionInfoList();
        for (FeedSubmissionInfo feedSubmissionInfo : feedSubmissionInfoList) {
            xml.append("<FeedSubmissionInfo>");
            xml.append(feedSubmissionInfo.toXMLFragment());
            xml.append("</FeedSubmissionInfo>");
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
        if (isSetFeedSubmissionInfoList()) {
            if (!first) json.append(", ");
            json.append("\"FeedSubmissionInfo\" : [");
            java.util.List<FeedSubmissionInfo> feedSubmissionInfoList = getFeedSubmissionInfoList();
            for (FeedSubmissionInfo feedSubmissionInfo : feedSubmissionInfoList) {
                if (feedSubmissionInfoList.indexOf(feedSubmissionInfo) > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(feedSubmissionInfo.toJSONFragment());
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
