package xyz.geo.qqz.main.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/")
    @ResponseBody
    String test() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        for (int i = 0; i < 2000; i++) {
            sb.append("");
            sb.append("<br>");
        }
        sb.append("</html>");
        return sb.toString();
    }
}
