package cn.qm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qm.pojo.BaseDict;
import cn.qm.pojo.Customer;
import cn.qm.pojo.QueryVo;
import cn.qm.service.BaseDictService;
import cn.qm.service.CustomerService;
import cn.qm.util.Page;

@Controller
public class CustomerController {
	
	@Autowired
	private BaseDictService dictService;
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo){
		//查詢顯示條件
		List<BaseDict> fromType = dictService.getBaseDictsByCode("002");
		List<BaseDict> industryType = dictService.getBaseDictsByCode("001");
		List<BaseDict> levelType = dictService.getBaseDictsByCode("006");
		
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		System.out.println("1111");
		Page<Customer> page = customerService.getCustomerByQueryVo(queryVo);
		
		model.addAttribute("page", page);
		model.addAttribute("vo", queryVo);
		
		return "customer";
	}

	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Integer id){
		Customer customer = customerService.selectById(id);
		return customer;
		
	}
}
