package com.kopo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kopo.domain.Webtoon;

public interface WebtoonService {
	List<Webtoon> getAllWebtoonList();
	List<Webtoon> getWebtoonListByGenre(String genre);
	Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter);
	Webtoon getWebtoonByName(String name);
	void setNewWebtoon(Webtoon webtoon);
}
