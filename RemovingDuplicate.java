
public class RemovingDuplicate {

	public static void main(String[] args) {
		String[] depts = {"HR","IT","Sales","IT","Sales","HR","HR","IT"};
		String eachDept ="";
		for(int i=0;i<depts.length;i++) {
			eachDept = depts[i];
			for(int j=i+1;j<depts.length;j++) {
				if( !(depts[j].equalsIgnoreCase("YYY")) 
						&& 
						(eachDept.equalsIgnoreCase(depts[j])) ){
					depts[j]="YYY";
				}
			}
		}
		for(int i=0;i<depts.length;i++) {
			if( !(depts[i].equalsIgnoreCase("YYY")) ) {
				System.out.print(depts[i]+" ");
			}

		}
		// "HR" "IT" "Sales" "YYY" "YYY" "YYY" "YYY" "YYY"

	}

}
