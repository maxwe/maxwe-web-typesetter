package org.maxwe.web.book.dao;

import org.maxwe.web.book.entity.NodeEntity;

/**
 * Created by Pengwei Ding on 2015-07-02 12:22.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 定义图书数据层操作接口
 */
public interface IBookDao {
    /**
     * 创建一本新书
     * @param name 新书名
     * @return Boo及其子类
     */
    <E extends NodeEntity> E createBook(String name);

    /**
     * 删除一本书
     * @param id 图书ID
     * @return Boo及其子类
     */
    <E extends NodeEntity> E deleteBook(String id);
}
