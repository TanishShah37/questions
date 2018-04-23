import java.util.*;

public class hs1 {

	static int hs(int member){
		if(member == 1){
			return 0;
		}
		else if(member == 2){
			return 1;
		}
		else{
			return hs(member - 1) + member-1;
		}
	}
	
	public static void main(String[] args) {
		Scanner userArgs = new Scanner(System.in);
		int testCases = userArgs.nextInt();
		ArrayList<Integer> boardmembers = new ArrayList<Integer>();
		for(int i = 0; i < testCases; i++){
			boardmembers.add(userArgs.nextInt());
		}
		
		for(int i = 0; i < boardmembers.size(); i++){
			System.out.println(hs(boardmembers.get(i)));
		}
		userArgs.close();
	}

}