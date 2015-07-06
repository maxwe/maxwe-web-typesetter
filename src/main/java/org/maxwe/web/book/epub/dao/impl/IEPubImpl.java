package org.maxwe.web.book.epub.dao.impl;

import org.maxwe.web.book.entity.BookEntity;
import org.maxwe.web.book.entity.NodeEntity;
import org.maxwe.web.book.epub.dao.IEPubDao;

/**
 * Created by dingpengwei on 6/27/15.
 */
public class IEPubImpl implements IEPubDao {

    @Override
    public <E extends NodeEntity> E createBook(String name) {
        return null;
    }

    @Override
    public <E extends NodeEntity> E deleteBook(String id) {
        return null;
    }
}
