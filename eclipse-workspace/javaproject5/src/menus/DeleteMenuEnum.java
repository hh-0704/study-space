package menus;

public enum DeleteMenuEnum {
	DELETE(41, "직원 정보 삭제"),
	EXIT(49, "돌아가기");
	
	int code;
	String message;
	
	DeleteMenuEnum(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
