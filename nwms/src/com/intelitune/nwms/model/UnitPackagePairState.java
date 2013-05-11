package com.intelitune.nwms.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @hibernate.class
 * table = "intt_unitPackagePairState"
 * @author chase
 *
 */
public class UnitPackagePairState implements java.io.Serializable{

	public static final String ZHENGCHANG = "0";
	public static final String SHANCHU = "1";
	public static final String SUODING = "2";
	/*
 * (non-javadoc)
 */
public final static Integer NORMAL = 0;public final static Integer DELETE = 1;public final static Integer LOCKED = 2;public String description;
 
/**
 * Getter of the property <tt>description</tt>
 *@hibernate.property
 * @return Returns the description.
 * 
 */

public String getDescription()
{
	return description;
}

/**
 * Setter of the property <tt>description</tt>
 *
 * @param description The description to set.
 *
 */
public void setDescription(String description ){
	this.description = description;
}

/*
 * (non-javadoc)
 */
public String code;
 
/**
 * Getter of the property <tt>code</tt>
 *@hibernate.property
 * @return Returns the code.
 * 
 */

public String getCode()
{
	return code;
}

/**
 * Setter of the property <tt>code</tt>
 *
 * @param code The code to set.
 *
 */
public void setCode(String code ){
	this.code = code;
}

/*
 * (non-javadoc)
 */
public String id;
 
/**
 * Getter of the property <tt>id</tt>
 *@hibernate.id
 *   generator-class = "uuid"
 * @return Returns the id.
 * 
 */

public String getId()
{
	return id;
}

/**
 * Setter of the property <tt>id</tt>
 *
 * @param id The id to set.
 *
 */
public void setId(String id ){
	this.id = id;
}

public Set<UnitPackagePair> unitPackagePairs = new HashSet<UnitPackagePair>();

public Set<UnitPackagePair> getUnitPackagePairs() {
	return unitPackagePairs;
}

public void setUnitPackagePairs(Set<UnitPackagePair> unitPackagePairs) {
	this.unitPackagePairs = unitPackagePairs;
}


}
