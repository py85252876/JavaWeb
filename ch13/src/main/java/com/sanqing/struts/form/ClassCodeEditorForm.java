/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.sanqing.struts.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * MyEclipse Struts
 * Creation date: 04-18-2008
 * <p>
 * XDoclet definition:
 *
 * @struts.form name="classCodeEditorForm"
 */
public class ClassCodeEditorForm extends ActionForm {
    /*
	 * Generated fields
	 */

    /**
     * prod_desc property
     */
    private String prod_desc;

    /**
     * prod_id property
     */
    private String prod_id;

	/*
	 * Generated Methods
	 */

    /**
     * Method validate
     *
     * @param mapping
     * @param request
     * @return ActionErrors
     */
    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Method reset
     *
     * @param mapping
     * @param request
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        // TODO Auto-generated method stub
    }

    /**
     * Returns the prod_desc.
     *
     * @return String
     */
    public String getProd_desc() {
        return prod_desc;
    }

    /**
     * Set the prod_desc.
     *
     * @param prod_desc The prod_desc to set
     */
    public void setProd_desc(String prod_desc) {
        this.prod_desc = prod_desc;
    }

    /**
     * Returns the prod_id.
     *
     * @return String
     */
    public String getProd_id() {
        return prod_id;
    }

    /**
     * Set the prod_id.
     *
     * @param prod_id The prod_id to set
     */
    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }
}