package kr.or.ddit.board.dao;

import org.springframework.stereotype.Repository;

import kr.or.ddit.board.vo.AttatchVO;
import kr.or.ddit.board.vo.BoardVO;

@Repository
public interface IAttatchDAO {
	public int insertAttatchs(BoardVO board); 
	public AttatchVO selectAttatch(int att_no);
	public int incrementDownCount(int att_no);
	public int deleteAttatchs(BoardVO board);
}
