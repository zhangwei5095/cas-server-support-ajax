package io.jstack.cas.support.ajax;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringBodyResponse extends HttpServletResponseWrapper {

    public StringBodyResponse(HttpServletResponse response) {
        super(response);
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(new StringWriter());
    }

}
