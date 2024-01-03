package com.xuanzhe.springbootmybatis.Mapper;

import com.xuanzhe.springbootmybatis.pojo.books;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface booksMapper {
  List<books> queryBookList();
  books queryBookById(int bookID);
  int addBook(books book);
  int updateBook(books book);
  int deleteBook(int bookID);
}
