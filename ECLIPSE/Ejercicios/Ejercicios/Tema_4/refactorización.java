
public class refactorización {


	public static void main(String[] args) {
		
		Object lugar;
		Object MADRID;
		Object mad_rate;
		Object rate;
		
		
		Object amt;
		Object base;
		Object calc;
		
		int points;
		
		Object barna;
		Object valencia;
		Object bcn_rate;
		Object val_rate;
		
		if ((lugar == MADRID) || (lugar==barna) || (lugar==valencia) || (lugar == barna)){
			rate = mad_rate;
			amt = base*mad_rate;
			rate = (lugar== barna) ? bcn_rate : val_rate;
			amt = base*rate;
			points = 2;
			calc = 2*basis(amt) + extra(amt)*1.05;
		}
		/*else if ((lugar==barna) || (lugar==valencia))*/ 
			
			/*rate = (lugar== barna) ? bcn_rate : val_rate;
			amt = base*rate;
			calc = 2*basis(amt) + extra(amt)*1.05;*/
			
			/*if (lugar == barna) {
				 points = 2;
			}
		}*/
		else {
			rate = 1;
			amt = base;
			calc = 2*basis(amt) + extra(amt)*1.05;
		}
		}
	

	private static double extra(Object amt) {
		
		return 0;
	}

	private static int basis(Object amt) {
		
		return 0;
	}

}
