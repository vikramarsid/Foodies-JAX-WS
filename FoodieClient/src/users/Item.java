/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package users;

public class Item  implements java.io.Serializable {
    private java.lang.String city;

    private java.lang.String itemAddress;

    private java.lang.String itemBanner;

    private int itemId;

    private java.lang.String itemName;

    private java.lang.String itemRating;

    private java.lang.String itemReview;

    public Item() {
    }

    public Item(
           java.lang.String city,
           java.lang.String itemAddress,
           java.lang.String itemBanner,
           int itemId,
           java.lang.String itemName,
           java.lang.String itemRating,
           java.lang.String itemReview) {
           this.city = city;
           this.itemAddress = itemAddress;
           this.itemBanner = itemBanner;
           this.itemId = itemId;
           this.itemName = itemName;
           this.itemRating = itemRating;
           this.itemReview = itemReview;
    }


    /**
     * Gets the city value for this Item.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Item.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the itemAddress value for this Item.
     * 
     * @return itemAddress
     */
    public java.lang.String getItemAddress() {
        return itemAddress;
    }


    /**
     * Sets the itemAddress value for this Item.
     * 
     * @param itemAddress
     */
    public void setItemAddress(java.lang.String itemAddress) {
        this.itemAddress = itemAddress;
    }


    /**
     * Gets the itemBanner value for this Item.
     * 
     * @return itemBanner
     */
    public java.lang.String getItemBanner() {
        return itemBanner;
    }


    /**
     * Sets the itemBanner value for this Item.
     * 
     * @param itemBanner
     */
    public void setItemBanner(java.lang.String itemBanner) {
        this.itemBanner = itemBanner;
    }


    /**
     * Gets the itemId value for this Item.
     * 
     * @return itemId
     */
    public int getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this Item.
     * 
     * @param itemId
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemName value for this Item.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this Item.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemRating value for this Item.
     * 
     * @return itemRating
     */
    public java.lang.String getItemRating() {
        return itemRating;
    }


    /**
     * Sets the itemRating value for this Item.
     * 
     * @param itemRating
     */
    public void setItemRating(java.lang.String itemRating) {
        this.itemRating = itemRating;
    }


    /**
     * Gets the itemReview value for this Item.
     * 
     * @return itemReview
     */
    public java.lang.String getItemReview() {
        return itemReview;
    }


    /**
     * Sets the itemReview value for this Item.
     * 
     * @param itemReview
     */
    public void setItemReview(java.lang.String itemReview) {
        this.itemReview = itemReview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
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
            ((this.itemAddress==null && other.getItemAddress()==null) || 
             (this.itemAddress!=null &&
              this.itemAddress.equals(other.getItemAddress()))) &&
            ((this.itemBanner==null && other.getItemBanner()==null) || 
             (this.itemBanner!=null &&
              this.itemBanner.equals(other.getItemBanner()))) &&
            this.itemId == other.getItemId() &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemRating==null && other.getItemRating()==null) || 
             (this.itemRating!=null &&
              this.itemRating.equals(other.getItemRating()))) &&
            ((this.itemReview==null && other.getItemReview()==null) || 
             (this.itemReview!=null &&
              this.itemReview.equals(other.getItemReview())));
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
        if (getItemAddress() != null) {
            _hashCode += getItemAddress().hashCode();
        }
        if (getItemBanner() != null) {
            _hashCode += getItemBanner().hashCode();
        }
        _hashCode += getItemId();
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemRating() != null) {
            _hashCode += getItemRating().hashCode();
        }
        if (getItemReview() != null) {
            _hashCode += getItemReview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://users", "Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemBanner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemBanner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemReview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://users", "itemReview"));
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
