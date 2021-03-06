package cn.com.yusys.yusp.workflow.repository.mapper;

import java.util.List;

import cn.com.yusys.yusp.workflow.domain.dto.QueryModel;
import cn.com.yusys.yusp.workflow.dto.result.ResultInstanceTodoDto;

public interface WorkflowBenchMapper {
	
	/**
	 * 用户待办实例查询
	 * @param queryModel
	 * @return
	 */
	List<ResultInstanceTodoDto> getInstanceInfoUserTodo(QueryModel queryModel);
	
	/**
	 * 用户已办查询
	 * @param queryModel
	 * @return
	 */
	List<ResultInstanceTodoDto> getInstanceInfoUserDone(QueryModel queryModel);
	
	/**
	 * 用户办结查询
	 * @param queryModel
	 * @return
	 */
	List<ResultInstanceTodoDto> getInstanceInfoUserHis(QueryModel queryModel);

}