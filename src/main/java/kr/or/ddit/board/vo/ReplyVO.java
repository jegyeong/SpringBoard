package kr.or.ddit.board.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ReplyVO implements Serializable{
	private Integer rep_no;
	private Integer bo_no;
	private String rep_content;
	private String rep_writer;
	private String rep_date;
	private String rep_ip;
	private String rep_pass;
}
