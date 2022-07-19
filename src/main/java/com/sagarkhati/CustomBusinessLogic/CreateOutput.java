package com.sagarkhati.CustomBusinessLogic;

public class CreateOutput {
	private Integer _book_id;

	public Integer getbook_id() {
		return this._book_id;
	}
	public void setbook_id(Integer book_id) {
		this._book_id = book_id;
	}

	private String _book_name;

	public String getbook_name() {
		return this._book_name;
	}
	public void setbook_name(String book_name) {
		this._book_name = book_name;
	}
	
	private Integer _fk_user_id;

	public Integer getfk_user_id() {
		return this._fk_user_id;
	}
	public void setfk_user_id(Integer fk_user_id) {
		this._fk_user_id = fk_user_id;
	}
}
