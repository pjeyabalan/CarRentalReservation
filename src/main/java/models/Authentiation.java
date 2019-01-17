package main.java.models;

public class Authentiation {
	
	private String userName;
	private String password;
	private boolean isLoginSuccessful;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoginSuccessful() {
		return isLoginSuccessful;
	}
	public void setLoginSuccessful(boolean isLoginSuccessful) {
		this.isLoginSuccessful = isLoginSuccessful;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isLoginSuccessful ? 1231 : 1237);
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Authentiation other = (Authentiation) obj;
		if (isLoginSuccessful != other.isLoginSuccessful)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	public String toString() {
		return "Authentiation [userName=" + userName + ", password=" + password
				+ ", isLoginSuccessful=" + isLoginSuccessful + "]";
	}

	
}
