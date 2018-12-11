package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication			//消费者
@EnableFeignClients 			//开启Feign
public class RunAppFeign {
	public static void main(String[] args) {
		SpringApplication.run(RunAppFeign.class, args);
	}
}
