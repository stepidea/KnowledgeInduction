--select top 10 * from master..sysprocesses with(nolock)
--where blocked>0
SELECT TOP 10 *
FROM sys.dm_os_performance_counters WHERE counter_name LIKE 'Number of Deadlocksc%';
exec sp_who active --看看哪个引起的阻塞
exec sp_lock--看看锁住了那个资源id，objid ，select object_name(objid) 得到
dbcc inputbuffer(296)-- 看看是那个语句 143339575

--查询死锁
select request_session_id spid,OBJECT_NAME(resource_associated_entity_id) tableName
from sys.dm_tran_locks where resource_type='OBJECT'         

--处理死锁
declare @spid int
Set @spid = 116
declare @sql varchar(1000)
set @sql='kill '+cast(@spid as varchar)
exec(@sql)