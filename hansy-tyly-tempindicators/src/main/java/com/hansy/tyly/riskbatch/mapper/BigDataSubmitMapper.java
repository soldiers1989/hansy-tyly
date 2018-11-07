package com.hansy.tyly.riskbatch.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hansy.tyly.riskbatch.model.BdDataModel;
import com.hansy.tyly.riskbatch.model.CustBill;
import com.hansy.tyly.riskbatch.model.SmsMessage;
import com.hansy.tyly.riskbatch.model.TScCustDcsRst;
import com.hansy.tyly.riskbatch.model.TScIntLog;

/**
 * @CreateTime:2017年11月2日上午11:45:54
 * @Description:大数据A5提交相关查询、插入操作接口
 */
public interface BigDataSubmitMapper {
	
	String queryParam(String paramId);
	
	List<CustBill> queryCustList(String busiDate);
	
	int insertCustBill(List<CustBill> list);
	
	int deleteCustBill();
	
	List<BdDataModel> queryCustBillList();
	
	int updateCustBill(Map<String, Object> inMap);
	
	int insertScIntLog(@Param("logList")List<TScIntLog> logList);
	
	List<BdDataModel> queryCustBillListForA7();
	
	int insertDscRstInfo(@Param("dscRstInfo")List<TScCustDcsRst> logList);
	
	List<SmsMessage> querySmsMessageList(String busiDate);
	
	int updateSmsMessageInfo(Map<String, Object> inMap);
}
