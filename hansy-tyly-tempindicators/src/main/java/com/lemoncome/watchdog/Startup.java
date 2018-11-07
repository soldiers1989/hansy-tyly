package com.lemoncome.watchdog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lemoncome.watchdog.core.holder.SpringContextHolder;

/**
 * Created by MIfengHe on 2017/10/30.
 */
@SpringBootApplication(exclude = {MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})
@EnableTransactionManagement
public class Startup {
    private static final Logger LOGGER = LoggerFactory.getLogger(Startup.class);
    public static String BUSI_DATE = "";

    @Bean
    public SpringContextHolder getSpringContextHolder() {
        return new SpringContextHolder();
    }

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
    

    @Bean
    public CommandLineRunner printRunEnvInfo(ApplicationContext applicationContext) {
        return args -> {
            LOGGER.info("# ————————————————————————————————————————————————— ");
            LOGGER.info("# 看家狗跑批系统(Watchdog Tempindicators V1.0.0) 启动");
            LOGGER.info("# 系统运行环境：" + applicationContext.getEnvironment().getProperty("spring.profiles.active", "default(默认)"));
            LOGGER.info("# 系统临时目录：" + applicationContext.getEnvironment().getProperty("java.io.tmpdir"));
            LOGGER.info("# ————————————————————————————————————————————————— ");
        };
    }
    
  /*  @Bean
    public CommandLineRunner startService(ApplicationContext applicationContext) {
        return args -> {
        	TempindicatorsService testService = applicationContext.getBean(TempindicatorsService.class);
        	testService.queryTempindicators();
        	String serviceName = applicationContext.getEnvironment().getProperty("service.name");
        	if (StringUtils.isBlank(serviceName)) throw new ServiceException("请提供服务名称[--service.name=?]");
        	BUSI_DATE = applicationContext.getEnvironment().getProperty("service.busiDate");
        	//if (StringUtils.isBlank(BUSI_DATE)) throw new ServiceException("请提供业务日期[--service.busiDate=?],格式为[2017-10-09]...");
        	*//**
        	 * serviceName服务名：
        	 * 110->查询风控具体指标结果(查A7明细)
        	 * 111->风控A5接口提交
        	 * 112->风控A7接口提交(查询A5结果)
        	 * 113->机构短信通知服务
        	 * *//*
        	switch (serviceName) {
			case "110":
				applicationContext.getBean(TempindicatorsService.class).queryTempindicators();
				break;
			case "111":
				applicationContext.getBean(LemonA5SubmitService.class).startService();
				break;
			case "112":
				applicationContext.getBean(LemonA7QueryService.class).startService();
				break;
			case "113":
				applicationContext.getBean(OrgMessageService.class).startService();
				break;
			default:
				throw new ServiceException(MessageFormat.format("服务[--service.name={0}]暂不支持", serviceName));
			}
        };
    }*/

}
