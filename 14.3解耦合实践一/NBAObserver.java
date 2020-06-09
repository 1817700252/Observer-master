package day10_demo02;

import day10_demo01.Secretary;

public class NBAObserver extends Observer
{
	public NBAObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}