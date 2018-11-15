package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.bean.Goods;
import com.service.GoodsService;

@Controller
public class GoodsController {

	@Resource(name = "goodsServiceImp")
	GoodsService goodsService;// 依赖service层

	/**
	 * 分页查询查询所有的数据
	 */
	@RequestMapping("/is/selectallgoods/{page}.html")
	public String selectAllGoods(HttpServletRequest req,
			@PathVariable("page") int page) {

		PageHelper.startPage(page, 2);// 第几页，每页条数
		List<Goods> list = goodsService.selectAll();// 查询所有
		PageInfo pageInfo = new PageInfo(list);// 就是一个包含了分页数据的对象

		req.setAttribute("list", list);
		req.setAttribute("pageInfo", pageInfo);
		return "selectallgoods";
	}

	/**
	 * 根据主键查询一个对象
	 */
	@RequestMapping("/is/selectbyprimarykeygoods/{id}.html")
	public String selectByPrimaryKeyGoods(HttpServletRequest req,@PathVariable("id") int id) {
		Goods goods = goodsService.selectByPrimaryKey(id);
		req.setAttribute("goods", goods);
		return "selectbyprimarykeygoods";
	}

	/**
	 * 根据主键删除一个对象
	 */
	@RequestMapping("/is/deletebyprimarykeygoods/{id}.html")
	public String deleteByPrimaryKeyGoods(HttpServletRequest req,@PathVariable("id") int id) {
		int r = goodsService.deleteByPrimaryKey(id);
		return "deletebyprimarykeygoods";
	}

	/**
	 * 根据主键修改一个对象
	 */
	@RequestMapping("/is/updatebyprimarykeygoods.html")
	public String updateByPrimaryKeyGoods(Goods goods) {
		int r = goodsService.updateByPrimaryKey(goods);
		return "updatebyprimarykeygoods";
	}

	/**
	 * 增加一个对象
	 */
	@RequestMapping("/is/insertgoods.html")
	public String insertGoods(Goods goods) {
		int r = goodsService.insert(goods);
		return "insertgoods";

	}

}
