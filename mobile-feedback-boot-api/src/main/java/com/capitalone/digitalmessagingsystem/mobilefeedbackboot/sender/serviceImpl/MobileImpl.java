package com.capitalone.digitalmessagingsystem.mobilefeedbackboot.sender.serviceImpl;

import com.capitalone.digitalmessagingsystem.mobilefeedbackboot.api.FeedBackApi;

public class MobileImpl implements FeedBackApi {

	@Override
	public void getCpId(String id) {
		System.out.println("******inside Service Impl*****"+id);

	}

}
