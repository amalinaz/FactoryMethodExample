package factory;

import model.Chocolate;
import model.MilkChocolate;

public class MilkChocolateFactory implements ChocolateFactory{
	@Override
	public Chocolate createChocolate() {
	// TODO Auto-generated method stub
		return new MilkChocolate();
	}
}
