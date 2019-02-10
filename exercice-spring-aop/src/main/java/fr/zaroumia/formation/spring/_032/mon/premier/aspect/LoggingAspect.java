package fr.zaroumia.formation.spring._032.mon.premier.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution( public * fr.zaroumia.formation.spring._032.mon.premier.aspect.UserService.*(..) )")
	public void logDebut(final JoinPoint joinPoint) {
		System.out.println("Début : appel à la methode " + joinPoint.getSignature().getName() + " dans la classe "
				+ joinPoint.getSignature().getDeclaringTypeName());
	}

	@After("execution( public * fr.zaroumia.formation.spring._032.mon.premier.aspect.UserService.*(..) )")
	public void logFin(final JoinPoint joinPoint) {
		System.out.println("Fin : appel à la methode " + joinPoint.getSignature().getName() + " dans la classe "
				+ joinPoint.getSignature().getDeclaringTypeName());
	}

}
