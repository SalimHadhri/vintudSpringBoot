package com.thp.spring.service;

import java.util.ArrayList;
import java.util.List;

import com.thp.spring.dto.AnnouncementDto;
import com.thp.spring.dto.CategoryDto;
import com.thp.spring.entity.Announcement;

public interface AnnouncementService {
	
	
	
	
	
	public AnnouncementDto addAnnouncement(AnnouncementDto announcementDto) ;
	public List<AnnouncementDto>  consulterAnnonces ()  ;
	public AnnouncementDto findAnnounceById (Long id) ;	
	public AnnouncementDto deleteAnnouncementById (Long id) ;
	public AnnouncementDto updateById(Long id, AnnouncementDto newAnnouncementDto) throws Exception ;	



	
	
	
	public void findAnnouncementByNameCatgeryAndOrPrice () ;		
	public void filtreAnnoucementPrix () ;
	public void filtreAnnoucementLocalisation () ;
	public void voirNombreVues (String email, String pwd) ;
	
	public ArrayList<Announcement> findAnnounceByIdUser(int id);
	
	public ArrayList<Announcement> findAllAnnoucement();

}

