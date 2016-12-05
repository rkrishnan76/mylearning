package demo;

public class StringQs {
    public StringQs() {
        super();
    }

        public static void main(String args[]){
        String str1 = "God is Great!!" ;
        String str2 = "Great!!";
        boolean found=false;
        for(int i=0;i<=str1.length()-str2.length();i++){
            for(int j=0;j<str2.length()/2;j++){
                System.out.println(str1.charAt(i+j)+"=="+str2.charAt(j)+"=="+ str1.charAt(i+str2.length()-1-j)+"=="+str2.charAt(str2.length()-1-j));
                if(str1.charAt(i+j)==str2.charAt(j)&& str1.charAt(i+str2.length()-1-j)==str2.charAt(str2.length()-1-j)){
                    if(j+1==str2.length()/2){
                        if(str2.length()%2==1){
                            if( str1.charAt(i+j+1)==str2.charAt(j+1))
                                found=true;
                        }
                        else
                            found=true;
                        break;
                    }
                    continue;
                }
                else
                    break;
            }
            if (found)
                   break;
        }
        System.out.println("match " + ((found) ? "found":"not found"));
    }
}
