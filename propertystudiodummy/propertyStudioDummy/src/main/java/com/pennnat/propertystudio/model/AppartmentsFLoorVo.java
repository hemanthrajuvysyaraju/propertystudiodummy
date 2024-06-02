package com.pennnat.propertystudio.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AppartmentsFLoorVo implements Serializable{

	private static final long serialVersionUID = -6338998328589408780L;
	private Integer projid;
	private Integer aprtid;
	private Integer aprtfloorindex;
	private String aprtfloorplanbase64format;
	private String aprtcompletionstatus;
	private LocalDateTime aprtlaudate;
	public Integer getProjid() {
		return projid;
	}
	public void setProjid(Integer projid) {
		this.projid = projid;
	}
	public Integer getAprtid() {
		return aprtid;
	}
	public void setAprtid(Integer aprtid) {
		this.aprtid = aprtid;
	}
	public Integer getAprtfloorindex() {
		return aprtfloorindex;
	}
	public void setAprtfloorindex(Integer aprtfloorindex) {
		this.aprtfloorindex = aprtfloorindex;
	}
	public String getAprtfloorplanbase64format() {
		return aprtfloorplanbase64format;
	}
	public void setAprtfloorplanbase64format(String aprtfloorplanbase64format) {
		this.aprtfloorplanbase64format = aprtfloorplanbase64format;
	}
	public String getAprtcompletionstatus() {
		return aprtcompletionstatus;
	}
	public void setAprtcompletionstatus(String aprtcompletionstatus) {
		this.aprtcompletionstatus = aprtcompletionstatus;
	}
	public LocalDateTime getAprtlaudate() {
		return aprtlaudate;
	}
	public void setAprtlaudate(LocalDateTime aprtlaudate) {
		this.aprtlaudate = aprtlaudate;
	}
	
	@Override
	public String toString() {
		return "AppartmentsFLoorVo [projid=" + projid + ", aprtid=" + aprtid + ", aprtfloorindex=" + aprtfloorindex
				+ ", aprtfloorplanbase64format=" + aprtfloorplanbase64format + ", aprtcompletionstatus="
				+ aprtcompletionstatus + ", aprtlaudate=" + aprtlaudate + "]";
	}
}
