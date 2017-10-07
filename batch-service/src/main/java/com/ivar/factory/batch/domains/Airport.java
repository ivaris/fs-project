package com.ivar.factory.batch.domains;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by ONC50886 on 6/13/2017.
 */
public class Airport {
	private String id;
	private String ident;
	private String type;
	private String name;
	private String latitudeDeg;
	private String longitudeDeg;
	private String elevationFt;
	private String continent;
	private String isoCountry;
	private String isoRegion;
	private String municipality;
	private String scheduledService;
	private String gpsCode;
	private String iataCode;
	private String localCode;
	private String homeLink;
	private String wikipediaLink;
	private String keywords;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdent() {
		return ident;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatitudeDeg() {
		return latitudeDeg;
	}

	public void setLatitudeDeg(String latitudeDeg) {
		this.latitudeDeg = latitudeDeg;
	}

	public String getLongitudeDeg() {
		return longitudeDeg;
	}

	public void setLongitudeDeg(String longitudeDeg) {
		this.longitudeDeg = longitudeDeg;
	}

	public String getElevationFt() {
		return elevationFt;
	}

	public void setElevationFt(String elevationFt) {
		this.elevationFt = elevationFt;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getIsoCountry() {
		return isoCountry;
	}

	public void setIsoCountry(String isoCountry) {
		this.isoCountry = isoCountry;
	}

	public String getIsoRegion() {
		return isoRegion;
	}

	public void setIsoRegion(String isoRegion) {
		this.isoRegion = isoRegion;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public String getScheduledService() {
		return scheduledService;
	}

	public void setScheduledService(String scheduledService) {
		this.scheduledService = scheduledService;
	}

	public String getGpsCode() {
		return gpsCode;
	}

	public void setGpsCode(String gpsCode) {
		this.gpsCode = gpsCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public String getHomeLink() {
		return homeLink;
	}

	public void setHomeLink(String homeLink) {
		this.homeLink = homeLink;
	}

	public String getWikipediaLink() {
		return wikipediaLink;
	}

	public void setWikipediaLink(String wikipediaLink) {
		this.wikipediaLink = wikipediaLink;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Airport(){

	}
	public Airport(String id, String ident, String type, String name, String latitudeDeg, String longitudeDeg, String elevationFt,
			String continent, String isoCountry, String isoRegion, String municipality, String scheduledService, String gpsCode,
			String iataCode, String localCode, String homeLink, String wikipediaLink, String keywords) {
		this.id = id;
		this.ident = ident;
		this.type = type;
		this.name = name;
		this.latitudeDeg = latitudeDeg;
		this.longitudeDeg = longitudeDeg;
		this.elevationFt = elevationFt;
		this.continent = continent;
		this.isoCountry = isoCountry;
		this.isoRegion = isoRegion;
		this.municipality = municipality;
		this.scheduledService = scheduledService;
		this.gpsCode = gpsCode;
		this.iataCode = iataCode;
		this.localCode = localCode;
		this.homeLink = homeLink;
		this.wikipediaLink = wikipediaLink;
		this.keywords = keywords;
	}
}
