package sorting;

public  class InsertionSort {
    static Integer[] insertionSort(Integer[] input){
        for (int i=1;i<input.length;i++){
           int j=i-1,value=input[i];
           while(j>=0&&input[j]>value){
               input[j+1]=input[j];
               j--;
           }
           input[j+1]=value;
        }
        return input;
    }



    public static void main(String args[]){
        Integer[] input= {5,4,3,2,1};
        Integer[] output=insertionSort(input);
        for (int i:output ){
            System.out.println(i);
        }
    }
}
