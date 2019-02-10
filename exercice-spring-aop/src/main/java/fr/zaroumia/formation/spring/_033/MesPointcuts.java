package fr.zaroumia.formation.spring._033;

import org.aspectj.lang.annotation.Pointcut;

public class MesPointcuts {
	@Pointcut("execution( public * fr.zaroumia.formation.spring._033.UserService.*(..) )")
	public void toutesLesMethodesDeUserService() {

	}
}
