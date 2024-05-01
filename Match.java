package ipl;

public class Match {

	public static void main(String[] args) {
		 Rcb rcb = new Rcb();
	        Srh srh = new Srh();
	        Csk csk = new Csk();

	        System.out.println("Rcb Players:");
	        rcb.batsman();
	        rcb.bowler();
	        rcb.allRounder();

	        System.out.println("\nSrh Players:");
	        srh.batsman();
	        srh.bowler();
	        srh.allRounder();

	        System.out.println("\nCsk Players:");
	        csk.batsman();
	        csk.bowler();
	        csk.allRounder();
	    }

	}


