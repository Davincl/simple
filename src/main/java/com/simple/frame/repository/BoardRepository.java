package com.simple.frame.repository;

import com.simple.frame.entity.BoardVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "BoardVo", path = "BoardVo")
public interface BoardRepository extends JpaRepository<BoardVo, Long> {

}
