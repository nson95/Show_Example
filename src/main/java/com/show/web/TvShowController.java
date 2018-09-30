package com.show.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.show.business.TvShow;
import com.show.business.TvShowRepository;


@Controller
@RequestMapping(path="/Ex/Users")
public class TvShowController {
	
	@Autowired
	private TvShowRepository tvShowRepository;
	
	@GetMapping("/List")
	public @ResponseBody Iterable<TvShow> getAllTvShows() {
		Iterable<TvShow> tvShow = tvShowRepository.findAll();
		return tvShow;
	}
	@GetMapping("/Get") 
	public @ResponseBody Optional<TvShow> get(@RequestParam int id) { 
		Optional<TvShow> tvShow = tvShowRepository.findById(id);
		return tvShow; 
		
	}
	
	@PostMapping("/Add") 
	public @ResponseBody TvShow addTvShow(@RequestBody TvShow tvShow) { 
		return tvShowRepository.save(tvShow);
	}
	
	@PostMapping("/Change")
	public @ResponseBody TvShow updateTvShow(@RequestBody TvShow tvShow) { 
		return tvShowRepository.save(tvShow);
	}
	
	@PostMapping("/Remove")
	public @ResponseBody String removeTvShow(@RequestBody TvShow tvShow) { 
		tvShowRepository.delete(tvShow);
		return "TvShow deleted";
	}
}