package com.service;

import java.util.List;

import com.entity.Tag;

public interface TagService {

	List<Tag> listTag();

	void addTag(Tag tag);

	Tag getTagById(Integer tagId);

	void updateTag(Tag tag);

}
