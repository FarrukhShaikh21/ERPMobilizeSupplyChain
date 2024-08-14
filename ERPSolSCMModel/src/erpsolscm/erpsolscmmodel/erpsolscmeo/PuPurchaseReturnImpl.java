package erpsolscm.erpsolscmmodel.erpsolscmeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 13 13:03:58 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPurchaseReturnImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PrId,
        Locationid,
        PrDate,
        Poid,
        Rnoteno,
        Potype,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Supplierid,
        Coid,
        Lcno,
        LcForId,
        DocTypeId,
        Storeid,
        Prseqno,
        txtSupplierName,
        txtStoreName,
        txtSumQuantity,
        txtSumNetAmount,
        PuPurchaseReturnLines,
        PuSuppliers,
        AllStores;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int PRID = AttributesEnum.PrId.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int PRDATE = AttributesEnum.PrDate.index();
    public static final int POID = AttributesEnum.Poid.index();
    public static final int RNOTENO = AttributesEnum.Rnoteno.index();
    public static final int POTYPE = AttributesEnum.Potype.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int COID = AttributesEnum.Coid.index();
    public static final int LCNO = AttributesEnum.Lcno.index();
    public static final int LCFORID = AttributesEnum.LcForId.index();
    public static final int DOCTYPEID = AttributesEnum.DocTypeId.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int PRSEQNO = AttributesEnum.Prseqno.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int TXTSUMQUANTITY = AttributesEnum.txtSumQuantity.index();
    public static final int TXTSUMNETAMOUNT = AttributesEnum.txtSumNetAmount.index();
    public static final int PUPURCHASERETURNLINES = AttributesEnum.PuPurchaseReturnLines.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PuPurchaseReturnImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolscm.erpsolscmmodel.erpsolscmeo.PuPurchaseReturn");
    }


    /**
     * Gets the attribute value for PrId, using the alias name PrId.
     * @return the value of PrId
     */
    public String getPrId() {
        return (String) getAttributeInternal(PRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrId.
     * @param value value to set the PrId
     */
    public void setPrId(String value) {
        setAttributeInternal(PRID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for PrDate, using the alias name PrDate.
     * @return the value of PrDate
     */
    public Date getPrDate() {
        return (Date) getAttributeInternal(PRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrDate.
     * @param value value to set the PrDate
     */
    public void setPrDate(Date value) {
        setAttributeInternal(PRDATE, value);
    }

    /**
     * Gets the attribute value for Poid, using the alias name Poid.
     * @return the value of Poid
     */
    public String getPoid() {
        return (String) getAttributeInternal(POID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Poid.
     * @param value value to set the Poid
     */
    public void setPoid(String value) {
        setAttributeInternal(POID, value);
    }

    /**
     * Gets the attribute value for Rnoteno, using the alias name Rnoteno.
     * @return the value of Rnoteno
     */
    public String getRnoteno() {
        return (String) getAttributeInternal(RNOTENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rnoteno.
     * @param value value to set the Rnoteno
     */
    public void setRnoteno(String value) {
        setAttributeInternal(RNOTENO, value);
    }

    /**
     * Gets the attribute value for Potype, using the alias name Potype.
     * @return the value of Potype
     */
    public String getPotype() {
        return (String) getAttributeInternal(POTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Potype.
     * @param value value to set the Potype
     */
    public void setPotype(String value) {
        setAttributeInternal(POTYPE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the value of Posted
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for Postedby, using the alias name Postedby.
     * @return the value of Postedby
     */
    public String getPostedby() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Postedby.
     * @param value value to set the Postedby
     */
    public void setPostedby(String value) {
        setAttributeInternal(POSTEDBY, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for Coid, using the alias name Coid.
     * @return the value of Coid
     */
    public String getCoid() {
        return (String) getAttributeInternal(COID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Coid.
     * @param value value to set the Coid
     */
    public void setCoid(String value) {
        setAttributeInternal(COID, value);
    }

    /**
     * Gets the attribute value for Lcno, using the alias name Lcno.
     * @return the value of Lcno
     */
    public String getLcno() {
        return (String) getAttributeInternal(LCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Lcno.
     * @param value value to set the Lcno
     */
    public void setLcno(String value) {
        setAttributeInternal(LCNO, value);
    }

    /**
     * Gets the attribute value for LcForId, using the alias name LcForId.
     * @return the value of LcForId
     */
    public Integer getLcForId() {
        return (Integer) getAttributeInternal(LCFORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcForId.
     * @param value value to set the LcForId
     */
    public void setLcForId(Integer value) {
        setAttributeInternal(LCFORID, value);
    }

    /**
     * Gets the attribute value for DocTypeId, using the alias name DocTypeId.
     * @return the value of DocTypeId
     */
    public String getDocTypeId() {
        return (String) getAttributeInternal(DOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocTypeId.
     * @param value value to set the DocTypeId
     */
    public void setDocTypeId(String value) {
        setAttributeInternal(DOCTYPEID, value);
    }

    /**
     * Gets the attribute value for Storeid, using the alias name Storeid.
     * @return the value of Storeid
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Storeid.
     * @param value value to set the Storeid
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
    }

    /**
     * Gets the attribute value for Prseqno, using the alias name Prseqno.
     * @return the value of Prseqno
     */
    public Integer getPrseqno() {
        return (Integer) getAttributeInternal(PRSEQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Prseqno.
     * @param value value to set the Prseqno
     */
    public void setPrseqno(Integer value) {
        setAttributeInternal(PRSEQNO, value);
    }

    /**
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for txtStoreName, using the alias name txtStoreName.
     * @return the value of txtStoreName
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtStoreName.
     * @param value value to set the txtStoreName
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * Gets the attribute value for txtSumQuantity, using the alias name txtSumQuantity.
     * @return the value of txtSumQuantity
     */
    public Integer gettxtSumQuantity() {
        return (Integer) getAttributeInternal(TXTSUMQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSumQuantity.
     * @param value value to set the txtSumQuantity
     */
    public void settxtSumQuantity(Integer value) {
        setAttributeInternal(TXTSUMQUANTITY, value);
    }

    /**
     * Gets the attribute value for txtSumNetAmount, using the alias name txtSumNetAmount.
     * @return the value of txtSumNetAmount
     */
    public BigDecimal gettxtSumNetAmount() {
        return (BigDecimal) getAttributeInternal(TXTSUMNETAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSumNetAmount.
     * @param value value to set the txtSumNetAmount
     */
    public void settxtSumNetAmount(BigDecimal value) {
        setAttributeInternal(TXTSUMNETAMOUNT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPuPurchaseReturnLines() {
        return (RowIterator) getAttributeInternal(PUPURCHASERETURNLINES);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPuSuppliers() {
        return (EntityImpl) getAttributeInternal(PUSUPPLIERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPuSuppliers(EntityImpl value) {
        setAttributeInternal(PUSUPPLIERS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllStores() {
        return (EntityImpl) getAttributeInternal(ALLSTORES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllStores(EntityImpl value) {
        setAttributeInternal(ALLSTORES, value);
    }


    /**
     * @param prseqno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer prseqno) {
        return new Key(new Object[] { prseqno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Prseqno");
        setERPSolPKSeqName("PU_PURCHASE_RETURN_SEQ");
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setStoreid(ERPSolGlobClassModel.doGetUserStoreCode());
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        
        if (operation==DML_INSERT) {
            String pkValue=" IMP_Purchase_RETURN_ID('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+getLocationid()+"','"+"B"+"',TO_DATE('"+getPrDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(PRID, result);
        }
        else if (operation==DML_UPDATE) {
            if (getPosted().equals("Y")) {
                populateAttributeAsChanged(POSTEDBY, ERPSolGlobClassModel.doGetUserCode());
               
           }
        }
        super.doDML(operation, e);
    }
}

