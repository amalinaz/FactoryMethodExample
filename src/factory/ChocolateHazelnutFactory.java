package factory;

import model.Chocolate;
import model.ChocolateHazelnut;

public class ChocolateHazelnutFactory implements ChocolateFactory{

	@Override
	public Chocolate createChocolate() {
		// TODO Auto-generated method stub
		return new ChocolateHazelnut();
	}

}
