package com.zerock.b01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zerock.b01.domain.Board;
import com.zerock.b01.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
