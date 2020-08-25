package kr.or.ddit.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.or.ddit.board.ServiceResult;
import kr.or.ddit.board.dao.IReplyDAO;
import kr.or.ddit.board.vo.PagingVO;
import kr.or.ddit.board.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements IReplyService {
	@Inject
	IReplyDAO replyDAO;

	@Override
	public ServiceResult createReply(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int readReplyCount(PagingVO<ReplyVO> pagingVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReplyVO> readReplyList(PagingVO<ReplyVO> paingVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult modifyReply(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceResult removeReply(ReplyVO reply) {
		// TODO Auto-generated method stub
		return null;
	}

}
