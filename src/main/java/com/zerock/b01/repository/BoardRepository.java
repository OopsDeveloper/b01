package com.zerock.b01.repository;

import com.zerock.b01.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {


}