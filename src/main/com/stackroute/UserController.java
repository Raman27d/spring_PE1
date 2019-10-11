package com.stackroute;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        String str=req.getParameter("name");
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("username",str);
        return  modelAndView;
    }
}