package com.bolo.core.model;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
/**
 *  实体基类  具有状态和最后修改人,最后修改时间
 * @author jiulong.hu
 *
 */
public class BaseEntity implements InitializingBean {
	
	protected String lastModifier;
	protected Date   lastModifyTime;
	protected String state;
	
	
	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	

	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		return null;
	}

	public void afterPropertiesSet() throws Exception {
		this.lastModifyTime = new Date();
	}

}
