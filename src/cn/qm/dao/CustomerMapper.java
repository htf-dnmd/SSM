package cn.qm.dao;

import java.util.List;

import cn.qm.pojo.Customer;
import cn.qm.pojo.QueryVo;

public interface CustomerMapper {
	
	public Integer getCountByVo(QueryVo vo);

	public List<Customer> getCustomerByQueryVo(QueryVo vo);

	public Customer selectById(Integer id);

}
