package cn.momoka.oop.callback;

import java.awt.Graphics;

public abstract class MyFrame {
	public abstract void paint();//{
		//System.out.println("把自己窗口画出来");
	//}
}
interface IMyFrame{
	void paint();
}