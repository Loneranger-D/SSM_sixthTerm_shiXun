package com.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.entity.Tag;
import com.mapper.TagMapper;
import com.service.TagService;

@Service
public class TagServiceImpl implements TagService {
	@Resource
	private TagMapper tagMapper;
	
	public List<Tag> listTag() {
		return tagMapper.listTag();
	}

	@Override
	public void addTag(Tag tag) {
		tagMapper.addTag(tag);
		
	}

	@Override
	public Tag getTagById(Integer tagId) {

		return tagMapper.getTagById(tagId);
	}

	@Override
	public void updateTag(Tag tag) {
		tagMapper.updateTag(tag);
		
	}

}