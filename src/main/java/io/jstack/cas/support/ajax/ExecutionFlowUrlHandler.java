package io.jstack.cas.support.ajax;

import org.springframework.webflow.context.servlet.FilenameFlowUrlHandler;

import javax.servlet.http.HttpServletRequest;


public class ExecutionFlowUrlHandler extends FilenameFlowUrlHandler {

    private String flowId;

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    @Override
    public String getFlowId(HttpServletRequest request) {
        return flowId;
    }
}
