package com.qingguatang.Java5minute.course1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorld {

  @RequestMapping(value = "/")
  @ResponseBody
  public String Hello() {
    String meassage = "hello";
    return meassage;
  }
}
