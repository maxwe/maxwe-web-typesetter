package org.maxwe.web.book.entity;

import java.util.Date;

/**
 * Created by Pengwei Ding on 2015-07-06 10:18.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 定义图书节点
 * @Column(name = "AGE")
 @Min(1)
 @Max(200)
 @NotNull
 */
public abstract class NodeEntity {
    protected Integer id;
    protected Integer pid;
    protected String name;
    protected String desc;
    protected Date createTime;
    protected Date updateTime;

}
