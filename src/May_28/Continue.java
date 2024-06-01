package May_28;

// skip the iteration

public class Continue {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
