package com.bethecoder.ascii_table;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DataTest {
	@Test
	public void data() {
		List<Person> persons = Arrays.asList(
				new Person("Rick", "Sanchez", 70),
				new Person("Morty", "Smith", 14)
				);
		
		String actual = Table.getTable(persons, Arrays.asList(
				new Column("First").with(p -> p.first),
				new Column("Last").with(p -> p.last),
				new Column("Age").with(p -> Integer.toString(p.age))
				));
		
		String expected = 
				"+-------+---------+-----+\n" +
				"| First | Last    | Age |\n" +
				"+-------+---------+-----+\n" +
				"|  Rick | Sanchez |  70 |\n" +
				"| Morty |   Smith |  14 |\n" +
				"+-------+---------+-----+\n";

		Assert.assertEquals(expected, actual);
	}
	
	private static class Person {
		public final String first;
		public final String last;
		public final int age;
		
		public Person(String first, String last, int age) {
			this.first = first;
			this.last = last;
			this.age = age;
		}
	}
}
