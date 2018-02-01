package com.atguigu.ssmshiro.mapper;


import com.atguigu.ssmshiro.pojo.ItemsCustom;
import com.atguigu.ssmshiro.pojo.ItemsQueryVo;

import java.util.List;

/**
 * Title: ItemsMapperCustom
 * Description:商品自定义mapper
 */
public interface ItemsMapperCustom {
	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}
