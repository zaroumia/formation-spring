package fr.zaroumia.formation.spring._034;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonLoggerAspect {
	//
	// @Before("execution( public *
	// fr.zaroumia.formation.spring._034.UserService.*(..)) && args(username) &&
	// target(userService) ")
	// public void LogBefore(final JoinPoint joinPoint, final String username,
	// final UserService userService) {
	// System.out.println("Début : appel de la méthode " +
	// joinPoint.getSignature().getName() + " de la classe "
	// + joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement :
	// " + username);
	// }
	//
	// @After("execution( public *
	// fr.zaroumia.formation.spring._034.UserService.*(..)) && args(username) &&
	// target(userService) ")
	// public void LogAfter(final JoinPoint joinPoint, final String username,
	// final UserService userService) {
	// System.out.println("Fin : appel de la méthode " +
	// joinPoint.getSignature().getName() + " de la classe "
	// + joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement :
	// " + username);
	// }
	//
	// @AfterReturning(pointcut = "execution( public *
	// fr.zaroumia.formation.spring._034.UserService.*(..)) && args(username) &&
	// target(userService) ", returning = "isExiste")
	// public void LogAfterReturning(final JoinPoint joinPoint, final String
	// username, final UserService userService,
	// final boolean isExiste) {
	// System.out.println("Fin : appel de la méthode " +
	// joinPoint.getSignature().getName() + " de la classe "
	// + joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement :
	// " + username
	// + " avec la valeur de retour = " + isExiste);
	// }
	//
	// @AfterThrowing(pointcut = "execution( public *
	// fr.zaroumia.formation.spring._034.UserService.*(..)) && args(username) &&
	// target(userService) ", throwing = "exeception")
	// public void LogAfterThrowing(final JoinPoint joinPoint, final String
	// username, final UserService userService,
	// final Exception exeception) {
	// System.out.println("Fin : appel de la méthode " +
	// joinPoint.getSignature().getName() + " de la classe "
	// + joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement :
	// " + username
	// + " avec l'exception = " + exeception.getMessage());
	// }

	@Around("execution( public * fr.zaroumia.formation.spring._034.UserService.*(..)) && args(username) && target(userService)   ")
	public boolean LogAround(final ProceedingJoinPoint joinPoint, final String username, final UserService userService)
			throws Throwable {

		System.out.println("Début : appel de la méthode " + joinPoint.getSignature().getName() + " de la classe "
				+ joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement : " + username);

		boolean isExiste = (boolean) joinPoint.proceed();

		System.out.println("Fin : appel de la méthode " + joinPoint.getSignature().getName() + " de la classe "
				+ joinPoint.getSignature().getDeclaringTypeName() + " avec l'arguement : " + username
				+ " avec la valeur de retour = " + isExiste);

		return isExiste;
	}

}
