package pers.lw.controller;

import javax.swing.JTextField;

import pers.lw.dao.UserDao;
import pers.lw.model.User;

/**
 * 用户行为控制类，包含用户名和密码的修改
 * 
 * @author 2020141460103 林旺
 */
public class UserAction {
    

	   /**
	    * 修改用户名密码
	    */
	    public void edit(JTextField username,JTextField passwd) throws Exception{
	    	User user = new User();
	        UserDao userdao=new UserDao();
	        userdao.updateUser(user,username.getText(),passwd.getText());
	    }
	        

}
