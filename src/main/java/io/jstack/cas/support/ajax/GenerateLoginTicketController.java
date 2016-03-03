package io.jstack.cas.support.ajax;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.webflow.mvc.servlet.FlowController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenerateLoginTicketController extends FlowController {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        super.handleRequest(request, new StringBodyResponse(response));

        LoginTicket loginTicket = getLoginTicketFromRequest(request);
        ModelAndView result = new ModelAndView(new MappingJackson2JsonView(), loginTicket.toMap());

        return result;
    }

    private LoginTicket getLoginTicketFromRequest(HttpServletRequest request) {
        String lt = getStringAttribute(request, LoginTicket.LT_ATTR_KEY);
        String execution = getStringAttribute(request, LoginTicket.EXECUTION_ATTR_KEY);

        return new LoginTicket(lt, execution);
    }

    private String getStringAttribute(HttpServletRequest request, String key) {
        Object value = request.getAttribute(key);
        return value == null ? null : value.toString();
    }

}
