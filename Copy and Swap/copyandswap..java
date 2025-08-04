int[] copyAndSwap(int[] array){
    boolean odd = false;
    int add = 0;
    int mid = -1;
    if(array.length%2==1){
        odd = true;
        mid = (array.length/2);
    }
    int[] arr2 = new int[2*(array.length/2)];
    for(int i = 0;i<array.length;i++){
        if(i!=mid)
            arr2[i+add] = array[i];
        else
            add = -1;
    }
    swap(arr2);
    return arr2;
}
void swap(int[] a2){
   int placeHolder = 0;
   for(int i = 0;i<a2.length;i+=2){
        placeHolder = a2[i];
        a2[i]=a2[i+1];
        a2[i+1] =placeHolder;  
    }
}
