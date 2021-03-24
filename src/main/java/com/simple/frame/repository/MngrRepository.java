package com.simple.frame.repository;

import com.simple.frame.entity.MngrVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mngrVo", path = "mngrVo")
public interface MngrRepository extends JpaRepository<MngrVo, Long> {

    MngrVo findByMngrId(String mngrId);

}
