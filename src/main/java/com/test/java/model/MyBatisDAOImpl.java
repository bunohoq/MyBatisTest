package com.test.java.model;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MyBatisDAOImpl implements MyBatisDAO {
	
	private final SqlSessionTemplate template;
	
	/*

		SqlSessionTemplate > SQL 실행
		- SQL은 XML Mapper에 작성됨
		
		int stat.executeUpdate()
		- 반환값이 없는 쿼리
		- int template.insert()
		- int template.update()
		- int template.delete()
		
		ResultSet stat.executeQuery()
		- 반환값이 있는 쿼리
		- template.selectOne()  > 결과셋의 레코드 1개(= if (rs.next()))
		- template.selectList() > 결과셋의 레코드 N개(= while (rs.next()))

	*/

	@Override
	public void m1() {
		
		//insert..
		//1. Connection
		//2. SQL
		//3. Statement
		//4. executeUpdate()
		
		template.insert("address.m1"); //executeUpdate()
		
	}
	
	@Override
	public int m2(String seq) {
		
		//int The number of rows affected by the delete.
		
		return template.delete("address.m2", seq);
	}
	
	@Override
	public int m3(Map<String, String> map) {
		
		return template.update("address.m3", map);
	}
	
	@Override
	public int m4(AddressDTO dto) {
		
		return template.update("address.m4", dto);
	}
	
	@Override
	public String m5(String seq) {
		
		//1. Connection
		//2. SQL
		//3. Statement
		//4. executeQuery()
		//5. ResultSet
		//6. if (rs.next()) {}
		//7. rs.getString("name")
		//8. return
		
		//SQL의 결과를 객체에 매핑(변환)		
		return template.selectOne("address.m5", seq);
	}
	
	@Override
	public AddressDTO m6(String seq) {
		
		//1. Connection
		//2. SQL
		//3. Statement
		//4. executeQuery()
		//5. ResultSet
		//6. if (rs.next()) {}
		//7. rs.getString("name")
		//8. AddressDTO
		//9. dto.setName(name)
		//10. return dto
	
		//SQL의 결과를 객체에 매핑(변환)
		return template.selectOne("address.m6", seq);
	}
	
	@Override
	public List<String> m7() {
		
		//1. Connection
		//2. SQL
		//3. Statement
		//4. executeQuery()
		//5. ResultSet
		//6. List<String> names
		//7. while (rs.next()) {}
		//8. rs.getString("name")
		//9. names.add(name)
		//10. return names
	
		return template.selectList("address.m7");
	}
	
	@Override
	public List<AddressDTO> m8() {
		
		return template.selectList("address.m8");
	}
	
}



















