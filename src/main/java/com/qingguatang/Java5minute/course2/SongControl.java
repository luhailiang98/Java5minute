package com.qingguatang.Java5minute.course2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述:if的花式技巧
 *
 * @param:id
 * @return:html
 * @auther: luhailiang
 * @date: 2018/7/17 22:36
 */
@Controller
public class SongControl {

  @RequestMapping(value = "/song")
  public String getSong(@RequestParam(name = "id", required = false) String songId) {
    if (songId == null) {
      songId = "1";
    }
    if (songId.equals("1")) {
      return "course2/1.html";
    } else {
      return "course2/other.html";
    }
  }
}
