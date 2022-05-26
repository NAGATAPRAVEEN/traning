import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
 
public class Testcode {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);
 
    static List<String> StringList = new ArrayList<>();
    static List<String> oddStringList = new ArrayList<>();
 
    public static void main(String[] args) {

        System.out.println("enter no of strings : ");
        int n = sc.nextInt();
   
        System.out.println("enter  the strings :" );
          for(int i = 0;i<n; i++){
              StringList.add(sc1.nextLine());
          }
   
              for(String f: StringList) {

              if(f.length()%2 !=0){
                  oddStringList.add(f);
              }
 
            }
 
 
   
   
              String result = " Better Luck NEXT Time";
        
   
              if(oddStringList.size() > 0) {
                  result = oddStringList.get( 0);
                  for(int i=1; i< oddStringList.size();i++){
   
                    if(oddStringList.get(i).length()>result.length()){
                    result =oddStringList.get(i);
                  }

                }

            }
            
            System.out.println(result);
        }

        }


       
   
        

   
                    



                     
 
   
   
           
   
 
