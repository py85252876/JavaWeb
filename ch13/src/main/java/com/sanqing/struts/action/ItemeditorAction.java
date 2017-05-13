/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sanqing.struts.action;

import com.sanqing.struts.form.ItemeditorForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * MyEclipse Struts
 * Creation date: 04-20-2008
 * <p>
 * XDoclet definition:
 *
 * @struts.action path="/itemeditor" name="itemeditorForm" input="/form/storage/itemeditor.jsp" scope="request" validate="true"
 */
public class ItemeditorAction extends Action {
    /*
	 * Generated Methods
	 */

    /**
     * Method execute
     *
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return ActionForward
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {
        ItemeditorForm itemeditorForm = (ItemeditorForm) form;// TODO Auto-generated method stub
        try {
            PrintWriter out = response.getWriter();
            try {
                String oper = request.getParameter("oper");
                com.sanqing.bll.BItemGeneral B_V = new com.sanqing.bll.BItemGeneral();
                if (oper.equals("add")) {
                    HibernateDao.Itemgeneral TypeModel = new HibernateDao.Itemgeneral();
                    TypeModel.setClasscode(new HibernateDao.ClasscodeDAO().findById(itemeditorForm.getProd_code()));
                    TypeModel.setColor(itemeditorForm.getColor());
                    TypeModel.setEmployeeByPoEmpId(new HibernateDao.EmployeeDAO().findById(itemeditorForm.getPo_emp_id()));
                    TypeModel.setEmployeeBySaleEmpId(new HibernateDao.EmployeeDAO().findById(itemeditorForm.getSale_emp_id()));
                    TypeModel.setItemDesc(itemeditorForm.getItem_desc());
                    TypeModel.setItemId(itemeditorForm.getItem_id());
                    TypeModel.setSalePic(Long.parseLong(itemeditorForm.getSale_pic()));
                    TypeModel.setStatus(itemeditorForm.getStatus());
                    TypeModel.setTaxRate(Long.parseLong(itemeditorForm.getTax_rate()));
                    TypeModel.setUmmaster(new HibernateDao.UmmasterDAO().findById(itemeditorForm.getUm_id()));
                    TypeModel.setWholPic(Long.parseLong(itemeditorForm.getWhol_pic()));
                    B_V.Item_Add(TypeModel);
                } else if (oper.equals("edit")) {
                    HibernateDao.Itemgeneral TypeModel = new HibernateDao.Itemgeneral();
                    TypeModel.setClasscode(new HibernateDao.ClasscodeDAO().findById(itemeditorForm.getProd_code()));
                    TypeModel.setColor(itemeditorForm.getColor());
                    TypeModel.setEmployeeByPoEmpId(new HibernateDao.EmployeeDAO().findById(itemeditorForm.getPo_emp_id()));
                    TypeModel.setEmployeeBySaleEmpId(new HibernateDao.EmployeeDAO().findById(itemeditorForm.getSale_emp_id()));
                    TypeModel.setItemDesc(itemeditorForm.getItem_desc());
                    TypeModel.setItemId(itemeditorForm.getItem_id());
                    TypeModel.setSalePic(Long.parseLong(itemeditorForm.getSale_pic()));
                    TypeModel.setStatus(itemeditorForm.getStatus());
                    TypeModel.setTaxRate(Long.parseLong(itemeditorForm.getTax_rate()));
                    TypeModel.setUmmaster(new HibernateDao.UmmasterDAO().findById(itemeditorForm.getUm_id()));
                    TypeModel.setWholPic(Long.parseLong(itemeditorForm.getWhol_pic()));
                    B_V.Item_Edit(TypeModel);
                } else if (oper.equals("delete")) {
                    B_V.Item_Delete(itemeditorForm.getItem_id());
                } else if (oper.equals("model")) {
                    out.print(B_V.Item_ConvertModelToJson(request.getParameter("item_id")));
                    return null;
                }
                out.print(B_V.ItemsConvertToHTMLTable());
            } catch (Exception e) {
                out.print(e.getMessage());
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}