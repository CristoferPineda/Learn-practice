public class Ternary_Operator {
    public static void main (String[] args){
        /*El operador ternario es como una manera simple de representar un if
        Estructura   <Condition> ? <Return if is true> : <Return if is false>;
        * */
        int experience = 5;
        int requirements = 10;
        //                Condition                if  True condition    else  False condition
        String result = (experience > requirements) ? "Accept to project" : "Learn more" ;
        System.out.println( "Result = " + result );//Return Learn more

        int age = 20;   //Condition  if   True        else   False
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Status= " + status);//Retorn Adult


    }
}
