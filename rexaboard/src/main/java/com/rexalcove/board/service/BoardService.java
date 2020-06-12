package com.rexalcove.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rexalcove.board.domain.BoardVO;
import com.rexalcove.board.mapper.BoardMapper;

@Service
public class BoardService {
	 @Resource
	    BoardMapper mBoardMapper;
	    
	    public List<BoardVO> boardListService() throws Exception{
	        
	        return mBoardMapper.boardList();
	    }
	    
	    public BoardVO boardDetailService(int bno) throws Exception{
	        
	        return mBoardMapper.boardDetail(bno);
	    }
	    
	    public int boardInsertService(BoardVO board) throws Exception{
	        
	        return mBoardMapper.boardInsert(board);
	    }
	    
	    public int boardUpdateService(BoardVO board) throws Exception{
	        
	        return mBoardMapper.boardUpdate(board);
	    }
	    
	    public int boardDeleteService(int bno) throws Exception{
	        
	        return mBoardMapper.boardDelete(bno);
	    }
}
