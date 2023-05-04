import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMain {

	@Test
	public void test() 
	{
		String[] args = {"2","4"};
		assertThrows(IndexOutOfBoundsException.class, ()-> {Main.main(args);});
		
	}
	@Test
	public void testSuma1() throws  Exception {
		String [] args = {"7","9","/"};
				Main.main(args);
	}
}
