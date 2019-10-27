/************
 * *
 * * Description: This program show you longest string of numbers where from all sides numbers less than in center.
 */
public class Longest {
    public static void main(String[] args) {
        int n= 11;//Integer.parseInt(args[0]);
        int[] heals = new int[n];
        //int[] heals= {10,6,6,4,10,10,1,2,2,2,1};

        int len = 0;
        int pos = 0;
        int value = 0;
        int maxlen=1;

        for(int i=0;i<heals.length;i++) {
            heals[i]=(int)(Math.random()*n);
            System.out.print(heals[i]+" ");
        }
        System.out.println("\n");

        for(int i=1;i<n;i++) {
            if(heals[i] > heals[i-1]) {
                len=1;
                value=heals[i];
                for(int j=i;j<n-1;j++) {
                    if(heals[j-1]==heals[j]) {
                        len++;
                    }

                    if(heals[j]!=value) {
                        break;
                    }

                    if(heals[j+1]>heals[j]) {
                        len=0;
                        break;
                    }
                }
            }
            else{
                len=0;
            }
            if(maxlen<len){
                maxlen=len;
                pos=i;
                //value = heals[pos];
                System.out.println("found pos! "+pos);
                System.out.println("found value! "+value);
                System.out.println("found length! "+maxlen);
                System.out.println("====================");
            }
            //System.out.println(pos+" "+maxlen);
        }
        System.out.println("starts from i = "+pos+" and length = "+maxlen);

        /*
        for(int i=1;i<n;i++) {
            if(heals[i] >= heals[i-1]) {
                len=1;
                for(int j=i;j<n;j++) {
                    if(heals[j-1]==heals[j]) {
                        len++;
                    }
                    else if(heals[j-1]>heals[j]) {
                        break;
                    }
                    else if(heals[j-1]<heals[j]) {
                        len=0;
                        break;
                    }
                }
            }
            else{
                len=0;
            }
            if(maxlen<len){
                maxlen=len;
                pos=i-1;
                value = heals[pos];
                System.out.println("found pos! "+pos);
                System.out.println("found value! "+value);
            }
            System.out.println(pos+" "+maxlen);
        }
        System.out.println("starts from i = "+pos+" and length = "+maxlen);

         */
    }
}
