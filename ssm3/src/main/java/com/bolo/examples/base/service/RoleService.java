package com.bolo.examples.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolo.examples.base.entity.Role;
import com.bolo.examples.base.entity.User;
import com.bolo.orm.mybatis.MyBatisDao;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * 角色管理
 * @author 菠萝大象
 */
@Service
public class RoleService {

	@Autowired
	private MyBatisDao myBatisDao;
	
//	@Autowired
//	private IGeneralDao generalDao;
	
	public List<Role> getRoles(){
		return myBatisDao.getList("roleMapper.selectByEntity");
	}
	
	public Role getRole(Serializable id){
		return myBatisDao.get("roleMapper.selectByPrimaryKey",id);
	}
	
	public void save(Role role){
		if(role.getId() == null)
			myBatisDao.save("roleMapper.insert", role);
		else
			myBatisDao.save("roleMapper.update", role);
	}
	
	public void delete(Serializable id){
		myBatisDao.delete("roleMapper.delete", id);
	}
	
	public PageList<Role> findRoles(Role role,int offset, int limit)  {
		
		
		PageList<Role> list = (PageList<Role>) myBatisDao.getPage("roleMapper.selectByEntity", role, new PageBounds(offset, limit));
		return list;
	}
}
