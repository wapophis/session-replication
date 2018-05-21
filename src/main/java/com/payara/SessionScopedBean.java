package com.payara;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessionScopedBean implements Serializable {

    private static final long serialVersionUID = -380899803578157188L;

    private String sessionScopedField;
    
    public String setValue() {
        sessionScopedField = "new value";
        return null;
    }

    public String reload() {
        return null;
    }

    public String getSessionScopedField() {
        return sessionScopedField;
    }

    public void setSessionScopedField(String sessionScopedField) {
        this.sessionScopedField = sessionScopedField;
    }
}
