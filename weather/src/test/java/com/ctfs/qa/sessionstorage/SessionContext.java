package com.ctfs.qa.sessionstorage;

public class SessionContext {



   private String jwtToken;
    private String webSessionID;
    public String getJwtToken() {
        return jwtToken;
    }
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
    public String getWebSessionID() {
        return webSessionID;
    }
    public void setWebSessionID(String webSessionID) {
        this.webSessionID = webSessionID;
    }
    @Override
    public String toString() {
        return "SessionContext [jwtToken=" + jwtToken + ", webSessionID=" + webSessionID + "]";
    }
}