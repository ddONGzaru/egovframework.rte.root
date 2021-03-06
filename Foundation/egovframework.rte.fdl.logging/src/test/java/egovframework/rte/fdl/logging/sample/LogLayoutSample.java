package egovframework.rte.fdl.logging.sample;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("logLayoutSample")
public class LogLayoutSample {

	// 일반적으로 아래와 같이 common logging API 를 사용하나
	// log4j 설정 정보를 testcase 에서 참조할 수 있도록 log4j logger 로 정의
	// 상호간에 casting 은 불가함에 유의!
	// protected Log log = LogFactory.getLog(this.getClass());
	protected Logger log = Logger.getLogger(this.getClass());

	public void executeSomeLogic() {
		log.debug("DEBUG - LogLayoutSample.executeSomeLogic executed");
		log.info("INFO - LogLayoutSample.executeSomeLogic executed");
		log.warn("WARN - LogLayoutSample.executeSomeLogic executed");
		log.error("ERROR - LogLayoutSample.executeSomeLogic executed");
		log.fatal("FATAL - LogLayoutSample.executeSomeLogic executed");
	}

	public Logger getTargetLogger() {
		return this.log;
	}

}
