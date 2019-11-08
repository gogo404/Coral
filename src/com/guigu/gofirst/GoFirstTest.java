package com.guigu.gofirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
// 也可以标注在类上给请求加一个限制的父路径
@RequestMapping(value="/test")
@Controller		
public class GoFirstTest {
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String Test1() {
		System.out.println("gofirst with hello ");
		return "success";
	}
	
	@RequestMapping(value="/helloo",method = RequestMethod.GET)
	public void Test2(){
		
		System.out.println("helloo请求已经处理");
	}
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String Test3(String name,String value) {
		System.out.println("gofirst with hello ");
		System.out.println("name = " + name);
		System.out.println("value = " + value);
		return "success";
	}
}
