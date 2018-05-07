package com.smart.jdbc;





import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate;

    {


    ctx=new ClassPathXmlApplicationContext("bean-jdbc.xml");

    jdbcTemplate=(JdbcTemplate)ctx.getBean("jdbcTemplate");

}


    /**
     * 测试是否能连上数据库
     * @throws SQLException
     */
    @Test
    public void testDataSource() throws SQLException{
        DataSource dataSource=ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
    /**
     * 执行插入，更新，删除操作
     */
    @Test
    public void testUpdate(){
        String sql="update emp set last_name = ? where id= ?";
        jdbcTemplate.update(sql, "linlin", 5);
    }
    /**
     * 执行批量更新
     */
    @Test
    public  void testBatchUpdate(){
        String sql="insert into emp(last_name,email,dept_id) values(?,?,?)";
        List<Object[]> objects=new ArrayList<>();
        objects.add(new Object[]{"linlin","123@qq.com",1});
        objects.add(new Object[]{"feifei","456@qq.com",1});
        jdbcTemplate.batchUpdate(sql,objects);
    }
}
