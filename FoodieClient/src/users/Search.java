/**
 * Search.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package users;

public class Search  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String searchAddress;

    private int searchId;

    private java.lang.String searchName;

    private java.lang.String searchRating;

    private java.lang.String searchReview;

    public Search() {
    }

    public Search(
           java.lang.String city,
           java.lang.String searchAddress,
           int searchId,
           java.lang.String searchName,
           java.lang.String searchRating,
           java.lang.String searchReview) {
           this.city = city;
           this.searchAddress = searchAddress;
           this.searchId = searchId;
           this.searchName = searchName;
           this.searchRating = searchRating;
           this.searchReview = searchReview;
    }


    /**
     * Gets the city value for this Search.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Search.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the searchAddress value for this Search.
     * 
     * @return searchAddress
     */
    public java.lang.String getSearchAddress() {
        return searchAddress;
    }


    /**
     * Sets the searchAddress value for this Search.
     * 
     * @param searchAddress
     */
    public void setSearchAddress(java.lang.String searchAddress) {
        this.searchAddress = searchAddress;
    }


    /**
     * Gets the searchId value for this Search.
     * 
     * @return searchId
     */
    public int getSearchId() {
        return searchId;
    }


    /**
     * Sets the searchId value for this Search.
     * 
     * @param searchId
     */
    public void setSearchId(int searchId) {
        this.searchId = searchId;
    }


    /**
     * Gets the searchName value for this Search.
     * 
     * @return searchName
     */
    public java.lang.String getSearchName() {
        return searchName;
    }


    /**
     * Sets the searchName value for this Search.
     * 
     * @param searchName
     */
    public void setSearchName(java.lang.String searchName) {
        this.searchName = searchName;
    }


    /**
     * Gets the searchRating value for this Search.
     * 
     * @return searchRating
     */
    public java.lang.String getSearchRating() {
        return searchRating;
    }


    /**
     * Sets the searchRating value for this Search.
     * 
     * @param searchRating
     */
    public void setSearchRating(java.lang.String searchRating) {
        this.searchRating = searchRating;
    }


    /**
     * Gets the searchReview value for this Search.
     * 
     * @return searchReview
     */
    public java.lang.String getSearchReview() {
        return searchReview;
    }


    /**
     * Sets the searchReview value for this Search.
     * 
     * @param searchReview
     */
    public void setSearchReview(java.lang.String searchReview) {
        this.searchReview = searchReview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Search)) return false;
        Search other = (Search) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.searchAddress==null && other.getSearchAddress()==null) || 
             (this.searchAddress!=null &&
              this.searchAddress.equals(other.getSearchAddress()))) &&
            this.searchId == other.getSearchId() &&
            ((this.searchName==null && other.getSearchName()==null) || 
             (this.searchName!=null &&
              this.searchName.equals(other.getSearchName()))) &&
            ((this.searchRating==null && other.getSearchRating()==null) || 
             (this.searchRating!=null &&
              this.searchRating.equals(other.getSearchRating()))) &&
            ((this.searchReview==null && other.getSearchReview()==null) || 
             (this.searchReview!=null &&
              this.searchReview.equals(other.getSearchReview())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getSearchAddress() != null) {
            _hashCode += getSearchAddress().hashCode();
        }
        _hashCode += getSearchId();
        if (getSearchName() != null) {
            _hashCode += getSearchName().hashCode();
        }
        if (getSearchRating() != null) {
            _hashCode += getSearchRating().hashCode();
        }
        if (getSearchReview() != null) {
            _hashCode += getSearchReview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Search.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://users", "Search"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "searchAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "searchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "searchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "searchRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchReview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "searchReview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
