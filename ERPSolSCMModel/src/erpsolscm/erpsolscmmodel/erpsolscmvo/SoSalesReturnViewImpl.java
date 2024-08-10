package erpsolscm.erpsolscmmodel.erpsolscmvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolscm.erpsolscmmodel.erpsolscmvo.common.SoSalesReturnView;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 14 23:55:13 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SoSalesReturnViewImpl extends ViewObjectImpl implements SoSalesReturnView {
    /**
     * This is the default constructor (do not remove).
     */
    public SoSalesReturnViewImpl() {
    }
    public void doSuperviseSalesReturn() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=pkg_sale_order.func_submit_sales_return('"+this.getCurrentRow().getAttribute("Salesretid")+"','"+ERPSolGlobClassModel.doGetUserCode()+"'); END;", 1);
//        System.out.println("begin ?:=Pkg_Sales_Rebate.FUNC_SUBMIT_SALES_RETURN('"+this.getCurrentRow().getAttribute("Salesretid")+"'); END;");
        try {
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            this.getCurrentRow().refresh(Row.REFRESH_WITH_DB_FORGET_CHANGES);
            
            if (!cs.getString(1).equals("ERPSOLSUCCESS")) {
    //               this.getCurrentRow().setAttribute("Posted", "N");
               this.getDBTransaction().commit();
                throw new JboException("Unable to supervise due to "+cs.getString(1));
               
           }
            this.getCurrentRow().setAttribute("Posted", "Y");
            this.getDBTransaction().commit();
        } catch (SQLException e) {
    //            this.getCurrentRow().setAttribute("Posted", "N");
            this.getDBTransaction().commit();
            System.out.println(e.getMessage()+ "this is message");
            throw new JboException("Unable to supervise ");
        }
        finally{
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }
    }
}

