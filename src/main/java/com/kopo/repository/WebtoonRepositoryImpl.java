package com.kopo.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.kopo.domain.Webtoon;

@Repository
public class WebtoonRepositoryImpl implements WebtoonRepository {
	private List<Webtoon> listOfWebtoons = new ArrayList<Webtoon>();

	public WebtoonRepositoryImpl() {
		Webtoon webtoon1 = new Webtoon("재혼황후", "img1.jpg");
		webtoon1.setAuthor("히어리");
		webtoon1.setDescription("동대제국의 완벽한 황후였던 나비에. ​황제인 남편이 정부를 황후로 만들려는 것을 알고 이혼을 택한다.");
		webtoon1.setRanking("1위");
		webtoon1.setReleaseDay("금요일");
		webtoon1.setWebsite("naver");
		webtoon1.setGenre("로맨스");
		webtoon1.setUrl("https://comic.naver.com/webtoon/list?titleId=735661");

		Webtoon webtoon2 = new Webtoon("외모지상주의", "img2.jpg");
		webtoon2.setAuthor("박태준");
		webtoon2.setDescription("못생기고 뚱뚱하다고 괴롭힘을 당하며 루저 인생만 살아온 내가 잘생겨졌다는 이유로 인싸가 됐다."
				+ " 어느 날 자고 일어났더니 갑자기 완벽한 외모와 몸을 지닌 사람이 되어 깨어난다면?");
		webtoon2.setRanking("2위");
		webtoon2.setReleaseDay("금요일");
		webtoon2.setWebsite("naver");
		webtoon2.setGenre("드라마");
		webtoon2.setUrl("https://comic.naver.com/webtoon/list?titleId=641253");

		Webtoon webtoon3 = new Webtoon("광마회귀", "img3.jpg");
		webtoon3.setAuthor("이히");
		webtoon3.setDescription("무공에 미친 광마 이자하. 그는 마교 교주의 천옥을 훔쳐 쫓기던 중 벼랑에서 떨어지게 된다."
				+ " 모든 게 끝났다고 생각한 순간 눈을 떠보니,"
				+ " 사람들에게 무시당하던 점소이 시절로 돌아와 있는데... ");
		webtoon3.setRanking("3위");
		webtoon3.setReleaseDay("금요일");
		webtoon3.setWebsite("naver");
		webtoon3.setGenre("무협/사극");
		webtoon3.setUrl("https://comic.naver.com/webtoon/list?titleId=776601");
		
		Webtoon webtoon4 = new Webtoon("똑 닮은 딸", "img4.jpg");
		webtoon4.setAuthor("이담");
		webtoon4.setDescription("'우리 엄마가 살인마인 것 같다.' 성적 우수, 품행 단정, 모범적인 자식인 길소명은"
				+ " 엄마가 요구하는 기준에 맞춰 완벽한 딸로 살아왔다. 그러나 남동생이 강물에서 시체로 떠오른 그 날, "
				+ "소명의 머릿속엔 섬뜩한 의혹이 피어오른다. 자식의 인생에 방해되는 모든 것을 없애려는 엄마와 그녀에게서 벗어나려는 딸,"
				+ " 두 사람의 잔혹한 모녀 스릴러! 2020 지상최대공모전 2기 우수상 수상작.");
		webtoon4.setRanking("8위");
		webtoon4.setReleaseDay("월요일");
		webtoon4.setWebsite("naver");
		webtoon4.setGenre("스릴러");
		webtoon4.setUrl("https://comic.naver.com/webtoon/list?titleId=774866");
		
		Webtoon webtoon5 = new Webtoon("로잘린 보가트", "img5.jpg");
		webtoon5.setAuthor("삼월에/마하");
		webtoon5.setDescription("\"남편이 어여뻐야 시가에 돈벼락이 내리지 않겠어요?\" "
				+ "왕족과 귀족의 사치로 재정이 무너져가는 칼라브리아 왕국. 평민의 신분으로 거부가 된 부르주아, 보가트 상단은"
				+ " 자신들이 유일하게 갖지 못한 명예를 얻기 위해 보가트 상단의 천덕꾸러기 차녀 로잘린과 칼라브리아 왕가의 최고 미인,"
				+ " 왕세자 로비엔을 결혼시키고자 하는데···. 돈으로 산 명예, 혼인으로 막은 왕가의 파산, 뜻하지 않은 결혼을 하게 된 둘은"
				+ " 서로의 치부를 감싸안고 가까워질 수 있을까.");
		webtoon5.setRanking("14위");
		webtoon5.setReleaseDay("화요일");
		webtoon5.setWebsite("naver");
		webtoon5.setGenre("로맨스");
		webtoon5.setUrl("https://comic.naver.com/webtoon/list?titleId=797582");
		
		Webtoon webtoon6 = new Webtoon("하루만 네가 되고 싶어", "img6.jpg");
		webtoon6.setAuthor("삼");
		webtoon6.setDescription("\'완벽한 인생이었다, 그 애가 나타나기 전까지는' 반전에 반전을 거듭하는 치밀한"
				+ " 궁중 서스펜스 네이버웹툰 최강자전 19년 대표작.");
		webtoon6.setRanking("3위");
		webtoon6.setReleaseDay("수요일");
		webtoon6.setWebsite("naver");
		webtoon6.setGenre("로맨스");
		webtoon6.setUrl("https://comic.naver.com/webtoon/list?titleId=738487");
		
		
		
		listOfWebtoons.add(webtoon1);
		listOfWebtoons.add(webtoon2);
		listOfWebtoons.add(webtoon3);
		listOfWebtoons.add(webtoon4);
		listOfWebtoons.add(webtoon5);
		listOfWebtoons.add(webtoon6);
	}

	@Override
	public List<Webtoon> getAllWebtoonList() {
		// TODO Auto-generated method stub
		return listOfWebtoons;
	}

	@Override
	public List<Webtoon> getWebtoonListByGenre(String genre) {
		// TODO Auto-generated method stub
		List<Webtoon> webtoonsByGenre = new ArrayList<Webtoon>();
		for (int i = 0; i < listOfWebtoons.size(); i++) {
			Webtoon webtoon = listOfWebtoons.get(i);
			if(genre.equalsIgnoreCase(webtoon.getGenre())) {
				webtoonsByGenre.add(webtoon);
			}
		}
		return webtoonsByGenre;
	}

	@Override
	public Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Webtoon> webtoonsByWebsite = new HashSet<Webtoon>();
		Set<Webtoon> webtoonsByGenre = new HashSet<Webtoon>();
		
		Set<String> webtoonsByFilter = filter.keySet();
		System.out.println("webtoonsByFilter : " + webtoonsByFilter);
		if(webtoonsByFilter.contains("website")) {
			for (int j = 0; j < filter.get("website").size(); j++) { 
				String websiteName = filter.get("website").get(j);
				for (int i = 0; i < listOfWebtoons.size(); i++) {
					Webtoon webtoon = listOfWebtoons.get(i);
					if (websiteName.equalsIgnoreCase(webtoon.getWebsite())) {
						webtoonsByWebsite.add(webtoon);
					}
				}

			}

			if (webtoonsByFilter.contains("genre")) {
				for (int i = 0; i < filter.get("genre").size(); i++) {
					String genre = filter.get("genre").get(i);
					System.out.println("장르 : " + genre);
					List<Webtoon> list = getWebtoonListByGenre(genre);//만들어 놓은 메서드 활용
					webtoonsByGenre.addAll(list);
				}
			}
		}
		webtoonsByGenre.retainAll(webtoonsByWebsite);
		return webtoonsByGenre;
	}

	@Override
	public Webtoon getWebtoonByName(String Name) {
		// TODO Auto-generated method stub
		Webtoon webtoonInfo = null;
		for (int i = 0; i < listOfWebtoons.size(); i++) {
			Webtoon webtoon = listOfWebtoons.get(i);
			if (webtoon != null && webtoon.getName() != null && webtoon.getName().equals(Name)) {
				webtoonInfo = webtoon;
				break;
			}
		}
		 if (webtoonInfo == null) {
	         throw new IllegalArgumentException("다음 이름의 웹툰을 찾을 수 없습니다 : " + Name);
	      }
		 return webtoonInfo;
	}

	@Override
	public void setNewWebtoon(Webtoon webtoon) {
		// TODO Auto-generated method stub
		listOfWebtoons.add(webtoon);
	}

}
