package com.wdcloud.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名称： com.wdcloud.test.action.TestAction.java</br>
 * 初始作者： Administrator</br>
 * 创建日期： 2017年12月9日</br>
 * 功能说明： 这里用一句话描述这个类的作用--此句话需删除 <br/>
 * =================================================<br/>
 * 修改记录：<br/>
 * 修改作者 日期 修改内容<br/>
 * ================================================<br/>
 * Copyright (c) 2010-2011 .All rights reserved.<br/>
 */
@RestController
public class TestAction {

	@GetMapping(value = "test")
	public Object test() {

		System.out.println("eclipse");
		System.out.println("idea");
		System.out.println("eclipse22");
		System.out.println("eclipse33");
		System.out.println("idea11");
		System.out.println("idea22");
		return null;
	}
}
