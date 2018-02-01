package com.atguigu.ssmshiro.pojo;

import java.util.List;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description: 商品的包装类</p>
 */
public class ItemsQueryVo {
	
	//商品信息
	private ItemsCustom itemsCustom;
	
	//定义一个list
	private List<ItemsCustom> itemsList;

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	public List<ItemsCustom> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<ItemsCustom> itemsList) {
		this.itemsList = itemsList;
	}
	
	

}
