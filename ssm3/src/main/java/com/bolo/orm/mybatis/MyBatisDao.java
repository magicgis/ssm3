package com.bolo.orm.mybatis;

import java.io.Serializable;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

/**
 * MyBatis的Dao基类
 * @author 菠萝大象
 */
public class MyBatisDao extends SqlSessionDaoSupport{
	
	public void save(String key, Object object) {
		getSqlSession().insert(key, object);
	}
	
	public void delete(String key, Serializable id) {
		getSqlSession().delete(key, id);
	}

	public void delete(String key, Object object) {
		getSqlSession().delete(key, object);
	}
	
	public <T> T get(String key, Object params) {
		return (T) getSqlSession().selectOne(key, params);
	}
	
	public <T> List<T> getList(String key) {
		return getSqlSession().selectList(key);
	}
	
	public <T> List<T> getList(String key, Object params) {
		return getSqlSession().selectList(key, params);
	}
	public <T> List<T> getPage(String key,T entity,PageBounds bounds){
		return getSqlSession().selectList(key, entity, bounds);
	}
	
}
