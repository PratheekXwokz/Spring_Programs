package com.xworkz.musicandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.musicandfood.dto.MusicDTO;

@Component
@RequestMapping("/")
public class MusicController {

	Collection<MusicDTO> mList = new ArrayList<MusicDTO>();
	
	public MusicController() {
		System.out.println("Calling Default Constructor of:"+ this.getClass().getSimpleName());
	}
	
 @RequestMapping("/music.do")	
  public String onAdd(MusicDTO music, Model model) {
		System.out.println("Calling onSave Method");
		System.out.println("Details entered Are:"+music);
		mList.add(music);
		model.addAttribute("music", music);
		return "Music.jsp";
  }	
 
 @RequestMapping("/view.do")
 public String onView(Model model) {
	 System.out.println("Calling onView Function:");
	 model.addAttribute("list", this.mList);
	 return "MusicDetails.jsp";
 }
 
}