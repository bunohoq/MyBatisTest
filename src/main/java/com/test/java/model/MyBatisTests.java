package com.test.java.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyBatisTests {

	@Autowired
	private SqlSessionTemplate template;
	
	@Test
	public void testCreateSqlSessionTemplate() {
		
		assertNotNull(template);
		
	}
	
	@Test
	public void testExecuteQuery() {
		
		//stat.executeQuery() 역할
		String time = template.selectOne("address.time");
		System.out.println(time);
		
		assertNotNull(time);
		
	}

}












