package io.jstack.cas.support.ajax;

import java.util.HashMap;
import java.util.Map;

public class LoginTicket {

    protected static final String LT_ATTR_KEY = "loginTicket";

    protected static final String EXECUTION_ATTR_KEY = "flowExecutionKey";

    private String lt;
    private String execution;

    public LoginTicket(String lt, String execution) {
        this.lt = lt;
        this.execution = execution;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }


    public String getExecution() {
        return execution;
    }

    public String getLt() {
        return lt;
    }

    public Map<String, String> toMap() {
        Map<String, String> maps = new HashMap<String, String>(2);
        maps.put("lt", lt);
        maps.put("execution", execution);

        return maps;
    }
}
