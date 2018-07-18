package com.qingguatang.Java5minute.course4.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * 功能描述: Comment实体类
 *
 * @param:
 * @return:
 * @auther: luhailiang
 * @date: 2018/7/18 22:05
 */

@Getter
@Setter
@Builder
public class Comment {

  //评论人头像
  private String icon;
  //评论人昵称
  private String nickName;
  //评论内容
  private String content;
  //评论时间
  private String commentTime;
  //点赞数
  private int likeNum;


}
