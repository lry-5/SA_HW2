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
package org.springframework.samples.petclinic.model;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;
import org.springframework.samples.petclinic.model.Person;

/**
 * Simple JavaBean domain object representing an owner.
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 */
@Entity
@Table(name = "students")
public class Student implements Serializable{

    @Column(name = "sno")
	@NotEmpty
    int sno;

    @Column(name = "name")
	@NotEmpty
    String name;

    @Column(name = "sex")
	@NotEmpty
    String sex;

    @Column(name = "birthday")
	@NotEmpty
    String birthday;

    @Column(name = "birthplace")
	@NotEmpty
    String birthplace;

    @Column(name = "dept")
	@NotEmpty
    String dept;

    public void setAll(int sno,String name,String sex,
    String bd,String bp,String dept){
        this.sno=sno;
        this.name=name;
        this.sex=sex;
        this.birthday=bd;
        this.birthplace=bp;
        this.dept=dept;
    }
    public void setSno(int sno){
        this.sno=sno;
    }
    public int getSno(){
        return sno;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setBirthday(String bd){
        this.birthday=bd;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthplace(String bp){
        this.birthplace=bp;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
}
