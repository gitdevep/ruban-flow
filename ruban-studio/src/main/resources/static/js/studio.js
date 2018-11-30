var studio = {
    nodeType:{
        name:"节点类型",
        key:"nodeType",
        type:"select",
        value:{0:"普通节点",1:"单选节点",2:"多选节点",3:"条件单选节点",4:"条件多选节点",5:"自动运行节点",C:"汇总节点",S:"开始节点",E:"结束节点"},
        readOnly:true
    },
    label:{
        name:"节点名称",
        key:"label",
        type:"text",
        readOnly:false
    },
    nodeSign:{
        name:"节点标识",
        key:"nodeSign",
        type:"text",
        readOnly:false
    },
    opUsersType:{
        name:"人员指定",
        key:"opUsersType",
        type:"select",
        value:{0:"人员列表选择",1:"上一办理人指定",2:"系统指定"},
        readOnly:false
    },
    nodeUser:{
        name:"处理人员",
        key:"nodeUser",
        type:"text",
        readOnly:false
    },
    computeType:{
        name:"人员计算",
        key:"computeType",
        type:"select",
        value:{0:"并集",1:"交集",2:"原始配置"},
        readOnly:false
    },
    handleType:{
        name:"办理类型",
        key:"handleType",
        type:"select",
        value:{0:"单人签收办理",1:"单人竞争办理",2:"多人顺序办理",3:"多人并行办理",4:"多人并行按条件转移",5:"多人顺序可结束",6:"多人并行可结束"},
        readOnly:false
    },
    isEndBeanId:{
        name:"转移条件",
        key:"isEndBeanId",
        type:"text",
        readOnly:false
    },
    bizBeanId:{
        name:"业务处理",
        key:"bizBeanId",
        type:"text",
        readOnly:false
    },
    reDoUserSelect:{
        name:"重办人员",
        key:"reDoUserSelect",
        type:"select",
        value:{1:"重新发送",0:"上次办理人"},
        readOnly:false
    },
    callBack:{
        name:"打回",
        key:"callBack",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    returnBack:{
        name:"退回",
        key:"returnBack",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    jump:{
        name:"跳转",
        key:"jump",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    change:{
        name:"转办",
        key:"change",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    assist:{
        name:"协办",
        key:"assist",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    urged:{
        name:"催办",
        key:"urged",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    refuse:{
        name:"否决",
        key:"refuse",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    tackBack:{
        name:"拿回",
        key:"tackBack",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    entrust:{
        name:"委托",
        key:"entrust",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    copy:{
        name:"抄送",
        key:"copy",
        type:"select",
        value:{0:"不允许",1:"允许"},
        readOnly:false
    },
    copyUsers:{
        name:"抄送人员",
        key:"copyUsers",
        type:"text",
        readOnly:false
    },
    nodeLevel:{
        name:"节点级别",
        key:"nodeLevel",
        type:"text",
        readOnly:false
    },
    isContinueBeanId:{
        name:"路由条件",
        key:"isContinueBeanId",
        type:"text",
        readOnly:false
    },
    strategyBeanId:{
        name:"分配策略",
        key:"strategyBeanId",
        type:"text",
        readOnly:false
    },
    noticeType:{
        name:"待办通知",
        key:"noticeType",
        type:"select",
        value:{0:"不通知",1:"消息通知",2:"邮件通知",3:"短信通知",4:"所有方式通知"},
        readOnly:false
    }
}