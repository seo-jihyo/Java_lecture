package view;

import java.sql.SQLException;

import controller.GogakController;


public class MainEntry {
	public static void main(String[] args) throws SQLException {
		GogakController.connect();
		GogakController.menu();

	}
}
