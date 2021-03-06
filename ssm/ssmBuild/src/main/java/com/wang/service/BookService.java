package com.wang.service;

import com.wang.pojo.Books;

import java.util.List;

/**
 * @ClassName BookService
 * Description
 * @Author jqWang
 * Date 2021/11/23 11:22
 **/
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();

}
