
package lesson2;
import javax.swing.JOptionPane;

public class Lesson2 {

    public static void main(String[] args) {
       /** 
        for (int i = 0; i<5; i++){
            System.out.println(i);
    }
        **/
       //Ejercicio 1
       for (int i = 0 ; i<5 ; i++){
           for (int j = 0; j<10; j++){
               System.out.print("@");
           }
           System.out.println();
       }
       
       //Ejercicio 2
       int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a multiplicar"));
       for (int i=1; i < 11; i++){
           int result = i*num;
           System.out.println(num+"x"+i+"= "+result);
       
       }
       
       //Ejercicio 3
       
       int line = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas deseado"));
       int i=1;
       while(i<=line){
           String print="";
           for(int j=0; j<i; j++){
               print+="*";
           
           }
           i++
           System.out.println(print);
       }
       
              //EJercicio 4
       
       
       
       //Ejercicio 5
       
       //Variables
       int students;
       int grade;
       int bestGrade=0;
       int lowestGrade=0;
       int standartGrade=0;
       
       students=Integer.parseInt((JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes a calificar")));
       
       for (int i=0; i<students; i++){
           grade=Integer.parseInt((JOptionPane.showInputDialog("Ingrese la nota del estudiante")));
           
           if (bestGrade<grade){
               bestGrade=grade;
            }
           if(grade<70 && grade>lowestGrade){
               lowestGrade=grade;
           }
            
       
       }
        System.out.println(bestGrade);
        System.out.println(lowestGrade);
       
       }
       
       

        
       
       
       
       
       
       
    }
    

