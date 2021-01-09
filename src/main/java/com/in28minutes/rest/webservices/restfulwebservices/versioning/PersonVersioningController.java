package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	@GetMapping("v1/person")
	public PersonV1 peronV1() {
		return new PersonV1("Esraa Salah");
	}

	@GetMapping("v2/person")
	public PersonV2 peronV2() {
		return new PersonV2(new Name("Esraa", "Salah"));
	}

	@GetMapping(value = "/person/param", params = "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Esraa Salah");
	}

	@GetMapping(value = "/person/param", params = "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Esraa", "Salah"));
	}

}
