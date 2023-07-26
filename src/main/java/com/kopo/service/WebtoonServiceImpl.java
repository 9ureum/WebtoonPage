package com.kopo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopo.domain.Webtoon;
import com.kopo.repository.WebtoonRepository;

@Service
public class WebtoonServiceImpl implements WebtoonService {
	@Autowired 
	private WebtoonRepository webtoonRepository;
	
	
	@Override
	public List<Webtoon> getAllWebtoonList() {
		// TODO Auto-generated method stub
		return webtoonRepository.getAllWebtoonList();
	}


	@Override
	public List<Webtoon> getWebtoonListByGenre(String genre) {
		// TODO Auto-generated method stub
		List<Webtoon> webtoonsByGenre = webtoonRepository.getWebtoonListByGenre(genre);
		return webtoonsByGenre;
	}


	@Override
	public Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Webtoon> webtoonByFilter = webtoonRepository.getWebtoonListByFilter(filter);
		System.out.println("webtoonservice : " + webtoonByFilter);
		return webtoonByFilter;
	}


	@Override
	public Webtoon getWebtoonByName(String name) {
		// TODO Auto-generated method stub
		Webtoon webtoonByName = webtoonRepository.getWebtoonByName(name);

		return webtoonByName;
	}


	@Override
	public void setNewWebtoon(Webtoon webtoon) {
		// TODO Auto-generated method stub
		webtoonRepository.setNewWebtoon(webtoon);
	}

}
