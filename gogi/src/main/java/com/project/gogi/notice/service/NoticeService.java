package com.project.gogi.notice.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.gogi.notice.domain.Criteria;
import com.project.gogi.notice.domain.Criteria2;
import com.project.gogi.notice.domain.NoticeVO;
import com.project.gogi.notice.domain.SearchCriteria;
import com.project.gogi.serv.domain.SearchCriteria2;

public interface NoticeService {

	//공지사항~
	//8.16
	//게시물 목록 +페이징
	public List<NoticeVO> NoticeList(SearchCriteria scri) throws Exception;
	// 작성
	public void NoticeWrite(NoticeVO vo) throws Exception;
	// 조회
	public NoticeVO NoticeRead(int notice_no) throws Exception;   
	// 수정
	public void NoticeUpdate(NoticeVO vo) throws Exception;   
	// 삭제
	public void NoticeDelete(int notice_no) throws Exception;
	// 게시물 총 갯수
	public int NoticeListCount() throws Exception;
	//조회수
	public void updateNoticeViewCnt(int notice_no) throws Exception;

	 //8.13
	   //검색 결과 갯수
	   public int countSearch(SearchCriteria scri) throws Exception;
	//공지사항 끝
	
	//FAQ~
	//게시물 목록 +페이징
	public List<NoticeVO> NoticeFAQList(Criteria2 cri2) throws Exception;
	// 작성
	public void NoticeFAQWrite(NoticeVO vo) throws Exception;		   
	// 조회
	public NoticeVO NoticeFAQRead(int notice_no_faq) throws Exception;
	// 수정
	public void NoticeFAQUpdate(NoticeVO vo) throws Exception;	   
	// 삭제
	public void NoticeFAQDelete(int notice_no_faq) throws Exception;
	//게시물 총 갯수 확인
	public int NoticeFAQListCount() throws Exception;
	//조회수
    public void updateNoticeFAQViewCnt(int notice_no_faq) throws Exception;

    //FAQ끝

    //관리자 확인
    public boolean CheckAdmin(NoticeVO vo) throws Exception;
}
