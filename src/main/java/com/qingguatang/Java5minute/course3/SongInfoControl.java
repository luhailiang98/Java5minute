package com.qingguatang.Java5minute.course3;

import com.qingguatang.Java5minute.course3.model.SongInfo;
import com.qingguatang.Java5minute.course4.model.Comment;
import com.qingguatang.Java5minute.course5.CommentPostControl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SongInfoControl {

  @Autowired
  private CommentPostControl commentPostControl;

  private static Map<String, SongInfo> songInfoMap = new HashMap<>();

  @RequestMapping(value = "/songinfo")
  public String index(String songId, ModelMap modelMap) {
    if (songId == null) {
      songId = "35847388";
    }
    SongInfo songInfo = songInfoMap.get(songId);
    modelMap.addAttribute("song", songInfo);
    List<Comment> comments =commentPostControl.getComments(songId);
    modelMap.addAttribute("comments",comments);
    return "index";
  }

  @RequestMapping(value = "/songinfo/get")
  @ResponseBody
  public SongInfo get(String songId){
    SongInfo songInfo=songInfoMap.get(songId);
    return  songInfo;
  }

  @PostConstruct
  public void init() {
    SongInfo songInfo = SongInfo.builder().id("35847388").name("Hello").singer("Adele")
        .albumName("Hello")
        .commentCount(10).albumImage(
            "http://p1.music.126.net/jBBmqVLHrTp68gi9rz4yKw==/3286440258167865.jpg?param=130y130")
        .lyrics(
            "Hello, it's me<br>I was wondering if after all these years you'd like to meet<br>To go over everything")
        .build();
    songInfoMap.put("35847388", songInfo);

    songInfo = SongInfo.builder().id("16435049").name("Someone lile you").singer("Adele")
        .albumName("Someone lile you").commentCount(10).albumImage(
            "http://p1.music.126.net/jBBmqVLHrTp68gi9rz4yKw==/3286440258167865.jpg?param=130y130")
        .lyrics("Someone lile you").build();
    songInfoMap.put("16435049", songInfo);
  }
}
