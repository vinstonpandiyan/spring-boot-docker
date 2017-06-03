package com.vin.docker.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vin.docker.entity.NameEntity;

/**
 *
 * @author Vinston Pandiyan
 * @since Jun 3, 2017
 */
@Component
public class NameService {

	@Autowired
	private NameRepository nameRepository;

	private String DEFUALT_NAME = "vinston";

	public String getHelloMessage() {
		Iterator<NameEntity> names = nameRepository.findAll().iterator();
		String name = DEFUALT_NAME;
		while (names.hasNext()) {
			name = names.next().getValue();
		}
		return "Hello " + name;
	}

}
