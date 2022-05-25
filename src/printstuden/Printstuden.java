/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstuden;

/**
 *
 * @author 14168
 */
public class Printstuden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student [ ] sl =new Student[3];
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(45);
        
        Student s2 = new Student();
        s2.setName("Jooohn");
        s2.setAge(10);
        Student s3 = new Student();
        s3.setName("Jahn");
        s3.setAge(13);
        sl[0]=s1;
        sl[1]=s2;
        sl[2]=s3;
        for (int i=0;i<sl.length;i++){
            
            System.out,println(sl[i].getName()+" "sl[i].get.);
        }
                
    }
}
        // TODO code application logic here
    
    

