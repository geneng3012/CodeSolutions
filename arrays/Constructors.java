import java.util.*;

public class Constructors{
    // Class-> class is a template of an object.(logical construct)
    // Object-> an object is an isntance of a class.(physical reality)
    public static void main(String[] args) {
            
        Scanner sc=new Scanner(System.in);

        Student max;
        max=new Student(45,421,"waar");

       // max.name="max";
       // max.roll=67;
       // max.marks=879;
        System.out.println(max.roll=76);
        System.out.println(max.marks);
        System.out.println(max.name);


      //  System.out

    }

    static class Student{
        int roll;
        int marks;
        String name;
       
       
        Student(int roll,int marks,String name){
           this.roll=roll;
           this.marks=marks;
           this.name=name;
        }
    }
}






































// import react from "react";

// function App(){
//   return <div></div>;
// }

// export default App;



// import react from "react";
// import reactDOM from "react-DOM";
// import App from "./component/App";

// reactDOM.render(<App />,document.getElementById ("root"));

