public class TrappingRainWater {

    public static int maxWater(int arr[]){

        //left-max 
        int leftAux[] = new int[arr.length];
        leftAux[0] = arr[0];

        for(int i =1; i < arr.length; i++){
            leftAux[i] = Math.max(leftAux[i-1], arr[i]);       
        }


        //right-max
        int rightAux[] = new int[arr.length];
        rightAux[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length -2 ; i>= 0; i--){
            rightAux[i] = Math.max(arr[i], rightAux[i+1]);
        }

        // Water-Level 
        int trapedWater = 0;
       

        for(int i =0 ; i< arr.length; i++){

            int waterLevel = Math.min(leftAux[i], rightAux[i]);

            trapedWater += waterLevel - arr[i];

        }

        return trapedWater;

    }



    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(maxWater(arr));

    }
}