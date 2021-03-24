package com.sujata.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Share;
import com.sujata.service.ShareService;

@Controller
public class ShareController {

	@Autowired
	private ShareService shareService;
	
	@RequestMapping("/")
	public ModelAndView mainPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	@RequestMapping("/showAll")
	public ModelAndView displayAllSharesController() {
		ModelAndView mv=new ModelAndView();
		ArrayList<Share> shareList=shareService.getAllShares();
		mv.addObject("shares", shareList);
		mv.setViewName("displayAllShares");

		return mv;
	}
	
	@RequestMapping("/searchPage")
	public ModelAndView searchPageController() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("enterShareId");
		return mv;
	}
	
	@RequestMapping("/searchShare")
	public ModelAndView searchShareController(HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		String id=request.getParameter("shareId");
		Share share=shareService.searchShareRecordById(Integer.parseInt(id));
		mv.addObject("share", share);
		mv.setViewName("shareDetails");
		return mv;
	}
}
