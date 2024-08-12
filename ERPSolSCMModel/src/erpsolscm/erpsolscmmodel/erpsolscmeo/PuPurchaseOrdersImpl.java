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
// ---    Sun Aug 11 19:49:46 PKT 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PuPurchaseOrdersImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Poid,
        Locationid,
        Supplierid,
        Currcode,
        Deliverytermid,
        Paymenttermid,
        ReceStoreid,
        PoDate,
        Potype,
        Postatus,
        SuppRefno,
        SuppRefDate,
        ExchangeRate,
        Remarks,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        PoFor,
        ProdId,
        LcBankid,
        LcBranchid,
        LcRef,
        LcForId,
        IsMigrated,
        MigratedDate,
        RefOrderHeaderId,
        CycleFor,
        ApprovedMemoWolcId,
        Poseq,
        txtLocationName,
        txtStoreName,
        txtSupplierName,
        txtGrossAmount,
        txtSumGrossAmount,
        txtSumNetmount,
        txtSumQuantity,
        PuPoLines,
        AllLocations,
        AllStores,
        PuSuppliers;
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


    public static final int POID = AttributesEnum.Poid.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int CURRCODE = AttributesEnum.Currcode.index();
    public static final int DELIVERYTERMID = AttributesEnum.Deliverytermid.index();
    public static final int PAYMENTTERMID = AttributesEnum.Paymenttermid.index();
    public static final int RECESTOREID = AttributesEnum.ReceStoreid.index();
    public static final int PODATE = AttributesEnum.PoDate.index();
    public static final int POTYPE = AttributesEnum.Potype.index();
    public static final int POSTATUS = AttributesEnum.Postatus.index();
    public static final int SUPPREFNO = AttributesEnum.SuppRefno.index();
    public static final int SUPPREFDATE = AttributesEnum.SuppRefDate.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int POFOR = AttributesEnum.PoFor.index();
    public static final int PRODID = AttributesEnum.ProdId.index();
    public static final int LCBANKID = AttributesEnum.LcBankid.index();
    public static final int LCBRANCHID = AttributesEnum.LcBranchid.index();
    public static final int LCREF = AttributesEnum.LcRef.index();
    public static final int LCFORID = AttributesEnum.LcForId.index();
    public static final int ISMIGRATED = AttributesEnum.IsMigrated.index();
    public static final int MIGRATEDDATE = AttributesEnum.MigratedDate.index();
    public static final int REFORDERHEADERID = AttributesEnum.RefOrderHeaderId.index();
    public static final int CYCLEFOR = AttributesEnum.CycleFor.index();
    public static final int APPROVEDMEMOWOLCID = AttributesEnum.ApprovedMemoWolcId.index();
    public static final int POSEQ = AttributesEnum.Poseq.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTGROSSAMOUNT = AttributesEnum.txtGrossAmount.index();
    public static final int TXTSUMGROSSAMOUNT = AttributesEnum.txtSumGrossAmount.index();
    public static final int TXTSUMNETMOUNT = AttributesEnum.txtSumNetmount.index();
    public static final int TXTSUMQUANTITY = AttributesEnum.txtSumQuantity.index();
    public static final int PUPOLINES = AttributesEnum.PuPoLines.index();
    public static final int ALLLOCATIONS = AttributesEnum.AllLocations.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PuPurchaseOrdersImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolscm.erpsolscmmodel.erpsolscmeo.PuPurchaseOrders");
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
     * Gets the attribute value for Currcode, using the alias name Currcode.
     * @return the value of Currcode
     */
    public String getCurrcode() {
        return (String) getAttributeInternal(CURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Currcode.
     * @param value value to set the Currcode
     */
    public void setCurrcode(String value) {
        setAttributeInternal(CURRCODE, value);
    }

    /**
     * Gets the attribute value for Deliverytermid, using the alias name Deliverytermid.
     * @return the value of Deliverytermid
     */
    public String getDeliverytermid() {
        return (String) getAttributeInternal(DELIVERYTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Deliverytermid.
     * @param value value to set the Deliverytermid
     */
    public void setDeliverytermid(String value) {
        setAttributeInternal(DELIVERYTERMID, value);
    }

    /**
     * Gets the attribute value for Paymenttermid, using the alias name Paymenttermid.
     * @return the value of Paymenttermid
     */
    public String getPaymenttermid() {
        return (String) getAttributeInternal(PAYMENTTERMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Paymenttermid.
     * @param value value to set the Paymenttermid
     */
    public void setPaymenttermid(String value) {
        setAttributeInternal(PAYMENTTERMID, value);
    }

    /**
     * Gets the attribute value for ReceStoreid, using the alias name ReceStoreid.
     * @return the value of ReceStoreid
     */
    public String getReceStoreid() {
        return (String) getAttributeInternal(RECESTOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReceStoreid.
     * @param value value to set the ReceStoreid
     */
    public void setReceStoreid(String value) {
        setAttributeInternal(RECESTOREID, value);
    }

    /**
     * Gets the attribute value for PoDate, using the alias name PoDate.
     * @return the value of PoDate
     */
    public Date getPoDate() {
        return (Date) getAttributeInternal(PODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoDate.
     * @param value value to set the PoDate
     */
    public void setPoDate(Date value) {
        setAttributeInternal(PODATE, value);
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
     * Gets the attribute value for Postatus, using the alias name Postatus.
     * @return the value of Postatus
     */
    public String getPostatus() {
        return (String) getAttributeInternal(POSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Postatus.
     * @param value value to set the Postatus
     */
    public void setPostatus(String value) {
        setAttributeInternal(POSTATUS, value);
    }

    /**
     * Gets the attribute value for SuppRefno, using the alias name SuppRefno.
     * @return the value of SuppRefno
     */
    public String getSuppRefno() {
        return (String) getAttributeInternal(SUPPREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppRefno.
     * @param value value to set the SuppRefno
     */
    public void setSuppRefno(String value) {
        setAttributeInternal(SUPPREFNO, value);
    }

    /**
     * Gets the attribute value for SuppRefDate, using the alias name SuppRefDate.
     * @return the value of SuppRefDate
     */
    public Date getSuppRefDate() {
        return (Date) getAttributeInternal(SUPPREFDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppRefDate.
     * @param value value to set the SuppRefDate
     */
    public void setSuppRefDate(Date value) {
        setAttributeInternal(SUPPREFDATE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public Integer getExchangeRate() {
        return (Integer) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(Integer value) {
        setAttributeInternal(EXCHANGERATE, value);
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
     * Gets the attribute value for PoFor, using the alias name PoFor.
     * @return the value of PoFor
     */
    public String getPoFor() {
        return (String) getAttributeInternal(POFOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoFor.
     * @param value value to set the PoFor
     */
    public void setPoFor(String value) {
        setAttributeInternal(POFOR, value);
    }

    /**
     * Gets the attribute value for ProdId, using the alias name ProdId.
     * @return the value of ProdId
     */
    public String getProdId() {
        return (String) getAttributeInternal(PRODID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProdId.
     * @param value value to set the ProdId
     */
    public void setProdId(String value) {
        setAttributeInternal(PRODID, value);
    }

    /**
     * Gets the attribute value for LcBankid, using the alias name LcBankid.
     * @return the value of LcBankid
     */
    public String getLcBankid() {
        return (String) getAttributeInternal(LCBANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcBankid.
     * @param value value to set the LcBankid
     */
    public void setLcBankid(String value) {
        setAttributeInternal(LCBANKID, value);
    }

    /**
     * Gets the attribute value for LcBranchid, using the alias name LcBranchid.
     * @return the value of LcBranchid
     */
    public String getLcBranchid() {
        return (String) getAttributeInternal(LCBRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcBranchid.
     * @param value value to set the LcBranchid
     */
    public void setLcBranchid(String value) {
        setAttributeInternal(LCBRANCHID, value);
    }

    /**
     * Gets the attribute value for LcRef, using the alias name LcRef.
     * @return the value of LcRef
     */
    public String getLcRef() {
        return (String) getAttributeInternal(LCREF);
    }

    /**
     * Sets <code>value</code> as the attribute value for LcRef.
     * @param value value to set the LcRef
     */
    public void setLcRef(String value) {
        setAttributeInternal(LCREF, value);
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
     * Gets the attribute value for IsMigrated, using the alias name IsMigrated.
     * @return the value of IsMigrated
     */
    public String getIsMigrated() {
        return (String) getAttributeInternal(ISMIGRATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsMigrated.
     * @param value value to set the IsMigrated
     */
    public void setIsMigrated(String value) {
        setAttributeInternal(ISMIGRATED, value);
    }

    /**
     * Gets the attribute value for MigratedDate, using the alias name MigratedDate.
     * @return the value of MigratedDate
     */
    public Date getMigratedDate() {
        return (Date) getAttributeInternal(MIGRATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MigratedDate.
     * @param value value to set the MigratedDate
     */
    public void setMigratedDate(Date value) {
        setAttributeInternal(MIGRATEDDATE, value);
    }

    /**
     * Gets the attribute value for RefOrderHeaderId, using the alias name RefOrderHeaderId.
     * @return the value of RefOrderHeaderId
     */
    public String getRefOrderHeaderId() {
        return (String) getAttributeInternal(REFORDERHEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RefOrderHeaderId.
     * @param value value to set the RefOrderHeaderId
     */
    public void setRefOrderHeaderId(String value) {
        setAttributeInternal(REFORDERHEADERID, value);
    }

    /**
     * Gets the attribute value for CycleFor, using the alias name CycleFor.
     * @return the value of CycleFor
     */
    public String getCycleFor() {
        return (String) getAttributeInternal(CYCLEFOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for CycleFor.
     * @param value value to set the CycleFor
     */
    public void setCycleFor(String value) {
        setAttributeInternal(CYCLEFOR, value);
    }

    /**
     * Gets the attribute value for ApprovedMemoWolcId, using the alias name ApprovedMemoWolcId.
     * @return the value of ApprovedMemoWolcId
     */
    public String getApprovedMemoWolcId() {
        return (String) getAttributeInternal(APPROVEDMEMOWOLCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovedMemoWolcId.
     * @param value value to set the ApprovedMemoWolcId
     */
    public void setApprovedMemoWolcId(String value) {
        setAttributeInternal(APPROVEDMEMOWOLCID, value);
    }

    /**
     * Gets the attribute value for Poseq, using the alias name Poseq.
     * @return the value of Poseq
     */
    public Integer getPoseq() {
        return (Integer) getAttributeInternal(POSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Poseq.
     * @param value value to set the Poseq
     */
    public void setPoseq(Integer value) {
        setAttributeInternal(POSEQ, value);
    }

    /**
     * Gets the attribute value for txtLocationName, using the alias name txtLocationName.
     * @return the value of txtLocationName
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtLocationName.
     * @param value value to set the txtLocationName
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
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
     * Gets the attribute value for txtGrossAmount, using the alias name txtGrossAmount.
     * @return the value of txtGrossAmount
     */
    public BigDecimal gettxtGrossAmount() {
        return (BigDecimal) getAttributeInternal(TXTGROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGrossAmount.
     * @param value value to set the txtGrossAmount
     */
    public void settxtGrossAmount(BigDecimal value) {
        setAttributeInternal(TXTGROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for txtSumGrossAmount, using the alias name txtSumGrossAmount.
     * @return the value of txtSumGrossAmount
     */
    public BigDecimal gettxtSumGrossAmount() {
        return (BigDecimal) getAttributeInternal(TXTSUMGROSSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSumGrossAmount.
     * @param value value to set the txtSumGrossAmount
     */
    public void settxtSumGrossAmount(BigDecimal value) {
        setAttributeInternal(TXTSUMGROSSAMOUNT, value);
    }

    /**
     * Gets the attribute value for txtSumNetmount, using the alias name txtSumNetmount.
     * @return the value of txtSumNetmount
     */
    public BigDecimal gettxtSumNetmount() {
        return (BigDecimal) getAttributeInternal(TXTSUMNETMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSumNetmount.
     * @param value value to set the txtSumNetmount
     */
    public void settxtSumNetmount(BigDecimal value) {
        setAttributeInternal(TXTSUMNETMOUNT, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getPuPoLines() {
        return (RowIterator) getAttributeInternal(PUPOLINES);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllLocations() {
        return (EntityImpl) getAttributeInternal(ALLLOCATIONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllLocations(EntityImpl value) {
        setAttributeInternal(ALLLOCATIONS, value);
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
     * @param poseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer poseq) {
        return new Key(new Object[] { poseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPSolPKColumnName("Poseq");
        setERPSolPKSeqName("PU_PURCHASE_ORDERS_SEQ");
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setReceStoreid(ERPSolGlobClassModel.doGetUserStoreCode());
//        setCompanyid(ERPSolGlobClassModel.doGetUserCompanyCode());
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
            String pkValue=" imp_purchase_order_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+getLocationid()+"','"+"B"+"',TO_DATE('"+getPoDate()+"','YYYY-MM-DD'))";
            System.out.println(pkValue + "pk value");
            String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
            populateAttributeAsChanged(POID, result);
        }
        else if (operation==DML_UPDATE) {
            if (getPosted().equals("Y")) {
                populateAttributeAsChanged(POSTEDBY, ERPSolGlobClassModel.doGetUserCode());
               
           }
        }
        super.doDML(operation, e);
    }
}

