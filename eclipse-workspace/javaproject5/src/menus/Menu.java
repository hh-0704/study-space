package menus;

import java.util.Scanner;

import menus.MainMenuEnum;
import utils.Utils;

public class Menu {
	public MainMenuEnum MainMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Main Menu ===");
		for(MainMenuEnum m : MainMenuEnum.values()) {
			System.out.println("  " + m.getCode() + ". " + m.getMessage());
		}

		int n;
		MainMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(MainMenuEnum m : MainMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
			System.out.println("Invalid Input. Try again");
		}
		
		return select;
	}


	// public RegisterMenuEnum RegisterMenu(Scanner s) { ... } 작성
	public RegisterMenuEnum RegisterMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Register Menu ===");
		for(RegisterMenuEnum r : RegisterMenuEnum.values()) {
			System.out.println("  " + r.getCode() + ". " + r.getMessage());
		}

		int n;
		RegisterMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(RegisterMenuEnum m : RegisterMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
			System.out.println("Invalid Input. Try again");
		}
		
		return select;
	}

	// public SearchMenuEnum SearchMenu(Scanner s) { ... } 작성
	public SearchMenuEnum SearchMenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Search Menu ===");
		for(SearchMenuEnum se : SearchMenuEnum.values()) {
			System.out.println("  " + se.getCode() + ". " + se.getMessage());
		}

		int n;
		SearchMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(SearchMenuEnum m : SearchMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
			System.out.println("Invalid Input. Try again");
		}
		
		return select;
	}
	
	public UpdateMenuEnum Updatemenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Update Menu ===");
		for(UpdateMenuEnum up : UpdateMenuEnum.values()) {
			System.out.println("  " + up.getCode() + ". " + up.getMessage());
		}

		int n;
		UpdateMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(UpdateMenuEnum m : UpdateMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
			System.out.println("Invalid Input. Try again");
		}
		
		return select;
	}
	
	public DeleteMenuEnum Deletemenu(Scanner s) {
		System.out.println("");
		System.out.println("======== Delete Menu ===");
		for(DeleteMenuEnum del : DeleteMenuEnum.values()) {
			System.out.println("  " + del.getCode() + ". " + del.getMessage());
		}

		int n;
		DeleteMenuEnum select = null;
		while(true) {
			n = Utils.checkInputInteger(s, "선택>>> ");
			
			// 유효한 값 입력 확인
			boolean valid = false;
			for(DeleteMenuEnum m : DeleteMenuEnum.values()) {
				if(n == m.getCode()) {
					valid = true;
					select = m;
					break;
				}
			}
			
			if(valid) {
				break;
			}
			System.out.println("Invalid Input. Try again");
		}
		
		return select;
	}
}
