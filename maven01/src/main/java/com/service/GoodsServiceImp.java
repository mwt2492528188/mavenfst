package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.GoodsMapper;
import com.bean.Goods;

/**
 * service层接口实现类
 */
@Component
public class GoodsServiceImp implements GoodsService {

	@Resource(name = "goodsMapper")
	GoodsMapper goodsMapper;

	/**
	 * 查询所有的数据
	 */
	@Override
	public List<Goods> selectAll() {
		return goodsMapper.selectAll();
	}

	/**
	 * 根据主键查询一个对象
	 */
	@Override
	public Goods selectByPrimaryKey(Integer id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据主键删除一个对象
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return goodsMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据主键修改一个对象
	 */
	@Override
	public int updateByPrimaryKey(Goods goods) {
		return goodsMapper.updateByPrimaryKey(goods);
	}

	/**
	 * 增加一个对象
	 */
	@Override
	public int insert(Goods goods) {
		return goodsMapper.insert(goods);
	}

}
