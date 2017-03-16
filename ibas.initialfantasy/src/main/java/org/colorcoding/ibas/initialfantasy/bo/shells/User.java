package org.colorcoding.ibas.initialfantasy.bo.shells;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.colorcoding.ibas.bobas.data.emYesNo;
import org.colorcoding.ibas.initialfantasy.bo.organizations.IUser;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "User")
@XmlRootElement(name = "User")
public class User {

	public static User create(IUser user) {
		User sUser = new User();
		sUser.setId(user.getDocEntry());
		sUser.setCode(user.getCode());
		sUser.setName(user.getName());
		sUser.setSupper(user.getSupper() == emYesNo.YES ? true : false);
		return sUser;
	}

	private int id;

	@XmlElement(name = "Id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String code;

	@XmlElement(name = "Code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private String name;

	@XmlElement(name = "Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private boolean supper;

	@XmlElement(name = "Supper")
	public boolean isSupper() {
		return supper;
	}

	public void setSupper(boolean supper) {
		this.supper = supper;
	}

	/**
	 * 检查密码
	 * 
	 * @param password
	 * @return
	 */
	public boolean checkPassword(String password) {
		return true;
	}
}