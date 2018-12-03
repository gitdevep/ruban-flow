# ruban-flow
鲁班工作流引擎，基于springboot的分布式高效工作流引擎
## 流程引擎
完成流程流转【30%】【提交、签收、撤销签收、拿回、打回、退回、挂起、唤醒、催办、转办、协办、否决、跳转、委托、抄送、会签等等】  
节点路由支持【完成】【普通节点、单选节点、多选节点、条件单选节点、条件多选节点、自动运行节点、汇总节点、开始节点、结束节点】  
办理类型支持【完成】【单人签收办理、单人竞争办理、多人顺序办理、多人并行办理、按转移条件、多人顺序可结束、多人并行可结束】  
## 流程绘制【完成】
![Image text](https://github.com/figuewang/ruban-flow/blob/master/ruban-studio/src/main/resources/static/images/studio2.png)
## 数据同步【完成】
组织机构信息同步到缓存，使得流程流转高效
## 业务处理【完成】后业务处理
本地bean方式;   
fegin方式：负载均衡外接系统，且分布式事物一致;  
## 流程热发布【完成】
流程图热发布，无需系统重启
## 消息通知【完成】
暂时支持邮件
## 人员计算【完成】
求交集、并集


