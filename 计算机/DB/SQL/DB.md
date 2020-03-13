SQL （Structured Query Language，结构化查询语言）用于存储、操作存储在关系型数据库中数据的计算机语言。

关系型数据库（MySQL、MS Access、Oracle、Sybase、Informix、Postgres SQL 和 SQL Server 等）管理系统都使用 SQL 作为其标准数据库语言。是一个 ANSI（American National Standard Institute，美国国家标准协会）标准。

|                     | 命令   | 描述                                   |
| ------------------- | ------ | -------------------------------------- |
| 数据定义语言（DDL） | CREATE | 创建新的表、视图或者其他数据库中的对象 |
|                     | ALTER  | 修改现存数据库对象                     |
|                     | DROP   | 删除表、视图或者数据库中的其他对象     |
| 数据操纵语言        | SELECT | 检索数据                               |
|                     | INSERT | 插入新记录                             |
|                     | UPDATE | 修改记录                               |
|                     | DELETE | 删除记录                               |
| 数据控制语言        | GRANT  | 赋予用户特权                           |
|                     | REVOKE | 收回赋予用户的特权                     |

RDBMS（**R**elational **D**ata**B**ase **M**anagement **S**ystem，关系型数据库管理系统）

- **数据库**（Database）：表的集合。
- **表**（Table）：相互关联的数据记录的集合，由一系列的行和列组成。
- **列**（Column）：每一列（数据元素）都包含着同种类型的数据，比如邮编。
- **行**（Row）：行（又被称为元组、项或记录）是一组相关数据，比如有关订阅量的数据。
- **冗余**（Redundancy）：存储两次数据，以便使系统更快速。
- **主键**（Primary Key）：主键是唯一的。同一张表中不允许出现同样两个键值。一个键值只对应着一行。
- **外键**（Foreign Key）：用于连接两张表。
- **复合键**（Compound Key）：复合键（又称组合键）是一种由多列组成的键，因为一列并不足以确定唯一性。
- **索引**（Index）：它在数据库中的作用就像书后的索引一样。
- **引用完整性**（Referential Integrity）：用来确保外键一直指向已存在的一行。