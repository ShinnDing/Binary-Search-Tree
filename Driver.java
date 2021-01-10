
/**
 * 
 * @author Stephanie Shinn
 *
 */
public class Driver {
	public static void main(String[] args) {

		//instantiates new Guitars for testing methods
		Guitar gibson = new Guitar("Gibson", 9, 2008);
		Guitar hoffman = new Guitar("Hoffman", 5, 2006);
		Guitar cordoba = new Guitar("Cordoba", 5, 2020);
		Guitar martin = new Guitar("Martin", 6, 2012);
		Guitar taylor = new Guitar("Taylor", 5, 2019);
		Guitar ovation = new Guitar("Ovation", 6, 1993);
		Guitar fender = new Guitar("Fender", 4, 2010);
		Guitar seagull = new Guitar("Seagull", 5, 2012);
		Guitar yamaha = new Guitar("Yamaha", 6, 2011);
		Guitar guild = new Guitar("Guild", 7, 2000);
		Guitar washburn = new Guitar("Washburn", 6, 1999);
		Guitar epiphone = new Guitar("Epiphone", 4, 1995);
		Guitar esp = new Guitar("ESP", 6, 2015);
		Guitar gretsch = new Guitar("Gretsch", 7, 2013);
		Guitar ibanez = new Guitar("Ibanez", 5, 1997);
		Guitar rickenbacker = new Guitar("Rickenbacker", 9, 1995);
		Guitar jackson = new Guitar("Jackson", 6, 1985);
		Guitar schecter = new Guitar("Schecter", 8, 1979);
		Guitar mitchell = new Guitar("Mitchell", 4, 1964);
		Guitar cort = new Guitar("Cort", 6, 1968);
		
		GuitarCollection gc = new GuitarCollection();
		
		gc.add(gibson);
		gc.add(hoffman);
		gc.add(cordoba);
		gc.add(martin);
		gc.add(taylor);
		gc.add(ovation);
		gc.add(fender);
		gc.add(seagull);
		gc.add(yamaha);
		gc.add(guild);
		gc.add(washburn);
		gc.add(epiphone);
		gc.add(esp);
		gc.add(gretsch);
		gc.add(ibanez);
		gc.add(rickenbacker);
		gc.add(jackson);
		gc.add(schecter);
		gc.add(mitchell);
		gc.add(cort);
		
		gc.preorder();
		gc.postorder();
		gc.inorder();
		
		System.out.println("\nThe depth of the Binary Tree is " + gc.depth() + ".");
		System.out.println("\nThe number of nodes in the Binary Tree is " + gc.count() + ".");
		System.out.println("\nSearch for Jackson and display details:\n\n" + gc.search(jackson));
	}		
}
