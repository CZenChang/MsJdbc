# MsJdbc
JDBC

## JDBC uri 功能控制
jdbc:mariadb://localhost:3306/{Name}?  
<font color=#fe5555> useServerPrepStmts=ture&cachePrepStmts=true</font>  
- 使用mysql的预编译对象PrepateStatement时，一定需要设置useServerPrepStmts=true开启服务器预编译功能，设置cachePrepStmts=true开启客户端对预编译对象的缓存。  
- 預設是false  
-  加快運行速度
  
&rewriteBatchedStatements=true  
- 執行 pstmt.executeBatch() 要打開才有真正執行

&sessionVariables=wait_timeout=1800000  
- session級的wait_timeout=1800000秒
- 預設是8小時
- 此功能為connect sleep狀態wait超過時間就斷線
