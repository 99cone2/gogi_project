package com.project.gogi.goods.vo;

import java.util.Date;

public class ImageFileVO {
	private int image_id;
	private int goods_id;
	private String file_name;
	private int reg_id;
	private String file_type;
	private Date creDate;
	
	public ImageFileVO() {
		// TODO Auto-generated constructor stub
	}

	public ImageFileVO(int image_id, int goods_id, String file_name, int reg_id, String file_type, Date creDate) {
		super();
		this.image_id = image_id;
		this.goods_id = goods_id;
		this.file_name = file_name;
		this.reg_id = reg_id;
		this.file_type = file_type;
		this.creDate = creDate;
	}

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}

	public Date getCredate() {
		return creDate;
	}

	public void setCredate(Date creDate) {
		this.creDate = creDate;
	}
	
	
}
