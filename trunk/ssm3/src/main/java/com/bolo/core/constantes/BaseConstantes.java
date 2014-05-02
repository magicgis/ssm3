package com.bolo.core.constantes;

/**
 * @ClassName: MobilePortalConstantes
 * @Description: TODO(应用、门户常用常量，临时，统一位置，后续部分常量需要根据业务进行调整)
 * @author mb.wang  
 * @date 2013-12-21 下午9:59:44
 * 
 */
public interface BaseConstantes {
	/**
	 * @Fields APP_AUDIT_STATUS_DRAFT : TODO(应用（包括客户端）状态：草稿)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:05:05
	 */
	String APP_AUDIT_STATUS_DRAFT = "10T";
	/**
	 * @Fields APP_AUDIT_STATUS_CONTINUE : TODO(应用（包括客户端）状态：审核中)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:09:38
	 */
	String APP_AUDIT_STATUS_CONTINUE = "10C";
	/**
	 * @Fields APP_AUDIT_STATUS_DISMISSED : TODO(应用（包括客户端）状态：审核驳回)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:09:41
	 */
	String APP_AUDIT_STATUS_DISMISSED = "10D";
	/**
	 * @Fields APP_AUDIT_STATUS_RELEASE : TODO(应用（包括客户端）状态：发布)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:09:45
	 */
	String APP_AUDIT_STATUS_RELEASE = "10P";
	/**
	 * @Fields APP_AUDIT_STATUS_OFFLINE : TODO(应用（包括客户端）状态：下线)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:09:45
	 */
	String APP_AUDIT_STATUS_OFFLINE = "10X";
	
	
	/**
	 * @Fields APP_IOS_ACCOUNT_ENTERPRISE : TODO(IOS账号类型：企业版)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:14:05
	 */
	String APP_IOS_ACCOUNT_ENTERPRISE = "1";
	/**
	 * @Fields APP_IOS_ACCOUNT_STANDARD : TODO(IOS账号类型：标准版)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:14:07
	 */
	String APP_IOS_ACCOUNT_STANDARD = "2";
	
	
	/**
	 * @Fields APP_UPDATE_TACTICS_OPTIONAL : TODO(应用（包括客户端）更新策略：可选更新)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:17:21
	 */
	String APP_UPDATE_TACTICS_OPTIONAL = "10A";
	/**
	 * @Fields APP_UPDATE_TACTICS_ENFORCEMENT : TODO(应用（包括客户端）更新策略：强制更新)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:17:26
	 */
	String APP_UPDATE_TACTICS_ENFORCEMENT = "10F";
	
	
	/**
	 * @Fields APP_PLATFORM_CROSS : TODO(应用（包括客户端）平台类型：跨平台)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:21:51
	 */
	String APP_PLATFORM_CROSS = "3";
	/**
	 * @Fields APP_PLATFORM_ANDROID : TODO(应用（包括客户端）平台类型：android)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:21:51
	 */
	String APP_PLATFORM_ANDROID = "2";
	/**
	 * @Fields APP_PLATFORM_IOS : TODO(应用（包括客户端）平台类型：ios)
	 * @author mb.wang 
	 * @date 2013-12-21 下午10:21:55
	 */
	String APP_PLATFORM_IOS = "1";
	
	
	/**
	 * @Fields APP_TERMINAL_MOBILE : TODO(应用适应终端：手机)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:27:35
	 */
	String APP_TERMINAL_MOBILE = "1";
	/**
	 * @Fields APP_TERMINAL_PAD : TODO(应用适应终端：PAD)
	 * @author mb.wang  
	 * @date 2013-12-21 下午10:27:38
	 */
	String APP_TERMINAL_PAD = "2";
	
	
	/**
	 * @Fields APP_RUN_MODEL_XPK : TODO(应用运行模式：跨平台)
	 * @author mb.wang  
	 * @date 2013-12-22 下午2:18:43
	 */
	String APP_RUN_MODEL_XPK = "xpk";
	/**
	 * @Fields APP_RUN_MODEL_NPK : TODO(应用运行模式：本地应用)
	 * @author mb.wang  
	 * @date 2013-12-22 下午2:18:47
	 */
	String APP_RUN_MODEL_NPK = "npk";
	
	
	String NO_PERMISSION = "UP01";
	String MSG_NO_PERMISSION = "无接口访问权限";
	
	String SUCCESS = "0000";
	String SUCCESS_MSG = "成功";
	
	String PARAM_ERROR = "0001";
	String PARAM_ERROR_MSG = "参数错误或者参数不完整";	

	String KEY_OR_SERVICE_CODE_ILLEGAL = "0002";
	String KEY_OR_SERVICE_CODE_ILLEGAL_MSG = "接入key或服务CODE校验失败";	
	
	String VERSION_ERROR = "0003";
	String VERSION_ERROR_MSG = "版本号错误";		
	
	String VERSION_STOP = "0004";
	String VERSION_STOP_MSG = "版本接口已经停用";	
	
	String UE01 = "UE01";
	String UE01_MSG = "未知接口异常";	

	String LOGIN_SUCCESS = "AT00";
	String LOGIN_SUCCESS_MSG = "登录成功";	
	String LOGIN_FAIL = "AT01";
	String LOGIN_FAIL_MSG = "登录失败";	
	
	
	String IS_INLOGIN = "已经登录";
	String TICKET_SUCCESS_MSG = "认证成功";
	String TICKET_FAIL_MSG = "认证失败";
	String LOGOUT_SUCCESS_MSG ="登出成功";
	String LOGOUT_FAIL_MSG ="登出失败";
	String PWDNOTEQ = "确认密码不一致" ;
	String OLD_PWD_ERROR="原密码错误";
	
	String USER_INFOERROR = "用户信息错误";
	String USER_EXITS = "用户已存在";
	
	String USER_CODEERROR = "账号必须为电信手机号";
	
}
