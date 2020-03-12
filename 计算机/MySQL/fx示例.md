1. DATE_ADD(date,INTERVAL expr type) 函数向日期添加指定的时间间隔

2. DATE_SUB(date,INTERVAL expr type) 函数从日期减去指定的时间间隔

   date 参数是合法的日期表达式。expr 参数是您希望添加的时间间隔。

```mysql
DATE_ADD('2019-11-12',INTERVAL 10 MICROSECOND)   --增加10微秒
DATE_ADD('2019-11-12',INTERVAL 10 SECOND) --增加10秒
DATE_ADD('2019-11-12',INTERVAL 10 MINUTE) --增加10分钟
DATE_ADD('2019-11-12',INTERVAL 10 HOUR) --增加10小时
DATE_ADD('2019-11-12',INTERVAL 10 DAY) --增加10天
DATE_ADD('2019-11-12',INTERVAL 1 WEEK) --增加一周
DATE_ADD('2019-11-12',INTERVAL 10 MONTH) --增加10个月
DATE_ADD('2019-11-12',INTERVAL 1 QUARTER) --增加3个月
DATE_ADD('2019-11-12',INTERVAL 10 YEAR) --增加10个月
```

3. DATEDIFF(date1,date2) 函数返回两个日期之间的天数。

   date1 和 date2 参数是合法的日期或日期/时间表达式；只有值的日期部分参与计算。

```mysql
SELECT DATEDIFF('2008-11-30','2008-11-28')  DiffDate;
```

4. DATE_FORMAT(date,format) 函数用于以不同的格式显示日期/时间数据。

   date 参数是合法的日期。format 规定日期/时间的输出格式。

```mysql
SELECT NOW() --返回当前的日期和时间
CURDATE() --返回当前的日期
CURTIME() --返回当前的时间
DATE(NOW()) --提取返回当前的日期
DATE_FORMAT(NOW(),'%a')  --缩写星期名
DATE_FORMAT(NOW(),'%b')  --缩写月名
DATE_FORMAT(NOW(),'%c')  --月数值
DATE_FORMAT(NOW(),'%D')  --带有英文前缀的月中的天
DATE_FORMAT(NOW(),'%d')  --月的天数值00到31,
DATE_FORMAT(NOW(),'%e')  --月的天数值0至31
DATE_FORMAT(NOW(),'%f')  --微秒
DATE_FORMAT(NOW(),'%H')  --小时00至23
DATE_FORMAT(NOW(),'%h')  --小时01至12
DATE_FORMAT(NOW(),'%I')  --小时01至12
DATE_FORMAT(NOW(),'%i')  --分钟数值00至59
DATE_FORMAT(NOW(),'%j')  --年的天001至366
DATE_FORMAT(NOW(),'%k')  --小时0至23
DATE_FORMAT(NOW(),'%l')  --小时1至12
DATE_FORMAT(NOW(),'%M')  --月名
DATE_FORMAT(NOW(),'%m')  --月数值00至12
DATE_FORMAT(NOW(),'%r')  --时间12小时
DATE_FORMAT(NOW(),'%S')  --秒00至59
DATE_FORMAT(NOW(),'%s')  --秒00至59
DATE_FORMAT(NOW(),'%T')  --时间24小时
DATE_FORMAT(NOW(),'%U')  --周00至53星期日是一周的第一天
DATE_FORMAT(NOW(),'%u')  --周00至53星期一是一周的第一天
DATE_FORMAT(NOW(),'%W')  --星期名
DATE_FORMAT(NOW(),'%w')  --周的天0星期日6星期六
DATE_FORMAT(NOW(),'%Y')  --年4位
DATE_FORMAT(NOW(),'%y')  --年2位
DATE_FORMAT(NOW(),'%V')  --周01至53星期日是一周的第一天与%X使用
DATE_FORMAT(NOW(),'%v')  --周01至53星期一是一周的第一天与%x使用
DATE_FORMAT(NOW(),'%X')  --年其中的星期日是周的第一天4位与%V使用
DATE_FORMAT(NOW(),'%x')  --年其中的星期一是周的第一天4位与%v使用
```

5. EXTRACT() 函数用于返回日期/时间的单独部分，比如年、月、日、小时、分钟等等。

```mysql
EXTRACT(SECOND_MICROSECOND FROM NOW())   --获取秒到毫秒
EXTRACT(MINUTE_MICROSECOND FROM NOW())     --获取分到毫秒
EXTRACT(MINUTE_SECOND FROM NOW())                 --获取分到秒
EXTRACT(HOUR_MICROSECOND FROM NOW())        --获取小时到毫秒
EXTRACT(HOUR_SECOND FROM NOW())                    --获取小时到秒
EXTRACT(HOUR_MINUTE FROM NOW())                      --获取小时到分
EXTRACT(DAY_MICROSECOND FROM NOW())            --获取天到毫秒
EXTRACT(DAY_SECOND FROM NOW())                        --获取天到秒
EXTRACT(DAY_MINUTE FROM NOW())                         --获取天到分
EXTRACT(DAY_HOUR FROM NOW())                            --获取天到小时
EXTRACT(YEAR_MONTH FROM NOW())                       --获取年到月
```

6. CONCAT(str1,str2,…)  返回结果为连接参数产生的字符串。如有任何一个参数为NULL ，则返回值为 NULL。

```mysql
SELECT CONCAT('11','22','33'),CONCAT('11','22',NULL);
```

7. CONCAT_WS(separator,str1,str2,...) 代表 CONCAT With separator，是CONCAT()的特殊形式。
   第一个参数是其它参数的分隔符。分隔符的位置放在要连接的两个字符串之间。
   分隔符可以是一个字符串，也可以是其它参数。

```mysql
select concat_ws(',','11','22','33'),concat_ws(',','11','22',NULL),concat_ws(NULL,'11','22','33');
```

8. group_concat([DISTINCT] 要连接的字段 [Order BY ASC/DESC 排序字段] [Separator '分隔符'])

```mysql
select w3cschool_author,
group_concat(w3cschool_title),
group_concat(w3cschool_title separator ';'),
group_concat(w3cschool_title ORDER BY w3cschool_title ASC)
from w3cschool_tbl group by w3cschool_author;
```

9. repeat()函数,用来复制字符串

```mysql
SELECT repeat('ab',2);
```

10. left（str, length）从左开始截取字符串

11. right（str, length）从右开始截取字符串

12. substring（str, pos）截取字符串

13. substring（str, pos, length）截取字符串

14. substring_index（str,delim,count）按关键字截取字符串 

    str是被截取字段，length 截取长度, pos 从第几位开始截取，delim 关键字，count 关键字出现的次数

```mysql
SELECT LEFT('www.w3cschool.cn',10)
,RIGHT('www.w3cschool.cn',10)
,SUBSTRING('www.w3cschool.cn',5)
,SUBSTRING('www.w3cschool.cn',-2)
,SUBSTRING('www.w3cschool.cn',8,6)
,SUBSTRING_INDEX("www.w3cschool.cn",".",2)
,SUBSTRING_INDEX("www.w3cschool.cn",".",-2); 
```

15. substr(string string,num start,num length)

    string为字符串；start为起始位置；length为长度。注意：mysql中的start是从1开始的。 

```mysql
SELECT SUBSTR('www.w3cschool.cn',0,10)
,SUBSTR('www.w3cschool.cn',1,10)
,SUBSTR('www.w3cschool.cn',10,10);
```

16. ABS(X) 返回X的绝对值
17. SIGN(X) 以 -1、0 或 1 方式返回参数的符号
18. MOD(N,M) 返回 N 被 M 除后的余数
19. FLOOR(X) 返回不大于 X 的最大整数值
20.  CEILING(X) 返回不小于 X 的最小整数
21.  ROUND(X) 返回参数 X 四舍五入到最近的整数
22.  ROUND(X,D) 返回一个数字四舍五入到 D 个小数

```mysql
SELECT -2,ABS(-9),SIGN(-5),MOD(234, 10),FLOOR(1.6),CEILING(1.1),ROUND(-1.58),ROUND(1.298, 1);
```

23. DIV 整除
24.  EXP(X) 返回值 e (自然对数的底) 的 X 次方
25.  LN(X) 返回 X 的自然对数
26.  LOG(X)
27.  LOG(B,X) 如果以一个参数调用，它返回 X 的自然对数
28.  LOG2(X) 返回 X 的以 2 为底的对数
29.  LOG10(X) 返回 X 以 10 为底的对数
30.  POWER(X,Y) 返回 X 的 Y 幂
31.  SQRT(X)返回 X 的非否平方根

```mysql
SELECT 5 DIV 2
,EXP(1)
,LN(2)
,LOG(2)
,LOG(2,65536)
,LOG2(65536)
,LOG10(100)
,POWER(2,2)
,SQRT(4);
```

32. PI()返回 PI 值(圆周率)
33.  COS(X)返回 X 的余弦，在这里，X 以弧度给出
34.  SIN(X)返回 X 的正弦
35.  TAN(X)返回 X 的正切

```mysql
SELECT PI(),COS(PI()),SIN(PI()),TAN(PI()+1);
```

36. RAND() 返回一个范围在 0 到 1.0 之间的随机浮点值
37.  RAND(N) N 被指定为种子值使用，用于产生一个可重复的数值

```mysql
SELECT RAND()
,RAND(20)
,RAND()
,RAND(20);
```

38. LEAST(X,Y,...) 有两个或更多个参数，返回最小(最小值)的参数
39.  GREATEST(X,Y,...) 返回最大(最大值)参数
40.  DEGREES(X) 将参数 X 从弧度转换为角度
41.  RADIANS(X)将参数 X 从角度转换为弧度

```mysql
SELECT LEAST(2,0)
,LEAST(34.0,3.0,5.0,767.0)
, GREATEST(34.0,3.0,5.0,767.0)
,DEGREES(PI())
,RADIANS(90);
```

42. TRUNCATE(X,D)将数值 X 截到 D 个小数，然后返回。

     如果 D 为 0，结果将不包含小数点和小数部分; 如果 D 是负数，那么数字的整个部分被对准零位输出

```mysql
SELECT TRUNCATE(1.223,1),TRUNCATE(1.999,0),TRUNCATE(122,-2);
```

十进值小数在计算机中通常不以精确数字存储，而是双精度型的值

```mysql
SELECT TRUNCATE(10.28*100,0); --出现1027则是10.28 实际上是以某些像 10.2799999999999999 的形式被存储的
```

