java-ascii-table
================

a fork of http://bethecoder.com/applications/products/asciiTable.action

ASCII TABLE (http://code.google.com/p/java-ascii-table/) is a simple framework for generating ASCII tables printable in console. It also provides enhanced APIs to get table buffer which can be rendered in Web pages. The table may or may not have a header. By default all headers are aligned center and data in each row is aligned right. It provides the following APIs:

```
public void printTable(String[] header, String[][] data);
public void printTable(String[] header, String[][] data, int dataAlign);
public void printTable(String[] header, int headerAlign, String[][] data, int dataAlign);

public String getTable(String[] header, String[][] data);
public String getTable(String[] header, String[][] data, int dataAlign);
public String getTable(String[] header, int headerAlign, String[][] data, int dataAlign);

public String getTable(ASCIITableHeader[] headerObjs, String[][] data);
public void printTable(ASCIITableHeader[] headerObjs, String[][] data);

public String getTable(IASCIITableAware asciiTableAware);
public void printTable(IASCIITableAware asciiTableAware);
```

The print version of APIs print the ASCII table to console where as get version of APIs return the ASCII table buffer as a string. User can align both header and data. The alignment constants are shown below,

```
ASCIITable.ALIGN_LEFT   - Header/data left alignment
ASCIITable.ALIGN_RIGHT  - Header/data right alignment
ASCIITable.ALIGN_CENTER - Header/data center alignment
The following snippet shows its simple usage,
String [] header = { "User Name", "Salary", "Designation", "Address", "Lucky#" };
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
```

`ASCIITable.getInstance().getTable(header, data)%` gives the following output:

```
+-----------+--------+-------------+------------------------+---------+
| User Name | Salary | Designation |         Address        |  Lucky# |
+-----------+--------+-------------+------------------------+---------+
|       Ram |   2000 |     Manager |        #99, Silk board |    1111 |
|       Sri |  12000 |   Developer |             BTM Layout |   22222 |
|    Prasad |  42000 |        Lead | #66, Viaya Bank Layout |  333333 |
|       Anu | 132000 |          QA |             #22, Vizag | 4444444 |
|       Sai |  62000 |   Developer |         #3-3, Kakinada |         |
|    Venkat |   2000 |     Manager |                        |         |
|       Raj |  62000 |             |                        |         |
|       BTC |        |             |                        |         |
+-----------+--------+-------------+------------------------+---------+
```

ASCIITableHeader class gives fine control over the alignment of header and data rows.

```
ASCIITableHeader[] headerObjs = {
	new ASCIITableHeader("User Name", ASCIITable.ALIGN_LEFT),
	new ASCIITableHeader("Salary"),
	new ASCIITableHeader("Designation", ASCIITable.ALIGN_CENTER),
	new ASCIITableHeader("Address", ASCIITable.ALIGN_LEFT),
	new ASCIITableHeader("Lucky#", ASCIITable.ALIGN_RIGHT),
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
```

`ASCIITable.getInstance().getTable(headerObjs, data)` gives the following output:

```
+-----------+--------+-------------+------------------------+---------+
| User Name | Salary | Designation |         Address        |  Lucky# |
+-----------+--------+-------------+------------------------+---------+
| Ram       |   2000 |   Manager   | #99, Silk board        |    1111 |
| Sri       |  12000 |  Developer  | BTM Layout             |   22222 |
| Prasad    |  42000 |     Lead    | #66, Viaya Bank Layout |  333333 |
| Anu       | 132000 |      QA     | #22, Vizag             | 4444444 |
| Sai       |  62000 |  Developer  | #3-3, Kakinada         |         |
| Venkat    |   2000 |   Manager   |                        |         |
| Raj       |  62000 |             |                        |         |
| BTC       |        |             |                        |         |
+-----------+--------+-------------+------------------------+---------+
```
