package com.vin.docker.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vin.docker.entity.NameEntity;

/**
 *
 * @author Vinston Pandiyan
 * @since Jun 3, 2017
 */
@RepositoryRestResource(collectionResourceRel = "nameEntity", path = "nameEntity")
public interface NameRepository extends CrudRepository<NameEntity, Long> {

}
