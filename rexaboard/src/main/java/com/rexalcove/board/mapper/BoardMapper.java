package com.rexalcove.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.rexalcove.board.domain.BoardVO;

@Repository //해당 클래스가 데이터베이스에 접근하는 클래스임을 명시함
@Mapper
public interface BoardMapper { //sql쿼리와 자바 객체를 연결하는 mybatis의 매퍼 - 매퍼는 무조건 인터페이스로 작성되어야 한다
public int boardCount() throws Exception;
//게시글 목록  
public List<BoardVO> boardList() throws Exception;

//게시글 상세
public BoardVO boardDetail(int bno) throws Exception;

//게시글 작성  
public int boardInsert(BoardVO board) throws Exception;

//게시글 수정  
public int boardUpdate(BoardVO board) throws Exception;

//게시글 삭제  
public int boardDelete(int bno) throws Exception;


}
