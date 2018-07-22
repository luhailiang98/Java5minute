package com.qingguatang.Java5minute.course7;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MusicControl {

  private static Map<String, String> musics = new HashMap<>();

  @RequestMapping(value = "/song/music")
  @ResponseBody
  public String getMusicSrc(String songId) {
    return musics.get(songId);
  }

  @PostConstruct
  public void init() {
    musics.put("35847388",
        "http://m10.music.126.net/20180722181601/18f55d2dffdae23c33d4be4ca4c6ba1f/ymusic/1b06/be80/b3aa/9f37fa8052e3f98d830b061639127dcf.mp3");
    musics.put("16435049",
        "http://m10.music.126.net/20180722192735/1ab8cca5f7f9c91209ce613a61e843ae/ymusic/dbd4/1d68/0259/d9a0d8c284b62313abfab546341426cf.mp3");
  }
}
