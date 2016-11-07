package demo;


import java.util.Date;


public class Class1 {
    public Class1() {
        super();
    }


    private int[] array;

        public Class1(int[] array){
            this.array = array;
        }

        public void setArray(int arr[]){
            this.array = arr;
        }

        public void bubblesort() {
            for (int i = array.length; i >= 0; i--) {
                for (int j = 0; j < i - 1; j++) {
                    if (array[j] > array[j+1]) {
                        swap(j, j+1);
                    }
                }
            }
        }

    public void selectionSort(){
            int min;
            for(int i = 0 ; i < array.length; i++){
                min = i;
                for(int j = i+1; j < array.length; j++){
                    if(array[min] > array[j]){
                        min = j;
                    }
                }
                if(min != i){
                    swap(min, i);
                }
            }

        }

    public void quickSort(int start, int end) {
           int i = start;
           int j = end;
           int pivot = array[start+(end-start)/2];
           while (i <= j) {
               while (array[i] < pivot) {
                   i++;
               }
               while (array[j] > pivot) {
                   j--;
               }
               if (i < j) {
                   swap(i, j);
                   i++;
                   j--;
               }
               else if( i == j){
                   i++;
                   j--;
               }
           }

           if (start < j)
               quickSort(start, j);
           if (i < end)
               quickSort(i, end);
       }

//        public static void main(String[] args) {
//            int[] input = {24,2,-45,20,56,75,2,-56,99,53,-12};
//            BubbleSort bubbleSort = new BubbleSort(input);
//            bubbleSort.bubblesort();
//
//            for (int i : input){
//                System.out.println(i);
//            }
//
//        }

        private void swap(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        public static void removeDuplicates(char[] str) {
            if (str == null) {System.out.println(new String(str));return;}
        int len = str.length;
        if (len < 2) {System.out.println(new String(str));return;};

        int tail = 1;

        for (int i = 1; i < len; ++i) {
           int j;
         for ( j= 0; j < tail; ++j) {
             if(str[i]==str[j])
                 break;
         }
             if(j==tail){
                 str[tail]=str[i];
                 tail++;
             }

          // System.out.println("j: "+j+ " :"+ new String(str));
       }
        System.out.println("tail: "+tail);
        System.out.println(new String(str).substring(0,tail));
    }
    public static void main(String ar[]){
        int[] input = {24,-45,20,56,75,2,-56,99,53,-12};
        //int[] input = {3,4,6};
                    Class1 class1 = new Class1(input);
                    Date d = new java.util.Date();
                    //class1.bubblesort();
        class1.selectionSort();
//                    for (int i : input){
//                        System.out.print(i + " ");
//                    }
                    int input1[] = {1,2,5,21,23,24};


        int[] output=new int[input.length];//= new int[input.length+input1.length];
        int[] output1=new int[(input.length<input1.length?input.length:input1.length)];
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        //int minlen = (input.length<input1.length?input.length:input1.length);
        if(input.length>input1.length){
            output=input;
            input=input1;
            input1=output;
        }
        output=new int[input.length+input1.length];

//     while(k<output.length && i<input.length && j<input1.length){
//
//        while(i<input.length && input[i]<=input1[j]){
//            output[k++]=input[i++];
//            if(input[i-1]==input1[j]){
//                output1[l++]=input[i-1];
//                j++;
//            }
//            System.out.print(output[k-1]+" ");
//        }
//        while(j<input1.length && (i==input.length || input1[j]<input[i])){
//            output[k++]=input1[j++];
//            System.out.print(output[k-1]+" ");
//        }
//            //System.out.println("k:"+k);
//        }
        while (i<input.length && j<input1.length){
            if(input[i]<input1[j])
              System.out.print(input[i++]+" ");
            else if(input1[j]<input[i])
              System.out.print(input1[j++]+" ");
            else{
                System.out.print(input1[j++]+" ");
                i++;
            }
        }



            while(i<input.length )
                System.out.print(input[i++]+" ");
            while(j<input1.length )
                System.out.print(input1[j++]+" ");
        System.out.println(" ");


       // System.out.println("output:"+output.length);
        //Class1.removeDuplicates("abcabcdef".toCharArray());
//        for(int x=0;x<l;x++)
//            System.out.println("output1:"+output1[x]+output.length);

        System.out.println("intersection");
        i=0;
            j=0;
        while (i<input.length && j<input1.length){
            if(input[i]<input1[j])
                i++;
            else if(input1[j]<input[i])
              j++;
            else{
                System.out.print(input1[j++]+" ");
                i++;
            }
        }

        String str="stress";
        int[] c=new int[256];

        for(i=0;i<str.length();i++ )
           c[str.charAt(i)]= c[str.charAt(i)]+1;

        for(i=0;i<str.length();i++ )
            System.out.println("str output i:"+ i+":"+ str.charAt(i) +" : "+c[str.charAt(i)]);
    }

}
