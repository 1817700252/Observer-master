package day10_demo02;

import day10_demo01.Secretary;

public class StockObserver extends Observer
{
	public StockObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
