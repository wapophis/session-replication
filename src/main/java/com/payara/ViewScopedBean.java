package com.payara;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ViewScopedBean implements Serializable{
    
    private static final long serialVersionUID = 2480724186216838459L;

    private String viewScopedField;
    
    public String setValue() {
        viewScopedField = "new value";
        return null;
    }

    public String reload() {
        return null;
    }

    public String getViewScopedField() {
        return viewScopedField;
    }

    public void setViewScopedField(String viewScopedField) {
        this.viewScopedField = viewScopedField;
    }
}
