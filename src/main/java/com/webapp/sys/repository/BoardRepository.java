package com.webapp.sys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.sys.model.Board;

public interface BoardRepository extends JpaRepository<Board,Long>{

	List<Board> findByTitle(String title);
	List<Board> findByTitleOrContent(String title, String content);
	
}