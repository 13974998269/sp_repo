package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class Item {
	//编号
	private Integer id;//商品id
	private String name;//商品名
	private Integer number;//商品数量
	//2222222222222222
}
