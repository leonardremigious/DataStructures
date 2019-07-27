package sorting;

public class BubbleSort {
    public static void main(String args[]){
        Integer[] input={5,1,1,9,7,3,2,1,3,3,8,6};
        BubbleSort bubbleSort=new BubbleSort();
        Integer[] output =bubbleSort.bubbleSort(input);
        int i=0;
        while (i!=output.length){
            System.out.println(output[i]);
            i++;
        }
    }
    private Integer[] bubbleSort(Integer[] input){
        for(int i=1;i<input.length;i++){
            for (int j=0;j<input.length-i;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        return input;
    }
}
