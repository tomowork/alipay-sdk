package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.basicservice.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 18:53:12
 */
public class AlipayEcoCplifeBasicserviceInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5339263771246436313L;

	/** 
	 * 若初始化的服务类型为物业缴费账单上传模式，成功后会返回需要物业账号单独授权给支付宝社区物业平台代物业发起物业费交易的链接。请开发者发给物业人员邀请对方点击并用对应的物业支付宝账号完成第三方授权。
	 */
	@ApiField("bill_pay_auth_url")
	private String billPayAuthUrl;

	/** 
	 * 服务初始化成功后，若从当前状态到下一状态需要完成下一步条件代码，则返回该字段，否则不返回。
操作主体有：
INVOKER - 接口调用方
MERCHANT - 物业公司
AUDITOR - 平台审核方
条件代码包括但不限于：
WAIT_SERVICE_PROVISION - 等待基础服务初始化
WAIT_PROD_VERIFICATION - 等待在生产环境通过自测
WAIT_ONLINE_APPLICATION - 等待提起上线申请（目前支持开发者调用alipay.eco.cplife.basicservice.modify接口发起上线申请）
WAIT_AUTH_TO_PLATFORM - 等待物业授权给支付宝社区平台
WAIT_CONFIRMATION - 等待相关方确认
WAIT_AUDITING - 等待审核
	 */
	@ApiField("next_action")
	private String nextAction;

	/** 
	 * 若服务成功初始化，则返回当前状态。
服务初始化后默认为下线状态，需要完成开发和验证，并提交服务上线申请。由支付宝小二审核通过后完成服务和小区上线。
	 */
	@ApiField("status")
	private String status;

	public void setBillPayAuthUrl(String billPayAuthUrl) {
		this.billPayAuthUrl = billPayAuthUrl;
	}
	public String getBillPayAuthUrl( ) {
		return this.billPayAuthUrl;
	}

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}
	public String getNextAction( ) {
		return this.nextAction;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
