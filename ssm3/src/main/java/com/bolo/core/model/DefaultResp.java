package com.bolo.core.model;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @ClassName: DefaultRespVO
 * @Description: TODO(统一服务端响应数据结构信息,主要用于客户端请求json格式的报文)
 * @author wangmb2008@gmail.com
 * @date 2013-6-26 上午10:33:04
 * 
 * @param <T>
 */
@SuppressWarnings("serial")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class DefaultResp<E> implements Serializable {
	private String code;
	private String msg;
	private E data;

	public DefaultResp() {
	}
	
	public DefaultResp(String code,String msg) {
		setCode(code);
		setMsg(msg);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
