package com.hhz.ump.dao.ct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.hhz.core.service.BaseService;
import com.hhz.core.utils.PowerUtils;
import com.hhz.ump.entity.ct.CtOperItemRel;

@Service
@Transactional
public class CtOperItemRelManager extends BaseService<CtOperItemRel, String> {
	@Autowired
	private CtOperItemRelDao ctOperItemRelDao;

	public void saveCtOperItemRel(CtOperItemRel ctOperItemRel) {
		PowerUtils.setEmptyStr2Null(ctOperItemRel);
		ctOperItemRelDao.save(ctOperItemRel);
	}

	public void deleteCtOperItemRel(String id) {
		ctOperItemRelDao.delete(id);
	}
	
	@Override
	public HibernateDao<CtOperItemRel, String> getDao() {
		return ctOperItemRelDao;
	}
	
}

