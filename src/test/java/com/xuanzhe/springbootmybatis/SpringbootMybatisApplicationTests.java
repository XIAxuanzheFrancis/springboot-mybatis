package com.xuanzhe.springbootmybatis;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

  @Autowired
  DataSource datasource;
  @Test
  void contextLoads() throws SQLException {
    System.out.println(datasource.getClass());
    System.out.println(datasource.getConnection());
  }
}
