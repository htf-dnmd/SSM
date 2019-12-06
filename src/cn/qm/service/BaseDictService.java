package cn.qm.service;

import java.util.List;

import cn.qm.pojo.BaseDict;

public interface BaseDictService {
	
	public List<BaseDict> getBaseDictsByCode(String code);
}
