package com.qingguatang.Java5minute.course3;

import com.qingguatang.Java5minute.course3.model.SongInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述: 变出你的内容来
 *
 * @param:
 * @return:
 * @auther: luhailiang
 * @date: 2018/7/17 23:12
 */
@Controller
public class SongInfoControl {

  @RequestMapping(value = "/songinfo")
  public String index(ModelMap modelMap) {
    SongInfo songInfo = SongInfo.builder().name("Hello").singer("Adele").albumName("Hello")
        .commentCount(10).albumImage(
            "http://p1.music.126.net/jBBmqVLHrTp68gi9rz4yKw==/3286440258167865.jpg?param=130y130")
        .lyrics(
            "Hello, it's me<br>I was wondering if after all these years you'd like to meet<br>To go over everything")
        .build();
    modelMap.addAttribute("song", songInfo);
    return "index";
  }
}
