package com.service;

import java.util.List;
import com.bean.Goods;

/**
 * service层接口
 */
public interface GoodsService {

	/**
	 * 查询所有的数据
	 */
	List<Goods> selectAll();

	/**
	 * 根据主键查询一个对象
	 */
	Goods selectByPrimaryKey(Integer id);

	/**
	 * 根据主键删除一个对象
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 根据主键修改一个对象
	 */
	int updateByPrimaryKey(Goods goods);

	/**
	 * 增加一个对象
	 */
	int insert(Goods goods);

}
