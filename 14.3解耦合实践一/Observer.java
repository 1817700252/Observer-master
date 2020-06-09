package day10_demo02;

import day10_demo01.Secretary;

public abstract class Observer
{
	protected String	name;
	protected Secretary	sub;

	public Observer(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();
}
