package com.payara;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RequestScopedBean {
    
    private String requestScopedField;
    
    public String setValue() {
        requestScopedField = "new value";
        return null;
    }

    public String reload() {
        return null;
    }

    public String getRequestScopedField() {
        return requestScopedField;
    }

    public void setRequestScopedField(String requestScopedField) {
        this.requestScopedField = requestScopedField;
    }
}
