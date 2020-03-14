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
package org.springframework.samples.petclinic.controller;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@Controller
class StudentController {

	@GetMapping("/index")
	public String index(Map<String, Object> model) {
		// Owner owner = new Owner();
        // model.put("owner", owner);
        System.out.println("index");
		return "/fragments/index";
    }
    
    @GetMapping("/index/insert")
	public String insert(Map<String, Object> model) {
		// Owner owner = new Owner();
        // model.put("owner", owner);
        System.out.println("insert");
		return "/students/insert";
    }

    @GetMapping("/index/query")
	public String query(Map<String, Object> model) {
		// Owner owner = new Owner();
        // model.put("owner", owner);
        System.out.println("query");
		return "/students/query";
    }

    @GetMapping("/index/update")
	public String update(Map<String, Object> model) {
		// Owner owner = new Owner();
        // model.put("owner", owner);
        System.out.println("update");
		return "/students/update";
    }


}
