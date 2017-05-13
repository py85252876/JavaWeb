/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sanqing.struts.action;

import com.sanqing.struts.form.VenderTypeEditorForm;
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
 * @struts.action path="/venderTypeEditor" name="venderTypeEditorForm" input="/form/vender/venderTypeEditor.jsp" scope="request" validate="true"
 */
public class VenderTypeEditorAction extends Action {
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
        VenderTypeEditorForm venderTypeEditorForm = (VenderTypeEditorForm) form;// TODO Auto-generated method stub
        try {
            PrintWriter out = response.getWriter();
            try {
                String oper = request.getParameter("oper");
                com.sanqing.bll.B_vender B_V = new com.sanqing.bll.B_vender();
                if (oper.equals("add")) {
                    HibernateDao.Vendtype TypeModel = new HibernateDao.Vendtype();
                    TypeModel.setVendtypeDesc(venderTypeEditorForm.getVendtype_desc());
                    TypeModel.setVendtypeId(venderTypeEditorForm.getVendtype_id());
                    B_V.M_Vendtype_Add(TypeModel);
                } else if (oper.equals("edit")) {
                    B_V.M_Vendtype_Edit(venderTypeEditorForm.getVendtype_id(),
                            venderTypeEditorForm.getVendtype_desc());
                } else if (oper.equals("delete")) {
                    B_V.M_Vendtype_Delete(venderTypeEditorForm.getVendtype_id());
                }
                out.print(B_V.M_Vendtype_ConvertToHTMLTable());

            } catch (Exception e) {
                out.print(e.getMessage());
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}