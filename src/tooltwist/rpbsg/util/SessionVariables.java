package tooltwist.rpbsg.util;

public enum SessionVariables {
	USER_ID						("userId"),
	IS_LOGGED					("isLogged");

	private String name;

	SessionVariables(String sessionVariables) {
		this.name = sessionVariables;
	}

	public String getName() {
		return this.name;
	}
	
}
