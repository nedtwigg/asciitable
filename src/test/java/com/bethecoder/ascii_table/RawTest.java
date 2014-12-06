package com.bethecoder.ascii_table;

import org.junit.Assert;
import org.junit.Test;

public class RawTest {
	@Test
	public void raw() {
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
	}
}
