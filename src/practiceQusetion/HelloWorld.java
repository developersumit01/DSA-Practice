package practiceQusetion;

public class HelloWorld {
	public static void main(String[] args) {
		int arr[]= {1,2,4,9,3,4,1};
		System.out.println(minDays(arr, 2,2));
	}
    public static int minDays(int[] bloomDay, int m, int k) {
    	if(m*k>bloomDay.length) {
    		return -1;
    	}
        int totalNumberOfFlower=m;
        int large=0;
        int days=-1;
        int count=m;
        boolean flag=true;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>large){
                large=bloomDay[i];
            }
        }
        for(int i=0;i<=large;i++){
            for(int j=0;j<bloomDay.length;j++){
                if(bloomDay[j]>i){
                    continue;
                }else{
                    for(int l=j;l<j+k&&l<bloomDay.length;l++){
                        if(bloomDay[l]>i){
                            flag=false;
                            break;
                        }else {
                        	totalNumberOfFlower--;
                        }
                    }
                    if(flag&&totalNumberOfFlower<=0){
                    	j=j+k-1;
                        count--;
                    }else{
                        flag=true;
                        count=m;
                        totalNumberOfFlower=m;
                    }
                    if(totalNumberOfFlower==0) {
                    	totalNumberOfFlower=m;
                    }
                }
            }
            if(count<=0){
                return i;
            }else {
            	count=m;
            	totalNumberOfFlower=m;
            }
        }
        return -1;
    }
}