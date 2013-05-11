package com.intelitune.nwms.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String name;
	private Date creationTime;
	private String address;
	private String remark;

 	// Constructors


	/** default constructor */
	public Customer()
	{
	}

	/** minimal constructor */
	public Customer(Date creationTime)
	{
		this.creationTime = creationTime;
	}

	/** full constructor */
	public Customer(String name, Date creationTime, String address,
			String remark)
	{
		this.name = name;
		this.creationTime = creationTime;
		this.address = address;
		this.remark = remark;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getCreationTime()
	{
		return this.creationTime;
	}

	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}


}