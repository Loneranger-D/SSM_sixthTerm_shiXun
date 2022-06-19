package com.service;
import java.util.List;
import com.entity.Article;
import com.github.pagehelper.PageInfo;

public interface ArticleService {
	/**
	 * ��ѯ��������ǰn������
	 * @param n ��ѯ��������
	 * @return �����б�
	 */
	List<Article> listRecentArticle(Integer n);

	PageInfo<Article> getPageArticleList(Integer pageIndex, Integer pageSize);

	void add(Article article);
}
