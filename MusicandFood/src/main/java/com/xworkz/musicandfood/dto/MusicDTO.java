package com.xworkz.musicandfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class MusicDTO {

	private String songName;
	private String singerName;
	private String duration;
	private String producer;
	private String lyricsWriter;
	private String language;
	private String type;

	public MusicDTO() {

		System.out.println("Calling Default Constructor of:" + this.getClass().getSimpleName());
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getLyricsWriter() {
		return lyricsWriter;
	}

	public void setLyricsWriter(String lyricsWriter) {
		this.lyricsWriter = lyricsWriter;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MusicDTO [songName=" + songName + ", singerName=" + singerName + ", duration=" + duration
				+ ", producer=" + producer + ", lyricsWriter=" + lyricsWriter + ", language=" + language + ", type="
				+ type + "]";
	}

}
