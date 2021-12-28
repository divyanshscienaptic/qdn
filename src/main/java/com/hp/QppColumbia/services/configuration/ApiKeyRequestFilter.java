//package com.hp.QppColumbia.services.configuration;
//
//
//import org.apache.tomcat.util.codec.binary.Base64;
//import org.json.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.GenericFilterBean;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class ApiKeyRequestFilter extends GenericFilterBean {
//
//    @Value("${const.application_group}")
//    String const_application_group;
//
//    @Value("${const.localDEVProfile}")
//    boolean active_profile;
//
//    private static final Logger LOG = LoggerFactory.getLogger(ApiKeyRequestFilter.class);
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        if (active_profile) {
//            chain.doFilter(request, response);
//        } else {
//            LOG.info("***** inside the filter *****");
//            HttpServletRequest req = (HttpServletRequest) request;
//            String path = req.getRequestURI();
//
//            String cookies = req.getHeader("Cookie") == null ? "" : req.getHeader("Cookie");
////        LOG.info("Trying key: " + cookies);
//
//            boolean flag = applicationGroupChecking(cookies);
//            LOG.info("***** FLAG ***** " + flag);
//
//            if (flag) {
//                chain.doFilter(request, response);
//            } else {
//                HttpServletResponse resp = (HttpServletResponse) response;
//                String error = "Unauthorized User Access";
//                LOG.info("***** Inside the error response ***** " + flag);
//
//                resp.reset();
//                resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                response.setContentLength(error.length());
//                response.getWriter().write(error);
//            }
//        }
//    }
//
//    private boolean applicationGroupChecking(String cookies) {
//        boolean flag = false;
//        LOG.info("***** Start of the applicationGroupChecking method ***** " + flag);
//
//        if (cookies == null || cookies.equals("")) {
//            LOG.error("**** Cookies is empty ****");
//            return false;
//        }
//
//        Base64 base64Url = new Base64(true);
//        String header = "";
//        try {
//            header = new String(base64Url.decode(cookies.toString().split("\\|")[2]));
//        } catch (Exception e) {
//            LOG.error(String.valueOf(e));
//            return false;
//        }
//
//        JSONObject json = null;
//        try {
//            json = new JSONObject(header);
//        } catch (Exception e) {
//            LOG.error("**** Unable to extract JSON from Cookies. ****");
//        }
//
//        String groups = json.getJSONObject("id_token").get("groups").toString().replace("/", "");
//        List<String> appPropGroup = Arrays.asList(const_application_group.split(","));
//
//        for (String str : appPropGroup) {
//            if (groups.contains(str)) {
//                flag = true;
//                break;
//            }
//        }
//
//        LOG.info("***** END of the applicationGroupChecking method ***** " + flag);
//        return flag;
//    }
//
//}