package com.pennnat.propertystudio.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class AppartmentsFloorDTO implements Serializable {
	private static final long serialVersionUID = -7734465060375190846L;
	private Integer projid;
	private Integer aprtid;
	@Override
	public String toString() {
		return "AppartmentsFloorDTO [projid=" + projid + ", aprtid=" + aprtid + ", aprtfloorindex=" + aprtfloorindex
				+ ", aprtfloorplan=" + Arrays.toString(aprtfloorplan) + ", aprtcompletionstatus=" + aprtcompletionstatus
				+ ", aprtlaudate=" + aprtlaudate + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aprtfloorindex;
	private byte[] aprtfloorplan;
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
	public byte[] getAprtfloorplan() {
		return aprtfloorplan;
	}
	public void setAprtfloorplan(byte[] aprtfloorplan) {
		this.aprtfloorplan = aprtfloorplan;
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
	
}
