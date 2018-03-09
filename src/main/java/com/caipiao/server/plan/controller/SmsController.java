package com.caipiao.server.plan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.caipiao.server.plan.dto.SmsSendRequest;
import com.caipiao.server.plan.dto.SmsSendResponse;
import com.caipiao.server.plan.service.SmsService;

@RestController
@RequestMapping("/message/sms/")
public class SmsController {
	@Autowired
	private SmsService smsService;
	@RequestMapping(method=RequestMethod.POST,value="send")
	public ResponseEntity<SmsSendResponse> send(SmsSendRequest request){
		SmsSendResponse response = smsService.send(request);
		return ResponseEntity.ok(response);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="send2")
	public ResponseEntity<SmsSendResponse> send2(@RequestBody SmsSendRequest request){
		SmsSendResponse response = smsService.send(request);
		return ResponseEntity.ok(response);
	}
}
