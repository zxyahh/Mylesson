package bean;

import java.sql.*;

public class InformationBean {

	private int info_id;
	private String info_title;
	private String info_content;
	private Date info_datetime;
	private String info_author;

	public InformationBean() {
		// TODO Auto-generated constructor stub
	}

	public int getInfo_id() {
		return info_id;
	}

	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}

	public String getInfo_title() {
		return info_title;
	}

	public void setInfo_title(String info_title) {
		this.info_title = info_title;
	}

	public String getInfo_content() {
		return info_content;
	}

	public void setInfo_content(String info_content) {
		this.info_content = info_content;
	}

	public Date getInfo_datetime() {
		return info_datetime;
	}

	public void setInfo_datetime(Date info_datetime) {
		this.info_datetime = info_datetime;
	}

	public String getInfo_author() {
		return info_author;
	}

	public void setInfo_author(String info_author) {
		this.info_author = info_author;
	}

}
