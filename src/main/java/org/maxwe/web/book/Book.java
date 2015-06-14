package org.maxwe.web.book;

/**
 * Created by dingpengwei on 6/13/15.
 * CREATE TABLE 'book'.'book' ( 'id' INT NOT NULL , 'isbn' VARCHAR(80) NOT NULL , 'name' VARCHAR(200) NOT NULL , 'cover' VARCHAR(1000) NOT NULL , 'content' VARCHAR(1000) NOT NULL , 'contentLength' INT NOT NULL ,
 * 'description' VARCHAR(1000) NOT NULL , 'author' VARCHAR(200) NOT NULL , 'publisher' VARCHAR(200) NOT NULL ,
 * 'status' INT NOT NULL , 'createTime' DATETIME NOT NULL , 'updateTime' DATETIME NOT NULL ) ENGINE = InnoDB;
 */
public class Book {
    private int id;
    private String isbn;
    private String name;
    private String cover;
    private String content;
    private long contentLength;
    private String description;
    private String author;
    private String publisher;
    private int status;
    private String createTime;
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Book(int id, String isbn, String name, String cover, String content, long contentLength, String description, String author, String publisher, int status) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.cover = cover;
        this.content = content;
        this.contentLength = contentLength;
        this.description = description;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }
}

