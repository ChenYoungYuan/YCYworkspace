package com.ut.scf.service.sys.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ut.scf.core.dict.ErrorCodeEnum;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.util.ScfUUID;
import com.ut.scf.dao.sys.IUserMarkDao;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.PageRespBean;
import com.ut.scf.service.sys.IUserMarkService;
/**
 * 
 * @author changxin
 *
 */
@Service("UserMarkService")
public class UserMarkServiceImpl implements IUserMarkService{
	private static final Logger log = LoggerFactory
			.getLogger(UserMarkServiceImpl.class);
	@Resource
	private IUserMarkDao userMarkdao;
	
	
	
	@Override
	@Transactional(readOnly = true)
	public BaseRespBean getUserMarkList(Map<String, Object> paramMap, PageInfoBean page) {
		List<Map<String, Object>> list = userMarkdao.selectUserMarkList(paramMap, page);
		PageRespBean respBean = new PageRespBean();
		respBean.setPages(page.getTotalPage());
		respBean.setRecords(page.getTotalRecord());
		respBean.setDataList(list);
		return respBean;
		}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean insertUserMark(Map<String, Object> paramMap) {
		BaseRespBean respBean = new BaseRespBean();
		paramMap.put("recUid", ScfUUID.generate());
		int resultnum = userMarkdao.insertUserMark(paramMap);
		log.debug("insert FinanceInfo num {}", resultnum);
		if(resultnum<=0){
			respBean.setResult(ErrorCodeEnum.ADD_FAILED);
			return respBean;
		}
		return respBean;
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean updateUserMark(Map<String, Object> paramMap) {
		BaseRespBean respBean = new BaseRespBean();

		int updateNum = userMarkdao.updateUserMark(paramMap);
		log.debug("update UserMark num {}", updateNum);
		if (updateNum <= 0) {
			respBean.setResult(ErrorCodeEnum.UPDATE_FAILED);
			return respBean;
		}

		return respBean;
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public BaseRespBean deleteUserMark(String recUid) {
		BaseRespBean respBean = new BaseRespBean();
		int resultnum = userMarkdao.deleteUserMark(recUid);
		log.debug("insert UserMark num {}", resultnum);
		if(resultnum<=0){
			respBean.setResult(ErrorCodeEnum.DELETE_FAILED);
			return respBean;
		}
		return respBean;
	}
	
}
