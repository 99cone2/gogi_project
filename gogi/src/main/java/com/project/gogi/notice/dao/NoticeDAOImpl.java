package com.project.gogi.notice.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.project.gogi.notice.domain.Criteria;
import com.project.gogi.notice.domain.Criteria2;
import com.project.gogi.notice.domain.NoticeVO;
import com.project.gogi.notice.domain.SearchCriteria;


@Repository
public class NoticeDAOImpl implements NoticeDAO {

	//마이바티스
	@Inject
	private SqlSession sql;

	//매퍼
	private static String namespace = "mapper.notice";
	
	//게시물 목록 +페이징
	 @Override
	 public List<NoticeVO> NoticeList(SearchCriteria  scri) throws Exception { 
		  
		  return sql.selectList(namespace + ".noticeList",scri);
		 }
	
	//작성
	@Override
	public void NoticeWrite(NoticeVO vo) throws Exception {
		sql.insert(namespace + ".noticeWrite", vo);
		
	}

	//조회
	@Override
	public NoticeVO NoticeRead(int notice_no) throws Exception {
		return
				 sql.selectOne(namespace + ".noticeRead", notice_no); 
	}

	//수정
	@Override
	public void NoticeUpdate(NoticeVO vo) throws Exception {
		 sql.update(namespace + ".noticeUpdate", vo);
		
	}

	//삭제
	@Override
	public void NoticeDelete(int notice_no) throws Exception {
		 sql.delete(namespace + ".noticeDelete", notice_no);
		
	}
	
	//게시글 총 갯수 확인
	//int 등 타입 확인 잘 하기
	@Override
	public int NoticeListCount() throws Exception {
		return sql.selectOne(namespace+".noticeListCount");
	}
	
	 //조회수
	 @Override	    
	 public void updateNoticeViewCnt(int notice_no) throws Exception {	      
	 	sql.update(namespace + ".updateNoticeViewCnt", notice_no);	   
	 }

	 
	 //FAQ~
	//게시물 목록 +페이징
		 @Override
		 public List<NoticeVO> NoticeFAQList(Criteria2 cri2) throws Exception { 
			  
			  return sql.selectList(namespace + ".noticeFAQList",cri2);
			 }
		
		 //8.13
		   //검색 결과 갯수
		   public int countSearch(SearchCriteria scri) throws Exception{
			   return sql.selectOne(namespace+".countSearch", scri);
		   }
		   
		 
		 
		//작성
		@Override
		public void NoticeFAQWrite(NoticeVO vo) throws Exception {
			sql.insert(namespace + ".noticeFAQWrite", vo);
			
		}

		//조회
		@Override
		public NoticeVO NoticeFAQRead(int notice_no_faq) throws Exception {
			return
					 sql.selectOne(namespace + ".noticeFAQRead", notice_no_faq); 
		}

		//수정
		@Override
		public void NoticeFAQUpdate(NoticeVO vo) throws Exception {
			 sql.update(namespace + ".noticeFAQUpdate", vo);
			
		}

		//삭제
		@Override
		public void NoticeFAQDelete(int notice_no_faq) throws Exception {
			 sql.delete(namespace + ".noticeFAQDelete", notice_no_faq);
			
		}
		
		//게시글 총 갯수 확인
		//int 등 타입 확인 잘 하기
		@Override
		public int NoticeFAQListCount() throws Exception {
			return sql.selectOne(namespace+".noticeFAQListCount");
		}
		
		 //조회수
		 @Override	    
		 public void updateNoticeFAQViewCnt(int notice_no_faq) throws Exception {	      
		 	sql.update(namespace + ".updateNoticeFAQViewCnt", notice_no_faq);	   
		 }

	 
		 @Override
		 // admin 확인 메서드 추가
	    public boolean CheckAdmin(NoticeVO vo) {
	        // vo를 사용하여 "mem_id"를 가져오거나 필요한 로직을 추가합니다.
	        String mem_id = vo.getMem_id();

	        // mem_id가 "admin"인지 확인하여 true 또는 false를 반환합니다.
	        return "admin".equals(mem_id);
	    }
		 
		 
		   
}
		
		
