package com.hhz.ump.dao.planold;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.hhz.core.service.BaseService;
import com.hhz.core.utils.PowerUtils;
import com.hhz.ump.entity.planold.PlanProjectNodeRelOld;
import com.hhz.ump.web.vo.EntityVO;

@Service
@Transactional
public class PlanProjectNodeRelOldManager extends BaseService<PlanProjectNodeRelOld, String> {
	
	private static Log log = LogFactory.getLog(PlanProjectNodeRelOldManager.class);
	
	@Autowired
	private PlanProjectNodeRelOldDao planProjectNodeRelDao;

	// 是否控制节点
	public static String CONTROL_NODE_FLG_ENABLE = "1";
	public static String CONTROL_NODE_FLG_DISABLE = "0";

	// 是否删除 1-是 0-否
	public static String DELETED_FLG_Y = "1";
	public static String DELETED_FLG_N = "0";

	@Transactional(readOnly = true)
	public PlanProjectNodeRelOld getPlanProjectNodeRel(String id) {
		return planProjectNodeRelDao.get(id);
	}
	
	public List<PlanProjectNodeRelOld> getAllPlanProjectNodeRel() {
		return planProjectNodeRelDao.getAll();
	}
	
	public void savePlanProjectNodeRel(PlanProjectNodeRelOld planProjectNodeRel) {
		PowerUtils.setEmptyStr2Null(planProjectNodeRel);
		planProjectNodeRelDao.save(planProjectNodeRel);
	}

	public void deletePlanProjectNodeRel(String id) {
		planProjectNodeRelDao.delete(id);
	}
	
	@Override
	public HibernateDao<PlanProjectNodeRelOld, String> getDao() {
		return planProjectNodeRelDao;
	}

	 
	/**
	 * 功能: 获取某个项目所有的执行计划节点
	 * @param projectCd
	 * @param planTypeCd
	 * 
	 * @return
	 */
	public List<PlanProjectNodeRelOld> getProjectNodeRelList(String projectCd,String planTypeCd){
		 Map<String, Object> params = new HashMap<String, Object>();
		    params.put("projectCd", projectCd);
		    params.put("planTypeCd", planTypeCd);
		    
		    if (StringUtils.isBlank(projectCd))
				return new ArrayList<PlanProjectNodeRelOld>();
		    
		    StringBuffer hqlBuf = new StringBuffer()
				    	.append(" from PlanProjectNodeRelOld n ")
						.append(" where n.planExecutionPlanMain.projectCd=:projectCd ")
						.append("  and  n.planTypeCd=:planTypeCd ");
						
		    return getDao().find(hqlBuf.toString(), params);
	}
	
	/**
	 * 功能: 获取某个项目有效的执行计划节点
	 * @param projectCd
	 * @param planTypeCd
	 * @param nodeName
	 * 
	 * @return
	 */
	public List<PlanProjectNodeRelOld> getValidProjNodes(String projectCd, String planTypeCd, String nodeName){
		return getValidProjNodes(projectCd, planTypeCd, nodeName, null, null);
	}
	
	/**
	 * 功能: 有效节点
	 * @param projectCd
	 * @param planTypeCd
	 * @param nodeName
	 * @param resOrgCd
	 * @param resOrgName
	 * @return
	 */
	public List<PlanProjectNodeRelOld> getValidProjNodes(String projectCd, String planTypeCd, String nodeName,String resOrgCd,String resOrgName) {
		return getValidProjNodes(projectCd, planTypeCd, nodeName, resOrgCd, resOrgName, null, false, null);
	}
	public List<PlanProjectNodeRelOld> getValidProjNodes(String projectCd, String planTypeCd, String nodeName,String resOrgCd,String resOrgName,String treeType,boolean ifConfig,String treeTypeCd) {

	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("projectCd", projectCd);
	    params.put("planTypeCd", planTypeCd);
	    params.put("deletedFlg", DELETED_FLG_Y);
	    
	    if (StringUtils.isBlank(projectCd))
			return new ArrayList<PlanProjectNodeRelOld>();

	    
	    StringBuffer hqlBuf = new StringBuffer()
			    	.append(" from PlanProjectNodeRelOld n ")
					.append(" where n.planExecutionPlanMain.projectCd=:projectCd ")
					.append("  and  n.planTypeCd=:planTypeCd ")
			    	.append( "  and n.deletedFlg != :deletedFlg ");
	    
	    if(StringUtils.isNotBlank(treeTypeCd)){
	    	hqlBuf.append(" and n.treeType = :treeType ");
		    params.put("treeType", treeTypeCd);
	    }
	    
	    if(StringUtils.isNotBlank(resOrgCd)){
	    	hqlBuf.append(" and n.resOrgCd = :resOrgCd ");
		    params.put("resOrgCd", resOrgCd);
	    }
	    if (StringUtils.isNotBlank(resOrgName)) {
	    	hqlBuf.append(" and n.resOrgName like :resOrgName");
			params.put("resOrgName", "%" + resOrgName + "%");
	    }
	    if (StringUtils.isNotBlank(nodeName)) {
	    	hqlBuf.append(" and n.nodeName like :nodeName");
			params.put("nodeName", "%" + nodeName + "%");
	    }
	    
	    if(StringUtils.isNotBlank(treeType)){
	    	//hqlBuf.append(" and (n.treeType like '"+treeType+"')");
	    }
	    if(!ifConfig){
	    	//hqlBuf.append(" and  n.treeType is not null");
	    }
	    hqlBuf.append(" order by n.order1 asc, n.order2 asc, n.order3 asc ");
	    
	    return getDao().find(hqlBuf.toString(), params);
	}

	/**
	 * 功能: 获取某个项目有效的控制计划节点
	 * @param projectCd
	 * @param planTypeCd
	 * 
	 * @return
	 */
 
	public List<PlanProjectNodeRelOld> getValidProjControlNodes(String projectCd, String planTypeCd,String resOrgCd,String resOrgName) {
	    if (StringUtils.isBlank(projectCd))
			return new ArrayList<PlanProjectNodeRelOld>();

	    Map<String, Object> params = new HashMap<String, Object>();
	    params.put("projectCd", projectCd);
	    params.put("planTypeCd", planTypeCd);
		params.put("controlNodeFlg", CONTROL_NODE_FLG_ENABLE);
		params.put("deletedFlg", DELETED_FLG_Y);
	    
	    StringBuffer hqlBuf = new StringBuffer()
				    .append(" from PlanProjectNodeRelOld n " )
				    .append(" where n.planExecutionPlanMain.projectCd=:projectCd " )
				    .append("   and n.controlNodeFlg = :controlNodeFlg " )
				    .append("   and n.planTypeCd = :planTypeCd " )
				    .append("   and (n.deletedFlg is null or n.deletedFlg != :deletedFlg)" );
	    if(StringUtils.isNotBlank(resOrgCd)){
	    	  hqlBuf.append("   and n.resOrgCd = :resOrgCd ");
	  		params.put("resOrgCd", resOrgCd);
	    }
	    if(StringUtils.isNotBlank(resOrgName)){
	    	  hqlBuf.append("   and n.resOrgName = :resOrgName ");
	  		params.put("resOrgName", resOrgName);
	    }
	    hqlBuf.append(" order by n.order1 asc, n.order2 asc, n.order3 asc ");
	    return getDao().find(hqlBuf.toString(), params);
	}

	/**
	 * 功能: 搜索主责中心列表
	 * @param planTypeCd
	 * 
	 * @return
	 */
	public List<EntityVO> getResOrgList(String planTypeCd) {

		Map<String,Object> params = new HashMap<String,Object>();
		params.put("planTypeCd", planTypeCd);
		String hql = " select distinct rel.resOrgCd,rel.resOrgName  from PlanProjectNodeRelOld rel where rel.planTypeCd =:planTypeCd ";
		List<Object[]> list = this.getDao().find(hql, params);
		if(list == null)
			return new ArrayList<EntityVO>();
		
		EntityVO vo = null;
		Object[] obj = null;
		String tmpCd = null;
		String tmpName = null;
		List<EntityVO> voList = new ArrayList<EntityVO>();
		for (int i = 0; i < list.size(); i++) {
			obj = list.get(i);
			tmpCd = (String)obj[0];
			tmpName = (String)obj[1];
			if(StringUtils.isBlank(tmpName)){
				log.debug("配合中心为空!cd:" + tmpCd + ", name : " + tmpName);
				continue;
			}
			vo= new EntityVO();
			vo.setEntityCd((String)obj[0]);
			vo.setEntityName((String)obj[1]);
			voList.add(vo);
		}
		return voList;
	}

}

