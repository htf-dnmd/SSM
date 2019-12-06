package cn.qm.service;

import cn.qm.pojo.Customer;
import cn.qm.pojo.QueryVo;
import cn.qm.util.Page;

public interface CustomerService {

	public Page getCustomerByQueryVo(QueryVo queryVo);

	public Customer selectById(Integer id);
	
	

}
