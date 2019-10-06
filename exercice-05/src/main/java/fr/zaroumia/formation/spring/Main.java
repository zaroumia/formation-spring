package fr.zaroumia.formation.spring;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public class Main {

	public static void main(final String[] args) {
		DateTime d1 = new DateTime(2018, 12, 31, 0, 0);
		DateTime d2 = new DateTime(9999, 12, 31, 0, 0);

		DateTime d3 = new DateTime(2018, 12, 30, 0, 0);
		DateTime d4 = new DateTime(2019, 06, 17, 0, 0);

		Interval periodeValidite = new Interval(d1, d2);
		Interval periodeRetropolation = new Interval(d3, d4);
		System.out.println(periodeValidite.overlap(periodeRetropolation));

	}
}
