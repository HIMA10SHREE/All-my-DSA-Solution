import java.util.HashSet;
class Isomophic {
    public boolean isIsomorphic(String s, String t) {
        HashSet <Character>se=new HashSet<>();
        HashSet <Character>te=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!se.contains(s.charAt(i))){
                
            
            
                se.add(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(!te.contains(t.charAt(i))){
               
                te.add(t.charAt(i));
            }
        }
        
        if(se.length==te.length{
            return true;
        }
        return false;
        
        }
        
    
}