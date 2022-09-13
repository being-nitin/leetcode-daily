class Solution {
    public boolean validUtf8(int[] data) {
      int a1=0;
        int a2=192;
        int a3=224;
        int a4=240;
        int check=128;
        int c=0;

        for(int i=0;i<data.length;i++)
        {
         
            if(c==0)
            {
                if((data[i]&128)==0)continue;
                else if((data[i]&a4)==a4&& ((1<<3)&data[i])==0)c=3;
                else if((data[i]&a3)==a3&& ((1<<4)&data[i])==0)c=2;
                else if((data[i]&a2)==a2&& ((1<<5)&data[i])==0)c=1; 
                else return false;
                
                
                
            }else{
                if((data[i]&128)!=128|| ((1<<6)&data[i])!=0 ) return false;
                c--;
            } 
           
        }
        
        return c==0;
    }
}