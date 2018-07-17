package com.qingguatang.Java5minute.course1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 功能描述: HelloWorld
 *
 * @param:
 * @return: meassage
 * @auther: luhailiang
 * @date: 2018/7/17 22:32
 */
@Controller
public class HelloWorld {

  @RequestMapping(value = "/")
  @ResponseBody
  public String Hello() {
    String meassage = "hello";
    return meassage;
  }
}
