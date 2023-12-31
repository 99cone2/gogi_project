package com.project.gogi.goods.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface GoodsController {
	public ModelAndView shop(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String category) throws Exception;
	public ModelAndView goodsDetail(@RequestParam("goods_id") int goods_id, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
