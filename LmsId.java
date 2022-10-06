package collection1;

import java.util.ArrayList;

public class LmsId {
	public static void main(String [] args) {
		ArrayList<Integer> id =new ArrayList<>();
		id.add(879);
		id.add(860);
		id.add(877);
		id.add(878);
		id.add(870);
		//id.remove(0);
		/*for(int i=0;i<id.size();i++) {
			if(id.get(i)%2!=0) {
				System.out.println(id.get(i));
			}
		}*/
		
		//id.set(1, 871);
		//System.out.println(id);
		
		/*for(int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
		}*/
		/*for(Integer lms:id) {
			System.out.println(lms);
			
		}*/
		//id.forEach(lms->System.out.println(lms));
		
		
		int min=id.get(0);
		for(int i=0;i<id.size();i++) {
			if(min>id.get(i)) {
				min=id.get(i);
			}
		}
		System.out.println(min);
	}

}
