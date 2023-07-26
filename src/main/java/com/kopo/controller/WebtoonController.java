package com.kopo.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kopo.domain.Webtoon;
import com.kopo.service.WebtoonService;

@Controller
@RequestMapping("/webtoons")
public class WebtoonController {
	@Autowired
	private WebtoonService webtoonService;
	
	@GetMapping("/all" )
	public String requestWebtoonList(Model model) {
		List<Webtoon> list = webtoonService.getAllWebtoonList();
		model.addAttribute("webtoonList", list);
		return "webtoons";
		}
	
	@GetMapping("/{genre}") //경로변수 하나로 찾는거
	public String requestWebtoonByGenre(@PathVariable("genre") String webtoonGenre, Model model) {
		List<Webtoon> webtoonsByGenre = webtoonService.getWebtoonListByGenre(webtoonGenre);
		model.addAttribute("webtoonList", webtoonsByGenre);
		return "webtoons";
	}
	
	//EX) localhost:8083/controller/books/filter/bookFilter;website=naver;genre=스릴러;
	@GetMapping("/filter/{webtoonFilter}") //매트릭스 변수로 해서 여러개 찾는거
	public String requestWebtoonsByFilter(
			@MatrixVariable(pathVar="webtoonFilter") Map<String, List<String>> webtoonFilter,
			Model model) {
		System.out.println("controller : " + webtoonFilter);
		
		
		Set<Webtoon> webtoonsByFilter = webtoonService.getWebtoonListByFilter(webtoonFilter);
		System.out.println("controller : " + webtoonsByFilter);
		model.addAttribute("webtoonList", webtoonsByFilter);
		return "webtoons";
	}
	
	@GetMapping("/webtoon")
	public String requestBookById(@RequestParam("name") String name, Model model) {
		Webtoon webtoonByName = webtoonService.getWebtoonByName(name);
		model.addAttribute("webtoon", webtoonByName);
		return "webtoon";
	}
	@GetMapping("/")
	public String requestMethod(Model model) {
		return "loginform";
	}
	
	@GetMapping("/add")
//	public String requestAddBookForm(Book book) {
	public String requestAddWebtoonForm(@ModelAttribute("newWebtoon") Webtoon webtoon) {
		/*
		 * ※네이게이션바, jumbotron(대형 전광판), footer 적용한 jsp 페이지 만들기
		 * bookId
		 * name
		 * unitPrice
		 * author
		 * description <-textarea
		 * publisher
		 * category
		 * unitInStock
		 * releaseDate
		 * condition <-radioButton
		 * 
		 */
		
		return "addWebtoon";
	}
	

	
	@PostMapping("/add")
	public String submitForm(@ModelAttribute("newWebtoon") Webtoon webtoon, HttpServletRequest requset, HttpSession session) {
		
		// 원본파일이름 : 개똥이.jpg
		// 내가 지정한 이름 : 진돗개
		// f = c:\\upload\\진돗개_개똥이jpg
		UUID uuid = UUID.randomUUID();
		String temp =webtoon.getImageFile().getOriginalFilename().replaceAll(" ", "");
		String filename = webtoon.getName()+uuid.toString()+"_"+temp;  //MultipartFile 메서드->
//		String name = webtoon.getName();
		//String filename = webtoon.getImageFile().getOriginalFilename().replaceAll(" ", "");
		//String imagePath = uuid + name+"_"+filename_tmp.replaceAll(" ", "");
//		String filename = filename_tmp;
		
		
		try {
			webtoon.getImageFile().transferTo(new File ("C:\\03STS_WorkSpace\\WebtoonPage\\src\\main\\webapp\\resources\\img\\" + filename));
			webtoon.setImgPath(filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
		webtoonService.setNewWebtoon(webtoon);
		return "redirect:/webtoons/all";
		
	}
	
	@ModelAttribute
	public void addAttribute(Model model) {
		model.addAttribute("addTitle", "신규 웹툰 등록");
	}
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) {
	 * binder.setAllowedFields("name","imgPath", "ranking", "website","author",
	 * "description","genre","uitsInStock","releaseDay","url"); }
	 */
	
	
}
