package com.xuanzhe.springbootmybatis.controller;

import com.xuanzhe.springbootmybatis.Mapper.booksMapper;
import com.xuanzhe.springbootmybatis.pojo.books;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksController {
  @Autowired
  private booksMapper booksMapper;
  @GetMapping("/bookList")
  public List<books> queryBookList(){
    List<books> bookList = booksMapper.queryBookList();
    for(books book : bookList){
      System.out.println(book);
    }
    return bookList;
  }

}
