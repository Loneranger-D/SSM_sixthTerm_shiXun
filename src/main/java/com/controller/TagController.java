package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Tag;
import com.service.TagService;

@Controller @RequestMapping("/tag")
public class TagController {
	@Resource
	TagService tagService;

	@RequestMapping("")
	public String listTag(ModelMap m) {
		List<Tag> tagList=tagService.listTag();
		m.put("tagList", tagList);
		return "Tag/tag";	
	}
	
	@RequestMapping("/addOrUpdate")
	public String addOrUpdate(Tag tag) {
		//新增
		if(tag.getTagId()==null ||tag.getTagId()==0) {
			tagService.addTag(tag);
		}
		else{
			tagService.updateTag(tag);
		}
		
		return "forward:/tag";
	}
	
	//根据id,查出tag信息,转到修改页面
	@RequestMapping("/edit/{tagId}")
	public String editTag(@PathVariable("tagId")Integer tagId, ModelMap m) {
		Tag tag =tagService.getTagById(tagId);
		m.put("tag", tag);
		
		return "forward:/tag";
	}
}