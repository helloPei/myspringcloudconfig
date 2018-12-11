package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RunAppConfigServer {
	//服务端配置
	public static void main(String[] args) {
		SpringApplication.run(RunAppConfigServer.class, args);
	}
}