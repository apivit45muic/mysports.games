package io.muzoo.ssc.mysports;

import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class SecurityService {
    private Map<String, String> userCredentials = new HashMap<String, String>() {{
        put("admins","123456");
        put("muic", "1111");
    }};

    public boolean authenticate(String username, String password, HttpServletRequest request){
        String passwordInDB = userCredentials.get(username);
        boolean isMatched = StringUtils.equals(password,passwordInDB);
        if (isMatched) {
            request.getSession().setAttribute("username",username);
            return true;
        } else {
            return false;
        }
    }
}
