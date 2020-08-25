package kr.or.ddit.board.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.PagingVO;

@Repository
public interface IBoardDAO {
	public int insertBoard(BoardVO board); 
	public int selectBoardCount(PagingVO<BoardVO> pagingVO); 
	public List<BoardVO> selectBoardList(PagingVO<BoardVO> pagingVO); 
	public BoardVO selectBoard(int bo_no); 
	public void incrementHit(int bo_no); 
	public int updateBoard(BoardVO board); 
	public int deleteBoard(BoardVO board);
}
