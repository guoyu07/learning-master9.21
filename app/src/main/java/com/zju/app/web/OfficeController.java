package com.zju.app.web;

import com.zju.utils.office.HtmlUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xujingfeng on 2017/10/5.
 */
@Controller
public class OfficeController {

    /**
     * 传入文件的绝对路径
     * @param path
     * @param response
     * @throws IOException
     */
    @RequestMapping("/office/demo")
    public void testDoc(String path, HttpServletResponse response) throws IOException {
        String html = HtmlUtil.generateHTML(path);
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(html);
    }


}
