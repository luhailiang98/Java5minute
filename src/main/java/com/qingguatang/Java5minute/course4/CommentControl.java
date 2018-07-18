package com.qingguatang.Java5minute.course4;

import com.qingguatang.Java5minute.course4.model.Comment;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述: 专业的评论功能
 *
 * @param:
 * @return:
 * @auther: luhailiang
 * @date: 2018/7/18 22:05
 */
@Controller
public class CommentControl {

  @RequestMapping(value = "/comments")
  public String comments(ModelMap modelMap) {
    List<Comment> comments = getComment();
    modelMap.addAttribute("comments", comments);
    return "comments";
  }

  private List<Comment> getComment() {
    List<Comment> comments = new ArrayList<>(); //List和ArrayList的用法
    Comment comment = Comment.builder()
        .icon("http://p1.music.126.net/JPsA7QZk6Ayw5hPGYK2Npw==/109951162936371114.jpg?param=50y50")
        .nickName("苏先生不姓苏").content("：试听完才发现用流量下了整张专辑").commentTime("2015年12月21日").likeNum(2988)
        .build();
    comments.add(comment);

    comment = Comment.builder()
        .icon("http://p1.music.126.net/JPsA7QZk6Ayw5hPGYK2Npw==/109951162936371114.jpg?param=50y50")
        .nickName("苏先生不姓苏").content("：试听完才发现用流量下了整张专辑").commentTime("2015年12月21日").likeNum(2900)
        .build();
    comments.add(comment);
    return comments;
  }
}
