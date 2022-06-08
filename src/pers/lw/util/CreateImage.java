package pers.lw.util;

import javax.swing.ImageIcon;

/**
 * 指定路径加载图片
 * 
 * @author 2020141460103 林旺
 */
public class CreateImage {
	
	public static ImageIcon add(String ImageName) {	
		// 加载图片
		ImageIcon icon= new ImageIcon("res/" + ImageName);	
		return icon;
	}
	

}
