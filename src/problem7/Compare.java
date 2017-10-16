package problem7;

public class Compare {
	float temp1;
	float temp2;
	Compare(float inputTemp1, float inputTemp2){
		temp1=inputTemp1;
		temp2=inputTemp2;
		if(temp1>=temp2) {
			System.out.println(temp1+" is greater than "+temp2);
		}
	}
	Compare(){
		
	}
}
