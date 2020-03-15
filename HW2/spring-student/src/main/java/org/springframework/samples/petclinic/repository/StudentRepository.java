/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Student;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository class for <code>Owner</code> domain objects All method names are compliant
 * with Spring Data naming conventions so this interface can easily be extended for Spring
 * Data. See:
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
public interface StudentRepository extends Repository<Student, Integer> {

	@Query("SELECT student FROM Student student WHERE student.name LIKE :name%")
	@Transactional(readOnly = true)
	Collection<Student> findByName(@Param("name") String name);
	
	@Query("SELECT student FROM Student student WHERE student.id =:id")
	@Transactional(readOnly = true)
	Collection<Student> findById(@Param("id") Integer id);

    @Query("SELECT student FROM Student student")
	@Transactional(readOnly = true)
	Collection<Student> findAll();

    @Modifying //说明该操作是修改类型操作，删除或者修改
    @Transactional //因为默认是readOnly=true的，这里必须自己进行声明
    @Query("delete from Student where id=:id") //删除的语句
    public void deleteById(@Param("id") Integer id);

    @Modifying //说明该操作是修改类型操作，删除或者修改
    @Transactional //因为默认是readOnly=true的，这里必须自己进行声明
    @Query("UPDATE Student s SET s.name = ?1 WHERE s.id = ?2")
    public void setNameById(String name,int id);



	void save(Student student);

}
