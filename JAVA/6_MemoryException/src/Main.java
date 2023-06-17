import java.util.*;

class InsufficientMemory extends Exception{
    InsufficientMemory(){
        System.out.println("Memory Out Of Bound");
    }
}

class Main {
    public static void main(String[] args){
        
    Scanner s = new Scanner(System.in);
    float m ;
    float main_memory = 1000 ; 
        
    while (true){
    System.out.println("Enter your choice:");
    System.out.println("1.Memory allocation\n2.Memory deallocation\n3.Quit");
            
    int ch = s.nextInt();
                   
        switch(ch){
                   case 1 :
                    System.out.println("Memeory available is"+main_memory);
                    System.out.println("Enter Total Memory required");
                    m = s.nextFloat();
                            try{
                                if(m>main_memory){
                                    throw new InsufficientMemory();
                                }
                                else{
                                     main_memory = main_memory - m ;
                                     System.out.println("Memory updated");
                                }
                            }
                                catch(InsufficientMemory e){
                                    System.out.println(e);
                                }
                                break ;
                            
                  case 2 :
                            System.out.println("Memory available is"+main_memory);
                            System.out.println("Enter Amount of Memory to be deleted");
                             m = s.nextFloat();
                            try{
                                if(m>(1-main_memory)){
                                    throw new InsufficientMemory();
                                }
                                else{
                                     main_memory = main_memory + m ;
                                     System.out.println("MEMORY  IS UPDATED");
                                }
                            }
                                catch(InsufficientMemory e){
                                    System.out.println("EXCEPTION IS IN :"+ e);
                                }
                                break ;
                                
                        
                            
                            
                        case 3 :{
                               System.exit(0);
                                }
                }
            }
                                       
         }
		 
}