package pers.lw;


import javax.swing.JFrame;

import pers.lw.view.Login;



/**
 * 主程序类
 * 
 * @author 2020141460103 林旺
 */
@SuppressWarnings("serial")
public class BookManage extends JFrame {
	

	public BookManage() {
		
		new Login();
	}
	
	
	public static void main(String[] args) {
		
		new BookManage();
		
	}

}
