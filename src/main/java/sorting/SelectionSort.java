package sorting;

public class SelectionSort {
    static void selectionSort(Integer[] input){
        for(int i=0;i<input.length;i++){
            int max=0,itr=-1;
            for(int j=i;j<input.length;j++){
                if(input[j]>max){
                    max=input[j];
                    itr=j;
                }
            }
            int temp=input[i];
            input[i]=input[itr];
            input[itr]=temp;
        }
    }

    public static void main(String args[]){
        Integer[] input ={1,2,-3 ,4, 5};
        selectionSort(input);
        for (int i: input){
            System.out.println(i);
        }
    }
}
