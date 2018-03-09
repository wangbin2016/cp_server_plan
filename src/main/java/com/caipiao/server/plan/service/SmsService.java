package com.caipiao.server.plan.service;

import com.caipiao.server.plan.dto.SmsSendRequest;
import com.caipiao.server.plan.dto.SmsSendResponse;

public interface SmsService {
	public SmsSendResponse send(SmsSendRequest request);
}
