package cn.tedu.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-hello")		//调用对应服务提供者
public interface HelloFeign {
	@RequestMapping("/hello/{name}")
	//代理提供者Controller，要求：统一返回值，返回值类型，函数名，参数，参数类型
	public String hello(
			@PathVariable("name") String name);

}
