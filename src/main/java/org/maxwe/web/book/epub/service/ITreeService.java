package org.maxwe.web.book.epub.service;

import org.maxwe.web.book.epub.entity.EPubEntity;

/**
 * Created by Pengwei Ding on 2015-07-02 12:33.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: 定义EPub基本操作
 */
public interface ITreeService {
    boolean createEPub(EPubEntity ePubEntity);
    boolean createEPubDir(String pid,String name);
    boolean updateEPubDirName(String id,String name);
    boolean deleteEPubDir(String pid,String name);
}
