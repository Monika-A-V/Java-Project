package Final_Test_Paper_1;

/*⦁	Convert following condition into ternary statement [0.5M]
if ( score < 40000 ) {
if ( score < 25000 ) 
sysout ( “ bronze “ ) ; 
else  {
	sysout(“silver” );
if ( score < 25000 ) 
sysout ( “ bronze “ ) ; 
else 
sysout(“silver” );
}
}
else if ( score < 60000) 
sysout( “ gold” ) 
else 
sysout(“platinum” );

*/
public class Q6 {

	public static void main(String[] args) {

		int score = 41000;
		String result = (score < 40000) ? ((score < 25000) ? "bronze" : "silver") : 
			(score < 60000) ? "gold" : "platinum";
		System.out.println(result);

	}

}
