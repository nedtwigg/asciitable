java-ascii-table
================

Data-driven test-case:

```
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
```

Manual test-case:

```
String [] header = { "User Name", 
		"Salary", "Designation",
		"Address", "Lucky#"
};

String[][] data = {
		{ "Ram", "2000", "Manager", "#99, Silk board", "1111"  },
		{ "Sri", "12000", "Developer", "BTM Layout", "22222" },
		{ "Prasad", "42000", "Lead", "#66, Viaya Bank Layout", "333333" },
		{ "Anu", "132000", "QA", "#22, Vizag", "4444444" },
		{ "Sai", "62000", "Developer", "#3-3, Kakinada"  },
		{ "Venkat", "2000", "Manager"   },
		{ "Raj", "62000"},
		{ "BTC"},
};

String expected = 
		"+-----------+--------+-------------+------------------------+---------+\n" +
		"| User Name | Salary | Designation | Address                | Lucky#  |\n" +
		"+-----------+--------+-------------+------------------------+---------+\n" +
		"|       Ram |   2000 |     Manager |        #99, Silk board |    1111 |\n" +
		"|       Sri |  12000 |   Developer |             BTM Layout |   22222 |\n" +
		"|    Prasad |  42000 |        Lead | #66, Viaya Bank Layout |  333333 |\n" +
		"|       Anu | 132000 |          QA |             #22, Vizag | 4444444 |\n" +
		"|       Sai |  62000 |   Developer |         #3-3, Kakinada |         |\n" +
		"|    Venkat |   2000 |     Manager |                        |         |\n" +
		"|       Raj |  62000 |             |                        |         |\n" +
		"|       BTC |        |             |                        |         |\n" +
		"+-----------+--------+-------------+------------------------+---------+\n";

Assert.assertEquals(expected, Table.getTable(header, data));
```

This project is a fork of http://bethecoder.com/applications/products/asciiTable.action by K Venkata Sudhakar. 

We've stripped out most of the API of the original, but all of the rendering logic of the original remains.  Many thanks to K Venkata.
