# Spring + MyBatis 연동 CRUD 예제 프로젝트 (25/10/22)

Spring Legacy (non-Boot) 환경에서 MyBatis를 연동하여 다양한 DB 쿼리 방식을 연습하기 위한 예제 프로젝트입니다.

<br>

## ⚙️ 사용 기술
* **Backend:** Java, Spring Framework
* **Database:** Oracle DB
* **Persistence:** MyBatis
* **DBCP:** HikariCP
* **Server:** Tomcat

<br>

## 📌 주요 기능 (MyBatis 쿼리 연습)

`address.xml` 매퍼 파일을 통해 MyBatis의 주요 기능을 연습했음.

* **`m1` (INSERT)**
    * 파라미터가 없는 정적 `INSERT` 쿼리를 실행
* **`m2` (DELETE)**
    * 단일 파라미터(String `seq`)를 받아 `DELETE` 쿼리를 실행
* **`m3` (UPDATE)**
    * 여러 파라미터를 `Map<String, String>` 객체로 받아 `UPDATE` 쿼리를 실행
* **`m4` (UPDATE)**
    * 파라미터를 `AddressDTO` 객체로 받아 `UPDATE` 쿼리를 실행
    * `mybatis-config.xml`의 `<typeAlias>` (별칭)를 활용 (`parameterType="adto"`)
* **`m5` (SELECT ONE - 단일 값)**
    * `selectOne`을 사용해 단일 레코드의 단일 컬럼(String `name`)을 반환
* **`m6` (SELECT ONE - DTO 객체)**
    * `selectOne`을 사용해 단일 레코드를 `AddressDTO` 객체에 매핑하여 반환
* **`m7` (SELECT LIST - 단일 값 리스트)**
    * `selectList`를 사용해 여러 레코드의 `name` 컬럼을 `List<String>`으로 반환
* **`m8` (SELECT LIST - DTO 리스트)**
    * `selectList`를 사용해 여러 레코드를 `List<AddressDTO>`에 매핑하여 반환
