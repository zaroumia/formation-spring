package fr.zaroumia.formation.spring._035;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonLoggerAspect {

	@Before("execution( public * fr.zaroumia.formation.spring._035.*.*(..) ) && target(userService) && args(username)")
	public void LogDebutMethode(final JoinPoint joinPoint, final UserService userService, final String username) {
		System.out.println("Début : appel de la méthode " + joinPoint.getSignature().getName() + " de la classe "
				+ userService.getClass().getSimpleName() + " avec l'arguement " + username);
	}

}
