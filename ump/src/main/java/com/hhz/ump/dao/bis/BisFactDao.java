package com.hhz.ump.dao.bis;

import org.springframework.stereotype.Repository;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.hhz.ump.entity.bis.BisFact;

@Repository
public class BisFactDao extends HibernateDao<BisFact, String> {
}

