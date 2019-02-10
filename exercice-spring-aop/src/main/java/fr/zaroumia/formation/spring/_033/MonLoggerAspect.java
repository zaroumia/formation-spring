package fr.zaroumia.formation.spring._033;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonLoggerAspect {

	// @Before("fr.zaroumia.formation.spring._033.MesPointcuts.toutesLesMethodesDeUserService()")
	// public void LogDebutMethode(final JoinPoint joinPoint) {
	// System.out.println("Début : appel de la méthode " +
	// joinPoint.getSignature().getName() + " de la classe "
	// + joinPoint.getSignature().getDeclaringTypeName());
	// }

	@Before("toutesLesMethodesDeUserServiceAvecWithin()")
	public void LogDebutMethode(final JoinPoint joinPoint) {
		System.out.println("Début : appel de la méthode " + joinPoint.getSignature().getName() + " de la classe "
				+ joinPoint.getSignature().getDeclaringTypeName());
	}

	@Pointcut("execution( public * fr.zaroumia.formation.spring._033.UserService.*(..) )")
	public void toutesLesMethodesDeUserService() {

	}

	@Pointcut("execution( public boolean fr.zaroumia.formation.spring._033.UserService.*(..) )")
	public void toutesLesMethodesDeUserServiceRetournantUnBoolean() {

	}

	@Pointcut("execution( public * fr.zaroumia.formation..*(..) )")
	public void toutesLesMethodesDuPackageFormation() {

	}

	@Pointcut("within(fr.zaroumia.formation.spring._033.UserService)")
	public void toutesLesMethodesDeUserServiceAvecWithin() {

	}

}
