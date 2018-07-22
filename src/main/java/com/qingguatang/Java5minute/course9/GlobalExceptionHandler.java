package com.qingguatang.Java5minute.course9;


import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GlobalExceptionHandler implements ErrorViewResolver {

  @Override
  public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status,
      Map<String, Object> model) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("url", request.getRequestURL());
    modelAndView.addAllObjects(model);
    modelAndView.setViewName("error");
    return modelAndView;
  }
}
