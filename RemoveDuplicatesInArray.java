package demo;

public class RemoveDuplicatesInArray {
    public RemoveDuplicatesInArray() {
        super();
    }
    public static void main(String args[]){
        int[] a= {1,2,3,2,4,1,6,2,5};
        int j=0;
        for (int i=0;i<a.length;i++){
            for(j=a.length-1;j>i;j--){
                if(a[i]==a[j]){
                    if(j+1<a.length)
                        a[j]=a[j+1];
                    else
                        a[j]='\0';
                }
            }
            if(a[i]!='\0')
            System.out.print(a[i]);
        }

    }
}
