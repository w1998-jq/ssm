package com.wang.dao;

import com.wang.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一个book
    int addBook(Books book);
    //根据id删除book
    int deleteBook(int id);
    //更新book
    int updateBook(Books book);
    //根据ID查询book
    Books  queryBookById(int id);
    //查询全部book
    List<Books> queryAllBook();
}
