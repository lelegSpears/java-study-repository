package datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2025-11-15");
		LocalDateTime d05 = LocalDateTime.parse("2025-11-15T06:50:30");
		Instant d06 = Instant.parse("2025-11-15T05:45:20Z");
		Instant d07 = Instant.parse("2025-11-15T05:45:20-03:00");
		LocalDate d08 = LocalDate.parse("14/10/2025", formato1);
		LocalDate d09 = LocalDate.parse("14/10/2025 03:20", formato2);
		LocalDate d10 = LocalDate.of(2025, 8, 12);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d08.format(formato1));
		System.out.println(formato3.format(d06));
		/* A norma ISO 8601 tem um padrão internacional para horarios tendo base o fuso horario Zero(Z = Zulu Time (UTC fuso zero)) */
	}

}