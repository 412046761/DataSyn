# DataSyn
基于xxl_job的不同数据源表数据同步

---------------
### 作用概况：定时从A库往B库同步数据，同步的表必须结构相同。

----------------

#### 使用配置：

1. 执行任务调度中心初始化SQL。

![Image](http://q4120.gitee.io/picture/DataSyn/1.png)

2. admin 模块 修改数据库，刚才执行脚本的数据库。

![Image](http://q4120.gitee.io/picture/DataSyn/2.png)

3. executor模块修改数据源信息

![Image](http://q4120.gitee.io/picture/DataSyn/3.png)

70 调度源库 74调度目的库

4. Db70TODb74Job.class getTableName()方法中配置需要同步的表

![Image](http://q4120.gitee.io/picture/DataSyn/4.png)

------



#### 使用方法：

1. 启动Admin模块 访问地址：http://127.0.0.1:8080/xxl-job-admin/

   ![Image](http://q4120.gitee.io/picture/DataSyn/2.1.png)

2. 选择执行器管理,启动executor模块， online刷新能看到执行器注册成功

![Image](http://q4120.gitee.io/picture/DataSyn/2.2.png)

3. 任务管理，新增任务JOB配置：testHandler

![Image](http://q4120.gitee.io/picture/DataSyn/2.3.png)

点执行时代码进入

com.xxl.job.executor.service.jobhandler.Db70TODb74Job任务

![Image](http://q4120.gitee.io/picture/DataSyn/2.4.png)

![Image](http://q4120.gitee.io/picture/DataSyn/2.5.png)

4. 配置定时调此任务

![Image](http://q4120.gitee.io/picture/DataSyn/2.6.png)

##### 功能测试:

1. 这里70源库用demo库,有三条数据 测试表为tb_area

   ![Image](http://q4120.gitee.io/picture/DataSyn/2.7.png)

2. 74调度目的库为hxxdata,

   ![Image](http://q4120.gitee.io/picture/DataSyn/2.8.png)

3. 执行

![Image](http://q4120.gitee.io/picture/DataSyn/2.9.png)

4. 查看调度结果

![Image](http://q4120.gitee.io/picture/DataSyn/2.91.png)

5. 查看目的库数据

![Image](http://q4120.gitee.io/picture/DataSyn/2.92.png)