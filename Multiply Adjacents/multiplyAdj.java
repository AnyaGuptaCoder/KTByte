int multiplyAdj(int[] arr){
    int sum = 0;
    int[] a2 = new int[arr.length];
    for(int i = 0;i<arr.length;i++){
        a2[i]=arr[i];
    }  
    
    for(int i = 0;i<arr.length;i++){
        if(arr.length==1){
            sum = arr[i]*arr[i]*arr[i];
            arr[i] = sum;
            return sum;
        }
        if(i == 0){
            sum+=a2[arr.length-1]*arr[0]*arr[1];
            arr[i] = a2[arr.length-1]*arr[0]*arr[1];
        }
        if(i == arr.length-1){
            sum+=a2[arr.length-1]*a2[arr.length-2]*a2[0];
            arr[i] = a2[arr.length-1]*a2[0]*a2[arr.length-2];
        }
        if(i!=0&&i!=arr.length-1){
            sum+=a2[i-1]*arr[i]*arr[i+1];
            arr[i] = a2[i-1]*arr[i]*arr[i+1];
        }
    }
    return sum;
}
